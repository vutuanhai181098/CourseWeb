package com.course.app.courseApp.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserDto {
    Integer id;
    String name;
    String email;
    String phone;
    String avatar;
}
