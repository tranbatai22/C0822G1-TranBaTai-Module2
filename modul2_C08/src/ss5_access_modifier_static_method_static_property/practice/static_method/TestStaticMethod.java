package ss5_access_modifier_static_method_static_property.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        //gọi phương thức
        Student.change();

        //khởi tạo đối tượng
        Student s1 = new Student(1, "Tài");
        Student s2 = new Student(2, "Định");
        Student s3 = new Student(3, "Nghĩa");

        //gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }

}
