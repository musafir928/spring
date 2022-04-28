package com.adil.repository;

import com.adil.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {
    // find all regions by country
    List<Region> findByCountry(String country);

    // find distinct regions by country
    List<Region> findDistinctByCountry(String country);

    // find all regions with country name includes
    List<Region> findByCountryContains(String pattern);

    // find all regions with country name includes str in order
    List<Region> findByCountryContainingOrderByCountry(String pattern);
}
