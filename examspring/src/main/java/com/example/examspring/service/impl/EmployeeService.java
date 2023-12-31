package com.example.examspring.service.impl;
import com.example.examspring.DTO.employeeDto;
import com.example.examspring.entity.employee;
import com.example.examspring.repository.employeerepo;
import com.example.examspring.service.employeerServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements employeerServiceRepository{
    @Autowired
    private employeerepo employeeRepository;

    public void createEmployee(int id, String name, double wage) {
        employee employee = new employee();
        employee.setId(id);
        employee.setName(name);
        employee.setName(String.valueOf(wage));
        employeeRepository.save(employee);
    }

    public List<employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public employee findById(long id) {
        return null;
    }

    public employeeDto createDTO(employeeDto createDTO) {
        employee newEmployee = new employee();
        newEmployee.setName(createDTO.getName());
        newEmployee.setWage(createDTO.getWage());

        employee savedEmployee = employeeRepository.save(newEmployee);

        employeeDto employeeDTO = new employeeDto();
        employeeDTO.setId(savedEmployee.getId());
        employeeDTO.setName(savedEmployee.getName());
        employeeDTO.setWage(savedEmployee.getWage());


        return employeeDTO;
    }
    @Override
    public employee getByName(String name) {
        return null;
    }

    @Override
    public List<employeeDto> getAll() {
        return null;
    }
}
