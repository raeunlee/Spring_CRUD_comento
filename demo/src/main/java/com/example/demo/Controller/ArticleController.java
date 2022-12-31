package com.example.demo.Controller;

import com.example.demo.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.ArticleService;

import java.awt.datatransfer.Clipboard;
import java.util.List;

@Controller
public class ArticleController {
    @Autowired //스프링 부트가 이미 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;
    private ArticleService articleService;

    @GetMapping("/articles/new")
    public String newArticleForm(){
      return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(Article article){
        articleService.create(article);
        return "";
    }


}
