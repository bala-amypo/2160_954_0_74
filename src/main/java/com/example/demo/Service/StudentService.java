package com.example.demo.Service;
import java.util.List;
import com.example.demo.Entity.StudentEntity;
public interface StudentService{
    StudentEntity addStudent(StudentEntity Student);
    List<StudentEntity> getAllStudent();
    StudentEntity getStudentById(Long id);
    StudentEntity updateStudent(Long id,StudentEntity Student);
}