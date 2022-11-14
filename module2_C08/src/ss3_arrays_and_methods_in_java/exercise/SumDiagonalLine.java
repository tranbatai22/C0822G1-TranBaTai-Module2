package ss3_arrays_and_methods_in_java.exercise;


import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.print("Tổng của đường chéo là: " + (sum + sum2));


//        Scanner scanner = new Scanner(System.in);
//        int number1;
//        do {
//            System.out.println("Nhập vào cạnh của mảng hình vuông");
//            number1 = Integer.parseInt(scanner.nextLine());
//            if (number1 <= 0) {
//                System.out.println("Nhập lại độ dài của mảng lớn hơn  0");
//            }
//        } while (number1 <= 0);
//
//        int[][] arr = new int[number1][number1];
//        for (int i = 0; i < number1; i++) {
//            for (int j = 0; j < number1; j++) {
//                System.out.print("Nhập phần tử của mảng tại vị trí thứ arr=[" + i + "][" + j + "]:");
//                arr[i][j] = Integer.parseInt(scanner.nextLine());
//
//            }
//
//        }
//        System.out.println("Mảng :  ");
//        for (int i = 0; i < number1; i++) {
//            for (int j = 0; j < number1; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//        int tong = 0;
//        for (int i = 0; i < number1; i++) {
//            for (int j = 0; j < number1; j++) {
//                if (i == j || i + j == number1 - 1) {
//                    tong += arr[i][j];
//                }
//            }
//
//        }
//        System.out.println("tổng của cột  " + tong);
    }
}
