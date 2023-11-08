// import java.util.Scanner;

public class compoundInterest {

    class Loan {
        public static double getTotalAmount(double principal, double rate, int time, int n) {
            double r = rate / 100;
            double A = principal * Math.pow(1 + r / n, n * time);
            return A;
        }
    }

    public static void main(String[] args) {
        double principal = 500000;
        double rate = 18;
        int time = 3;
        int n = 12;

        double totalAmount = Loan.getTotalAmount(principal, rate, time, n);

        System.out.printf("Amount paid after %d years: %.2f frw", time, totalAmount);
    }

}
