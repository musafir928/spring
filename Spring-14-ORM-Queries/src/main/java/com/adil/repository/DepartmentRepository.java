package com.adil.repository;

import com.adil.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    //Display all Departments in the furniture department
    List<Department> findByDepartment(String department);

    //Display all Departments with not null division
    List<Department> findByDivisionIsNotNull();

    List<Department> findByDivisionEquals(String division);

    //Display top 3 departments with division name includes 'Hea', without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);

    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);

    // jpa-named-query file is holding this query
    List<Department> readDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern);
}
