package com.studentproject3.project3.repository;

import com.studentproject3.project3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository <Student, Long> {

}
