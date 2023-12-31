package com.course.app.courseApp.database;

import com.course.app.courseApp.model.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CourseDB {
    public static List<Course> courseList = new ArrayList<>(
            List.of(
                    new Course("Data Structure - Algorithm - LeetCode", "Description 1", "online", List.of("backend"), "https://techmaster.vn/resources/image/thumbnail.jpg", 1),
                    new Course("Luyện thi FE", "Description 2", "onlab", List.of("basic"), "https://media.techmaster.vn/api/static/36/uhWHezPC", 1),
                    new Course("Java cấu trúc dữ liệu - giải thuật", "Description 3", "onlab", List.of("basic", "backend"), "https://media.techmaster.vn/api/static/36/bu7v5ak51co41h2qctt0", 1),
                    new Course("Java căn bản", "Description 4", "online", List.of("frontend", "backend", "devops"), "https://media.techmaster.vn/api/static/bub3enc51co7s932dsk0/ZuedW7J1", 1),
                    new Course("Spring Boot - Web Back End", "Description 5", "onlab", List.of("devops", "basic", "mobile"), "https://media.techmaster.vn/api/static/36/bu7v9ks51co41h2qcttg", 2),
                    new Course("Học lập trình Java trực tuyến", "Description 6", "onlab", List.of("database", "devops"), "https://media.techmaster.vn/api/fileman/Uploads/Java/banner-javabasic.png", 2),
                    new Course("Lập trình Web - API - Microservice bằng Golang", "Description 7", "onlab", List.of("backend", "database", "devops"), "https://media.techmaster.vn/api/static/36/bu803kc51co41h2qctug", 2),
                    new Course("Lập trình Lego Robot Inventor", "Description 8", "online", List.of("basic", "frontend"), "https://media.techmaster.vn/api/static/brbgh4451coepbqoch60/eQcu6FM-", 2),
                    new Course("Lộ trình DevOps", "Description 9", "online", List.of("devops"), "https://devops.techmaster.vn/resources/image/banner_devops.png", 3),
                    new Course("Nhập môn lập trình - giải thuật cơ bản", "Description 10", "onlab", List.of("backend"), "https://media.techmaster.vn/api/fileman/Uploads/users/5463/giaithuat-thumnail.png", 3),
                    new Course("Lập trình di động IOS Swift online", "Description 11", "onlab", List.of("mobile"), "https://media.techmaster.vn/api/static/8028/bqa348s51cocm3n1ubq0", 3),
                    new Course("Lập trình Nodejs (cập nhật 2022)", "Description 12", "online", List.of("basic", "backend"), "https://media.techmaster.vn/api/static/bub3enc51co7s932dsk0/6PyUoB-T", 3)
            )
    );
}
