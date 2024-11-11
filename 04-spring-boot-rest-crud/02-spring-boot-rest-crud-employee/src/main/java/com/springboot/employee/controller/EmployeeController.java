package com.springboot.employee.controller;

import com.springboot.employee.entity.Employee;
import com.springboot.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        Employee tempEmployee = employeeService.findById(id);
        if (Objects.isNull(tempEmployee)) {
            throw new RuntimeException("Employee id not found - " + id);
        }
        employeeService.deleteById(id);
    }

}
