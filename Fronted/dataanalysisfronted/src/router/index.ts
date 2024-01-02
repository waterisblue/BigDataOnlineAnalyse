import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import DataView from '@/views/DataView.vue'
import ChartView from '../views/ChartView.vue'
import InfoView from '../views/InfoView.vue'
import UploadData from '@/components/UploadData.vue'
import ReadData from '@/components/ReadData.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/index',
      name: 'index',
      component: HomeView
    },
    {
      path: '/data',
      name: 'data',
      component: DataView,
      children: [
        {path: '/data/upload', component: UploadData},
        {path: '/data', component: UploadData},
        {path: '/data/read', component: ReadData},
      ]
    },
    {
      path: '/chart',
      name: 'chart',
      component: ChartView
    },
    {
      path: '/info',
      name: 'info',
      component: InfoView
    },
  ]
})

export default router
