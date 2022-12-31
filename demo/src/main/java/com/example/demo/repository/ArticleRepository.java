package com.example.demo.repository;

import com.example.demo.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository <Article, Long> {

}
