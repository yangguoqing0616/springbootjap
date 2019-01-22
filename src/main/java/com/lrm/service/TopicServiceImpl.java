package com.lrm.service;

import com.alibaba.fastjson.JSON;
import com.lrm.domain.Article;
import com.lrm.domain.ArticleRepository;
import com.lrm.domain.Topic;
import com.lrm.domain.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by limi on 2017/9/11.
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private ArticleRepository articleRepository;

    @Transactional
    @Override
    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    @Transactional
    @Override
    public Topic findTopic(Long id) {
        /*Topic topic = topicRepository.findOne(id);
        System.out.println(JSON.toJSONString(topic,true));
        return topic;*/
        return null;
    }

    @Transactional
    @Override
    public Topic updateTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    @Transactional
    @Override
    public Topic includeArticle(Long topicId, Long articleId) {
       /* Topic topic = topicRepository.findOne(topicId);
        Article article = articleRepository.findOne(articleId);
        topic.getArticles().add(article);
        return topic;*/
        return null;
    }

    @Transactional
    @Override
    public Topic unIncludeArticle(Long topicId, Long articleId) {
        /*Topic topic = topicRepository.findOne(topicId);
        Article article = articleRepository.findOne(articleId);
        topic.getArticles().remove(article);
        return topic;*/
        return null;
    }

    @Transactional
    @Override
    public void deleteTopic(Long id) {
        //topicRepository.delete(id);
    }
}
