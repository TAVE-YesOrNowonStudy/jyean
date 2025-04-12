package com.example.springbootdeveloper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //Courses
    // Course: id, name, author

    @RequestMapping("/courses")
    public List<Course> retreieveAllCourses() {
        return Arrays.asList(
                new Course(1,"Learn AWS", "in28minute"),
                new Course(2,"Learn DevOp", "in28minute"),
                new Course(3,"Learn AZure", "in28minute"),
                new Course(4,"Learn example", "in28minute"),
                new Course(5,"Learn example", "in28minute")

        );
    }
}
