package review.phone.util;

import review.phone.model.XachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteXachTay {
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

    public static List<XachTay> readXachTay(String path){
        List<String> stringList = readFile(path);
        List<XachTay> xachTayList = new ArrayList<>();
        String[] arr;
        for (String line: stringList) {
            arr = line.split(",");
            if (arr.length == 7){
                xachTayList.add(new XachTay(Integer.parseInt(arr[0]), arr[1],
                        Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),
                        arr[4],arr[5], arr[6]));
            }
        }
        return xachTayList;
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

    public static void writeXachTay(String path, List<XachTay> xachTayList){
        StringBuilder stringBuilder = new StringBuilder(path);
        for (XachTay xachTay:xachTayList) {
            stringBuilder.append(new XachTay(xachTay.getId(),xachTay.getName(), xachTay.getPrice(), xachTay.getAmount(),
                    xachTay.getProducer(), xachTay.getNation(), xachTay.getStatus()));
        }
        writeFile(path, stringBuilder.toString());
    }
}
