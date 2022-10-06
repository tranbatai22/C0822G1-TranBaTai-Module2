package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print(Arrays.toString(arr));

        int number;
        System.out.println();
        System.out.print("Nhập giá trị càn chèn vào mảng: ");
        number = Integer.parseInt(scanner.nextLine());

        int index;
        System.out.print("Nhập vị trí càn chèn vào mảng: ");
        index = Integer.parseInt(scanner.nextLine());

        if (index < 0 || index > arr.length) {
            System.out.println("Vị trí cần chèn không phù hợp");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    for (int j = arr.length - 1; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                }
            }
            arr[index] = number;
        }
        System.out.println("Mảng đã chèn phần tử vào là: " + Arrays.toString(arr));
    }
}



//    Scanner scanner = new Scanner(System.in);
//    int[] arr = {10, 4, 6, 23, 5, 0, 0, 2, 3, 5};
//System.out.println("Nhập vào số muốn chèn");
//        int number = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập vào vị trí muốn chèn");
//        int index = Integer.parseInt(scanner.nextLine());
//        if (index <= -1 || index > arr.length - 1) {
//        System.out.println("không chèn được phần tử vào mảng");
//        } else {
//        System.arraycopy(arr, index, arr, index + 1, arr.length - 1 - index);
//        //System.arraycopy(mảng bạn muốn sao chép, vị trí bắt đầu (chỉ số) trong mảng ,mảng đích,
//        // vị trí bắt đầu (chỉ số) trong  mảng đích,số phần tử cần sao chép )
//        arr[index] = number;
//        System.out.println("mảng sau khi thêm phần tử là: " + Arrays.toString(arr));
//        }