package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses() {
        List<CourseDTO> list = courseService.getCourses();
        return list;

    }

    @GetMapping("/category/{name}")
    public List<CourseDTO> getCategoryByName(@PathVariable("name") String category) {
        return courseService.getCoursesByCategory(category);

    }

    @PostMapping("/create")
    public CourseDTO createCourse(@RequestBody CourseDTO courseDTO) {
        return courseService.createCourse(courseDTO);
    }

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") Long courseId, @RequestBody CourseDTO courseDTO) {
        courseService.updateCourse(courseId, courseDTO);
    }

    @DeleteMapping
    public void deleteCourses() {
        courseService.deleteCourses();
    }
}