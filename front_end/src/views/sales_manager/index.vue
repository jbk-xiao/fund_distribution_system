<template>
  <el-container>
    <el-header>
      <Header />
    </el-header>
    <el-container style="margin-top:50px">
      <el-aside width="20%" style="height:500px;padding-left:30px">
        <el-row class="tac">
          <el-col :span="24">
            <el-menu
              :router="true"
              default-active="'/sales_manager/baseInformation'"
              class="el-menu-vertical-demo"
            >
              
              <el-menu-item :index="'/sales_manager/baseInformation'">
                <template slot="title">
                  <i class="el-icon-menu"></i>
                  <span>基本信息</span>
                </template>
              </el-menu-item>
              <el-menu-item :index="'/sales_manager/channelsShow'">
                <template slot="title">
                  <i class="el-icon-menu"></i>
                  <span>销售渠道查询</span>
                </template>
              </el-menu-item>
              <el-menu-item :index="'/sales_manager/visitPlan'">
                <template slot="title">
                  <i class="el-icon-menu"></i>
                  <span>拜访规划</span>
                </template>
              </el-menu-item>
              <el-menu-item :index="'/sales_manager/visitLogsShow'">
                <template slot="title">
                  <i class="el-icon-menu"></i>
                  <span>历史拜访记录</span>
                </template>
              </el-menu-item>

            </el-menu>
          </el-col>
        </el-row>
      </el-aside>
      <el-main>
        <router-view></router-view>
      </el-main>
    </el-container>

  </el-container>
</template>

<script>
import Header from '@/components/Header.vue';
export default {
  components: {
    Header,
  },
};
</script>

<style scoped>
.el-header {
  padding: 0;
}
</style>
