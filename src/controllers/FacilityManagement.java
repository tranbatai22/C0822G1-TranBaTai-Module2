package controllers;

public class FacilityManagement extends FuramaController {

    public static void getFacility() {
        System.out.println(
                          " 1. Cơ sở danh sách hiển thị.\n"
                        + " 2. Thêm cơ sở mới.\n"
                        + " 3. Hiển thị danh sách bảo trì cơ sở.\n"
                        + " 4. Trở lại menu chính."
        );
        int option3;
        do {
            System.out.print("Vui lòng lựa chọn chức năng: ");
            option3 = scanner.nextInt();
        } while (option3 < 1 || option3 > 4);

        switch (option3) {
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
