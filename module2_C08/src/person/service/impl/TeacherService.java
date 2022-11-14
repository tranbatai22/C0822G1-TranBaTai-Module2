package person.service.impl;

import person.model.Student;
import person.model.Teacher;
import person.service.IPersonService;
import person.util.ReadWriteStudent;
import person.util.ReadWriteTeacher;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "person\\data\\teacher.csv";
    @Override
    public void add() {
        List<Teacher> teacherList = ReadWriteTeacher.readTeacher(PATH);
        System.out.println("Nhập id");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Nhập tên");
        String ten = SCANNER.nextLine();
        System.out.println("Nhập sđt");
        String sdt = SCANNER.nextLine();
        System.out.println("Nhập email");
        String email = SCANNER.nextLine();
        System.out.println("Nhập điểm");
        double luong = Double.parseDouble(SCANNER.nextLine());
        teacherList.add(new Teacher(id, ten, sdt, email, luong));
        ReadWriteTeacher.writeTeacher(PATH, teacherList);
        System.out.println("Thêm mới thành công!!!");
    }

    @Override
    public void display() {
        List<Teacher> teacherList = ReadWriteTeacher.readTeacher(PATH);
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void delete() {
        List<Teacher> teacherList = ReadWriteTeacher.readTeacher(PATH);
        System.out.println("Nhập id muốn xoá: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        int index = 0;
        boolean check = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId() == id) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.println("Không có id phù hợp, vui lòng nhập lại!!!");
        } else {
            teacherList.remove(index);
            ReadWriteTeacher.writeTeacher(PATH, teacherList);
        }
    }

    @Override
    public void find() {

    }
}
