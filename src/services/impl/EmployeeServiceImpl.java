package services.impl;

import models.Employee;
import services.EmployeeService;
import util.ReadWriteEmployeeFileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "data\\employees.csv";

    @Override
    public void display() {
        List<Employee> employees = ReadWriteEmployeeFileUtil.readEmployeeFile(PATH);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}

