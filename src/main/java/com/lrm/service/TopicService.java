package com.lrm.service;

import com.lrm.domain.Topic;

/**
 * Created by limi on 2017/9/11.
 */
public interface TopicService {

    Topic saveTopic(Topic topic);

    Topic findTopic(Long id);

    Topic updateTopic(Topic topic);

    Topic includeArticle(Long topicId, Long articleId);

    Topic unIncludeArticle(Long topicId, Long articleId);

    void deleteTopic(Long id);
}
