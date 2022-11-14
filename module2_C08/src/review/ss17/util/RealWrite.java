package review.ss17.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RealWrite {
    public static List<String> ReadFile(String path){
        List<String> products = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null) {
                String[] str = line.split(",");
                products.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void WriteFile(String path, List<String> list) {
        File file = new File("on_tap\\ss17\\data\\product.csv");
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String product1: list) {
                bufferedWriter.write(String.valueOf(product1));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
