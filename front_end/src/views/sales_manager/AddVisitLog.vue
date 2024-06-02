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
            v-model="visit_log_form.manager"
            disabled
          ></el-input>
        </el-form-item>
        <el-form-item style="margin-top:30px;margin-left:50px" label="拜访日期：">
            <el-date-picker
                v-model="visit_log_form.date"
                type="date"
                placeholder="选择日期"
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd">
            </el-date-picker>
        </el-form-item>
        <el-form-item style="margin-top:30px;margin-left:50px" label="拜访摘要：">
            <el-input
                type="textarea"
                :autosize="{ minRows: 2, maxRows: 6}"
                v-model="visit_log_form.logAbstract"
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
        visit_log_data: {
          channel: 'channel name',
          organization: 'org',
          manager: 'manager_name',
          date: '',
          logAbstract: '',
          detail: '',
        },
        visit_log_form: {
          channel: 'channel name',
          organization: 'org',
          manager: 'manager_name',
          date: '',
          logAbstract: '',
          detail: '',
        },
      };
    },
    mounted () {
      this.visit_log_data = this.$route.query;
      console.log('来自query的参数', this.visit_log_data);
      this.visit_log_form.channel = this.visit_log_data.channel;
      this.visit_log_form.organization = this.visit_log_data.organization;
      this.visit_log_form.manager = this.visit_log_data.manager;
    },
    methods: {
      cancel () {
        this.$router.back();
      },
      async submitVisitLog() {
        console.log('拜访记录表单内容：', this.visit_log_form)
        this.visit_log_data.date = this.visit_log_form.date;
        this.visit_log_data.logAbstract = this.visit_log_form.logAbstract;
        this.visit_log_data.detail = this.visit_log_form.detail;

        console.log("before post", this.visit_log_data);
        let res = await this.$http.post("salesManager/visitLog", this.visit_log_data);
        console.log("after post", res);
        
        if (res.data.code == 200) {
          if (res.data.data == "1") {
            this.$message.success("添加成功！");
            this.$router.back();
          } else {
            this.$message.error("添加失败！");
          }
        } else {
          this.$message.error("添加失败！");
        }
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
  