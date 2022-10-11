package ss5_access_modifier_static_method_static_property.exercise.class_just_write;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        Student.setName("Tài");
        Student.setClasses("C08");
        System.out.println(student.toString());
    }
}
