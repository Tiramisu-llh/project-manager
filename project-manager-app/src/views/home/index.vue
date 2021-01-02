<template>
  <div style="background-color: #f5f5f5">
    <!-- <el-container >
   <el-header>-->
    <!-- 导航栏 -->
    <!-- <header-nav></header-nav>
   </el-header>
  <el-container>  -->
    <navbar-page>
      <router-view></router-view>
    </navbar-page>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import { State, Getter } from "vuex-class";
import NavbarPage from "@/components/NavbarPage.vue";

@Component({
  components: {
    NavbarPage,
  },
})
export default class Home extends Vue {}
</script>

<style lang="scss" scoped>
</style>
