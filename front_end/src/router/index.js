import Vue from 'vue';
import VueRouter from 'vue-router';
Vue.use(VueRouter);

//解决vue路由重复导航错误
//获取原型对象上的push函数
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
  return originalPush.call(this, location).catch(err => err)
}

const router = new VueRouter({
  routes: [
    // {
    //     path: "/",
    //     component: () => import(/*webpackChunkName:"Home"*/'@/views/Home'),
    //     meta: { title: "首页" }
    // },
    {
      path: '/',
      redirect: '/login',
    },
    {
      path: '/active',
      name: 'Active',
      component: () => import(/*webpackChunkName:"Active"*/ '@/views/Active'),
      meta: { title: '激活' },
    },
    {
      path: '/sales_manager/home',
      redirect: '/sales_manager',
    },
    {
      path: '/sales_leader/home',
      redirect: '/sales_leader',
    },
    // {
    //   path: '/sales_manager/login',
    //   redirect: '/login',
    // },
    // {
    //   path: '/sales_manager/active',
    //   redirect: '/active',
    // },
    // {
    //   path: '/sales_leader/home',
    //   redirect: '/home',
    // },
    {
      path: '/sales_leader/login',
      redirect: '/login',
    },
    {
      path: '/home',
      redirect: '/sales_leader',
      name: 'Home',
      meta: { title: '首页' },
    },
    // {
    //   path: '/indexComplecated',
    //   name: 'IndexComplecated',
    //   component: () => import(/* webpackChunkName: "IndexComplicated" */ '@/views/IndexComplicated'),
    //   meta: { title: '首页' },
    // },
    {
      path: '/login',
      props: true,
      component: () => import(/*webpackChunkName:"Login"*/ '@/views/Login'),
      meta: { title: '登录' },
    },
    {
      path: '/forgetPassword',
      name: 'ForgetPassword',
      component: () => import(/*webpackChunkName:"Forgetpassword"*/ '@/views/ForgetPassword'),
      meta: { title: '忘记密码' },
    },
    {
      path: '/register',
      name: 'Register',
      component: () => import(/*webpackChunkName:"Register"*/ '@/views/Register'),
      meta: { title: '注册' },
    },
    // {
    //   path: '/morenews',
    //   props: true,
    //   component: () =>
    //     import(/*webpackChunkName:"MoreNews"*/ '@/views/MoreNews'),
    //   meta: { title: '新闻' },
    // },
    {
      path: '/sales_manager', // 经理登录后进入，跳转至经理个人信息界面
      name: 'SalesManager',
      redirect: '/sales_manager/baseInformation',
      component: () =>
        import(/*webpackChunkName:"SalesManager"*/ '@/views/sales_manager'),
      children: [
        {
          path: 'baseInformation', // 经理个人信息界面，领导点击指定经理后也跳转至此
          name: 'SalesManagerBaseInformation',
          component: () => import('@/views/sales_manager/BaseInformation.vue'),
        },
        {
          path: 'channelsShow', // 经理查询所负责渠道情况，包含渠道列表和搜索渠道功能
          name: 'SalesManagerChannelsShow',
          component: () => import('@/views/sales_manager/ChannelsShow.vue'),
        },
        {
          path: 'channelDetail', // 经理查询销售渠道的详情界面，包含渠道基本信息，渠道地图，新增拜访，拜访列表
          name: 'SalesManagerChannelDetail',
          component: () => import('@/views/sales_manager/ChannelDetail.vue'),
        },
        {
          path: 'addVisitLog', // 经理为指定销售渠道添加一条拜访记录
          name: 'AddVisitLog',
          component: () => import('@/views/sales_manager/AddVisitLog.vue'),
        },
        {
          path: 'visitLogsShow', // 经理查询历史拜访记录，显示历史拜访记录，点击可进入拜访记录详情
          name: 'SalesManagerVisitLogsShow',
          component: () => import('@/views/sales_manager/VisitLogsShow.vue'),
        },
        {
          path: 'visitLogDetail', // 经理查询拜访记录详情
          name: 'SalesManagerVisitLogDetail',
          component: () => import('@/views/sales_manager/VisitLogDetail.vue'),
        },
        {
          path: 'visitPlan', // 销售经理规划拜访路线
          name: 'VisitPlan',
          component: () => import('@/views/sales_manager/VisitPlan.vue'),
        },
        {
          path: 'changePassword',
          name: 'SalesManagerChangePassword',
          component: () => import('@/views/sales_manager/ChangePassword.vue'),
        },
        {
          path: 'integral', // 统计信息参考界面
          name: 'Integral',
          component: () => import('@/views/sales_manager/Integral.vue'),
        },
        {
          path: 'rank', // 排行榜参考界面
          name: 'SalesManagerRank',
          component: () => import('@/views/sales_manager/Rank.vue'),
        },
      ],
    },
    {
      path: '/sales_leader', // 领导登录后进入，跳转至领导所在团队信息界面
      name: 'SalesLeader',
      redirect: '/sales_leader/baseInformation',
      component: () =>
        import(/*webpackChunkName:"SalesLeader"*/ '@/views/sales_leader'),
      children: [
        {
          path: 'baseInformation', // 领导团队信息界面
          name: 'SalesLeaderBaseInformation',
          component: () => import('@/views/sales_leader/BaseInformation.vue'),
        },
        {
          path: 'managersShow', // 领导查询团队经理列表
          name: 'ManagersShow',
          component: () => import('@/views/sales_leader/ManagersShow.vue'),
        },
        {
          path: 'managerDetail', // 领导查询经理详情
          name: 'ManagerDetail',
          component: () => import('@/views/sales_leader/ManagerDetail.vue'),
        },
        {
          path: 'channelsShow', // 领导查询所负责渠道情况，包含渠道列表和搜索渠道功能
          name: 'SalesLeaderChannelsShow',
          component: () => import('@/views/sales_leader/ChannelsShow.vue'),
        },
        {
          path: 'channelDetail', // 领导查询销售渠道的详情界面，包含渠道基本信息，渠道地图，新增拜访，拜访列表
          name: 'SalesLeaderChannelDetail',
          component: () => import('@/views/sales_leader/ChannelDetail.vue'),
        },
        {
          path: 'visitLogsShow', // 领导查询历史拜访记录，显示历史拜访记录，点击可进入拜访记录详情
          name: 'SalesLeaderVisitLogsShow',
          component: () => import('@/views/sales_leader/VisitLogsShow.vue'),
        },
        {
          path: 'visitLogDetail', // 领导查询拜访记录详情
          name: 'SalesLeaderVisitLogDetail',
          component: () => import('@/views/sales_leader/VisitLogDetail.vue'),
        },
        {
          path: 'rank',
          name: 'SalesLeaderRank',
          component: () => import('@/views/sales_leader/Rank.vue'),
        },
        {
          path: 'changePassword',
          name: 'SalesLeaderChangePassword',
          component: () => import('@/views/sales_leader/ChangePassword.vue'),
        },
      ],
    },
  ],
  scrollBehavior() {
    return { x: 0, y: 0 };
  },
  // mode: 'history',
});

// 挂载导航守卫
router.beforeEach((to, from, next) => {
  // to 将要访问的路径
  // from 代表从哪个路径跳转过来
  // next 是一个函数，表示放行
  //    next() 放行  next('login') 强制跳转

  if (to.path === '/login') return next();
  if (to.path === '/register') return next();
  if (to.path === '/forgetPassword') return next();
  // if(to.path === '/active') return next();

  // 获取token 和用户角色
  const tokenStr = window.sessionStorage.getItem('token')
  const roleId = window.sessionStorage.getItem('roleId')
  if (!tokenStr) return next('login')

  if (to.path == '/sales_manager/baseInformation') {
    if (roleId == 1) {
      // 销售领导
      return next('sales_leader')
    }
  }

  if (to.path == '/sales_leader/baseInformation') {
    if (roleId == 2) {
      // 销售经理
      return next('sales_manager')
    }
  }
  next()
});


export default router;
