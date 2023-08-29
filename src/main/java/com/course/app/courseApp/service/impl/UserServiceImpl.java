package com.course.app.courseApp.service.impl;

import com.course.app.courseApp.dto.UserDto;
import com.course.app.courseApp.exception.ResourceNotFoundException;
import com.course.app.courseApp.mapper.UserMapper;
import com.course.app.courseApp.model.User;
import com.course.app.courseApp.repository.UserRepository;
import com.course.app.courseApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserDto> getALlUser() {
        return userRepository.getAllUser().stream()
                .map(user -> {
                    return userMapper.mapToDto(user);
                }).collect(Collectors.toList());
    }

    @Override
    public UserDto getUerById(Integer id) {
        User user = userRepository.getUserById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException("Not found user");
        });
        return userMapper.mapToDto(user);
    }
}
