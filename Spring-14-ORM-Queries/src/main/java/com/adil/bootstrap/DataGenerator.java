package com.adil.bootstrap;

import com.adil.repository.DepartmentRepository;
import com.adil.repository.EmployeeRepository;
import com.adil.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    RegionRepository regionRepository;
    DepartmentRepository departmentRepository;
    EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        regionRepository.findByCountry("Canada").forEach(System.out::println);
        departmentRepository.findByDivisionIsNotNull().forEach(System.out::println);
        System.out.println(employeeRepository.getEmployeeDetail());
    }
}
