package ru.example.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.example.edu.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private long count = 1;
    private List<Student> studentList = new ArrayList<>();

    @GetMapping("/student")
    public List<Student> getStudents() {
        return studentList;
    }

    @PostMapping("/student")
    public long addStudent(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        Student newStudent = new Student(count++, name, email, age);
        studentList.add(newStudent);
        return count;

    }
}