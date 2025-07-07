package com.example.student_management_api.service;

import com.example.student_management_api.entity.Student;
import com.example.student_management_api.exception.ResourceNotFoundException;
import com.example.student_management_api.repository.StudentRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimpl implements StudentService{
    @Autowired
    private StudentRepositiory studentRepositiory;
    @Override
    public Student createStudent(Student student) {
     return studentRepositiory.save(student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student not found with id "+id));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepositiory.findAll();
    }

    @Override
    public Student updateStudent(long id, Student updatedstudent) {
        Student student=getStudentById(id);
        student.setName(updatedstudent.getName());
        student.setEmail(updatedstudent.getEmail());
        student.setCourse(updatedstudent.getCourse());
        return studentRepositiory.save(student);

    }

    @Override
    public void deleteStudent(long id) {
        Student student=getStudentById(id);
        studentRepositiory.delete(student);

    }
}
