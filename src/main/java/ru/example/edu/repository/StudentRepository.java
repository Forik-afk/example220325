package ru.example.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  ru.example.edu.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
