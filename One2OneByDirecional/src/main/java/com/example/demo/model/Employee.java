package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9152395385620441174L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empid;
	private  String name,phn,city;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employee")
	private Laptop laptop;

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, empid, laptop, name, phn);
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
		return Objects.equals(city, other.city) && Objects.equals(empid, other.empid)
				&& Objects.equals(laptop, other.laptop) && Objects.equals(name, other.name)
				&& Objects.equals(phn, other.phn);
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", phn=" + phn + ", city=" + city + ", laptop=" + laptop
				+ "]";
	}
	
	  

	
	
}
