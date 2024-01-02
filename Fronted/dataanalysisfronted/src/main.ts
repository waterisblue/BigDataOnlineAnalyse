import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import pinia from './stores'
import axios from 'axios'

// quasar
import { Quasar } from 'quasar'
import quasarLang from 'quasar/lang/zh-CN'
import 'quasar/dist/quasar.css'

import '@quasar/extras/roboto-font/roboto-font.css'
import '@quasar/extras/material-icons/material-icons.css'

const app = createApp(App)
axios.defaults.baseURL = '121.36.99.228:8080'
app.config.globalProperties.$http = axios

// quasar use
app.use(Quasar, {
    plugins: {},
    lang: quasarLang
})

app.use(router).use(pinia)
app.mount('#app')
