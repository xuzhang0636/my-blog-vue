package com.xuzhang.springbootvuecrud.repository;

import com.xuzhang.springbootvuecrud.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
