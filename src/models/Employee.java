package models;

import java.util.Date;

public class Employee extends Person {
    private int employeeCode;
    private String lever;
    private String location;
    private double wage;

    public Employee(String name, String date, String sex, int CMND, int phone, String email) {
        super(name, date, sex, CMND, phone, email);
    }

    public Employee(String name, String date, String sex, int CMND, int phone, String email,
                    int employeeCode, String lever, String location, double wage) {
        super(name, date, sex, CMND, phone, email);
        this.employeeCode = employeeCode;
        this.lever = lever;
        this.location = location;
        this.wage = wage;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", lever='" + lever + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n", this.getName(),
                this.getDate(), this.getSex(), this.getCMND(),
                this.getPhone(), this.getEmail(), this.getEmployeeCode(),
                this.getLever(), this.getLocation(), this.getWage());
    }
}