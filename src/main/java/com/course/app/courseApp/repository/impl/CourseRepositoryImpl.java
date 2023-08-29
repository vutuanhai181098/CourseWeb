package com.course.app.courseApp.repository.impl;

import com.course.app.courseApp.database.CourseDB;
import com.course.app.courseApp.model.Course;
import com.course.app.courseApp.repository.CourseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public List<Course> getAllCourse() {
        return CourseDB.courseList;
    }

    @Override
    public Optional<Course> getCourseById(Integer id) {
        return CourseDB.courseList.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst();
    }

    @Override
    public void save(Course course) {
        CourseDB.courseList.add(course);
    }

    @Override
    public void delete(Course course) {
        CourseDB.courseList.remove(course);
    }
}
