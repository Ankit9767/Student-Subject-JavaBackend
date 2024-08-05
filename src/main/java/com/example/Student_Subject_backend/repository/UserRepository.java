package com.example.Student_Subject_backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student_Subject_backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

