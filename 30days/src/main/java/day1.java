import java.util.Scanner;

/*Sample Input

        12
        4.0
        is the best place to learn and practice coding!
        Sample Output

        16
        8.0
        HackerRank is the best place to learn and practice coding!*/
public class day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        StringBuilder s2 = new StringBuilder();
        while(scan.hasNext())
            s2.append(scan.next()+ " ");
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+s2);

    }
}
