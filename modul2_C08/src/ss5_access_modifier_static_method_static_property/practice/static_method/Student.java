package ss5_access_modifier_static_method_static_property.practice.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // Constructor khởi tạo biến
    Student(int r,String n) {
        rollno = r;
        name = n;
    }

    // Phương thức static dùng để thay đổi giá trị của biến stactic
    static void change() {
        college = "CODEGYM";
    }

    // Phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
