package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Blue");
        circle.setRadius(5);
        System.out.println(circle.toString());
    }
}
