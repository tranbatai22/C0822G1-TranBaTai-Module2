package ss4_class_and_object.exercise.EquadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassQuadraticEquation classQuadraticEquation = new ClassQuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cho a: ");
        Double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá trị cho b: ");
        Double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá trị cho c: ");
        Double c = Double.parseDouble(scanner.nextLine());
        classQuadraticEquation.setA(a);
        classQuadraticEquation.setB(b);
        classQuadraticEquation.setC(b);
        if (classQuadraticEquation.getDiscriminant() >= 0) {
            System.out.println(classQuadraticEquation.getRoot1() + " và " + classQuadraticEquation.getRoot2());
        } else if (classQuadraticEquation.getDiscriminant() == 0) {
            System.out.println(classQuadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
