package ExceptionHandling;

import java.util.Scanner;

/*Sample Input 0

3 5
2 4
0 0
-1 -2
-1 3
Sample Output 0

243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
*/
public class JavaExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    static class MyCalculator {
        public int power(int n, int p) throws Exception {
            if(n==0 && p==0)
                throw new Exception("n and p should not be zero.");
            if(n<0 || p<0)
                throw new Exception("n or p should not be negative.");
            return (int) Math.pow(n,p);
        }
    /*
    * Create the method long power(int, int) here.
    */

    }
}
