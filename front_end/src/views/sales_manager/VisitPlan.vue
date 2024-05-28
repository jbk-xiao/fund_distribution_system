<template>
    <div>
        <BackTop></BackTop>
        <checkbox-sales-channel-table ref="checkboxRows"></checkbox-sales-channel-table>
        <el-row style="margin-top:20px;margin-left:700px">
            <el-button type="primary" @click="requestNavigation">
                开始规划
            </el-button>
        </el-row>
    </div>
    
</template>
  
<script>
    import BackTop from '@/components/BackTop'; // 报错
    import CheckboxSalesChannelTable from '@/components/sales_channel/CheckboxSalesChannelTable.vue';

    export default {
        components: { 
            CheckboxSalesChannelTable,
            BackTop
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
                let res = await this.$http.get("communityUser/userInfo/" + userId)
                .catch(function (error) {
                    console.log('出错',error.response);//可以拿到后端返回的信息
                    // if(error.response.status == 500)
                    //   this.$router.push('active')
                });
                console.log('用户信息',res)
                if(res.data.code == 200) {
                    this.name = res.data.data.name;
                    this.userId = res.data.data.userId;
                    this.mail = res.data.data.mail;
                    this.org = res.data.data.org;
                    this.score = res.data.data.score;
                }
                if(res.data.code == 500) {
                    this.$message.success('请先激活账户！')
                    this.$router.push('/active');
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
