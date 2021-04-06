package com.cursitospring.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student santi = new Student(
                    "Santi",
                    "santi@hotmail.com",
                    LocalDate.of(1988, Month.JANUARY, 25)

            );

            Student miriam = new Student(
                    "Alex",
                    "alex@hotmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 05)
            );

            repository.saveAll(
                    List.of(santi, miriam)
                    );
        };
    }
}
