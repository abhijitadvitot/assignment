package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Controllers.EmployeeRestController;

@SpringBootTest
class WebThyleafCurdApplicationTests {

	 @Autowired
	 private  EmployeeRestController employeeRestController;
	@Test
	void contextLoads() {
	 assertThat(employeeRestController.employeeList().size()).isEqualByComparingTo(8);
	 
	
	}

}
