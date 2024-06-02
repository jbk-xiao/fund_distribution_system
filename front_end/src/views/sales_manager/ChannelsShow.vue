<template>
    <div>
        <BackTop></BackTop>
        <simple-sales-channel-table ref="channel_table"></simple-sales-channel-table>
    </div>
    
</template>
  
<script>
    import BackTop from '@/components/BackTop'; // 报错
    import SimpleSalesChannelTable from '@/components/sales_channel/SimpleSalesChannelTable';


    export default {
        components: { 
            SimpleSalesChannelTable,
            BackTop,
        },
        data() {
            return {
            name: '',
            userId: '',
            mail: '',
            org: '',
            score: '',
            team: '',
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
                    this.$refs.channel_table.channel_list = res.data.data;
                }
                if(res.data.code == 403) {
                    this.$message.error('没有权限！')
                    // this.$router.push('/active');
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
