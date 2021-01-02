<template>
  <div class="container">
    <el-divider>登录</el-divider>
    <el-row :gutter="20">
      <el-col :md="10" :sm="9" class="text-center">
        <i class="el-icon-cloudy" style="font-size: 350px; "></i>
      </el-col>

      <el-col :md="13" :sm="15" style="margin-top: 50px;">
        <el-form ref="form" label-width="160px">
          <el-form-item label="用户名：">
            <el-input
              placeholder="请输入用户名"
              v-model="loginForm.account"
              suffix-icon="el-icon-user-solid"
            ></el-input>
          </el-form-item>

          <el-form-item label="密码：">
            <!-- .trim自动过滤输入内容最开始和最后的空格，中间的会保留一个空格，多的会被过滤掉 -->
            <el-input
              placeholder="请输入密码"
              v-model.trim="loginForm.password"
              suffix-icon="el-icon-key"
            ></el-input>
          </el-form-item>
          <div class="form-group-btn">
            <el-button type="primary" @click="login" style="width:200px; margin-left:170px;">登录</el-button>
            <el-button @click="goRegister()" style="width:200px;">注册</el-button>
          </div>
        </el-form>
      </el-col>
    </el-row>
    <el-divider></el-divider>
    <div class="text-center">You can also sign up with：</div>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      loginForm: {
        account: 'user@qq.com',
        password: '123456'
      }
    }
  },
  methods: {
    login () {
      this.$axios
        .post('http://39.107.230.57:9100/api/v1/login', {
          account: this.loginForm.account,
          password: this.loginForm.password
        })
        .then(res => {
          console.log(res)
          console.log(res.data.code)
          if (res.data.code === 0) {
            console.log(res.data.data.userName)
            this.$router.replace('/index')
          } else {
            console.log(res.data.message)
          }
        }) /* eslint handle-callback-err: "warn" */
        .catch(error => {})
    },
    goRegister () {
      this.$router.push({ path: '/register' })
    }
  }
}
</script>

<style scoped>
</style>