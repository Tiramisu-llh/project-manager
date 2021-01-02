<template>
  <div>
    <el-form ref="form" :model="userForm" label-width="80px">
      <el-form-item label="用户名">
        <el-input v-model="userForm.username"></el-input>
      </el-form-item>
      <el-form-item label="年龄">
        <el-input type="number" v-model="userForm.age"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="addUser">添加</el-button>
        <el-button>取消</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import { State, Getter } from "vuex-class";
import { addUser } from "@/api/user";

@Component
export default class HelloWorld extends Vue {
  private userForm = {
    username: "",
    age: "",
  };
  private addUser() {
    console.log(this.userForm)

    addUser(this.userForm).then((res) => {
      console.log(res);
    });
  }
}
</script>

<style lang="scss" scoped>
</style>
