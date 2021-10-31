package springproject.demoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.demoapp.entity.Student;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByAgeGreaterThan(Integer age);

    List<Student> findByCity(String city);

    List<Student> findByAgeGreaterThanAndCityLike(Integer age, String city);
}


