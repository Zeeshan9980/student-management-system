package com.example.student_management_api.repository;

import com.example.student_management_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositiory extends JpaRepository<Student,Long> {
}
