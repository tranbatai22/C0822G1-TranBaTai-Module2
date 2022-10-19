package controllers.case_study_module_2.controllers;

import java.util.Scanner;

public class Promotion extends FuramaController {

    public static void getPromotion() {
        System.out.println(
                " 1. Thêm đặt chỗ mới.\n"
                        + " 2. Hiển thị danh sách đặt chỗ.\n"
                        + " 3. Trở lại menu chính.");
        int option5;
        do {
            System.out.print("Vui lòng lựa chọn chức năng: ");
            option5 = scanner.nextInt();
        } while (option5 < 1 || option5 > 3);

        switch (option5) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                displayMainMenu();
        }
    }
}
