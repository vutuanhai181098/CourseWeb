package com.course.app.courseApp.mapper.impl;

import com.course.app.courseApp.dto.CourseDto;
import com.course.app.courseApp.dto.UserDto;
import com.course.app.courseApp.mapper.CourseMapper;
import com.course.app.courseApp.model.Course;
import com.course.app.courseApp.request.UpsertCourseRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseDto mapToDto(Course course, UserDto userDto) {

        return CourseDto.builder()
                .id(course.getId())
                .name(course.getName())
                .description(course.getDescription())
                .type(course.getType())
                .topics(course.getTopics())
                .thumbnail(course.getThumbnail())
                .userDto(userDto)
                .build();
    }

    @Override
    public Course convertTo(UpsertCourseRequest upsertCourseRequest) {
        String name = upsertCourseRequest.getName();
        String type = upsertCourseRequest.getType();
        String description = upsertCourseRequest.getDescription();
        List<String> topics = upsertCourseRequest.getTopics();
        String thumbnail = upsertCourseRequest.getThumbnail();
        Integer userId = upsertCourseRequest.getUserId();
        return new Course(name, description, type, topics, thumbnail, userId);
    }
}
