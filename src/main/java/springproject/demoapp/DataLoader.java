package springproject.demoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springproject.demoapp.entity.Student;
import springproject.demoapp.repositories.StudentRepo;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private final StudentRepo studentRepo;

    public DataLoader(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepo.saveAll(
                List.of(
                        new Student("Raul", 30, "Oradea"),
                        new Student("Alina", 26, "Oradea"),
                        new Student("Basescu", 35, "Pitesti"),
                        new Student("Iliescu", 154, "Brasov")
                )
        );
    }
}
