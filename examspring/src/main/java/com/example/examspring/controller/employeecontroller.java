package com.example.examspring.controller;
import com.example.examspring.entity.employee;
import com.example.examspring.DTO.employeeDto;
import com.example.examspring.service.employeerServiceRepository;
import com.example.examspring.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
public class employeecontroller {

    @RestController
    public class EmployeeController {
        @Autowired
        private EmployeeService employeeService;

        @GetMapping("/create")
        public String createEmployee() {
            employeeService.createEmployee(1, "John Doe", 50000.00);
            return "Employee created!";
        }

        @GetMapping("/findAll")
        public List<employee> findAllEmployees() {
            return employeeService.findAllEmployees();
        }
    }
}
