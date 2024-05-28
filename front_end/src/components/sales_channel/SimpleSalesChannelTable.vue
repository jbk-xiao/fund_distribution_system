<template>
    <!-- CONTENT -->
    <div class="section">
        <el-table :data="channel_list.filter(
            data =>
                !search || data.channel.toLowerCase().includes(search.toLowerCase())
                || data.address.toLowerCase().includes(search.toLowerCase())
        )" border style="width: 100%" max-height="500">
            <el-table-column fixed type="index" :index="indexMethod">
            </el-table-column>
            <el-table-column fixed prop="channel" label="渠道名称" width="150">
            </el-table-column>
            <el-table-column prop="organization" label="所属机构" width="150">
            </el-table-column>
            <el-table-column prop="province" label="省份" width="120">
            </el-table-column>
            <el-table-column prop="city" label="市区" width="120">
            </el-table-column>
            <el-table-column prop="address" label="地址" width="300">
            </el-table-column>
            <el-table-column prop="zip" label="邮编" width="120">
            </el-table-column>
            <el-table-column prop="start_time" label="开始营业时间" width="150">
            </el-table-column>
            <el-table-column prop="end_time" label="结束营业时间" width="150">
            </el-table-column>
            <el-table-column prop="manager_name" label="负责人" width="150">
            </el-table-column>
            <el-table-column fixed="right" align="right" width="250">
                <template slot="header" slot-scope="{}">
                    <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                    <el-button @click="showChannelDetail(scope.row)" type="text" size="small">查看详情</el-button>
                </template>
            </el-table-column>
        </el-table>
    </div>

</template>

<script>
export default {
    data() {
        return {
            channel_list: [
                {
                    channel: '00天河支行',
                    organization: "中国建设银行",
                    province: "广东省",
                    city: "广州市天河区",
                    address: "广东省广州市天河区体育西路建行天河支行",
                    zip: 510000,
                    start_time: "09:00",
                    end_time: "17:00",
                    manager_name: "张三",
                    phone_number: "020-81179529",
                }
            ],
            isManager: true,
            search: ''
        }
    },
    methods: {
        indexMethod(index) {
            return index + 1;
        },
        async getData() {
            // let userId = window.sessionStorage.getItem('userId');
            var roleId = window.sessionStorage.getItem('roleId');
            this.isManager = (roleId == 2);
            let { data: res } = await this.$http.get("communityUser/ansRecords")
            console.log('ansRecords', res.data)
            for (var i = 0; i < res.data.length; i++) {
                let { data } = await this.$http.get("communityWhole/question/" + res.data[i].queId)
                console.log(data)
                this.channel_list.push({
                    index: i + 1,
                    problem: data.data.problem,
                    stdAns: data.data.stdAns,
                    analysis: data.data.analysis,
                    ans: res.data[i].ans,
                    channel: '建行天河支行',
                    organization: "中国建设银行",
                    province: "广东省",
                    city: "广州市天河区",
                    address: "广东省广州市天河区建行天河支行",
                    zip: 510000,
                    start_time: "09:00",
                    end_time: "17:00",
                    manager_name: "张三"
                    // isCorrect: res.data[i].isCorrect,
                })
            }
            console.log('渠道列表汇总', this.channel_list)
            // window.localStorage.setItem('userBasic', res.data);
        },
        showChannelDetail(channel_data) {
            console.log('channel_data: ', channel_data);
            console.log('channel_data.channel: ', channel_data.channel);
            if (this.isManager) {
                this.$router.push({
                    path: '/sales_manager/channelDetail',
                    query: channel_data,
                });
            } else {
                this.$router.push({
                    path: '/sales_leader/channelDetail',
                    query: channel_data,
                });
            }
        }
    },
    mounted() {
        this.getData();
    }

}
</script>

<style>
.demo-table-expand {
    font-size: 0;
}

.demo-table-expand label {
    width: 120px;
    color: #99a9bf;
}

.demo-table-expand .el-form-item {
    margin-right: 0;
    margin-bottom: 0;
    width: 90%;
}

div.el-table__expand-icon {
    /* color: #1A62A1; */
    background-color: #EEEEEE;
    /* background-color: #C61202; */
}
</style>