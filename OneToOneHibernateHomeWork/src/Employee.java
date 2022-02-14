import javax.persistence.*;
import java.util.Objects;

@Entity
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long empId;
  private String empName,departName;

  @OneToOne(cascade = CascadeType.ALL)
  private Laptop laptop;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", departName='" + departName + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empName, employee.empName) && Objects.equals(departName, employee.departName) && Objects.equals(laptop, employee.laptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, departName, laptop);
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName(String abhijit) {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
