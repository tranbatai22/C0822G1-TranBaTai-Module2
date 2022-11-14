package review.money;

public class InterestRate {
    public static double interestRate(double money, double ratio, int month){
        double profitAmount = money * ratio / 12 * month;
        return profitAmount;
    }
}
