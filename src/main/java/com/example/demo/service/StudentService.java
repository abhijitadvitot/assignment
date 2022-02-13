package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;
import com.example.demo.model.Student;

public interface StudentService {
	public List<Student> listStudents();
	
	public Student saveStudent(Student student);

	public Student updateStudent(Student student);
	public String deleteStudent(Student student);

}
