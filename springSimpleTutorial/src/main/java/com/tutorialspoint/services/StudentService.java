package com.tutorialspoint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialspoint.model.Student;
import com.tutorialspoint.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student create(){

		Student student = new Student();
		return student;
	}
	
	public Student add(Student task) {
		return studentRepo.saveAndFlush(task);
	}
}
