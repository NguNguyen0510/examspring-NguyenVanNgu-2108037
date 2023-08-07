package com.example.examspring.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Getter
@Setter
public class employee {
    @Id
    private int id;
    private String name;
    private double wage;
}
