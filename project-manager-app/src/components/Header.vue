<template>
  <div>
    <el-menu
      :default-active="currentPath"
      router
      mode="horizontal"
      background-color="white"
      text-color="#222"
      active-text-color="red">
      <el-menu-item>
        <img src="" alt="brand">
      </el-menu-item>
      <el-menu-item v-for="(item,i) in navList" :key="i" :index="item.name">
        {{ item.navItem }}
      </el-menu-item>
      <el-input
        placeholder="快速搜索"
        prefix-icon="el-icon-search"
        size="medium"
        style="width: 200px;position:absolute;margin-top: 12px;right: 15%"
        v-model="keywords">
      </el-input>
    </el-menu>
  </div>
</template>

<script>
  export default {
    name: 'NavMenu',
    data () {
      return {
        navList: [
          {name: '/test', navItem: '我的代办'},
          {name: '/build', navItem: '我的创建'},
          {name: '/created', navItem: '我的已建'},
          {name: '/manage', navItem: '管理中心'}
        ],
        keywords: ''
      }
    },
    computed: {
      hoverBackground () {
        return '#ffd04b'
      },
      currentPath () {
        var x = this.$route.path.indexOf('/', 1)
        if (x !== -1) {
          return this.$route.path.substring(0, x)
        } else {
          return this.$route.path
        }
      }
    }
  }
</script>

<style scoped>
  a{
    text-decoration: none;
  }
  span {
    pointer-events: none;
  }
</style>