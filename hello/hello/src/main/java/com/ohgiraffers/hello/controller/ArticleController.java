package com.ohgiraffers.hello.controller;

import com.ohgiraffers.hello.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return"articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toSring());

        //1.Dto를 변환! Entity!
        Article article = form.toEntity();

        //2. Repository에게 Entity를 DB에 저장하게 함!
        return "";
    }
}
