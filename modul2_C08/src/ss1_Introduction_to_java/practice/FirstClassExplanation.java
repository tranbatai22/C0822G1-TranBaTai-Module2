package ss1_Introduction_to_java.practice;

import java.util.Scanner;

public class FirstClassExplanation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (b - c) / a;
            System.out.println("Equation pass with x =" + answer);
        } else {
            if (b == c) {
                System.out.println("The sol2ution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
