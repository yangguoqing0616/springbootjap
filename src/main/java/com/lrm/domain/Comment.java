package com.lrm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by limi on 2017/9/10.
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String content;

    @ManyToOne//还可以在这里做一些级联更新得操作
    private Article article;


    public void clearComment() {
        this.getArticle().getComments().remove(this);
    }

    public Comment() {
    }

    public Comment(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
