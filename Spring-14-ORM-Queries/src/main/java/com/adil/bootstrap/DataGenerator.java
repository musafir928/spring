package com.adil.bootstrap;

import com.adil.repository.DepartmentRepository;
import com.adil.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    RegionRepository regionRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        regionRepository.findByCountry("Canada").forEach(System.out::println);
    }
}
