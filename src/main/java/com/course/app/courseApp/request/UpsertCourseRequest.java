package com.course.app.courseApp.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UpsertCourseRequest {
    @NotBlank(message = "Tên không được để trống")
    String name;
    @NotBlank(message = "Mô tả không được để trống")
    @Size(min = 10, message = "Mô tả không được dưới 10 ký tự")
    String description;
    @NotBlank(message = "Type không được để trống")
    String type;
    List<String> topics;
    String thumbnail;
    @NotNull(message = "userid không được để trống")
    Integer userId;
}
