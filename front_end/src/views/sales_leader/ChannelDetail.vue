<template>
    <div>
        <BackTop></BackTop>
        <sub-header></sub-header>

        <div class="inf">
            <el-row>
                <span style="display:inline-block;width:80px">渠道名称：</span>
                <el-input class="my-input-box" v-model="channel_data.channel" readonly></el-input>
            <!-- </el-row>
            <el-row> -->
                <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">所属机构：</span>
                <el-input class="my-input-box" v-model="channel_data.organization" readonly></el-input>
                <!-- <span>{{ id }}</span> -->
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">所在省份：</span>
                <el-input class="my-input-box" v-model="channel_data.province" readonly style="width: 80px;"></el-input>
                
                <span style="display:inline-block;width:20px"></span>
                <span style="display:inline-block;width:80px">所在市区：</span>
                <el-input class="my-input-box" v-model="channel_data.city" readonly style="width: 120px;"></el-input>

                <span style="display:inline-block;width:20px"></span>
                <span style="display:inline-block;width:80px">邮编：</span>
                <el-input class="my-input-box" v-model="channel_data.zip" readonly style="width: 120px;"></el-input>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">地址：</span>
                <el-input class="my-input-box" v-model="channel_data.address" readonly></el-input>
                
                <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">联系方式：</span>
                <el-input class="my-input-box" v-model="channel_data.phone_number" readonly></el-input>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">开始营业：</span>
                <el-input class="my-input-box" v-model="channel_data.start_time" readonly style="width: 70px;"></el-input>
                
                <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">结束营业：</span>
                <el-input class="my-input-box" v-model="channel_data.end_time" readonly style="width: 70px;"></el-input>

                <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">负责经理：</span>
                <el-input class="my-input-box" v-model="channel_data.manager_name" readonly style="width: 70px;"></el-input>
                
                <span style="display:inline-block;width:100px"></span>
                <el-button type="primary" @click="addVisitLog" v-if="isManager">
                新增拜访记录
                </el-button>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">具体位置：</span>

            </el-row>
            <el-row>
                <bmap></bmap>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">拜访记录：</span>
            </el-row>
            <el-row>
                <VisitLogTable></VisitLogTable>
            </el-row>
        </div>
    </div>
</template>

<script>
import BackTop from '@/components/BackTop.vue';
import SubHeader from '@/components/SubHeader.vue';
import Bmap from '@/components/index/Bmap.vue';
import VisitLogTable from '@/components/visit_log/VisitLogTable.vue';

export default {
    components: {
        BackTop,
        SubHeader,
        Bmap,
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
            },
            isManager: false,
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
            var roleId = window.sessionStorage.getItem('roleId');
            this.isManager = roleId == 2; 
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
        addVisitLog() {
            this.$router.push({
                path: '/sales_manager/addVisitLog',
                query: { // 后续增加channel唯一id和manager唯一id
                    channel: this.channel_data.channel,
                    organization: this.channel_data.organization,
                    manager_name: this.channel_data.manager_name,
                },
            })
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
