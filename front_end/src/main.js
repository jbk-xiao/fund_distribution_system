import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './mixins'
import ElementUI from 'element-ui'
// import 'element-ui/lib/theme-chalk/index.css'

// 覆盖 element-ui 的样式，使用自定义的主题色
import './assets/element-#1A62A1/index.css'

// 引入vue-swiper
import vueSwiper from 'vue-awesome-swiper'
import 'swiper/css/swiper.css'

// 引入 vue 日历
import fullCalendar from 'vue-fullcalendar'

// 试试 引入echarts
import * as echarts from 'echarts'

// 引入axios
import axios from 'axios'
// 配置请求的默认根路径
axios.defaults.baseURL = 'http://127.0.0.1:8290/'
// 请求预处理
axios.interceptors.request.use(config => {
  console.log(config)
  config.headers.satoken = window.sessionStorage.getItem('token')
  // let token = window.sessionStorage.getItem('token')
  // if(token) {
  //   config.headers = {
  //     'satoken': token,
  //   }
  // }
  // 在最后必须 return config
  return config
})

// 引入高德地图api
import VueAMap from 'vue-amap'

Vue.use(VueAMap)
VueAMap.initAMapApiLoader({
  key: '2b01c527483499451f85e8b0e1010727',
  plugin: [
    "AMap.Autocomplete",// 输入提示插件 
    "AMap.PlaceSearch",// POI搜索插件
    "AMap.Scale",// 右下角缩略图插件 比例尺
    "AMap.OverView",// 地图鹰眼插件
    "AMap.ToolBar",// 地图工具条
    "AMap.MapType",// 类别切换控件，实现默认图层与卫星图、实施交通图层之间切换的控制
    "AMap.PolyEditor",// 编辑 折线多，边形
    "AMap.CircleEditor",// 圆形编辑器插件
    "AMap.Geolocation", // 定位控件，用来获取和展示用户主机所在的经纬度位置
    "AMap.Geocoder",// 地理编码与逆地理编码服务，用于地址描述与坐标间的相互转换
    "AMap.AMapUI",// UI组件
  ]
})

Vue.config.productionTip = false
Vue.use(ElementUI)
Vue.use(vueSwiper)
Vue.component('full-calendar',fullCalendar)

// 试试 挂载原型
Vue.prototype.$echarts = echarts 
// Vue.use(echarts)
Vue.prototype.$http = axios


new Vue({
  router,
  
  render: h => h(App),
}).$mount('#app')
