package com.santosh.Spring_JPA_Example;

import com.santosh.Spring_JPA_Example.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaExampleApplication {

    public static void main(String[] args) {


        ApplicationContext context=SpringApplication.run(SpringJpaExampleApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollNo(101);
        s1.setName("shivaprasad");
        s1.setMarks(89);

        s2.setRollNo(102);
        s2.setName("Dattaprasad");
        s2.setMarks(90);

        s3.setRollNo(103);
        s3.setName("Supriya");
        s3.setMarks(94);

//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);
//        System.out.println(repo.findAll());
        Optional<Student> s = repo.findById(2);
        System.out.println(s);
        System.out.println(s.orElse(new Student()));


    }

}
