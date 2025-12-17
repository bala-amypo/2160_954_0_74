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

    
}