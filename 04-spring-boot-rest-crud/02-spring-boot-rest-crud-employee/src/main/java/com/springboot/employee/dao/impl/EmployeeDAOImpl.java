package com.springboot.employee.dao.impl;

import com.springboot.employee.dao.EmployeeDAO;
import com.springboot.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EmployeeDAOImpl implements EmployeeDAO {

    private final EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
