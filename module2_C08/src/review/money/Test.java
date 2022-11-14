package review.money;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        InterestRate interestRate = new InterestRate();
        Scanner scanner = new Scanner(System.in);
        double money;
        do {
            System.out.print("Nhập số tiền gửi: ");
            money = Double.parseDouble(scanner.nextLine());
            if (money <= 0) {
                System.out.print("Số tiền gửi phải lớn hơn 0");
            }
        } while (money <= 0);
        double ratio;
        do {
            System.out.print("Nhập tỉ lệ lãi xuất: ");
            ratio = Double.parseDouble(scanner.nextLine());
            if (ratio <= 0) {
                System.out.print("tỉ lệ lãi suất không phù hợp: ");
            }
        }
        while (ratio <= 0);
        int month;
        do {
            System.out.print("Nhập số tháng mày muốn gửi: ");
            month = Integer.parseInt(scanner.nextLine());
            if (month < 1) {
                System.out.print("số tháng bạn gửi không phù hợp: ");
            }
        } while (month < 1);

        System.out.println(InterestRate.interestRate(money, ratio, month));
    }
}
