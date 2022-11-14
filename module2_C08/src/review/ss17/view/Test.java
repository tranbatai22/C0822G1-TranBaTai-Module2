package review.ss17.view;

import review.ss17.service.iplm.IProduct;

public class Test {
    public static void main(String[] args) {
        IProduct productService = new IProduct();
        productService.display();
        productService.add();
    }
}
