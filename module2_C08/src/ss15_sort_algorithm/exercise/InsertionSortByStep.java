package ss13_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa nhập: " + Arrays.toString(arr));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int index = i;
            while (index > 0 && value < array[index - 1]) {
                array[index] = array[index - 1];
                System.out.println("Mảng sau khi chèn: " + Arrays.toString(array));
                index--;
            }
            array[index] = value;
        }
        return array;
    }
}
