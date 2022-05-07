package com.adil.repository;

import com.adil.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name
    Optional<Cinema> findCinemaByName(String name);
    // using optional to avoid null pointer exception

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    List<Cinema> findFirst3BySponsoredName(String name);

    //Write a derived query to list all cinemas in a specific country
    List<Cinema> findByLocation_Country(String name);

    //Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findCinemaByNameOrSponsoredName(String name, String sponsoredName);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id
    @Query("select c.name from Cinema c where c.id=?1")
    String getCimenaNameHavingId(Long id);

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country
    @Query(value = "SELECT * from cinema c join location l on c.location_id=l.id WHERE l.country=:country", nativeQuery = true)
    List<Cinema> readAllCinemasWithCountry(@Param("country") String country);

    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern
    @Query(value = "select * from cinema where name ILIKE concat('%',:pattern,'%') OR sponsored_name ILIKE concat('%',:pattern,'%')", nativeQuery = true)
    List<Cinema> readAllCinemaWithNameOrSponsoredName(@Param("pattern") String pattern);

    //Write a native query to sort all cinemas by name
    @Query(value = "SELECT * FROM cinema ORDER BY name", nativeQuery = true)
    List<Cinema> sortAllCinemaWithName();

    //Write a native query to distinct all cinemas by sponsored name
    @Query(value = "SELECT Distinct(sponsored_name) FROM cinema", nativeQuery = true)
    List<String> sortDistinctCinemaWithSponsoredName();
}
