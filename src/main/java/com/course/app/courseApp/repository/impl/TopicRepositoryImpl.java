package com.course.app.courseApp.repository.impl;

import com.course.app.courseApp.database.TopicDB;
import com.course.app.courseApp.repository.TopicRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TopicRepositoryImpl implements TopicRepository {
    @Override
    public List<String> getAllTopic() {
        return TopicDB.topicList;
    }
}
