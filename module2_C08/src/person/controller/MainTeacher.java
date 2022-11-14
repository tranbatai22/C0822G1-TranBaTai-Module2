package person.controller;

import person.model.Teacher;
import person.service.impl.TeacherService;
import person.util.ReadWriteTeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTeacher {
    public static void menuStudent() {
        Scanner scanner = new Scanner(System.in);
//        List<Teacher> teacherList = new ArrayList<>();
//        teacherList.add(new Teacher(1, "Tài", "12345", "abc22@gmail.com", 5.555));
//        ReadWriteTeacher.writeTeacher("person\\data\\teacher.csv",teacherList);
        TeacherService teacherService = new TeacherService();
        int option = 0;
        do {
            System.out.println("===TEACHER===\n"
                    + " 1. Thêm giáo viên\n"
                    + " 2. Hiển thị danh sách giáo viên\n"
                    + " 3. Xoá giáo viên theo id\n"
                    + " 4. Tìm kiếm giáo viên theo id\n"
                    + " 5. Quay lại menu chính");
            System.out.print("Nhập lựa chọn của bạn: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 5) {
                System.out.println("Không có lựa chọn phù hợp, vui lòng nhập lại!!!");
            }

            switch (option) {
                case 1:
                    teacherService.add();
                    break;
                case 2:
                    teacherService.display();
                    break;
                case 3:
                    teacherService.delete();
                    break;
                case 4:
                    teacherService.find();
                    break;
                case 5:
                    menuStudent();
            }
        } while (option <= 0 || option > 5);
    }
}
