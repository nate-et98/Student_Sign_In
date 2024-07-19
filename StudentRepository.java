package com.advjava.testcenterform.repository;

import com.advjava.testcenterform.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}