package com.studentproject3.project3.controller;

import com.studentproject3.project3.entity.Course;
import com.studentproject3.project3.entity.Student;
import com.studentproject3.project3.service.CourseService;
import com.studentproject3.project3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/course")
    public Course saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }




}
