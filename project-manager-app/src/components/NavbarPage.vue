<template>
  <div class="co-navbar-page">
    <div class="co-navbar">
      <Navbar></Navbar>
    </div>
    <!--  -->
    <div class="co-page">
      <!-- 插槽 -->
      <div class="co-header">
        <Header></Header>
      </div>
      <div class="co-content">
        <slot></slot>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import { State, Getter } from "vuex-class";
import Navbar from "@/components/Navbar.vue";
import Header from "@/components/Header.vue";

@Component({
  components: {
    Navbar,
    Header,
  },
})
export default class HelloWorld extends Vue {}
</script>

<style lang="scss" scoped>
$navbar-width: 210px;
.co-navbar-page {
  .co-navbar {
    width: $navbar-width;
    position: fixed;
    overflow: auto;
  }
  .co-page {
    margin-left: $navbar-width;
    .co-header {
      width: 100%;
      margin-bottom: 10px;
    }
    .co-content {
      background-color: rgb(240, 242, 245);
      min-height: 100vh;
    }
  }
}
/* 设置滚动条的样式 */
::-webkit-scrollbar {
  width: 1px;
}
</style>
