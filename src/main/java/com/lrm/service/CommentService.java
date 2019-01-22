package com.lrm.service;

import com.lrm.domain.Comment;

/**
 * Created by limi on 2017/9/11.
 */
public interface CommentService {

    Comment saveComment(Comment comment);

    void deleteComment(Long id);
}
