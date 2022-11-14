package person.util;

import person.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteTeacher {
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

    public static List<Teacher> readTeacher(String path){
        List<String> stringList = readFile(path);
        List<Teacher> teacherList = new ArrayList<>();
        String[] arr;
        for (String line: stringList) {
            arr = line.split(",");
            if (arr.length == 5){
                teacherList.add(new Teacher(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Double.parseDouble(arr[4])));
            }
        }
        return teacherList;
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

    public static void writeTeacher(String path, List<Teacher> teacherList){
        StringBuilder stringBuilder = new StringBuilder(path);
        for (Teacher teacher: teacherList) {
            stringBuilder.append(teacher.getInfo());
        }
        writeFile(path, stringBuilder.toString());
    }
}
