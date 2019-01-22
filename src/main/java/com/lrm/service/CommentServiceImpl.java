package com.lrm.service;

import com.lrm.domain.Comment;
import com.lrm.domain.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by limi on 2017/9/11.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Transactional
    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Transactional
    @Override
    public void deleteComment(Long id) {
        //第一版
       /* Comment commentById = commentRepository.findCommentById(id);
       //清楚关系
        List<Comment> comments = commentById.getArticle().getComments();
        for (Comment comment: comments) {
            if(id.equals(comment.getId())){
                comments.remove(comment);
            }
        }
        commentRepository.delete(id);*/
       //第二版
        /*Comment comment = commentRepository.findOne(id);
        //清楚关系
        comment.clearComment();
        commentRepository.delete(id);*/
    }
}
