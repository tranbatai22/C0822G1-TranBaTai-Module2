package ss17_io_file_serialization.exercise.controler;

import ss17_io_file_serialization.exercise.model.service.IProductService;
import ss17_io_file_serialization.exercise.model.service.Product;
import ss17_io_file_serialization.exercise.model.service.ProductReadAndWrite;
import ss17_io_file_serialization.exercise.model.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {
     public static void menuController() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Tủ lạnh", "Toshiba", 200000));
        ProductReadAndWrite.writeProductFile("ss17_io_file_serialization\\exercise\\data\\product.dat", productList);
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();

        do {
            System.out.println("QUẢN LÍ SẢN PHẨM\n " +
                    "1. Thêm mới sản phẩm\n" +
                    " 2. Hiển thị danh sách sản phẩm\n" +
                    " 3. Tìm kiếm thông tin sản phẩm\n" +
                    " 4. Thoát.");

            int choose = 0;
            try {
                System.out.print("Chọn chắc năng: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Chọn lại chức năng: ");
            }

            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.find();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không có chức năng phù hợp, vui lòng nhập lại: ");
            }
        } while (true);
    }
}
