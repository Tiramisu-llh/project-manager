<template>
  <div>
    <el-button type="primary">Hello World</el-button> 
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import { State, Getter } from 'vuex-class';

@Component
export default class HelloWorld extends Vue {

}
</script>

<style lang="scss" scoped>

</style>
