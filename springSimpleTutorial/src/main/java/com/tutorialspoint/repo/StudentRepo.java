package com.tutorialspoint.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorialspoint.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
