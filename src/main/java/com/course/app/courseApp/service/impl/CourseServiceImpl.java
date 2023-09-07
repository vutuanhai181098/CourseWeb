package com.course.app.courseApp.service.impl;

import com.course.app.courseApp.dto.CourseDto;
import com.course.app.courseApp.exception.ResourceNotFoundException;
import com.course.app.courseApp.mapper.CourseMapper;
import com.course.app.courseApp.mapper.UserMapper;
import com.course.app.courseApp.model.Course;
import com.course.app.courseApp.model.User;
import com.course.app.courseApp.repository.CourseRepository;
import com.course.app.courseApp.repository.UserRepository;
import com.course.app.courseApp.request.UpsertCourseRequest;
import com.course.app.courseApp.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired

    private UserRepository userRepository;
    @Autowired

    private CourseMapper courseMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<CourseDto> getAllCourse() {
        return courseRepository.getAllCourse().stream()
                .map(course -> {
                    User user = userRepository.getUserById(course.getUserId()).orElseThrow(() -> {
                        throw new ResourceNotFoundException("Not found user");
                    });
                    return courseMapper.mapToDto(course, userMapper.mapToDto(user));
                }).collect(Collectors.toList());
    }

    @Override
    public CourseDto getCourseById(Integer id) {
        Course course = courseRepository.getCourseById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Not found course");
        });
        User user = userRepository.getUserById(course.getUserId()).orElseThrow(() -> {
            throw new ResourceNotFoundException("Not found user");
        });
        return courseMapper.mapToDto(course, userMapper.mapToDto(user));
    }

    @Override
    public CourseDto createCourse(UpsertCourseRequest upsertCourseRequest) {
        Course course = courseMapper.convertTo(upsertCourseRequest);
        log.info("course={}", course);
        User user = userRepository.getUserById(course.getUserId()).orElseThrow(() -> {
            throw new ResourceNotFoundException("Not found user");
        });
        courseRepository.save(course);
        return courseMapper.mapToDto(course, userMapper.mapToDto(user));
    }

    @Override
    public void deleteCourse(Integer id) {
        Course course = courseRepository.getCourseById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Not found course");
        });
        courseRepository.delete(course);
    }

    @Override
    public CourseDto updateCourse(Integer id, UpsertCourseRequest upsertCourseRequest) {
        Course course = courseRepository.getCourseById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Not found course");
        });
        course.setName(upsertCourseRequest.getName());
        course.setType(upsertCourseRequest.getType());
        course.setDescription(upsertCourseRequest.getDescription());
        course.setTopics(upsertCourseRequest.getTopics());
        course.setThumbnail(upsertCourseRequest.getThumbnail());
        course.setUserId(upsertCourseRequest.getUserId());

        User user = userRepository.getUserById(course.getUserId()).orElseThrow(() -> {
            throw new ResourceNotFoundException("Not found user");
        });

        return courseMapper.mapToDto(course, userMapper.mapToDto(user));
    }
}
