import Vue from 'vue';
import VeeValidate from 'vee-validate';
import VueResource from 'vue-resource';
import VueApexCharts from 'vue-apexcharts'

import { store } from './_store';
import { router } from './_helpers';
import App from './app/App';

Vue.use(VeeValidate);
Vue.use(VueResource);
Vue.component('apexchart', VueApexCharts)

// setup fake backend
import { configureFakeBackend } from './_helpers';
configureFakeBackend();

new Vue({
    el: '#app',
    router,
    store,
    render: h => h(App)
});