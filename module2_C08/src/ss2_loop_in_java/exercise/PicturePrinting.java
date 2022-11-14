package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class PicturePrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Print the rectangle \n" +
                "2 Print the square triangle " +
                "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "3 Print isosceles triangle \n" +
                "4 Exit");
        int number;
        do {
            System.out.print("Nhập stt của hình cần in ra: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 4) {
                System.out.print("Không có stt của hình phù hợp, vui lòng nhập lại: ");
            }
        } while (number <= 0 || number > 4);

        switch (number) {
            case 1:
                int height;
                int width;
                do {
                    System.out.print("Nhập vào chiều dài: ");
                    height = Integer.parseInt(scanner.nextLine());
                    if (height <= 0) {
                        System.out.print("Chiều dài phải lớn hơn 0, vui lòng nhập lại: ");
                    }
                } while (height <= 0);
                do {
                    System.out.print("Nhập vào chiều rộng: ");
                    width = Integer.parseInt(scanner.nextLine());
                    if (width <= 0 && width > 5) {
                        System.out.print("Chiều rộng phải lớn hơn 0, vui lòng nhập lại: ");
                    }
                } while (width <= 0 && width > 5);
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("* \t");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* \t");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* \t");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int hight;
                do {
                    System.out.print("Nhập chiều cao của tam giác cần in ra: ");
                    hight = Integer.parseInt(scanner.nextLine());
                    if (hight <= 0) {
                        System.out.print("Chiều cao nhập vào không phù hợp, vui lòng nhập lại");
                    }
                } while (hight <= 0);

                for (int i = 1; i <= hight; ++i) {
                    for (int j = 1; j <= hight - i; ++j) {
                        System.out.print("  ");
                    }
                    for (int x = 1; x < i * 2; x++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                break;
        }
    }
}

