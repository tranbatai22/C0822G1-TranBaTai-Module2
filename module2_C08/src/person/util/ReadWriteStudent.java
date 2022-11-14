package person.util;

import person.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteStudent {
    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Student> readStudent(String path) {
        List<String> stringList = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            if (arr.length == 5) {
                studentList.add(new Student(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Double.parseDouble(arr[4])));
            }
        }
        return studentList;
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

    public static void writeStudent(String path, List<Student> studentList){
        StringBuilder stringBuilder = new StringBuilder(path);
        for (Student student: studentList) {
            stringBuilder.append(student.getInfo());
        }
        writeFile(path, stringBuilder.toString());
    }

}
