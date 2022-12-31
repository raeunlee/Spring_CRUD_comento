package service;

import com.example.demo.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ArticleRepository;
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public void create(Article article) {
        articleRepository.save(article);
    }
}
