<template>
    <div>
        <BackTop></BackTop>
        <!-- <sub-header></sub-header> -->

        <div class="inf">
            <el-row>
                <VisitLogTable ref="visit_log_table"></VisitLogTable>
            </el-row>
        </div>
    </div>
</template>

<script>
import BackTop from '@/components/BackTop.vue';
// import SubHeader from '@/components/SubHeader.vue';
import VisitLogTable from '@/components/visit_log/VisitLogTable.vue';

export default {
    components: {
        BackTop,
        // SubHeader,
        VisitLogTable,
    },
    // SimpleSalesChannelTable,
    data() {
        return {
            channel_data: {
                channel: '00天河支行',
                organization: "中国建设银行",
                province: "广东省",
                city: "广州市天河区",
                address: "广东省广州市天河区体育西路建行天河支行",
                zip: 510000,
                start_time: "09:00",
                end_time: "17:00",
                manager_name: "张三",
            }
        };
    },
    mounted() {
        this.getData();
    },
    methods: {
        async getData() {
            let userId = window.sessionStorage.getItem('userId');
            let res = await this.$http.get("salesLeader/teamVisitLogList/" + userId)
                .catch(function (error) {
                    console.log('出错', error.response);//可以拿到后端返回的信息
                    
                });
            console.log('用户信息', res)
            if (res.data.code == 200) {
                this.$refs.visit_log_table.visit_log_list = res.data.data;
            }
            if(res.data.code == 403) {
                this.$message.error('没有权限！')
                // this.$router.push('/active');
            }
            if (res.data.code == 500) {
                this.$message.success('请先登录账户！')
                this.$router.push('/login');
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
    margin: 20px auto 20px 20px;
}

.my-input-box {
    width: 260px;
}
</style>
