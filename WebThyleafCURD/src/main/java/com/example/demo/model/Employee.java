package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empid;
	private String empname, empphn;
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpphn() {
		return empphn;
	}
	public void setEmpphn(String empphn) {
		this.empphn = empphn;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid, empname, empphn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empid, other.empid) && Objects.equals(empname, other.empname)
				&& Objects.equals(empphn, other.empphn);
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empphn=" + empphn + "]";
	}
	public Employee() {
		super();
	}




}
