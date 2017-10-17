package Introduction;

import java.util.Scanner;

/*Input Format

There are  3 lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125
*/
public class JavaStdinandStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
