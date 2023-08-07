package com.example.examspring.repository;

import com.example.examspring.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employeerepo extends JpaRepository<employee, Long>, JpaSpecificationExecutor {
    //    List<User> findAll();
    employee findById(long id);
}