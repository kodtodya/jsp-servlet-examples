package com.kodtodya.practice.web.service;

import com.kodtodya.practice.web.model.Student;
import com.kodtodya.practice.web.repository.StudentRepository;

import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public boolean insertStudent(Student student) throws SQLException {
        if (studentRepository.insertStudent(student)) {
            System.out.println("Student inserted successfully!");
        } else {
            System.out.println("Failed to insert Student.");
            return false;
        }
        return true;
    }

    public List<Student> retrieveStudents() throws SQLException {
         return studentRepository.retrieveStudents();
    }
}
