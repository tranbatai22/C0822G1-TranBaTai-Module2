package review.student.controler;

import review.student.service.impl.StudentService;

import java.util.Scanner;

public class MainStudent {
    public static void mainStudent() {
        Scanner scanner = new Scanner(System.in);
        StudentService student = new StudentService();
        int option = 0;
        do {
            System.out.println("1. Hiển thị danh sách học sinh \n"
                    + " 2. Thêm học sinh \n"
                    + " 3. Xoá học sinh\n"
                    + " 4. Tìm kiếm học sinh");
            System.out.print("Chọn chức năng: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    student.display();
                    break;
                case 2:
                    student.add();
                    break;
                case 3:
                    student.delete();
                    break;
                case 4:
                    student.find();
                case 5:
                    mainStudent();
            }
            if (option > 5 || option < 1){
                System.out.println("Sai rồi bé ơi:)))");
            }
        } while (option > 5 || option < 1);
    }
}
