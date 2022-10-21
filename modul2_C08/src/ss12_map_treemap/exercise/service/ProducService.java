package ss12_map_treemap.exercise.service;

import ss12_map_treemap.exercise.moder.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProducService implements Service {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> productArrayList = new ArrayList<Product>();

    static {
        productArrayList.add(new Product(1, "a", 2000));
        productArrayList.add(new Product(2, "b", 5000));
        productArrayList.add(new Product(3, "c", 4000));
        productArrayList.add(new Product(4, "d", 1000));
        productArrayList.add(new Product(5, "e", 3000));
    }

    public void display() {
        for (Object key : productArrayList) {
            System.out.println(key);
        }
    }

    public void add() {
        System.out.println("nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        int gia = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, gia);
        productArrayList.add(product);


    }

    public void edit() {
        display();
        System.out.println("Chọn sản phẩm cần sửa");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (edit == productArrayList.get(i).getId()) {
                System.out.println("Nhập tên mới cho sản phẩm");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("Nhập giá mới cho sản phẩm");
                productArrayList.get(i).setCost(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
    }

    public void delete() {
        display();
        System.out.println("Nhập id sản phẩm cần xoá");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                break;
            }
        }
    }

    public void searchByName() {
        System.out.println("Nhập têm sản phẩm cần tìm");
        String name = scanner.nextLine();
        int count = 0;
        for (Product key : productArrayList) {
            if (key.getName().indexOf(name) >= 0) {
                System.out.println(key);
            } else {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Tên sản phầm không phù hợp");
    }

    public void sort() {
        productArrayList.sort(Comparator.comparing(Product::getCost));
    }
}
