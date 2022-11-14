package review.ss17.service.iplm;

import review.ss17.model.Product;
import review.ss17.service.ProductService;
import review.ss17.util.RealWrite;

import java.util.List;
import java.util.Scanner;

public class IProduct implements ProductService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String> products = RealWrite.ReadFile("on_tap\\ss17\\data\\product.csv");
        for (String z : products) {
            System.out.println(z);
        }
    }

    @Override
    public Product add() {
        System.out.println("Nhập mã sp: ");
        int productCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sp: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãn sx: ");
        String production = scanner.nextLine();
        System.out.println("Nhập giá sp: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(productCode, name, production, price);
        return product;
    }
}
