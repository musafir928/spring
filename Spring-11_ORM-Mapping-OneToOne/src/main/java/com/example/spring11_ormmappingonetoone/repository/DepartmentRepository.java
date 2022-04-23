package com.example.spring11_ormmappingonetoone.repository;

import com.example.spring11_ormmappingonetoone.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
