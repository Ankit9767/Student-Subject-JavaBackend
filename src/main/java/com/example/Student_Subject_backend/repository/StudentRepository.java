package com.example.Student_Subject_backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student_Subject_backend.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

