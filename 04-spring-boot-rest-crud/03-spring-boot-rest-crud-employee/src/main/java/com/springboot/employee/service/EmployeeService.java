package com.springboot.employee.service;

import com.springboot.employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Optional<Employee> findById(Integer id);

    Employee save(Employee employee);

    void deleteById(Integer id);

}
