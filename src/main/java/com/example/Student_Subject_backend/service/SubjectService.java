package com.example.Student_Subject_backend.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_Subject_backend.entity.Subject;
import com.example.Student_Subject_backend.repository.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}

