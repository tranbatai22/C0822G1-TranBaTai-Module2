package review.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3PrintArray {
//    public static int[] printArr(int num) {
//        int[] arr = new int[num];
//        int[] arr1 = new int[num];
//        for (int i = 0; i < num; i++) {
//            int count = 0;
//            for (int j = 1; j <= num; j++) {
//                if (arr[i] % arr[j] == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                int f0 = 0, f1 = 1, fn = 0;
//                for (int j = 0; j < 10; j++) {
//                    if (i > 2){
//                        fn = f0 + f1;
//                        if (arr[i] == fn){
//                            System.out.println(arr1[i] == fn);
//                            continue;
//                        }
//                        f0 = f1;
//                        f1 = fn;
//                    }
//                }
//            }
//        }
//        return arr1;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.println("Hãy nhập một số bất kì");
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        display(number);
    }

    public static void display(int number) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if (isPrime(i) && isFibonacy(i)) {
                integers.add(i);
            }
        }
        for (Integer value : integers) {
            System.out.println(value);
        }
    }

    public static boolean isPrime(int number) {
        boolean check = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static boolean isFibonacy(int number) {
        int a = 1;
        int b = 1;
        boolean check = false;
        int sum;
        for (int i = 0; i <= number; i++) {
            sum = a + b;
            a = b;
            b = sum;
            if (sum == number) {
                check = true;
            }
        }
        return check;
    }
}
