package BasicsofInputOutput;

import java.util.Scanner;

/*SAMPLE INPUT
2
SAMPLE OUTPUT
2
*/
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fac(sc.nextLong()));
    }

    private static long fac(long n) {
        if(n==1)
            return 1;
        return n*fac(n-1);
    }
}
