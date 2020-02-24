import http from "../http-common";

class ArticleDataService {
    getAll() {
        return http.get("/articles");
    }
}

export default new ArticleDataService();