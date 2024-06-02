<template>
    <!-- CONTENT -->
    <div class="section">
        <el-table :data="channel_list.filter(
            data =>
                !search || data.name.toLowerCase().includes(search.toLowerCase())
                || data.address.toLowerCase().includes(search.toLowerCase())
        )" border style="width: 100%" max-height="500">
            <el-table-column fixed type="index" :index="indexMethod">
            </el-table-column>
            <el-table-column fixed prop="name" label="渠道名称" width="150">
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
            <el-table-column prop="openHours" label="营业时间" width="150">
            </el-table-column>
        
            <!-- <el-table-column prop="manager_name" label="负责人" width="150">
            </el-table-column> -->

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
            ],
            isManager: true,
            search: ''
        }
    },
    methods: {
        indexMethod(index) {
            return index + 1;
        },
        showChannelDetail(channel_data) {
            var roleId = window.sessionStorage.getItem('roleId');
            this.isManager = (roleId == 2);
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
        // this.getData();
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