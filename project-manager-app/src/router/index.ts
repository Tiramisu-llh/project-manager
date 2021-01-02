import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'

Vue.use(VueRouter)

const routes: Array<RouteConfig> = [
  { 
    path: '/home', name: 'Home', component: () => import('../views/home/index.vue'),
    children: [
      { path: 'example', name: 'Example', component: () => import('../views/home/Example.vue') },
      { path: 'test', name: 'Example', component: () => import('../views/test/test.vue') },
      { path: 'table', name: 'Example', component: () => import('../views/test/Table.vue') }
    ]
  },


  // test
  { path: '/', name: 'Home', component: () => import('../views/tsTemplate.vue') },
  { path: '/navbar', name: 'navbar', component: () => import('../views/test/navbar.vue') },
  { path: '/get', name: 'get', component: () => import('../views/test/Get.vue') },
  { path: '/post', name: 'get', component: () => import('../views/test/Post.vue') },
  
    // { path: '/test1', name: 'test1', component: () => import('../views/article/test1.vue') },
  // { path: '/navbar1', name: 'navbar1', component: () => import('../views/home/navbar1.vue') },
  { path: '/login', name: 'login', component: () => import('../views/user/login.vue') },
  // { path: '/page', name: 'page', component: () => import('../views/home/page.vue') },
  // { path: '/float', name: 'float', component: () => import('../views/home/float.vue') },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})
export default router

