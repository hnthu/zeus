package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Sample Input 0:

10
3
Sample Output 0:

3
Sample Input 1:

10
Hello
Sample Output 1:

java.util.InputMismatchException
Sample Input 2:

10
0
Sample Output 2:

java.lang.ArithmeticException: / by zero
Sample Input 3:

23.323
0
Sample Output 3:

java.util.InputMismatchException
*/
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Integer.valueOf(a/b));
        }
        catch (InputMismatchException ie) {
            System.out.println(ie.toString().split(": For input")[0]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
