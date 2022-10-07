package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập vào ký tự cần kiển tra: ");
        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện lý tự %c trong %s, %d", c, str, count);
    }
}
