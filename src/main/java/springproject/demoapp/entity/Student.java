package springproject.demoapp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int age;
    private String city;

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    private School school;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
//        this.school = school;
    }
}
