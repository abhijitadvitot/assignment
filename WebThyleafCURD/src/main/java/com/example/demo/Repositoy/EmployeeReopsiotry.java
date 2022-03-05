package com.example.demo.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeReopsiotry  extends JpaRepository<Employee, Long>{

}
