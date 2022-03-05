package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.Services.StudentService;
import com.example.demo.model.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	  private StudentRepository studentRepository;

	@Override
	public List<Student> studentsList() {
		return studentRepository.findAll();
	}

	@Override
	public Student add(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public void update(Student student) {
      
		 studentRepository.save(student);
		
	}

	@Override
	public String deleteByID(Long id) {
	studentRepository.deleteById(id);
	return "Delete";
	}
	
}
