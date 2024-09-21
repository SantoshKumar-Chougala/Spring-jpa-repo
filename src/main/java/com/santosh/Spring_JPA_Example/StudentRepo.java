package com.santosh.Spring_JPA_Example;

import com.santosh.Spring_JPA_Example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
