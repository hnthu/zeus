package BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/*Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
*/
public class JavaBigDecimal {
    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        //Write your code here

        Arrays.sort(s,0,n,(o1, o2) -> {
            BigDecimal b1 =new BigDecimal(o1);
            BigDecimal b2 =new BigDecimal(o2);
            return b2.compareTo(b1);
        });
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
