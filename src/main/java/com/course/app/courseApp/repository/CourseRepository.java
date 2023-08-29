package com.course.app.courseApp.repository;

import com.course.app.courseApp.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {
    List<Course> getAllCourse();

    Optional<Course> getCourseById(Integer id);

    void save(Course course);

    void delete(Course course);
}
