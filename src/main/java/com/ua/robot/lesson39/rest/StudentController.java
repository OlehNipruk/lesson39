package com.ua.robot.lesson39.rest;

import com.ua.robot.lesson39.domain.Student;
import com.ua.robot.lesson39.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
