//Q1. Please create one Spring core project with Employee and Laptop bean injected using setter and constructor both


import java.util.Objects;

public class Employee {


    private Long empId;
    private String empName,designation;

    public Employee() {
    }

    public Employee(Long empId, String empName, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empName, employee.empName) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, designation);
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
