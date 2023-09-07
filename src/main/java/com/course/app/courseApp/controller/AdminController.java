package com.course.app.courseApp.controller;

import com.course.app.courseApp.request.UpsertCourseRequest;
import com.course.app.courseApp.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/courses")
public class AdminController {
    @Autowired
    private CourseService courseService;
    @GetMapping("")
    public ResponseEntity<?> getAllCourses(){
        return new ResponseEntity<>(courseService.getAllCourse(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Integer id){
        return new ResponseEntity<>(courseService.getCourseById(id), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> createCourse(@Valid @RequestBody UpsertCourseRequest upsertCourseRequest){
        return new ResponseEntity<>(courseService.createCourse(upsertCourseRequest), HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateCourse(@PathVariable Integer id, @Valid @RequestBody UpsertCourseRequest upsertCourseRequest){
        return new ResponseEntity<>(courseService.updateCourse(id, upsertCourseRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Integer id){
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
