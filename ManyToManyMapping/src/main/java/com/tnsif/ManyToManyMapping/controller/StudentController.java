package com.tnsif.ManyToManyMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.ManyToManyMapping.entity.Student;
import com.tnsif.ManyToManyMapping.service.StudentServicempl;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServicempl StudentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return StudentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return StudentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return StudentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return StudentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        StudentService.deleteStudent(id);
    }
}