package com.lrm.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by limi on 2017/9/10.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Transactional
    @Modifying
    @Query("delete from Comment c where c.id = ?1")
    void deleteBy(Long id);

    Comment findCommentById(Long id);
}
