package controllers.case_study_module_2.controllers;

import java.util.Scanner;

public class Employee extends FuramaController {

    public static void getEmployee() {
        System.out.println(
                " 1. Danh sách hiển thị nhân viên.\n"
                        + " 2. Thêm nhân viên mới.\n"
                        + " 3. Xóa nhân viên.\n"
                        + " 4. Chỉnh sửa nhân viên.\n"
                        + " 5. Trở lại menu chính."
        );

        int option1;
        do {
            System.out.print("---Vui lòng lựa chọn chức năng: ");
            option1 = Integer.parseInt(scanner.nextLine());
        } while (option1 < 1 || option1 > 5);

        switch (option1) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                displayMainMenu();
        }
    }

}
