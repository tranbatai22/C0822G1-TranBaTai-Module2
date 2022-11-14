package ss1_Introduction_to_java.practice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {

            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {

                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {

//                    System.out.printf("%d is a leap year", year);
                    isLeapYear = false;
                }
            } else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            }else {
//                System.out.printf("%d is a leap year", year);
//            }
//        }else {
//            System.out.printf("%d is NOT a leap year", year);
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}