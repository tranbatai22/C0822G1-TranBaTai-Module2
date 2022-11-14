package review.ss17.model;

public class Product {
    private int productCode;
    private String name;
    private String production;
    private double price;

    public Product(int productCode, String name, String production, double price) {
        this.productCode = productCode;
        this.name = name;
        this.production = production;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "IStudent{" +
                "productCode=" + productCode +
                ", name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", price=" + price +
                '}';
    }
}
