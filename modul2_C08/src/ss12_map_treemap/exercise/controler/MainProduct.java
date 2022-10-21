package ss12_map_treemap.exercise.controler;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;
import ss12_map_treemap.exercise.service.ProducService;

import java.util.Scanner;

public class MainProduct {
    private static ProducService producService = new ProducService();

    public static void displayMenu() {
        int option = 0;
        do {
            System.out.println("Chức năng " +
                    "\n 1.Add" +
                    "\n 2.Edit" +
                    "\n 3.Delete" +
                    "\n 4.Display" +
                    "\n 5.SearchName" +
                    "\n 6.SortCost" +
                    "\n 7. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Thêm sản phẩm");
                    producService.add();
                    displayMenu();
                    break;
                case 2:
                    System.out.println("Sửa thông tin sản phẩm theo id");
                    producService.edit();
                    displayMenu();
                    break;
                case 3:
                    System.out.println("Xoá sản phẩm theo id" );
                    producService.delete();
                    displayMenu();
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách sản phẩm");
                    producService.display();
                    displayMenu();
                    break;
                case 5:
                    System.out.println("Tìm sản phẩm theo tên");
                    producService.searchByName();
                    displayMenu();
                    break;
                case 6:
                    System.out.println("chức năng sắp xếp sản phẩm tăng dần theo giá");
                    producService.sort();
                    break;
            }
        } while (option < 1 || option >= 7);
    }
}



