<template>
  <div>
    <el-button type="primary" @click="get()">Hello World</el-button>
  </div>
</template>

<script lang="ts">
import { getUser } from "@/api/user";
import { Component, Vue } from "vue-property-decorator";
import { State, Getter } from "vuex-class";
@Component
export default class HelloWorld extends Vue {
  private get() {
    getUser(1).then((res) => {
      console.log(res);
    });
  }
}
</script>

<style lang="scss" scoped>
</style>
