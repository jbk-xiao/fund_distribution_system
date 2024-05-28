<template>
    <div class="section">
        <el-table :data="tableData.filter(
            data =>
                !search || data.manager_name.toLowerCase().includes(search.toLowerCase())
        )" border style="width: 100%" max-height="500">
            <el-table-column fixed type="index" width="70">
            </el-table-column>
            <el-table-column fixed prop="name" label="姓名" width="150px">
            </el-table-column>
            <el-table-column prop="id" label="Id" width="130px">
            </el-table-column>
            <el-table-column prop="org" label="组织">
            </el-table-column>
            <el-table-column prop="roleName" label="身份">
            </el-table-column>
            <el-table-column prop="mail" label="邮箱">
            </el-table-column>
            <!-- <el-table-column
            prop="note"
            label="心得感悟/篇">
          </el-table-column> -->
            <!-- <el-table-column
            prop="comment"
            label="评论/条">
          </el-table-column> -->
            <!-- <el-table-column
            prop="question"
            label="答题/次">
          </el-table-column> -->
          <el-table-column fixed="right" align="right" width="150">
                <template slot="header" slot-scope="{}">
                    <el-input v-model="search" size="mini" placeholder="输入姓名搜索" />
                </template>
                <template slot-scope="scope">
                    <el-button @click="showManagerDetail(scope.row)" type="text" size="small">查看详情</el-button>
                </template>
            </el-table-column>
        </el-table>
    </div>
</template>

<script>
export default {
    data() {
        return {
            tableData: [],
            tableData2: [{
                student: '18379999',
                name: '王小虎',
                gender: '男',
                association: '193',
                note: '53',
                comment: '27',
                question: '14'
            }, {
                student: '18379999',
                name: '王小虎',
                gender: '男',
                association: '193',
                note: '53',
                comment: '27',
                question: '14'
            }, {
                student: '18379999',
                name: '王小虎',
                gender: '男',
                association: '193',
                note: '53',
                comment: '27',
                question: '14'
            }, {
                student: '18379999',
                name: '王小虎',
                gender: '男',
                association: '193',
                note: '53',
                comment: '27',
                question: '14'
            }],
            search: '',
        }
    },
    methods: {
        async getData() {
            let res = await this.$http.get("managerOperation/xUsers");
            console.log(res.data.data)
            this.tableData = res.data.data;
        },
        showManagerDetail(manager_data) {
            this.$router.push({
                path: '/sales_leader/managerDetail',
                query: manager_data,
            })
        },
    },
    mounted() {
        this.getData();
    }
}
</script>