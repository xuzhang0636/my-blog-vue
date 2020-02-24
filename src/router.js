import Vue from "vue";
import Router from 'vue-router';

Vue.use(Router);

export default new Router({
    mode: "history",
    routes: [
        {
            path: "/",
            alias: "/tutorials",
            name: "tutorials",
            component: () => import("./components/TutorialsList")
        },
        {
            path: "/tutorials/:id",
            name: "tutorial-details",
            component: () => import("./components/Tutorial")
        },
        {
            path: "/add",
            name: "add",
            component: () => import("./components/AddTutorial")
        },
        {
            path: '/articles',
            name: 'articles',
            component: () => import("./components/article/ArticleList")
        },
        {
            path: '/aboutme',
            name: 'aboutme',
            component: () => import("./components/AboutMe")
        }, {
            path: '/articles/:id',
            name: 'article-detail',
            component: () => import("./components/article/Article")
        }
    ]
});