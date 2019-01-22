package com.lrm.service;

import com.lrm.domain.Article;
import com.lrm.domain.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by limi on 2017/9/10.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article findArticle(Long id) {
        //return articleRepository.findOne(id);
        return null;
    }

    @Override
    public void deleteArticle(Long id) {
        //articleRepository.delete(id);

    }
}
