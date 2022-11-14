package review.phone.Controller;

import java.util.Scanner;

public class ControllerMain {
    public static void phoneMain() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Hệ thống quản lí điện thoại\n"
                    + " 1. Điện thoại chính hãng\n"
                    + " 2. Điện thoại xách tay\n"
                    + " 3. Quay về menu chính");
            System.out.println("Chọn loại điện thoại");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 3) {
                System.out.println("Không có loại điện thoại phù hợp, vui lòng nhập lại !!!");
            }

            switch (option) {
                case 1:
                    MainChinhHang.menuChinhHang();
                    break;
                case 2:
                    MainXachTay.menuXachTay();
                    break;
                case 3:
                    phoneMain();
            }
        } while (option <= 0 || option > 3);
    }
}
