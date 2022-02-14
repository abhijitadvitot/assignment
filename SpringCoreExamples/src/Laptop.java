//Q1. Please create one Spring core project with Employee and Laptop bean injected using setter and constructor both

import java.util.Objects;

public class Laptop {

    private Long lip;
    private String cpp, hdd, ram;

    @Override
    public String toString() {
        return "Laptop{" +
                "lip=" + lip +
                ", cpp='" + cpp + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public Laptop() {
    }

    public Long getLip() {
        return lip;
    }

    public void setLip(Long lip) {
        this.lip = lip;
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

    public Laptop(Long lip, String cpp, String hdd, String ram) {
        this.lip = lip;
        this.cpp = cpp;
        this.hdd = hdd;
        this.ram = ram;
    }
}
