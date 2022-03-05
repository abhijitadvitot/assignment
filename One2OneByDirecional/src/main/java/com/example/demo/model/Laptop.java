package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1924758564324492557L;

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO ) 
	private Long lid;
	private String brand,cpp,hdd,ram;
	@OneToOne
	@JoinColumn(name="empid")
	private Employee employee;

	public Long getLid() {
		return lid;
	}

	public void setLid(Long lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpp() {
		return cpp;
	}

	public void setCpp(String cpp) {
		this.cpp = cpp;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, cpp, employee, hdd, lid, ram);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(cpp, other.cpp)
				&& Objects.equals(employee, other.employee) && Objects.equals(hdd, other.hdd)
				&& Objects.equals(lid, other.lid) && Objects.equals(ram, other.ram);
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", cpp=" + cpp + ", hdd=" + hdd + ", ram=" + ram
				+ ", employee=" + employee + "]";
	}
	
	
	
	
}
