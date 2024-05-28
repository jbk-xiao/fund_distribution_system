<template>
    <el-card class="box-card">
      <div slot="header" class="clearfix">
        <span>添加拜访记录</span>
      </div>
      <el-form ref="form" :model="visit_log_form" label-width="100px" @submit.native.prevent="onSubmit">
        <el-form-item style="margin-top:30px;margin-left:50px" label="渠道名称：">
          <el-input
            style="width:500px"
            v-model="visit_log_form.channel"
            disabled
          ></el-input>
        </el-form-item>
        <el-form-item style="margin-top:30px;margin-left:50px" label="所属机构：">
          <el-input
            style="width:500px"
            v-model="visit_log_form.organization"
            disabled
          ></el-input>
        </el-form-item>
        <el-form-item style="margin-top:30px;margin-left:50px" label="负责经理：">
          <el-input
            style="width:500px"
            v-model="visit_log_form.manager_name"
            disabled
          ></el-input>
        </el-form-item>
        <el-form-item style="margin-top:30px;margin-left:50px" label="拜访日期：">
            <el-date-picker
                v-model="visit_log_form.date"
                type="daterange"
                start-placeholder="开始日期"
                end-placeholder="结束日期"
                :default-time="['00:00:00', '23:59:59']"
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd">
            </el-date-picker>
        </el-form-item>
        <el-form-item style="margin-top:30px;margin-left:50px" label="拜访摘要：">
            <el-input
                type="textarea"
                :autosize="{ minRows: 2, maxRows: 6}"
                v-model="visit_log_form.abstract"
                placeholder="简要描述拜访过程，建议200字以内。">
            </el-input>
        </el-form-item>
        <el-form-item style="margin-top:30px;margin-left:50px" label="详细记录：">
            <el-input
                type="textarea"
                :autosize="{ minRows: 4, maxRows: 16}"
                v-model="visit_log_form.detail"
                placeholder="为防止数据丢失，建议线下完成编辑后填入。">
            </el-input>
        </el-form-item>
        <el-form-item style="margin-top:50px;margin-left:350px">
          <el-button type="warning" @click="cancel">取消</el-button>
          <el-button type="primary" @click="submitVisitLog">添加</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </template>
  
  <script>
  export default {
    data() {
      return {
        visit_log_form: {
          channel: 'channel name',
          organization: 'org',
          manager_name: 'manager_name',
          date: '',
          abstract: '',
          detail: '',
        },
      };
    },
    mounted () {
      this.visit_log_form = this.$route.query;
      console.log('来自query的参数', this.visit_log_form);
    },
    methods: {
      cancel () {
        this.$router.back();
      },
      async submitVisitLog() {
        console.log('拜访记录表单内容：', this.visit_log_form)
        // if (
        //   this.form.password.length != 0 && 
        //   this.form.newPassword.length != 0 &&
        //   this.form.newPassword === this.form.rePassword
        // ) {
        //   //发送确认旧密码准确，然后设置成新密码
        //   let res = await this.$http.put('userOperation/password?newPw=' + this.form.newPassword + "&oldPw=" + this.form.password)
        //   console.log('改密码',res.data);
        //   if(res.data.code == 200) {
        //     window.sessionStorage.clear();
        //     this.$router.push('/login');
        //     return this.$message.success('密码修改成功！请重新登录。')
        //   }
  
        // } else if(this.form.newPassword != this.form.rePassword) {
        //   this.form.newPassword = '';
        //   this.form.rePassword = '';
        //   this.$message({
        //     type: 'error',
        //     message: '两次密码不一致！',
        //   });
        // } else {
        //   this.$message.error('修改失败！')
        // }
      },
    },
  };
  </script>
  
  <style scoped>
  .box-card {
    width: 80%;
    margin: 0px 5% auto 10%;
  }
  </style>
  