import java.util.Scanner;

public class ifstatement {
    public static void main(String args[]) {
        String name = "Ngomijana";
        Scanner myNumber = new Scanner(System.in);
        System.out.print("Enter baby's weight: ");
        double weight = myNumber.nextDouble();

        if (weight >= 5 && weight <= 8) {
            System.out.println(name + "'s weight " + weight + "Kgs is Normal");
        } else {
            System.out.println(name + "'s weight " + weight + "Kgs is Abnormal");
        }
    }
}
