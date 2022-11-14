package review.phone.util;

import review.phone.model.ChinhHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteChinhHang {
    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<ChinhHang> readChinhHang(String path){
        List<String> stringList = readFile(path);
        List<ChinhHang> chinhHangList = new ArrayList<>();
        String[] arr;
        for (String line: stringList) {
            arr = line.split(",");
            if (arr.length == 7){
                chinhHangList.add(new ChinhHang(Integer.parseInt(arr[0]), arr[1],
                        Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),
                        arr[4],Double.parseDouble(arr[5]), arr[6]));
            }
        }
        return chinhHangList;
    }

    public static void writeFile(String path, String data){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeChinhHang(String path, List<ChinhHang> chinhHangList){
        StringBuilder stringBuilder = new StringBuilder(path);
        for (ChinhHang chinhHangs:chinhHangList) {
            stringBuilder.append(new ChinhHang(chinhHangs.getId(),chinhHangs.getName(), chinhHangs.getPrice(), chinhHangs.getAmount(),
                    chinhHangs.getProducer(), chinhHangs.getTime(), chinhHangs.getRange()));
        }
        writeFile(path, stringBuilder.toString());
    }
}
