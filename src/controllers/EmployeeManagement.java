package controllers;

import services.EmployeeService;
import services.impl.EmployeeServiceImpl;

public class EmployeeManagement extends FuramaController {


    public static void getEmployee() {
        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
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
            option1 = scanner.nextInt();
        } while (option1 < 1 || option1 > 5);

        switch (option1) {
            case 1:
                employeeService.display();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                displayMainMenu();
                break;
        }
    }

}
