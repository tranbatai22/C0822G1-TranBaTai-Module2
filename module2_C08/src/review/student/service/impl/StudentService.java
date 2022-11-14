package review.student.service.impl;

import review.student.model.Student;
import review.student.service.IStudent;
import review.student.util.ReadWriteStudent;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "review.student\\data\\review.student.csv";

    @Override
    public void display() {
        List<Student> students = ReadWriteStudent.readStudentFile(PATH);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void add() {
        List<Student> students = ReadWriteStudent.readStudentFile(PATH);
        System.out.println("Nhập tên");
        String ten = SCANNER.nextLine();
        System.out.println("Nhập ngày sinh");
        String ngaysinh = SCANNER.nextLine();
        System.out.println("Nhập giới tính");
        String gioitinh = SCANNER.nextLine();
        System.out.println("Nhập địa chỉ");
        String diachi = SCANNER.nextLine();
        students.add(new Student(ten, ngaysinh, gioitinh, diachi));
        ReadWriteStudent.writeStudentFile(PATH, students);
        System.out.println("oke bây bi");
    }

    @Override
    public void delete() {
        List<Student> students = ReadWriteStudent.readStudentFile(PATH);
        System.out.println("Nhập tên muốn xoá: ");
        String name = SCANNER.nextLine();
        int index = 0;
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.println("deo co");
        } else {
            students.remove(index);
            ReadWriteStudent.writeStudentFile(PATH, students);
        }
    }

    @Override
    public void find() {
        List<Student> students = ReadWriteStudent.readStudentFile(PATH);
        boolean check;
        do {
            System.out.println("Nhập tên muốn tìm: ");
            String name = SCANNER.nextLine();
            check = false;
            for (Student p : students) {
                if (p.getName().equals(name)) {
                    check = true;
                    System.out.println(p);
                }
            }
            if (!check) {
                System.out.println("Tên k tồn tại");
            }
        }while (!check);
    }
}
