package com.course.app.courseApp.mapper;

import com.course.app.courseApp.dto.UserDto;
import com.course.app.courseApp.model.User;

public interface UserMapper {
    UserDto mapToDto(User user);
}
