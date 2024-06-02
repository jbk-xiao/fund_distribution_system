<template>
    <!-- CONTENT -->
    <div class="section">
        <el-table :data="visit_log_list.filter(
            data =>
                !search || data.channel.toLowerCase().includes(search.toLowerCase())
                || data.abstract.toLowerCase().includes(search.toLowerCase())
        )" border style="width: 100%" max-height="500">
            <el-table-column fixed type="index" :index="indexMethod">
            </el-table-column>
            <el-table-column fixed prop="channel" label="渠道名称" width="150">
            </el-table-column>
            <el-table-column prop="organization" label="所属机构" width="150">
            </el-table-column>
            <el-table-column prop="date" label="拜访日期" width="120">
            </el-table-column>
            <el-table-column prop="logAbstract" label="拜访摘要" width="240">
            </el-table-column>
            
            <el-table-column prop="manager" label="负责人" width="150">
            </el-table-column>
            <el-table-column fixed="right" align="right" width="250">
                <template slot="header" slot-scope="{}">
                    <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                    <el-button @click="showVisitLogDetail(scope.row)" type="text" size="small">查看详情</el-button>
                </template>
            </el-table-column>
        </el-table>
    </div>

</template>

<script>
export default {
    data() {
        return {
            visit_log_list: [
                // {
                //     channel: '00天河支行',
                //     organization: "中国建设银行",
                //     visit_date: "2024-05-26",
                //     abstract: "这是一条不一样的拜访摘要。这是一条拜访摘要。这是一条拜访摘要。这是一条拜访摘要。",
                //     manager_name: "张三",
                // }
            ],
            search: '',
            roleId: '',
        }
        // methods: {

        // };
    },
    methods: {
        indexMethod(index) {
            return index + 1;
        },
        // async getData() {
        //     // let userId = window.sessionStorage.getItem('userId');
        //     console.log('ansRecords', res.data)
        //     let { data: res } = await this.$http.get("communityUser/ansRecords")
        //     for (var i = 0; i < res.data.length; i++) {
        //         let { data } = await this.$http.get("communityWhole/question/" + res.data[i].queId)
        //         console.log(data)
        //         this.visit_log_list.push({
        //             index: i + 1,
        //             problem: data.data.problem,
        //             stdAns: data.data.stdAns,
        //             analysis: data.data.analysis,
        //             ans: res.data[i].ans,
        //             channel: '建行天河支行',
        //             organization: "中国建设银行",
        //             visit_date: "2024-05-26",
        //             abstract: "这是一条查出来的拜访摘要。这是一条拜访摘要。这是一条拜访摘要。这是一条拜访摘要。",
        //             manager_name: "张三",
        //             // isCorrect: res.data[i].isCorrect,
        //         })
        //     }
        //     console.log('拜访记录列表汇总', this.visit_log_list)
        //     // window.localStorage.setItem('userBasic', res.data);
        // },
        showVisitLogDetail(visit_log_data) {
            var roleId = window.sessionStorage.getItem('roleId');
            this.isManager = (roleId == 2);
            if (this.isManager) {
                this.$router.push({
                    path: '/sales_manager/visitLogDetail',
                    query: visit_log_data,
                });
            } else {
                this.$router.push({
                    path: '/sales_leader/visitLogDetail',
                    query: visit_log_data,
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