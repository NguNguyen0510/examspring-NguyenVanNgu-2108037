package com.example.examspring.service;
import com.example.examspring.entity.employee;

import java.util.List;

public interface employeerServiceRepository {
    employee findById(long id);
    boolean add(employee employee);
    employee getByName(String name);

    List<employee> getAll();
}