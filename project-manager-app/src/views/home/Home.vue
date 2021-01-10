<template>
  <div style="background-color: rgb(239, 243, 247)">
    <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
    >
      <el-menu-item index="1">
        <img src="" alt="brand" />
      </el-menu-item>
      <el-menu-item index="2">处理中心</el-menu-item>
      <el-menu-item index="3">我的工作台 </el-menu-item>
      <el-menu-item index="4">消息中心</el-menu-item>
      <el-menu-item index="5">订单管理</el-menu-item>
      <el-menu-item class="float-right">
        <el-button round style="border-color: grey">登陆</el-button>
        <el-button round type="primary">注册</el-button>
      </el-menu-item>
    </el-menu>

    <el-row>
      <el-col :span="12">
        <div class="co-home-text">dd</div>
      </el-col>
      <el-col :span="12">
        <div class="co-home-img">
          <img src="@/assets/home.png" alt="" width="100%" />
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import { State, Getter } from "vuex-class";

@Component
export default class HelloWorld extends Vue {
  private activeIndex = 1;
}
</script>

<style lang="scss" scoped>
.co-home-text,
.co-home-img {
  margin-top: 20px;
}
</style>
