package ss17_io_file_serialization.exercise.service;

import ss17_io_file_serialization.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductReadAndWrite {
    public static List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void writeProductFile(String path, List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

