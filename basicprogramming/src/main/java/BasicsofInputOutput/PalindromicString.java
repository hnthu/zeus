package BasicsofInputOutput;

import java.util.Scanner;
/*SAMPLE INPUT
aba
SAMPLE OUTPUT
YES
*/
public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.printf(input.compareTo(new StringBuilder(input).reverse().toString())==0?"YES":"NO");
    }
}
