package review.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SelectionSort selectionSort = new SelectionSort();

        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng đã nhập vào là: " + Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        System.out.println("Mảng đã sắp xếp là: " + Arrays.toString(arr));
    }
}
