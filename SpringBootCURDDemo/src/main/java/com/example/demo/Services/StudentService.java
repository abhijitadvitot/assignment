package com.example.demo.Services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	
	 public List<Student> studentsList();
	 
	 
	 public Student add(Student student);
	 	 
	 public void update(Student student);
	 
	 
	 public String deleteByID(Long id);
	 
	 
}
