package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class studentService {
    public List<student> getAlumnos(){
        return List.of(
                new student(
                        1L,
                        "juan",
                        LocalDate.of(2008, Month.DECEMBER,2),
                        "juan21@gmail.com",
                        16
                )
        );
    }
}
