package com.adil.repository;

import com.adil.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // find all courses by category
    List<Course> findByCategory(String category);

    // check if a course  with the provided name exists. return true if the course exists, false otherwise
    boolean existsByName(String name);

    // return count of the courses for the provided category
    int countByCategory(String category);
    int countCourseByCategory(String category);

    // find all courses by category and returns a stream
    Stream<Course> streamByCategory(String category);

    @Query("select c from Course c where c.category = :category and c.rating>:rating")
    List<Course> findAllByCategoryAndRatingGraterThan(@Param("category") String category, @Param("rating") int rating);
}
