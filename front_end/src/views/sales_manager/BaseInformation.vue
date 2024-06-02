<template>
    <div class="inf">
      <el-row>
        <span style="display:inline-block;width:80px">姓名：</span>
        <el-input class="my-input-box" v-model="name" disabled></el-input>
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">员工号：</span>
        <el-input class="my-input-box" v-model="mid" disabled></el-input>
        <!-- <span>{{ id }}</span> -->
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">邮箱：</span>
        <el-input class="my-input-box" v-model="mail" disabled></el-input>
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">部门：</span>
        <el-input class="my-input-box" v-model="team" disabled></el-input>
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">部门领导：</span>
        <el-input class="my-input-box" v-model="leader" disabled></el-input>
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">负责渠道数：</span>
        <el-input class="my-input-box" v-model="channel_num" disabled></el-input>
      </el-row>
      <el-row>
        <span style="display:inline-block;width:80px">拜访次数：</span>
        <el-input class="my-input-box" v-model="visit_num" disabled></el-input>
      </el-row>
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
      mid: "",
      name: "",
      mail: "",
      lid: "",
      team: "",
      leader: "",
      channel_num: 0,
      visit_num: 0,
    };
  },
  mounted() {
    this.getData();
  },
  methods: {
    async getData () {
      let userId = window.sessionStorage.getItem('userId');
      // let {data:res} = await this.$http.get("communityUser/userInfo/" + userId)
      let res = await this.$http.get("salesManager/baseInformation/" + userId)
      .catch(function (error) {
        console.log('出错',error.response);//可以拿到后端返回的信息
        // if(error.response.status == 500)
        //   this.$router.push('active')
      });
      console.log('用户信息',res)
      if(res.data.code == 200) {
        this.mid = res.data.data.mid;
        this.name = res.data.data.name;
        this.mail = res.data.data.mail;
        this.lid = res.data.data.lid;
        this.team = res.data.data.team;
        this.leader = res.data.data.leader;
        this.channel_num = res.data.data.channelNum;
        this.visit_num = res.data.data.visitNum;
        window.sessionStorage.setItem("lid", this.lid);
      }
      if(res.data.code == 500) {
        this.$message.success('请先激活账户！')
        this.$router.push('/active');
      }
       

    },
    toChangePassword() {
      this.$router.push({
        path: '/sales_manager/changePassword',
        query: {
          name: this.name,
        },
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
