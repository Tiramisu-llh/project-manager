<template>
  <div>
    <el-row>
      <el-col :span="24">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>欢迎注册</span>
          </div>
          <div>
            <el-form
              status-icon
              ref="ruleForm"
              label-width="100px"
              class="demo-ruleForm"
            >
              <el-form-item label="邮箱" prop="pass">
                <el-input type="password" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item label="验证码" prop="checkPass">
                <el-input type="password" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item label="年龄" prop="age">
                <el-input></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary">下一步</el-button>
              </el-form-item>
            </el-form>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import { State, Getter } from "vuex-class";

@Component
export default class HelloWorld extends Vue {}
</script>

<style lang="scss" scoped>
.clearfix {
  text-align: center;
}
.box-card {
  width: 900px;
}
</style>
