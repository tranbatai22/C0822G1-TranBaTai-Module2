package ss6_Inheritance.practice;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double radius, double side) {
        super(color, filled, radius, side, side);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
       return " side = " + getSide() + super.toString();
    }
}
