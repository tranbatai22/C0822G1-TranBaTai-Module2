package review.algorithm;

import java.util.Scanner;

public class _7Fibonaci<number> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean check = false;
        do {
            try {
                System.out.println("Bạn muốn hiển thị bao nhiêu số nguyên");
                number = Integer.parseInt(scanner.nextLine());
                check = true;
                if (number <= 0) {
                    System.out.println("Phải nhập số lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                check = false;
                e.getMessage();
                e.printStackTrace();
                System.out.println("Phải nhập số nguyên");
            }
        } while ((number <= 0 || check) == false);
    }

//    public static boolean isFibonaci(int number) {
//        int a = 1;
//        int b = 1;
//        int sum = 0;
//        boolean check = false;
//        for (int i = 0; i < number; i++) {
//            sum = a + b;
//            a = b;
//            b = sum;
//        }
//        if (check = true){
//            return true;
//        }else {
//            return false;
//        }
//    }

