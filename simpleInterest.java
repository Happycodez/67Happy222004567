public class simpleInterest {

    public static double calculatingSI(double rate, double deposit, int year) {
        double simpleInterest = (rate * deposit * year);
        return simpleInterest;
    }

    public static void main(String[] a) {
        double interestrate = 0.05;
        double amountdeposited = 100000;
        int years = 5;

        double solution = calculatingSI(interestrate, amountdeposited, years);
        System.out.println("Simple Interest: " + solution + " frw.");
    }
}
