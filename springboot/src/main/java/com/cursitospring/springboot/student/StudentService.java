package com.cursitospring.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents() {
       return repository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = repository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()) {
            throw new IllegalStateException("Email Taken!!");
        }
        repository.save(student);
    }

    public void deleteStudent(Integer studentId) {
        boolean exists = repository.existsById(studentId);
        if(!exists) {
            throw new IllegalStateException("studen with id" + studentId + " does not exists");
        }
        repository.deleteById(studentId);
        System.out.println("Se borro todo piola!");
        }

    @Transactional
    public void updateStudent(Integer studentId, String name, String email) {
        Student student = repository.findById(studentId).orElseThrow(() -> new IllegalStateException("studen with id" + studentId + " does not exists"));

        if(name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentOptional = repository.findStudentByEmail(email);
            if(studentOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
    }
}

