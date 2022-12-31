package com.example.demo.Controller;

import com.example.demo.dto.ArticleForm;
import com.example.demo.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired //스프링 부트가 이미 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
      return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());


        //1. Dto -> Entity
        Article article = form.toEntity();
        System.out.println(form.toString());

        //2. Repository에게 Entity를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());


        return"";
    }

}
