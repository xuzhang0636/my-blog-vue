package com.xuzhang.springbootvuecrud.controller;

import com.xuzhang.springbootvuecrud.model.Article;
import com.xuzhang.springbootvuecrud.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/articles")
    public ResponseEntity<List<Article>> getAllArticles() {
        return new ResponseEntity<>(articleRepository.findAll(), HttpStatus.OK);
    }
}
