import Vue from 'vue';
import Router from 'vue-router';

import HomePage from '../home/HomePage'
import LoginPage from '../login/LoginPage'
import RegisterPage from '../register/RegisterPage'
import AboutUsPage from '../about/AboutUsPage'
import ContactPage from '../contact/ContactPage'
import FormDataPage from '../form/FormDataPage'
import SearchPage from '../search/SearchPage'
import InsightsPage from '../insight/InsightPage'

Vue.use(Router);

export const router = new Router({
  mode: 'history',
  routes: [
    { path: '/', component: HomePage },
    { path: '/login', component: LoginPage },
    { path: '/register', component: RegisterPage },
    { path: '/about', component: AboutUsPage },
    { path: '/contact', component: ContactPage },
    { path: '/formData', component: FormDataPage },
    { path: '/search', component: SearchPage },
    { path: '/insights', component: InsightsPage },

    // otherwise redirect to home
    { path: '*', redirect: '/' }
  ]
});

router.beforeEach((to, from, next) => {
  // redirect to login page if not logged in and trying to access a restricted page
  const publicPages = ['/login', '/register'];
  const authRequired = !publicPages.includes(to.path);
  const loggedIn = localStorage.getItem('user');

  if (authRequired && !loggedIn) {
    return next('/login');
  }

  next();
})