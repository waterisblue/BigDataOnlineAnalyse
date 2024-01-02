<template>
    <div class="q-pa-lg">
        <div class="column" style="height: 80vh;">
            <div class="col-1">
                <q-btn-group spread>
                    <q-btn to="/data/upload" color="purple" label="数据上传" icon="timeline" />
                    <q-btn to="/data/read" color="purple" label="数据查看" icon="visibility" />
                </q-btn-group>
            </div>
            <div class="col-1"></div>
            <RouterView />
        </div>
    </div>
</template>

<script lang="ts">
    export default {

    }
</script>
<style scoped>
  
</style>