package BasicsofInputOutput;

import java.util.Arrays;
import java.util.Scanner;

/*Input format:

First line of input contains an integer T number of test cases. Each test case contains an integer N (denoting the length of the string) and a string S.

Output Format:

For each test case, print Dhananjay's Magical Word in a new line.

Constraints:

1 <= T <= 100

1 <= |S| <= 500

SAMPLE INPUT
1
6
AFREEN
SAMPLE OUTPUT
CGSCCO
*/
public class MagicalWord {
    public static void main(String[] args) {
        boolean[] sievePrimes = sieve(500);
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int j = 0; j < t; j++) {
            int l = s.nextInt();
            String str = s.next();
            for (int i = 0; i < l; i++) {
                System.out.print(convertToDhananjay(str.charAt(i),sievePrimes));
            }
            System.out.println();
        }
    }

    private static boolean[] sieve(int i) {
        boolean[] sieve = new boolean[i+1];
        Arrays.fill(sieve,true);
        for (int j = 0; j < 2 && j<i+1; j++) {
            sieve[j]=false;
        }
        for (int j = 2; j <= i; j++) {
            if(sieve[j]) {
                for (int k = 2; k*j < i; k++) {
                    sieve[k*j] = false;
                }
            }
        }
        Arrays.fill(sieve,0,(int)'A'-1,false);
        Arrays.fill(sieve,(int)'Z'+1,(int)'a'-1,false);
        Arrays.fill(sieve,(int)'z'+1,i,false);
        return sieve;
    }

    private static char convertToDhananjay(char c, boolean[] sieve) {
        int i = 0;
        while(true) {
            if(((int)c-i > 0) && sieve[(int)c-i]) {
                return (char)((int)c-i);
            }
            if(sieve[(int)c+i]) {
                return (char)((int)c+i);
            }
            i++;
        }
    }
}
