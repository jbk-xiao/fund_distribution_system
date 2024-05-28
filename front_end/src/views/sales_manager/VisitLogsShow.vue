<template>
    <div>
        <BackTop></BackTop>
        <!-- <sub-header></sub-header> -->

        <div class="inf">
            <el-row>
                <VisitLogTable></VisitLogTable>
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
        // this.getData();
        this.channel_data = this.$route.query;
        console.log(this.channel_data);

    },
    methods: {
        async getData() {
            let userId = window.sessionStorage.getItem('userId');
            // let {data:res} = await this.$http.get("communityUser/userInfo/" + userId)
            let res = await this.$http.get("communityUser/userInfo/" + userId)
                .catch(function (error) {
                    console.log('出错', error.response);//可以拿到后端返回的信息
                    // if(error.response.status == 500)
                    //   this.$router.push('active')
                });
            console.log('用户信息', res)
            if (res.data.code == 200) {
                this.name = res.data.data.name;
                this.userId = res.data.data.userId;
                this.mail = res.data.data.mail;
                this.org = res.data.data.org;
                this.score = res.data.data.score;
            }
            if (res.data.code == 500) {
                this.$message.success('请先激活账户！')
                this.$router.push('/active');
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
