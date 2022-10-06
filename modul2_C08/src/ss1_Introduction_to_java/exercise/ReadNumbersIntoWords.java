package ss1_Introduction_to_java.exercise;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");
        int number = scanner.nextInt();
        String[] string =
                {"One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
        String[] string2 =
                {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
        while (number >= 1000) {
            System.out.println("Nhập lại số nhỏ hơn 1000: ");
            number = scanner.nextInt();
        }
        if (number == 0) {
            System.out.print("Zero");
        } else {
            switch (number / 100) {
                case 1:
                    System.out.print("One hundred ");
                    break;
                case 2:
                    System.out.print("Two hundred ");
                    break;
                case 3:
                    System.out.print("Three hundred ");
                    break;
                case 4:
                    System.out.print("Four hundred ");
                    break;
                case 5:
                    System.out.print("Five hundred ");
                    break;
                case 6:
                    System.out.print("Six hundred ");
                    break;
                case 7:
                    System.out.print("Seven hundred ");
                    break;
                case 8:
                    System.out.print("Eight hundred ");
                    break;
                case 9:
                    System.out.print("Nine hundred ");
                    break;
                default:
                    System.out.print("");
            }
            switch ((number % 100) / 10) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    for (int i = 0; i < string2.length; i++) {
                        if (number % 10 == i) {
                            System.out.println(string2[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            if ((number % 100) / 10 != 1) {
                for (int i = 1; i <= string.length; i++) {
                    if (number % 10 == i) {
                        System.out.print(string[i - 1]);
                    }
                }
            }
        }
    }
}

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số cần đọc: ");
//        int number = scanner.nextInt();
//        if (number > 0 && number < 10) {
//            switch (number) {
//                case 1:
//                    System.out.println("one");
//                    break;
//                case 2:
//                    System.out.println("two");
//                    break;
//                case 3:
//                    System.out.println("three");
//                    break;
//                case 4:
//                    System.out.println("four");
//                    break;
//                case 5:
//                    System.out.println("five");
//                    break;
//                case 6:
//                    System.out.println("six");
//                    break;
//                case 7:
//                    System.out.println("seven");
//                    break;
//                case 8:
//                    System.out.println("eight");
//                    break;
//                case 9:
//                    System.out.println("nine");
//                    break;
//            }
//        } else if (number < 20) {
//            switch (number % 10) {
//                case 0:
//                    System.out.println("ten");
//                    break;
//                case 1:
//                    System.out.println("eleven");
//                    break;
//                case 2:
//                    System.out.println("twelve");
//                    break;
//                case 3:
//                    System.out.println("thirteen");
//                    break;
//                case 4:
//                    System.out.println("fourteen");
//                    break;
//                case 5:
//                    System.out.println("fifteen");
//                    break;
//                case 6:
//                    System.out.println("sixteen");
//                    break;
//                case 7:
//                    System.out.println("seventeen");
//                    break;
//                case 8:
//                    System.out.println("eighteen");
//                    break;
//                case 9:
//                    System.out.println("nineteen");
//                    break;
//            }
//        } else if (number < 100) {
//            int number1 = number % 10;
//            int number2 = number / 10;
//            switch (number2) {
//                case 2:
//                    System.out.print("twenty");
//                    break;
//                case 3:
//                    System.out.print("thirty");
//                    break;
//                case 4:
//                    System.out.print("forty");
//                    break;
//                case 5:
//                    System.out.print("fifty");
//                    break;
//                case 6:
//                    System.out.print("sixty");
//                    break;
//                case 7:
//                    System.out.print("seventy");
//                    break;
//                case 8:
//                    System.out.print("eighty");
//                    break;
//                case 9:
//                    System.out.print("ninety");
//                    break;
//            }
//            switch (number1) {
//                case 0:
//                    System.out.print("zero");
//                    break;
//                case 1:
//                    System.out.print("one");
//                    break;
//                case 2:
//                    System.out.print("two");
//                    break;
//                case 3:
//                    System.out.print("three");
//                    break;
//                case 4:
//                    System.out.print("four");
//                    break;
//                case 5:
//                    System.out.print("five");
//                    break;
//                case 6:
//                    System.out.print("six");
//                    break;
//                case 7:
//                    System.out.print("seven");
//                    break;
//                case 8:
//                    System.out.print("eight");
//                    break;
//                case 9:
//                    System.out.print("nine");
//                    break;
//            }
//        } else if (number < 1000) {
//            int number1 = number / 100;
//            int number2 = (number / 10) % 10;
//            int number3 = number % 10;
//            switch (number1) {
//                case 1:
//                    System.out.print("one hundred");
//                    break;
//                case 2:
//                    System.out.print("two hundred");
//                    break;
//                case 3:
//                    System.out.print("three hundred");
//                    break;
//                case 4:
//                    System.out.print("four hundred");
//                    break;
//                case 5:
//                    System.out.print("five hundred");
//                    break;
//                case 6:
//                    System.out.print("six hundred");
//                    break;
//                case 7:
//                    System.out.print("seven hundred");
//                    break;
//                case 8:
//                    System.out.print("eight hundred");
//                    break;
//                case 9:
//                    System.out.print("nine hundred");
//                    break;
//            }
//            switch (number2) {
//                case 1:
//                    switch (number3) {
//                        case 0:
//                            System.out.print(" and ten");
//                            break;
//                        case 1:
//                            System.out.print(" and eleven");
//                            break;
//                        case 2:
//                            System.out.print(" and twelve");
//                            break;
//                        case 3:
//                            System.out.print(" and thirteen");
//                            break;
//                        case 4:
//                            System.out.print(" and fourteen");
//                            break;
//                        case 5:
//                            System.out.print(" and fifteen");
//                            break;
//                        case 6:
//                            System.out.print(" and sixteen");
//                            break;
//                        case 7:
//                            System.out.print(" and seventeen");
//                            break;
//                        case 8:
//                            System.out.print(" and eighteen");
//                            break;
//                        case 9:
//                            System.out.print(" and nineteen");
//                            break;
//                    }
//                    break;
//                case 2:
//                    System.out.print(" and twenty");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//                case 3:
//                    System.out.print(" and thirty");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//                case 4:
//                    System.out.print(" and forty");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//                case 5:
//                    System.out.print(" and fifty");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//                case 6:
//                    System.out.print(" and sixty");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//                case 7:
//                    System.out.print(" and seventy");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//                case 8:
//                    System.out.print(" and eighty");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//                case 9:
//                    System.out.print(" and ninety");
//                    switch (number3) {
//                        case 1:
//                            System.out.print(" one");
//                            break;
//                        case 2:
//                            System.out.print(" two");
//                            break;
//                        case 3:
//                            System.out.print(" three");
//                            break;
//                        case 4:
//                            System.out.print(" four");
//                            break;
//                        case 5:
//                            System.out.print(" five");
//                            break;
//                        case 6:
//                            System.out.print(" six");
//                            break;
//                        case 7:
//                            System.out.print(" seven");
//                            break;
//                        case 8:
//                            System.out.print(" eight");
//                            break;
//                        case 9:
//                            System.out.print(" nine");
//                            break;
//                    }
//                    break;
//            }
//
//        }
//    }
//}


//        int number = scanner.nextInt();
//        String hundreds = null;
//        String tens = null;
//        String units = null;
//        if (number < 1000 && number > 99) {
//            switch (number / 100) {
//                case 1:
//                    hundreds = "one hundred";
//                    break;
//                case 2:
//                    hundreds = "two hundred";
//                    break;
//                case 3:
//                    hundreds = "three hundred";
//                    break;
//                case 4:
//                    hundreds = "four hundred";
//                    break;
//                case 5:
//                    hundreds = "five hundred";
//                    break;
//                case 6:
//                    hundreds = "six hundred";
//                    break;
//                case 7:
//                    hundreds = "seven hundred";
//                    break;
//                case 8:
//                    hundreds = "eight hundred";
//                    break;
//                case 9:
//                    hundreds = "nine hundred";
//                    break;
//            }
//            number %= 100;
//            System.out.print(hundreds + " ");
//        }
//        if (number < 100 && number > 9) {
//            switch (number / 10) {
//                case 1:
//                    switch (number) {
//                        case 10:
//                            tens = "ten";
//                            break;
//                        case 11:
//                            tens = "eleven";
//                            break;
//                        case 12:
//                            tens = "twelve";
//                            break;
//                        case 13:
//                            tens = "thirteen";
//                            break;
//                        case 14:
//                            tens = "fourteen";
//                            break;
//                        case 15:
//                            tens = "fifteen";
//                            break;
//                        case 16:
//                            tens = "sixteen";
//                            break;
//                        case 17:
//                            tens = "seventeen";
//                            break;
//                        case 18:
//                            tens = "eighteen";
//                            break;
//                        case 19:
//                            tens = "nineteen";
//                            break;
//                    }
//                    number -= number;
//                    break;
//                case 2:
//                    tens = "twenty";
//                    break;
//                case 3:
//                    tens = "thirty";
//                    break;
//                case 4:
//                    tens = "forty";
//                    break;
//                case 5:
//                    tens = "fifty";
//                    break;
//                case 6:
//                    tens = "sixty";
//                    break;
//                case 7:
//                    tens = "seventy";
//                    break;
//                case 8:
//                    tens = "eighty";
//                    break;
//                case 9:
//                    tens = "ninety";
//                    break;
//
//            }
//            number %= 10;
//            System.out.print(tens + " ");
//        }
//        if (number < 10) {
//            switch (number) {
//                case 1:
//                    units = "one";
//                    break;
//                case 2:
//                    units = "two";
//                    break;
//                case 3:
//                    units = "three";
//                    break;
//                case 4:
//                    units = "four";
//                    break;
//                case 5:
//                    units = "five";
//                    break;
//                case 6:
//                    units = "six";
//                    break;
//                case 7:
//                    units = "seven";
//                    break;
//                case 8:
//                    units = "eight";
//                    break;
//                case 9:
//                    units = "nine";
//                    break;
//            }
//            if (units != null) {
//                System.out.print(units + " ");
//            }
//
//        }
//
//    }
//}
