package com.lrm.service;

import com.lrm.domain.Article;

/**
 * Created by limi on 2017/9/10.
 */
public interface ArticleService {

    Article saveArticle(Article article);

    Article updateArticle(Article article);

    Article findArticle(Long id);

    void deleteArticle(Long id);
}
