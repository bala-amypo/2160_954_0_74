package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowierd;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowierd
    private StudentService Service;

    @postMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return Service.addStudent(student);
    }
    @GetMapping("/all")
    public List<StudentEntity> getAllStudent() {
        return Service.getAllStudent();
    }
    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return Service.getStudentById(id);
    }
    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(
        @PathVariable Long id,
        @RequestBody StudentEntity Student){
            return Service.updateStudent(id,Student);
        }
    
}