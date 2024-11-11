package com.springboot.__spring_boot_rest_crud.controller;

import com.springboot.__spring_boot_rest_crud.dto.StudentErrorResponse;
import com.springboot.__spring_boot_rest_crud.entity.Student;
import com.springboot.__spring_boot_rest_crud.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private final List<Student> studentList = new ArrayList<>();

    @PostConstruct
    public void loadData() {
        studentList.add(new Student("John", "Doe"));
        studentList.add(new Student("Mary", "Public"));
        studentList.add(new Student("Samantha", "Doe"));
    }

    @GetMapping("/students}")
    public List<Student> getStudents() {
        return studentList;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if (studentId >= studentList.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return studentList.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
