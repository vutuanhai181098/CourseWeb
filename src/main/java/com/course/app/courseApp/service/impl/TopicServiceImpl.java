package com.course.app.courseApp.service.impl;

import com.course.app.courseApp.repository.TopicRepository;
import com.course.app.courseApp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicRepository topicRepository;
    @Override
    public List<String> getALlTopic() {
        return topicRepository.getAllTopic();
    }
}
