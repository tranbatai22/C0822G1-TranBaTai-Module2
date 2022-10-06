package ss3_arrays_and_methods_in_java.practice;

import java.util.Scanner;

public class InvertTheElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập độ dài của mảng: " + " ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size > 20);

        array = new int[size];
        int j = 0;
        while (j < array.length) {
            System.out.print("Nhập phần tử thứ " + (j + 1) + ": ");
            array[j] = Integer.parseInt(scanner.nextLine());
            j++;
        }
        System.out.print("Mảng đã nhập là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println(" ");
        System.out.print("Mảng đã đảo ngược là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

