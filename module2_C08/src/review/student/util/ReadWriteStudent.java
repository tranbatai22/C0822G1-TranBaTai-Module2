package review.student.util;

import review.student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteStudent {
//    public static List<String> readFile(String path) {
//        List<String> stringList = new ArrayList<>();
//        try {
//            File file = new File(path);
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                stringList.add(line);
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return stringList;
//    }
//
//    public static List<Student> readStudentFile(String path) {
//        List<String> stringList = readFile(path);
//        List<Student> students = new ArrayList<>();
//        String[] arr;
//        for (String line : stringList) {
//            arr = line.split(",");
//            if (arr.length == 4) {
//                students.add(new Student(arr[0], arr[1], arr[2], arr[3]));
//            }
//        }
//        return students;
//    }


//    public static void writeFile(String path, String data) {
//        try {
//            File file = new File(path);
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(data);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void writeStudentFile(String path, List<Student> students){
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Student review.student: students) {
//            stringBuilder.append(review.student.getInfo());
//        }
//        writeFile(path, stringBuilder.toString());
//    }

//    public static void writeFile(String path, String data){
//        try{
//            File file = new File(path);
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(data);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeStudentFile(String path, List<Student> students){
//        StringBuilder stringBuilder = new StringBuilder(path);
//        for (Student review.student: students) {
//            stringBuilder.append(review.student.getInfo());
//        }
//        writeFile(path, stringBuilder.toString());
//    }

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

    public static List<Student> readStudentFile(String path) {
        List<String> stringList = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            if (arr.length == 4) {
                students.add(new Student(arr[0], arr[1], arr[2], arr[3]));
            }
        }
        return students;
    }

    public static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeStudentFile(String path, List<Student> students) {
        StringBuilder stringBuilder = new StringBuilder(path);
        for (Student student : students) {
            stringBuilder.append(student.getInfo());
        }
        writeFile(path, stringBuilder.toString());
    }
}
