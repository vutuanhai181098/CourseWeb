package com.course.app.courseApp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class User {
    static AtomicInteger autoId = new AtomicInteger(0);
    Integer id;
    String name;
    String email;
    String phone;
    String avatar;

    public User(String name, String email, String phone, String avatar){
        this.id = autoId.incrementAndGet();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
    }
}