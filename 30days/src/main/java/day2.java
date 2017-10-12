import java.util.Scanner;

/*Sample Input

        12.00
        20
        8
        Sample Output

        The total meal cost is 15 dollars.*/
public class day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round((tipPercent+taxPercent+100)*mealCost/100);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
