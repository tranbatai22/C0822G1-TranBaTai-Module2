package posts;

import com.sun.javafx.scene.input.InputEventUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private static void writeFile(String path, List<Posts> list) throws IOException {
        File file = new File("D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\posts\\posts.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Posts posts : list) {
            bufferedWriter.write(posts.getId() + ", " + posts.getTitle() + ", " + posts.getSubtitle() + ", " + posts.getContent() + ", " + posts.getViewt());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private static List<String> readFile() throws IOException {
        File file = new File("D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\posts\\posts.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        List<Posts> list = new ArrayList<>();
        list.add(new Posts(1, "aaa", "bbb", "ccc", 2));
        list.add(new Posts(1, "aaa", "bbb", "ccc", 2));
        try {
            writeFile("D:\\CodeGym\\C0822G1-TranBaTai-Module2\\modul2_C08\\src\\posts\\posts.csv", list);
            for (String z : readFile()) {
                System.out.println(z);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
