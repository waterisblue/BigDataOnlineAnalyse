<template>
    <div class="q-pa-md">
        <div class="column" style="height: 80vh;">
            <div class="col-3">
                <div class="q-pa-md q-gutter-md"> 
                    <q-btn push color="white" text-color="primary" label="未读消息">
                        <q-badge color="orange" floating>22</q-badge>
                    </q-btn>
                    <q-btn dense round flat icon="email">
                        <q-badge color="red" floating transparent>
                            4
                        </q-badge>
                    </q-btn>

                    <div class="text-h4">
                        大数据云分析平台
                    <q-badge outline align="middle" color="teal">
                        v1.0.0
                    </q-badge>
                    </div>
                </div>
            </div>
            <div class="col-3" >
                <q-banner rounded class="bg-grey-3">
                <template v-slot:avatar>
                    <img
                    src="https://cdn.quasar.dev/img/mountains.jpg"
                    style="width: 64px; height: 64px; border-radius: 10%;"
                    >
                </template>
                <span style="font-size: large;">
                    waterIB
                </span>
                <template v-slot:action>
                    <q-btn flat label="注销" />
                </template>
                </q-banner>
            </div>
            <div class="col-6">
                <q-banner rounded class="bg-blue-8 text-white">
                    没有发现您的登录，请先登录后使用！
                <template v-slot:action>
                    <q-btn flat color="white" label="注册" />
                    <q-btn flat color="white" label="登录" />
                </template>
                </q-banner>
            </div>
        </div>
    </div>
</template>

<style scoped>

</style>