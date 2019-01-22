package com.lrm;

import com.alibaba.fastjson.JSON;
import com.lrm.domain.Article;
import com.lrm.domain.Comment;
import com.lrm.service.ArticleService;
import com.lrm.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by limi on 2017/9/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentTests {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ArticleService articleService;

    @Test
    public void saveCommentTest() {
        Article article = articleService.findArticle(2L);

        Comment comment = new Comment();
        comment.setContent("关于互联网思维....");
        comment.setArticle(article);

        commentService.saveComment(comment);
    }

    @Test
    public void deleteCommentTest() {
        commentService.deleteComment(8L);
    }
}
