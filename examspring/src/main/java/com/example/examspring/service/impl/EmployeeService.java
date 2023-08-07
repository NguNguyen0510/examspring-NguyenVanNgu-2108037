package com.example.examspring.service.impl;
import com.example.examspring.entity.employee;
import com.example.examspring.repository.employeerepo;
import com.example.examspring.service.employeerServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class EmployeeService implements employeerServiceRepository{
    @Autowired
    private employeerepo employeeRepository;

    public void createEmployee(int id, String name, double wage) {
        employee employee = new employee();
        employee.setId(id);
        employee.setName(name);
        employee.setWage(wage);
        employeeRepository.save(employee);
    }

    public List<employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public employee findById(long id) {
        return null;
    }

    @Override
    public boolean add(employee employee) {
        return false;
    }

    @Override
    public employee getByName(String name) {
        return null;
    }

    @Override
    public List<employee> getAll() {
        return null;
    }
}
