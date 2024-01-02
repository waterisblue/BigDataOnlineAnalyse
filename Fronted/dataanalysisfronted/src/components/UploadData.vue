<template>
    <div class="col-10">
        <q-form class="q-gutter-xl">
            <q-input
                filled
                v-model="fileName"
                label="数据名称"
                hint="上传数据后显示的名称"
                lazy-rules
                :rules="[ val => val && val.length > 0 || '请输入数据的名称']"
            />
            <div class="row">
                <div class="col-2 items-center" style="font-size: large;">数据格式：</div>
                <div class="col">
                    <q-option-group
                        v-model="fileTypeGroup"
                        :options="fileTypeOptions"
                        color="primary"
                        inline
                    />
                </div>
                
            </div>
            
            
            <q-file filled bottom-slots v-model="fileLocate" label="Label" counter max-files="12">
                <template v-slot:before>
                <q-icon name="folder_open" />
                </template>

                <template v-slot:hint>
                Field hint
                </template>

                <template v-slot:append>
                <q-btn round dense flat icon="add" @click.stop.prevent />
                </template>
            </q-file>
            <div class="column q-gutter-lg">
                <q-btn label="开始上传" type="submit" color="primary"/>
                <q-btn label="重新输入" type="reset" color="primary" flat />
            </div>
        </q-form>
    </div>
</template>

<script lang="ts">
import { ref }  from 'vue'
    export default {
        setup(){
            return {
                fileTypeGroup: ref('op1'),
                fileTypeOptions: [
                    {
                        label: 'csv',
                        value: 'op1'
                    },
                    {
                        label: 'xlsx',
                        value: 'op2'
                    },
                    {
                        label: 'txt',
                        value: 'op3'
                    }
                ],
                fileLocate: ref(null),
                fileName: ref("")
            }
        }
    }
</script>

<style>
</style>