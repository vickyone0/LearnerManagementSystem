package com.airtribe.LearnerManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airtribe.LearnerManagementSystem.entity.Course;
import com.airtribe.LearnerManagementSystem.service.LearnerService;

@RestController
public class CourseController {


    @Autowired
    private LearnerService _LearnerService;
    

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course) {
        return _LearnerService.createCourse(course);
    }
}
