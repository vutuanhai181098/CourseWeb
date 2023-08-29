package com.course.app.courseApp.repository.impl;

import com.course.app.courseApp.database.UserDB;
import com.course.app.courseApp.model.User;
import com.course.app.courseApp.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> getAllUser() {
        return UserDB.userList;
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        return UserDB.userList.stream().filter(user -> user.getId().equals(id)).findFirst();
    }
}
