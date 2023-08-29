package com.course.app.courseApp.controller;

import com.course.app.courseApp.dto.CourseDto;
import com.course.app.courseApp.dto.UserDto;
import com.course.app.courseApp.service.CourseService;
import com.course.app.courseApp.service.TopicService;
import com.course.app.courseApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/courses")
public class AdminViewController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private TopicService topicService;
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String getAdminPage(Model model){
        List<CourseDto> courseDtoList = courseService.getAllCourse();
        model.addAttribute("courseList", courseDtoList);
        return "admin-page";
    }

    @GetMapping("/create")
    public String getCreateCoursePage(Model model){
        List<String> topics = topicService.getALlTopic();
        List<UserDto> userDtos = userService.getALlUser();
        model.addAttribute("topics" , topics);
        model.addAttribute("userDtos", userDtos);
        return "create-course-page";
    }

    @GetMapping("/{id}")
    public String getCourseById(@PathVariable Integer id, Model model){
        CourseDto courseDto = courseService.getCourseById(id);
        model.addAttribute("course" , courseDto);
        return "detail-course";
    }
}
