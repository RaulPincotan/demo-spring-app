package springproject.demoapp.service;

import org.springframework.stereotype.Service;
import springproject.demoapp.entity.Student;
import springproject.demoapp.repositories.StudentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudents(String city, Integer age) {
        if (city == null && age == null) {
            return studentRepo.findAll();
        } else if (city == null) {
            return studentRepo.findByAgeGreaterThan(age);
        } else if (age == null) {
            return studentRepo.findByCity(city);
        } else {
            return studentRepo.findByAgeGreaterThanAndCityLike(age, city);
        }
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }

}
