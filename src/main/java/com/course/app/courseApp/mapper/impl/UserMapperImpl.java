package com.course.app.courseApp.mapper.impl;

import com.course.app.courseApp.dto.UserDto;
import com.course.app.courseApp.mapper.UserMapper;
import com.course.app.courseApp.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserDto mapToDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .avatar(user.getAvatar())
                .build();
    }
}
