package ss17_io_file_serialization.exercise.service;

import ss17_io_file_serialization.exercise.exception.IDException;
import ss17_io_file_serialization.exercise.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\ss17_io_file_serialization\\exercise\\data\\product.dat";

    @Override
    public void add() {
        List<Product> productList = ProductReadAndWrite.readProductFile(PATH);
        int id;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(SCANNER.nextLine());

                for (Product product : productList) {
                    if (product.getId() == id) {
                        throw new IDException("Id đã tồn tại, vui lòng nhập lại!!!: ");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại id: ");
            } catch (IDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập tên sản phẩm: ");
        String name = SCANNER.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = SCANNER.nextLine();

        int price;
        while (true) {
            try {
                System.out.print("Nhập giá sản phẩm: ");
                price = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại giá sản phẩm: ");
            }
        }
        productList.add(new Product(id, name, manufacturer, price));
        ProductReadAndWrite.writeProductFile(PATH, productList);
        System.out.println("Đã thêm sản phẩm!!!");
    }

    @Override
    public void display() {
        List<Product> productList = ProductReadAndWrite.readProductFile(PATH);
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void find() {
        List<Product> productList = ProductReadAndWrite.readProductFile(PATH);
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String nameFind = SCANNER.nextLine();
        boolean isExit = false;

        for (Product product : productList) {
            if (product.getName().contains(nameFind)) {
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy sản phẩm!!!");
        }
    }
}
