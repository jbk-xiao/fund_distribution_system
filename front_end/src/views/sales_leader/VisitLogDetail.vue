<template>
    <div>
        <BackTop></BackTop>
        <sub-header></sub-header>

        <div class="inf">
            <el-row>
                <span style="display:inline-block;width:80px">渠道名称：</span>
                <el-input class="my-input-box" v-model="visit_log_data.channel" readonly></el-input>
            <!-- </el-row>
            <el-row> -->
                <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">所属机构：</span>
                <el-input class="my-input-box" v-model="visit_log_data.organization" readonly></el-input>
                <!-- <span>{{ id }}</span> -->
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">拜访日期：</span>
                <el-input class="my-input-box" v-model="visit_log_data.date" readonly style="width: 120px;"></el-input>

                <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">负责经理：</span>
                <el-input class="my-input-box" v-model="visit_log_data.manager" readonly style="width: 70px;"></el-input>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">拜访摘要：</span>
            </el-row>
            <el-row>
                <el-input
                    type="textarea"
                    :autosize="{ minRows: 2, maxRows: 6}"
                    v-model="visit_log_data.detail"
                    readonly>
                </el-input>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">详细记录：</span>
            </el-row>
            <el-row>
                <el-input
                    type="textarea"
                    :autosize="{ minRows: 4, maxRows: 16}"
                    v-model="visit_log_data.detail"
                    readonly>
                </el-input>
            </el-row>
        </div>
    </div>
</template>

<script>
import BackTop from '@/components/BackTop.vue';
import SubHeader from '@/components/SubHeader.vue';

export default {
    components: {
        BackTop,
        SubHeader,
    },
    // SimpleSalesChannelTable,
    data() {
        return {
            visit_log_data: {
                channel: '00天河支行',
                organization: "中国建设银行",
                visit_date: "2024-05-26",
                abstract: "这是一条不一样的拜访摘要。这是一条拜访摘要。这是一条拜访摘要。这是一条拜访摘要。",
                manager_name: "张三",
                // 详细记录太长了，考虑重新发送一条请求
                detail: "这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。这是一段很长的详细记录。。。",
            }
        };
    },
    mounted() {
        // this.getData();
        this.visit_log_data = this.$route.query;
        console.log(this.visit_log_data);

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
