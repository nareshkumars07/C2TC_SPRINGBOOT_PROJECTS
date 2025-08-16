package com.tnsif.ManyToManyMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.ManyToManyMapping.entity.Course;
import com.tnsif.ManyToManyMapping.service.CourseServicempl;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseServicempl CourseService;

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return CourseService.saveCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return CourseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return CourseService.getCourseById(id);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return CourseService.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        CourseService.deleteCourse(id);
    }
}