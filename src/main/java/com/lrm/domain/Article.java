package com.lrm.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by limi on 2017/9/10.
 */
@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

    @OneToMany(mappedBy = "article", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    //"@OneToMany(mappedBy = "article"" jap规定多的一方是维护方,就是存在外键的一方.
    //private List<Comment> comments ;
    private List<Comment> comments = new ArrayList<>();
    //保存的时候需要特殊注意,需要把一方的对象放进去
    public void addComment(Comment comment) {
        comment.setArticle(this);
        comments.add(comment);
    }


    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
