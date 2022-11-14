package review.isprime;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean check = false;
        do {
            try {
                System.out.print("Nhập vào số cần kiểm tra: ");
                number = Integer.parseInt(scanner.nextLine());
                check = true;
                if (number < 0) {
                    System.out.println("Số nhập vào phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                check = false;
                e.getMessage();
//                e.printStackTrace();
                System.out.println("Phải nhập số nguyên");
            }

        } while (number < 0 || check == false);

        if (isPrime.Snt(number)) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
