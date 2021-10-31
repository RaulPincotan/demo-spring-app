package springproject.demoapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springproject.demoapp.entity.Student;
import springproject.demoapp.exception.ResourceNotFoundException;
import springproject.demoapp.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;


    @GetMapping
    List<Student> getStudents(@RequestParam(required = false) String city, Integer age) {
        return studentService.getStudents(city, age);
    }

    @GetMapping("/{id}")
    Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student with id" + id + " does not exist"));
    }
}
