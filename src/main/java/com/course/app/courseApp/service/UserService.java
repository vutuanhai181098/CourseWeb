package com.course.app.courseApp.service;


import com.course.app.courseApp.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getALlUser();

    UserDto getUerById(Integer id);

}
