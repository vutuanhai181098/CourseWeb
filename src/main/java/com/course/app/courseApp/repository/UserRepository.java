package com.course.app.courseApp.repository;

import com.course.app.courseApp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUser();
    Optional<User> getUserById(Integer id);
}
