<template>
    <div class="sngc">
        <h2 class="titlebar">Contact Us</h2>
        <h3 class="subtitle">We want to hear 
        <br>from you</h3>
        <p class="text1">Contact our team for more information about our insights solutions.</p>
        <h1 class="heading">Address</h1>
        <p class="text2">SNGC College</p>
        <p class="text2">Ernakulam</p>
        <p class="text2">Phone : 1223344556</p>

        <div class="leftdiv input-field col s5">
            <h2 class="subtitle1">Contact Form</h2>
            <div>
                <label for="email" class="contactform">EMAIL:</label>
                <input type="text" v-model="email" name="email"  class="textbox"/>
            </div>

            <div>
                <label class="contactform" >FIRST NAME:</label>
                <input type="text"  class="textbox" v-model="firstName" name="firstName"/>
            </div>

            <div>
                <label class="contactform">LAST NAME:</label>
                <input type="text" v-model="lastName" name="lastName"  class="textbox"/>
            </div>

            <div>
                <label class="contactform">COMPANY:</label>
                <input type="text" v-model="company" name="company"  class="textbox"/>
            </div>

            <div>
                <label class="contactform">PHONE:</label>
                <input type="text" v-model="phoneNumber" name="phoneNumber" class="textbox"/>
            </div>

            <div>
                <label class="contactform">MESSAGE:</label>
                <textarea v-model="message" name="message"  style="height:100px;text-align: inherit;" class="textbox" />
            </div>
            <div>
                <button v-on:click.prevent="post" style="margin-top:50px;margin-left:200px;"> Submit </button>
            </div>
        </div>
    </div>
</template>
<script>

export default{
    data(){
        return{
            email: '',
            firstName: '',
            lastName: '',
            company:'',
            phoneNumber: '',
            message: ''
        }
    },
    methods:{
        post:function(){
            this.$http.post('http://localhost:9004/contact',{
                email: this.email,
                firstName: this.firstName,
                lastName: this.lastName,
                phoneNumber: this.phoneNumber,
                message: this.message
            }).then(function(data){
                console.log(data); 
            });
        }
    }
}
</script>