package com.example.examspring.controller;
import com.example.examspring.entity.employee;
import com.example.examspring.DTO.employeeDto;
import com.example.examspring.service.employeerServiceRepository;
import com.example.examspring.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class employeecontroller extends EmployeeService {

    @RestController
    public class EmployeeController {
        @Autowired
        private EmployeeService employeeService;


        @PostMapping(value="/create")
        public ResponseEntity<?> createNewItem(@RequestBody employeeDto employeeDtoDto, HttpServletRequest request){
            employeeDto classesDto1 = EmployeeService.(employee);
            return ResponseEntity.ok(classesDto1);
        }

        @GetMapping("/findAll")
        public List<employeeDto> getAllemployee() {
            return employeeService.getAll();
        }
    }
}
