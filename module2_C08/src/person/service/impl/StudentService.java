package person.service.impl;

import person.model.Student;
import person.service.IPersonService;
import person.util.ReadWriteStudent;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\person\\data\\student.csv";

    @Override
    public void add() {
        List<Student> studentList = ReadWriteStudent.readStudent(PATH);
        System.out.println("Nhập id");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Nhập tên");
        String ten = SCANNER.nextLine();
        System.out.println("Nhập sđt");
        String sdt = SCANNER.nextLine();
        System.out.println("Nhập email");
        String email = SCANNER.nextLine();
        System.out.println("Nhập điểm");
        double diem = Double.parseDouble(SCANNER.nextLine());
        studentList.add(new Student(id, ten, sdt, email, diem));
        ReadWriteStudent.writeStudent(PATH, studentList);
        System.out.println("Thêm mới thành công!!!");
    }

    @Override
    public void display() {
        List<Student> studentList = ReadWriteStudent.readStudent(PATH);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void delete() {
        List<Student> studentList = ReadWriteStudent.readStudent(PATH);
        System.out.println("Nhập id muốn xoá: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        int index = 0;
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.println("Không có id phù hợp, vui lòng nhập lại!!!");
        } else {
            studentList.remove(index);
            ReadWriteStudent.writeStudent(PATH, studentList);
        }
    }

    @Override
    public void find() {

    }
}
