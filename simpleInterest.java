public class simpleInterest {
    
    public static double calculatingSI(double rate, double deposit, int year) {
        double simpleInterest = (rate * deposit * year);
        return simpleInterest;
    }
//Function taht calculate compund interest
    public static void main(String[] a) {
        double interestrate = 0.05;
        double amountdeposited = 100000;
        int years = 5;
//We pass arguments to the function called above 
        double solution = calculatingSI(interestrate, amountdeposited, years);
//Output
        System.out.println("Simple Interest: " + solution + " frw.");
    }
}
