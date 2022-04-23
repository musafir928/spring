package com.example.spring11_ormmappingonetoone.repository;

import com.example.spring11_ormmappingonetoone.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
