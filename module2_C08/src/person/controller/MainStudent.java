package person.controller;

import person.model.Student;
import person.service.impl.StudentService;
import person.util.ReadWriteStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void menuStudent() {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Tài", "12345", "abc22@gmail.com", 5.555));
        ReadWriteStudent.writeStudent("D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\person\\data\\student.csv",studentList);
        StudentService studentService = new StudentService();
        int option = 0;
        do {
            System.out.println("===STUDENT===\n"
                    + " 1. Thêm học sinh\n"
                    + " 2. Hiển thị danh sách học sinh\n"
                    + " 3. Xoá học sinh theo id\n"
                    + " 4. Tìm kiếm học sinh theo id\n"
                    + " 5. Quay lại menu chính");
            System.out.print("Nhập lựa chọn của bạn: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 5) {
                System.out.println("Không có lựa chọn phù hợp, vui lòng nhập lại!!!");
            }

            switch (option) {
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.display();
                    break;
                case 3:
                    studentService.delete();
                    break;
                case 4:
                    studentService.find();
                    break;
                case 5:
                    menuStudent();
            }
        } while (option <= 0 || option > 5);
    }
}
