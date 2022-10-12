package ss1_Introduction_to_java.exercise;
import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vnd = usd * 23000;
        System.out.println("Số tiền VND là: " + vnd);
    }
}
