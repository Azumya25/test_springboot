package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public void registerNewStudent(@RequestBody student Student){
        StudentService1.addNewStudent(Student);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        StudentService1.deleteStudent(studentId);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(
                @PathVariable("studentId") Long studentId,
                @RequestParam(required = false) String name,
                @RequestParam(required = false) String email
        ){
            StudentService1.updateStudent(studentId,name,email);
        }
}
