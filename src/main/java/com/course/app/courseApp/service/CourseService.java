package com.course.app.courseApp.service;

import com.course.app.courseApp.dto.CourseDto;
import com.course.app.courseApp.model.Course;
import com.course.app.courseApp.request.UpsertCourseRequest;

import java.util.List;

public interface CourseService {

    List<CourseDto> getAllCourse();

    CourseDto getCourseById(Integer id);

    CourseDto createCourse(UpsertCourseRequest upsertCourseRequest);

    void deleteCourse(Integer id);

    CourseDto updateCourse(Integer id, UpsertCourseRequest upsertCourseRequest);
}
