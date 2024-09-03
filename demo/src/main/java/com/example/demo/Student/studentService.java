package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    private final StudentInterface studentInterface;
    @Autowired
    public studentService(StudentInterface studentInterface) {
        this.studentInterface = studentInterface;
    }

    public void addNewStudent(student student) {
        Optional<student> studentByEmail= studentInterface
                .findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email ocupado");
        }
        studentInterface.save(student);
    }

    @Autowired

    public List<student> getAlumnos(){
        return studentInterface.findAll();

    }

    public void deleteStudent(Long studentId) {
        boolean exist= studentInterface.existsById(studentId);
        if(!exist){
            throw new IllegalStateException("No existe el id:"+studentId);
        }
        studentInterface.deleteById(studentId);
    }

    public void updateStudent(Long studentId, String name, String email) {
    }
}
