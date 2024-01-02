<template>
  <div class="q-pa-md">
    <q-layout view="hHh Lpr lff" container style="height: 650px; width: 1160px;" class="shadow-2 rounded-borders">
      <q-drawer
        v-model="drawer"
        show-if-above
        :mini="miniState"
        @mouseover="miniState = false"
        @mouseout="miniState = true"

        :width="200"
        :breakpoint="500"
        bordered
        class="bg-grey-3"
      >
        <q-scroll-area class="fit" :horizontal-thumb-style="{ opacity: 0 }">
          <q-list padding>
            <q-item clickable v-ripple :active="view === 'index'" @click="checkView('index')">
              <q-item-section avatar>
                <i class="iconfont">&#xe601;</i>
              </q-item-section>

              <q-item-section>
                Index
              </q-item-section>
            </q-item>

            <q-item clickable v-ripple :active="view === 'data'" @click="checkView('data')">
              <q-item-section avatar>
                <i class="iconfont">&#xe604;</i>
              </q-item-section>

              <q-item-section>
                Data
              </q-item-section>
            </q-item>

            <q-item clickable v-ripple :active="view === 'chart'" @click="checkView('chart')">
              <q-item-section avatar>
                <i class="iconfont">&#xe603;</i>
              </q-item-section>

              <q-item-section>
                Chart
              </q-item-section>
            </q-item>

            <q-separator />

            <q-item clickable v-ripple :active="view === 'info'" @click="checkView('info')">
              <q-item-section avatar>
                <i class="iconfont">&#xe602;</i>
              </q-item-section>

              <q-item-section>
                info
              </q-item-section>
            </q-item>
          </q-list>
        </q-scroll-area>
      </q-drawer>

      <q-page-container>
        <q-page padding>
          <RouterView />
        </q-page>
      </q-page-container>
    </q-layout>
  </div>
</template>


<script lang="ts">
  import { ref } from 'vue'
import router from './router';

  export default {
    setup () {
      return {
        drawer: ref(false),
        miniState: ref(true),
        view: ref("index")
      }
    },
    methods: {
      checkView(view: string) {
        this.view = view
        router.push(`/${view}`)
      }
    }
  }
</script>


<style scoped>

</style>
