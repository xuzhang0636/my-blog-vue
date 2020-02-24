<template>
    <div>
        <div v-for="(article, index) in articles" class="card text-center" :key="index">
            <div class="card-header">
                Featured
            </div>
            <div class="card-body">
                <h5 class="card-title">{{article.title}}</h5>
                <a href="#" class="btn btn-primary">查看</a>
            </div>
            <div class="card-footer text-muted">
                2 days ago
            </div>
        </div>
    </div>
</template>

<script>
    import ArticleDataService from "../../services/ArticleDataService";

    export default {
        name: "ArticleList",
        data() {
            return {
                articles: []
            };
        },
        methods: {
            getAllArticles() {
                ArticleDataService.getAll().then(response => {
                    this.articles = response.data;
                }).catch(err => {
                    console.log(err);
                });
            }
        },
        mounted() {
            this.getAllArticles();
        }
    }
</script>

<style scoped>
</style>