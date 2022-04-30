package com.adil.bootstrap;

import com.adil.repository.CourseRepository;
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
    CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        regionRepository.findByCountry("Canada").forEach(System.out::println);
        departmentRepository.findByDivisionIsNotNull().forEach(System.out::println);
        System.out.println(employeeRepository.getEmployeeDetail());

        System.out.println(courseRepository.countByCategory("Spring"));
        System.out.println(courseRepository.countCourseByCategory("Spring"));
    }
}
