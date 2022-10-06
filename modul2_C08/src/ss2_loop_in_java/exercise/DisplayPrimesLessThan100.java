package ss2_loop_in_java.exercise;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (N <= 100) {
            int count1 = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                System.out.print(N + "\t");
                count++;
            }
            N++;
        }
    }
}
