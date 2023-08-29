package com.course.app.courseApp.mapper;

import com.course.app.courseApp.dto.CourseDto;
import com.course.app.courseApp.dto.UserDto;
import com.course.app.courseApp.model.Course;
import com.course.app.courseApp.request.UpsertCourseRequest;

public interface CourseMapper {
    CourseDto mapToDto(Course course, UserDto userDto);

    Course convertTo(UpsertCourseRequest upsertCourseRequest);
}
