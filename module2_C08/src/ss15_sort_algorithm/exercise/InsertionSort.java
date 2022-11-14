package ss13_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int index = i;
            while (index > 0 && value < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }

            arr[index] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
}