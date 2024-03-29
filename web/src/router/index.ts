import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import HomeView from '../views/home.vue'
import About from '../views/AboutView.vue'
import Home from "@/views/home.vue";
import AdminEbook from "@/views/admin/admin-ebook.vue";

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/about',
    name: 'about',
    component: About
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    // component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },

    {
      path: '/admin/ebook',
      name: 'AdminEbook',
      component: AdminEbook
    },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
