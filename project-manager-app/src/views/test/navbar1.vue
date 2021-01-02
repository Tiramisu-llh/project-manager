<template>
<!-- 不能限定高 -->
  <el-container style="height: 1000px; border: 1px solid #eee">
    <!-- <el-aside width="200px" style="background-color: rgb(238, 241, 246)"> -->
    <!-- 侧边导航栏 -->
    <el-menu 
      class="el-menu"
      :default-active="$route.path"
      @open="handleOpen"
      @close="handleClose"
      :collapse="isCollapse"
    >
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span slot="title">导航一</span>
        </template>
      </el-submenu>

      <el-submenu index="2">
        <template slot="title"><i class="el-icon-menu"></i>导航二</template>
      </el-submenu>

      <el-submenu index="3">
        <template slot="title"><i class="el-icon-setting"></i>导航三</template>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"><i class="el-icon-edit"></i>导航四</template>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"
          ><i class="el-icon-message-solid"></i>导航五</template
        >
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"><i class="el-icon-s-order"></i>导航六</template>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"
          ><i class="el-icon-s-comment"></i>导航七</template
        >
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"><i class="el-icon-folder"></i>导航八</template>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"
          ><i class="el-icon-user-solid"></i>导航九</template
        >
      </el-submenu>
    </el-menu>

    <el-container>
      <el-header style="text-align: right; font-size: 12px;">
        <el-dropdown>
          <i class="el-icon-setting" style="margin-right: 15px"></i>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>查看</el-dropdown-item>
            <el-dropdown-item>新增</el-dropdown-item>
            <el-dropdown-item>删除</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </el-header>
      <el-main style="background-color: rgb(238, 241, 246)">
        <el-row :gutter="20">
          <el-col :span="12" class="el-col">
            <el-card
              :body-style="{ padding: '0px', height: '360px' }"
              shadow="always"
            >
            </el-card>
          </el-col>
          <el-col :span="12">
            <el-card
              :body-style="{ padding: '0px', height: '360px' }"
              shadow="always"
            >
            </el-card>
          </el-col>
        </el-row>
        <el-row :gutter="20" class="el-row">
          <el-col :span="12" class="el-col">
            <el-card
              :body-style="{ padding: '0px', height: '360px' }"
              shadow="always"
            >
            </el-card>
          </el-col>
          <el-col :span="12">
            <el-card
              :body-style="{ padding: '0px', height: '360px' }"
              shadow="always"
            >
            </el-card>
          </el-col>
        </el-row>
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>
<style>
.el-header {
  background-color: #b3c0d1;
  color: #333;
  line-height: 60px;
}
.el-col {
  height: 200px;
}
.el-row {
  margin-bottom: 200px;
}
.el-aside {
  color: #333;
}

.el-menu {
  min-width: 149px;
  /* position: fixed; */
}
</style>