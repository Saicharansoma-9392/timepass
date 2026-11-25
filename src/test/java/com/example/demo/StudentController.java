package com.example.demo;

// Import statements
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controller class
@Controller
public class StudentController {

    // Handle student request
    @GetMapping("/student")
    public String student(Model model) {

        // Create Student object
        Student student = new Student(
            101,
            "Rahul",
            "CSE"
        );

        // Add student object to Model
        model.addAttribute("student", student);

        // Return view name
        return "student";
    }
}