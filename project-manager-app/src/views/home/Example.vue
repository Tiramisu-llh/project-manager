<template>
  <div>
    <div v-for="i in 20" :key="i" style="padding: 30px">
      Lorem ipsum dolor sit, amet consectetur adipisicing elit. Sequi culpa nesciunt officia, minima animi voluptas exercitationem earum odit blanditiis quos. Est numquam itaque aspernatur, accusamus ut dolor commodi error quos.
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import { State, Getter } from 'vuex-class';

@Component
export default class Example extends Vue {

}
</script>

<style lang="scss" scoped>

</style>
