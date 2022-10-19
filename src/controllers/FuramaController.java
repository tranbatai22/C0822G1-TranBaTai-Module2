package controllers.case_study_module_2.controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static int option;

    public static void displayMainMenu() {
        System.out.println(
                        "1. Quản lý nhân viên.\n"
                       +"2. Quản lý khách hàng.\n"
                       +"3. Quản lý Cơ sở.\n"
                       +"4. Quản lý đặt chỗ.\n"
                       +"5. Quản lý Khuyến mãi.\n"
                       +"6. Thoát");

        do {
            System.out.print("Nhập lựa chọn của bạn ");
            option = scanner.nextInt();
            if (option < 1 || option > 6) {
                System.out.println("Nhập lựa chọn từ 1 đến 6 ( biết đọc không )");
            }
        } while (option < 1 || option > 6);
        switch (option) {
            case 1:
                Employee.getEmployee();
                break;
            case 2:
                Customer.getCustomer();
                break;
            case 3:
                Facility.getFacility();
                break;
            case 4:
                Booking.getBooking();
                break;
            case 5:
                Promotion.getPromotion();
                break;
            case 6:
                break;

        }
    }
}
