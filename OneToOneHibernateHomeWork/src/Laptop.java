import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lid;
    private String cpp,hdd,ram;

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", cpp='" + cpp + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(lid, laptop.lid) && Objects.equals(cpp, laptop.cpp) && Objects.equals(hdd, laptop.hdd) && Objects.equals(ram, laptop.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lid, cpp, hdd, ram);
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
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
}
