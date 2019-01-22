package com.lrm;

import com.alibaba.fastjson.JSON;
import com.lrm.domain.*;
import com.lrm.service.ArticleService;
import com.lrm.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by limi on 2017/9/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleTests {

    @Autowired
    private ArticleService articleService;


    @Test
    public void saveArticle() {
        //测试1
        /*Article article1 = new Article();
        article1.setTitle("小明测试");
        article1.setContent("这是测试数据");

        ArrayList<Comment> comments = new ArrayList<>();
        Comment comment = new Comment();
        comment.setContent("好");
        Comment comment10 = new Comment();
        comment10.setContent("很好");
        comments.add(comment);
        comments.add(comment10);
        article1.setContent(comments);
        articleService.saveArticle(article1);*/

       /* //复制的
        Article article = new Article();
        article.setTitle("关于创业");
        article.setContent("关于创业的一些想法....");

        Comment comment1 = new Comment("评论内容1");
        Comment comment2 = new Comment("评论内容2");

        article.addComment(comment1);
        article.addComment(comment2);

        articleService.saveArticle(article);*/
    }

    @Test
    public void updateArticle() {
        Article article = articleService.findArticle(3L);
        article.setContent("游记的一些所见所闻....");
        articleService.updateArticle(article);
    }

    @Test
    public void findArticle() {
        Article article = articleService.findArticle(3L);
        System.out.println(JSON.toJSONString(article, true));
    }

    @Test
    public void deleteArticle() {
        articleService.deleteArticle(1L);
    }

}
