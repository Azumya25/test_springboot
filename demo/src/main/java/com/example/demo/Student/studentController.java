package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {

    private final studentService StudentService1;

    @Autowired
    public studentController(studentService studentService1) {
        StudentService1 = studentService1;
    }

    @GetMapping
    public List<student> getAlumnos(){
        return StudentService1.getAlumnos();
    }
}
