package com.ssam.controller;

import com.ssam.model.Course;
import com.ssam.service.CoursesHardcodedService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CourseResource {
    @Autowired
    private CoursesHardcodedService courseManagementService;

    @GetMapping("/rest/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {

        System.out.println("getAllCourses!");
        return courseManagementService.findAll();
    }

    @GetMapping("/viewTest")
    public String geoTest() {
        System.out.println("viewTest!");
        return "viewTest!";
    }
}
