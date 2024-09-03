package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentInterface repository){
        return args -> {
                    student juan = new student(

                            "juan",
                             LocalDate.of(2008, Month.DECEMBER,2),
                            "juan21@gmail.com"
                    );
            student alex = new student(
                    "alex",
                    LocalDate.of(2009, Month.DECEMBER,12),
                    "alexw@gmail.com"
            );
            repository.saveAll(
                    List.of(juan,alex)
            );
        };
    }
}
