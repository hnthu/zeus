package Strings;

import java.util.Scanner;

/*Sample Input

Helloworld
3 7
Sample Output

lowo
*/
public class JavaSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.printf(str.substring(s.nextInt(),s.nextInt()));
    }
}
