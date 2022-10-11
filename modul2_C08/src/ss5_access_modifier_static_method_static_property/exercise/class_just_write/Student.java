package ss5_access_modifier_static_method_static_property.exercise.class_just_write;

public class Student {
    private static String name = "John";
    private static String classes = "C08";
    public Student (){

    }

    public static void setName(String name){
        Student.name = name;
    }
    public static void setClasses(String classes){
        Student.classes = classes;
    }


    public String toString() {
        return name + " and " + classes;
    }
}
