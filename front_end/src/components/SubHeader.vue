<template>
  <div class="middlebar d-none d-sm-block">
    <el-button type="primary" @click="returnLast">
      返回上一级
    </el-button>
  </div>
</template>

<script src="../../public/js/vendor/modernizr.min.js"></script>
<script>
export default {
  methods: {
    returnLast () {
      this.$router.back();
    },
  }
};
</script>