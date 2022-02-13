package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column
	    private String name;
	    @OneToMany(mappedBy = "department")
	    private List<Student> studentList;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Student> getStudentList() {
			return studentList;
		}
		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, name, studentList);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Department other = (Department) obj;
			return Objects.equals(id, other.id) && Objects.equals(name, other.name)
					&& Objects.equals(studentList, other.studentList);
		}
		@Override
		public String toString() {
			return "Department [id=" + id + ", name=" + name + ", studentList=" + studentList + "]";
		}





}
