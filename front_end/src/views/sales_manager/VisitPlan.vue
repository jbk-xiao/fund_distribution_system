<template>
    <div>
        <BackTop></BackTop>
        <checkbox-sales-channel-table ref="checkboxRows"></checkbox-sales-channel-table>
        <el-row style="margin-top:20px;margin-left:700px">
            <el-button type="primary" @click="requestNavigation">
                开始规划
            </el-button>
        </el-row>
        <el-row style="margin-top:20px">
            <bmap ref="map"></bmap>
        </el-row>
    </div>
    
</template>
  
<script>
    import BackTop from '@/components/BackTop'; // 报错
    import CheckboxSalesChannelTable from '@/components/sales_channel/CheckboxSalesChannelTable.vue';
    import Bmap from '@/components/index/Bmap.vue';

    export default {
        components: { 
            CheckboxSalesChannelTable,
            BackTop,
            Bmap,
        },
        // SimpleSalesChannelTable,
        data() {
            return {
            name: '',
            userId: '',
            mail: '',
            org: '',
            score: ''
            };
        },
        mounted() {
            this.getData();
        },
        methods: {
            async getData () {
                let userId = window.sessionStorage.getItem('userId');
                // let {data:res} = await this.$http.get("communityUser/userInfo/" + userId)
                let res = await this.$http.get("salesManager/channelList/" + userId)
                .catch(function (error) {
                    console.log('出错',error.response);//可以拿到后端返回的信息
                    // if(error.response.status == 500)
                    //   this.$router.push('active')
                });
                console.log('用户信息',res)
                if(res.data.code == 200) {
                    this.$refs.checkboxRows.channel_list = res.data.data;
                }
                if(res.data.code == 403) {
                    this.$message.error('没有权限！')
                    // this.$router.push('/active');
                }
            },
            toChangePassword() {
                this.$router.push({
                    path: '/personal/changePassword',
                    // query: {
                    //   name: this.accountId,
                    // },
                });
            },
            requestNavigation() {
                this.multipleSelection = this.$refs.checkboxRows.multipleSelection;
                if (this.multipleSelection.length == 0) {
                    this.$message.error('请选择待访问渠道！');
                } else if (this.multipleSelection.length > 10) {
                    this.$message.error('最多选择10个销售渠道！');
                } else {
                    this.$message.info('开始规划行程……')
                    var lng = this.multipleSelection[0].longitude;
                    var lat = this.multipleSelection[0].latitude;

                    // geo = [{
                    //     "lng": lng,
                    //     "lat": lat,
                    //     "name": this.channel_data.name,
                    //     "value": 100
                    // }]
                    var geo = []
                    for (var i = 0; i < this.multipleSelection.length; i++) {
                
                        geo.push({
                            name: this.multipleSelection[i].name,
                            value: [this.multipleSelection[i].longitude, this.multipleSelection[i].latitude],
                        })

                    }

                    setTimeout(() => {
                        this.$refs.map.graph(geo, [], [], [], [], [lng, lat], 10);
                        this.$refs.loading = false;
                    }, 1000);
                }
            },
        },
    };
</script>

<style scoped>
    .box-card {
        width: 60%;
        margin: 0px 20% auto 20%;
    }

    .inf {
        width: 100%;
        /* background-color: aqua; */
        /* padding: 0 20px; */
        box-sizing: border-box;
    }

    .inf .el-row {
        margin: 20px auto 20px 100px;
    }

    .my-input-box {
        width: 260px;
    }
</style>
