package controllers;

public class CustomerManagement extends FuramaController {

    public static void getCustomer() {
        System.out.println(
                " 1. Hiển thị danh sách khách hàng.\n"
                        + " 2. Thêm khách hàng mới.\n"
                        + " 3. Chỉnh sửa khách hàng.\n"
                        + " 4. Trở lại menu chính.");

        int option2;
        do {
            System.out.print("Vui lòng lựa chọn chức năng: ");
            option2 = scanner.nextInt();
        } while (option2 < 1 || option2 > 4);

        switch (option2) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }
}
