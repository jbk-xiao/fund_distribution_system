<template>
    <div>
        <BackTop></BackTop>
        <sub-header></sub-header>

        <div class="inf">
            <el-row>
                <span style="display:inline-block;width:80px">渠道名称：</span>
                <el-input class="my-input-box" v-model="channel_data.name" readonly></el-input>
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
                <el-input class="my-input-box" v-model="channel_data.phoneNumber" readonly></el-input>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">营业时间：</span>
                <el-input class="my-input-box" v-model="channel_data.openHours" readonly style="width: 200px;"></el-input>
                
                <!-- <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">结束营业：</span>
                <el-input class="my-input-box" v-model="channel_data.end_time" readonly style="width: 70px;"></el-input>

                <span style="display:inline-block;width:10px"></span>
                <span style="display:inline-block;width:80px">负责经理：</span>
                <el-input class="my-input-box" v-model="channel_data.manager_name" readonly style="width: 70px;"></el-input> -->
                
                <!-- <span style="display:inline-block;width:100px"></span>
                <el-button type="primary" @click="addVisitLog" v-if="isManager">
                新增拜访记录
                </el-button> -->
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">具体位置：</span>

            </el-row>
            <el-row>
                <bmap ref="map"></bmap>
            </el-row>
            <el-row>
                <span style="display:inline-block;width:80px">拜访记录：</span>
            </el-row>
            <el-row>
                <VisitLogTable ref="visit_log_table"></VisitLogTable>
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
                name: '00天河支行',
                organization: "中国建设银行",
                province: "广东省",
                city: "广州市天河区",
                address: "广东省广州市天河区体育西路建行天河支行",
                zip: 510000,
                openHours: "09:00-17:00",
                manager_name: "张三",
            },
            isManager: false,
        };
    },
    mounted() {
        this.channel_data = this.$route.query;
        console.log(this.channel_data);
        this.getData();
    },
    methods: {
        async getData() {
            // let userId = window.sessionStorage.getItem('userId');
            var roleId = window.sessionStorage.getItem('roleId');
            this.isManager = (roleId == 2); 
            // let {data:res} = await this.$http.get("communityUser/userInfo/" + userId)
            let res = await this.$http.get("salesLeader/channelVisitLogList/" + this.channel_data.cid)
            .catch(function (error) {
                console.log('出错',error.response);//可以拿到后端返回的信息
                // if(error.response.status == 500)
                //   this.$router.push('active')
            });
            console.log('用户信息',res)
            if(res.data.code == 200) {
                this.$refs.visit_log_table.visit_log_list = res.data.data;
            }
            if(res.data.code == 403) {
                this.$message.error('没有权限！')
                // this.$router.push('/active');
            }

            var lng = this.channel_data.longitude;
            var lat = this.channel_data.latitude;

            // geo = [{
            //     "lng": lng,
            //     "lat": lat,
            //     "name": this.channel_data.name,
            //     "value": 100
            // }]
            var geo = [{
                name: this.channel_data.name,
                value: [lng, lat],
            }]

            setTimeout(() => {
                this.$refs.map.graph(geo, [], [], [], [], [lng, lat], 90);
                this.$refs.loading = false;
            }, 1000);
            // console.log(this.$refs.map.graph);
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
