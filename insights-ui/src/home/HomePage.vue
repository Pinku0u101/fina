<template>
    <div class="sngc">
    <div class="titlebar">
        <h2 >Hi {{ user }}! </h2>
        <button v-on:click.prevent="logOut" style="float:right; width:100px; margin-right:10px;">LogOut</button>
        </div>
        <p class="text1">Welcome To SNGC Insights</p>
        <p style="background-color:olive">
        <a href="/insights">Click here to get recently searched Insights</a>
        </p>

        <table>
        <tr><th colspan="5">Tip Of The Day : Cold Busting Foods</th></tr>
        <tr><td colspan="5">Apple</td></tr>
        <tr><td colspan="5">Garlic</td></tr>
        <tr><td colspan="5">White Mushrooms</td></tr>
        <tr><td colspan="5">Dried Cranberries</td></tr>
        <tr><td colspan="5">Pomogranate</td></tr>
        </table>
    </div>
</template>

<script>
import { router } from '../_helpers';

export default {
    data() {
        return {
            user:''
            
        }
    },
    mounted:function(){
        this.getDashBoard()
    },
    methods:{
        getDashBoard:function(){
            this.user = localStorage.getItem('userName')
        },
        logOut:function(){
            localStorage.clear()
            router.push('/login')
        
        }
    }
}
</script>