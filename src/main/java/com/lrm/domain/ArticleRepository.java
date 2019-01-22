package com.lrm.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by limi on 2017/9/10.
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
