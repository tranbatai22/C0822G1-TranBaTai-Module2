package controllers.case_study_module_2.controllers;

import java.util.Scanner;

public class Booking extends FuramaController {

    public static void getBooking() {
        System.out.println(
                " 1. Thêm đặt chỗ mới.\n"
                        + " 2. Hiển thị danh sách đặt chỗ.\n"
                        + " 3. Trở lại menu chính.");
        int option4;
        do {
            System.out.print("Vui lòng lựa chọn chức năng: ");
            option4 = scanner.nextInt();
        } while (option4 < 1 || option4 > 3);

        switch (option4) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                displayMainMenu();
        }
    }

}
