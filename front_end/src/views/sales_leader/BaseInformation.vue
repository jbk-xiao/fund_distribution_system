<template>
    <div class="inf">
      <el-row>
        <span style="display:inline-block;width:80px">姓名：</span>
        <el-input class="my-input-box" v-model="name" disabled></el-input>
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">员工号：</span>
        <el-input class="my-input-box" v-model="lid" disabled></el-input>
        <!-- <span>{{ id }}</span> -->
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">部门：</span>
        <el-input class="my-input-box" v-model="team" disabled></el-input>
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">邮箱：</span>
        <el-input class="my-input-box" v-model="mail" disabled></el-input>
      </el-row>
      <!-- <el-row>
        <span style="display:inline-block;width:80px">拜访次数：</span>
        <el-input class="my-input-box" v-model="score" disabled></el-input>
      </el-row> -->
      <!-- <el-row>
        <el-col :span="6" :offset="16">
          <span
            style="cursor:pointer;text-decoration:underline"
            @click="toChangePassword"
            >修改密码</span
          >
        </el-col>
      </el-row> -->
    </div>
  <!-- </el-card> -->
</template>

<script>
export default {
  data() {
    return {
      name: '',
      lid: '',
      mail: '',
      team: ''
    };
  },
  mounted() {
    this.getData();
  },
  methods: {
    async getData () {
      let userId = window.sessionStorage.getItem('userId');
      let {data:res} = await this.$http.get("salesLeader/baseInformation/" + userId)
      console.log('用户信息',res.data)
      this.name = res.data.name;
      this.lid = res.data.lid;
      this.mail = res.data.mail;
      this.team = res.data.team;
      // this.score = res.data.score;
      // window.sessionStorage.setItem('comments', res.data.comments);
      // window.sessionStorage.setItem('notes', res.data.notes);
    },
    toChangePassword() {
      this.$router.push({
        path: '/sales_leader/changePassword',
        // query: {
        //   name: this.accountId,
        // },
      });
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
