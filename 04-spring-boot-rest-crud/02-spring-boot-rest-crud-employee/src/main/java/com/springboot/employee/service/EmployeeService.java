package com.springboot.employee.service;

import com.springboot.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee employee);

    void deleteById(Integer id);

}
