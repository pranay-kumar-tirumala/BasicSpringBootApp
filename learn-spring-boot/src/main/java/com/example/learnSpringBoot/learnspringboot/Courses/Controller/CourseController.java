package com.example.learnSpringBoot.learnspringboot.Courses.Controller;

import com.example.learnSpringBoot.learnspringboot.Courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1,"Spring Boot","in28minutes") ,
                new Course(2,"Angular","in28minutes") ,
                new Course(3,"JavaScript","in28minutes")
        );
    }
    @GetMapping("/course1")
    public List<Course> getCourse(){
        return Arrays.asList(
                new Course(1,"Spring Boot","in28minutes")
        );
    }
}