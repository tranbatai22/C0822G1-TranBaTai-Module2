package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class SumInOneColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int n;
//        do {
//            System.out.print("Nhập cột muốn tính tổng: ");
//            n = Integer.parseInt(scanner.nextLine());
//            if (n <= 0 || n > arr.length) {
//                System.out.println("Số cột không hợp lệ, vui lòng nhập lại: ");
//            }
//        } while (n <= 0 || n > arr.length);
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//                sum += arr[i][n];
//        }
//        System.out.println();
//        System.out.print("Tổng các phần tử ở cột thứ " + n + " là: " + sum);

        int number1, number2;
        do {
            System.out.println("Nhập vào độ dài của mảng");
            number1 = Integer.parseInt(scanner.nextLine());
            if (number1 <= 0) {
                System.out.println("Nhập lại độ dài của mảng lớn hơn  0");
            }
        } while (number1 <= 0);
        do {
            System.out.println("Nhập vào độ dài phần tử  của mảng");
            number2 = Integer.parseInt(scanner.nextLine());
            if (number2 <= 0) {
                System.out.println("Nhập lại độ dài phẩn tử mảng mảng lớn hơn  0");
            }
        } while (number2 <= 0);

        int[][] arr = new int[number1][number2];
        for (int i = 0; i <number1 ; i++) {
            for (int j = 0; j <number2 ; j++) {
                System.out.print("Nhập phần tử của mảng tại vị trí thứ arr=["+i+"]["+j+"]:");
                arr[i][j]=Integer.parseInt(scanner.nextLine());

            }

        }
        System.out.println("Mảng :  ");
        for (int i = 0; i <number1 ; i++) {
            for (int j = 0; j <number2 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Nhập cột cần tính tổng ");
        int number3 = Integer.parseInt(scanner.nextLine());
        int tong = 0 ;
        for (int i = 0; i <number1 ; i++) {

            tong=tong+arr[i][number3];
        }
        System.out.println("tổng của cột "+number3+" la "+tong);
    }
}
