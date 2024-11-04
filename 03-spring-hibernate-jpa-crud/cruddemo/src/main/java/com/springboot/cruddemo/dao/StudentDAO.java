package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findByLastName(String lastName);

    List<Student> findAll();

    void update(Student student);

    void deleteById(Integer id);

    void deleteAll();

}
