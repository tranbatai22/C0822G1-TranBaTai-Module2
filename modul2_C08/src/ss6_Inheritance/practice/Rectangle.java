package ss6_Inheritance.practice;

public class Rectangle extends Circle {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double radius, double width, double length) {
        super(color, filled, radius);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPrameter(){
        return 2 * (this.width + this.length );
    }

    @Override
    public String toString() {
        return " width= " + width + ", length = " + length + super.toString();
    }
}
