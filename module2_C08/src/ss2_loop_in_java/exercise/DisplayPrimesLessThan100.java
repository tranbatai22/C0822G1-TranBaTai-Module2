package ss2_loop_in_java.exercise;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {

        int number = 2;
        while (number <= 100) {
            int count = 0;
            int count1 = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count1++;       
                }
            }

            if (count1 == 2) {
                System.out.print(number + "\t");
                count++;
            }
            number++;
        }
    }
}
