package review.phone.util;

import java.util.Scanner;

public class Reger {
    private static final String EMAI = "[a-zA-Z0-9]{1,}@gmail.com";
    private static final String SDT = "0[0-9]{9,10}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        do {
            a = scanner.nextLine();
            if (a.matches(SDT)){
                break;
            }
        } while (true);
    }

}
