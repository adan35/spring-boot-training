package com.practice.project1.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return  List.of(new Student(1L, "Adan", "adanshahzad35@gmail.com", "2000-12-20", 35));
    }

}
