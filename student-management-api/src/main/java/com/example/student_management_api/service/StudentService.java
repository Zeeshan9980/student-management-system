package com.example.student_management_api.service;

import com.example.student_management_api.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(long id);
    List<Student> getAllStudents();
    Student updateStudent(long id,Student student);
    void deleteStudent(long id);
}
