package ss2_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println("Không phải là số nguyên tố");
        } else {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
