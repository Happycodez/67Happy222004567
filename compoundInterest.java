// import java.util.Scanner;

public class compoundInterest {

// The below Loan function calculate the simple interest. 
    class Loan {
        public static double getTotalAmount(double principal, double rate, int time, int n) {
            double r = rate / 100;
            double A = principal * Math.pow(1 + r / n, n * time);
            return A;
        }
    }
// The below function is the main one that call the above one to be executed
    public static void main(String[] args) {
        double principal = 500000;
        double rate = 18;
        int time = 3;
        int n = 12;
// We pass values/arguments to the called function
        double totalAmount = Loan.getTotalAmount(principal, rate, time, n);
// output
        System.out.printf("Amount paid after %d years: %.2f frw", time, totalAmount);
    }

}
