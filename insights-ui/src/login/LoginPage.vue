<template>
    <div class="sngc">
<h2 class="titlebar">Login</h2>
        <form @submit.prevent="handleSubmit">
            <div class="form-group" >
                <label for="username" class="labelClass">Username</label>
                <input type="text" v-model="username" name="username" class="form-control" :class="{ 'is-invalid': submitted && !username }" />
                <div v-show="submitted && !username" class="invalid-feedback">Username is required</div>
            </div>
            <div class="form-group">
                <label htmlFor="password" class="labelClass">Password</label>
                <input type="password" v-model="password" name="password" class="form-control" :class="{ 'is-invalid': submitted && !password }" />
                <div v-show="submitted && !password" class="invalid-feedback">Password is required</div>
            </div>
            <div class="form-button">
                <button class="btn-primary" :disabled="status.loggingIn" style="border-style: ridge;font-size: 20px;background-color: cornflowerblue;color:white;text-decoration: none;border-width: 5px;">Login</button>
                <router-link to="/register" style="border-style: ridge;font-size: 20px;background-color: cornflowerblue;color:white;text-decoration: none;border-width: 5px;" class="btn-primary">Register</router-link>
            </div>
        </form>
    </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'

export default {
    data () {
        return {
            username: '',
            password: '',
            submitted: false
        }
    },
    computed: {
        ...mapState('account', ['status'])
    },
    created () {
        // reset login status
        this.logout();
    },
    methods: {
        ...mapActions('account', ['login', 'logout']),
        handleSubmit (e) {
            this.submitted = true;
            const { username, password } = this;
            if (username && password) {
                this.login({ username, password })
            }
            else{
                this.username= '';
                this.password= '';
            }
        }
    }
};
</script>