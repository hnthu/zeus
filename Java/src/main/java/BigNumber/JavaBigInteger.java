package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/*Sample Input

1234
20
Sample Output

1254
24680
*/
public class JavaBigInteger {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            BigInteger b1 = s.nextBigInteger();
            BigInteger b2 = s.nextBigInteger();
            System.out.println(b1.add(b2));
            System.out.println(b1.multiply(b2));
        }
    }
}
