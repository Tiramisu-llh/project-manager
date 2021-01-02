<template>
  <div class="pl-2">
    <el-button type="primary">Hello World</el-button>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import { State, Getter } from "vuex-class";
// 调用api
import { getUser } from "@/api/user";

@Component
export default class HelloWorld extends Vue {
  // 取modules/app.ts 下 state 定义的loading
  @State((state) => state.app.loading) private loading: any;
  @State((state) => state.app.user.id) private userId: any;
  // 取getters.ts下定义的
  @Getter("id") private id: any;

  private val = 10; // 变量

  private abc() {
    // 方法
  }

  private afd() {
    getUser("参数")
      .then((res: any) => {
        // 请求成功了
        console.log(res);
      })
      .catch((err: any) => {
        // 请求失败了
        console.log(err);
      });
  }
  // 初始化调用的函数
  private mounted() {
    console.log(this.loading);
    this.$store.dispatch("app/setLoading", true);
    console.log(this.loading);
    console.log(this.id);
    console.log(this.userId);
  }
}
</script>

<style lang="scss" scoped>
</style>
