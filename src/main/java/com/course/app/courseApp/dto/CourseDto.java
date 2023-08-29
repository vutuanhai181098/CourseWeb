package com.course.app.courseApp.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CourseDto {
    Integer id;
    String name;
    String description;
    String type;
    List<String> topics;
    String thumbnail;
    UserDto userDto;
}
