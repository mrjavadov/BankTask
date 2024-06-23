package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private Long id;
    private String name;
    private double salary;
    private String adress;
    private Long phoneNumber;
    private String finCode;
    private Bank bank;
    private List<AtmWithDrawEmployees> atmWithDrawEmployees;
    private ReportEmployees reportEmployees;

    public Employee(Long id, String name, double salary, String adress, Long phoneNumber, String finCode) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.finCode = finCode;
        this.atmWithDrawEmployees=new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", finCode='" + finCode + '\'' +
                '}';
    }
}

