package com.course.app.courseApp.model;

import com.course.app.courseApp.database.CourseDB;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Course {
    static AtomicInteger autoId = new AtomicInteger(0);
    Integer id;
    String name;
    String description;
    String type;
    List<String> topics;
    String thumbnail;
    Integer userId;
    public Course(String name, String description, String type, List<String> topics, String thumbnail, Integer userId) {
        this.id = autoId.incrementAndGet();
        this.name = name;
        this.description = description;
        this.type = type;
        this.topics = topics;
        this.thumbnail = thumbnail;
        this.userId = userId;
    }
}
