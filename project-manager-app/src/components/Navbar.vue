<template>
  <div>
    <el-menu 
      class="co-menu-wrap"
      :default-active="active"
      @open="handleOpen"
      @close="handleClose"
      :collapse="isCollapse"
      style="max-height: 100vh"
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
      <el-submenu index="4">
        <template slot="title"><i class="el-icon-edit"></i>导航四</template>
      </el-submenu>
      <el-submenu index="5">
        <template slot="title"
          ><i class="el-icon-message-solid"></i>导航五</template
        >
      </el-submenu>
      <el-submenu index="6">
        <template slot="title"><i class="el-icon-s-order"></i>导航六</template>
      </el-submenu>
      <el-submenu index="7">
        <template slot="title"
          ><i class="el-icon-s-comment"></i>导航七</template
        >
      </el-submenu>
      <el-submenu index="8">
        <template slot="title"><i class="el-icon-folder"></i>导航八</template>
      </el-submenu>
      <el-submenu index="9">
        <template slot="title"><i class="el-icon-user-solid"></i>
          导航九
        </template>
      </el-submenu>
      <el-submenu index="10">
        <template slot="title"><i class="el-icon-user-solid"></i>
          导航九
        </template>
      </el-submenu>
      <el-submenu index="11">
        <template slot="title"><i class="el-icon-user-solid"></i>
          导航九1
        </template>
      </el-submenu>
    </el-menu>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import { State, Getter } from 'vuex-class';

@Component
export default class HelloWorld extends Vue {
  private active = 1;
}
</script>

<style lang="scss" scoped>

</style>