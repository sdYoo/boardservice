package com.ssam.controller;

import com.ssam.model.Course;
import com.ssam.service.CoursesHardcodedService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@AllArgsConstructor
public class CourseResource {
    @Autowired
    private CoursesHardcodedService courseManagementService;

    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {

        System.out.println("getAllCourses()");
        return courseManagementService.findAll();
    }

    @DeleteMapping("/instructors/{username}/courses/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String username, @PathVariable long id) {
        System.out.println("deleteCourse() / UserName: "+username + "/ ID: "+id);
        Course course = courseManagementService.deleteById(id);

        if (course != null) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/instructors/{username}/courses/{id}")
    public Course getCourse(@PathVariable String username, @PathVariable long id) {
        return courseManagementService.findById(id);
    }

    @GetMapping("/viewTest")
    public String geoTest() {
        System.out.println("viewTest!");
        return "viewTest!";
    }
}
