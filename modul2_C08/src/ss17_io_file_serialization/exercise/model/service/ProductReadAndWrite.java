package ss17_io_file_serialization.exercise.model.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductReadAndWrite {
    public static List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;

    }

    public static void writeProductFile(String path, List<Product> productList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
