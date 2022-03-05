package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.ServiceImp.StudentServiceImp;
import com.example.demo.model.Student;

@Controller
@RequestMapping("/main")
public class StudentWeb {

	@Autowired
	private StudentServiceImp studentServiceImp;

	@GetMapping("/showdata")
public String display (Model model) {
		 
	List<Student > stList=	studentServiceImp.studentsList();
		
		model.addAttribute("list", stList);
						return "display";
	}
	
}
