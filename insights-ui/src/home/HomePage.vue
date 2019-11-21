<template>
    <div class="sngc">
    <div class="titlebar">
        <h2 >Hi {{ user }}! </h2>
        <button v-on:click.prevent="logOut" style="float:right; width:100px; margin-right:10px;">LogOut</button>
        </div>
        <div style="background:url(./src/assets/sngc1.jpeg);background-repeat:no-repeat;background-size:cover;height:100%;">
        <p class="text1">Welcome To SNGC Insights</p>
        <p style="background-color:olive">
        <a href="/insights">Click here to get recently searched Insights</a>
        </p>

        <table style="border-color: red;border-style: groove;">
        <tr><th colspan="5" style="background-color: yellow;">Health Tip Of The Day :</th></tr>
        <tr   v-for="tip in tips" ><td colspan="5" style="background-color: yellow;"> {{tip}}</td></tr>
        </table>

        </div>
    </div>
</template>

<script>
import { router } from '../_helpers';

export default {
    data() {
        return {
            user:'',
            tips: []
            
        }
    },
    mounted:function(){
        this.getDashBoard()
    },
    methods:{
        getDashBoard:function(){
            this.user = localStorage.getItem('userName')
            this.$http.get('http://localhost:9004/user/tip').then(function(data){
                this.tips = data.body.slice(0,10);
            })
        },
        logOut:function(){
            localStorage.clear()
            router.push('/login')
        
        }
    }
}
</script>