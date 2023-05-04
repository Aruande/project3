package com.studentproject3.project3.service;

import com.studentproject3.project3.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getStudents();
    
    Student updateStudent(Student student, Long studentId);


    void deleteStudent(Long studentId);
}
