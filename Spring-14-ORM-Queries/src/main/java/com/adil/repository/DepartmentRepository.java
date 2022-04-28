package com.adil.repository;

import com.adil.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    // find all departments
    List<Department> findByDepartment(String department);

    // find all departments by division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);
}
