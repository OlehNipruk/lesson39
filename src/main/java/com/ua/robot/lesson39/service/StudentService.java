package com.ua.robot.lesson39.service;

import com.ua.robot.lesson39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 20));
        students.add(new Student(2, "Kate", 21));
        students.add(new Student(3, "Mike", 19));
        return students;
    }
}
