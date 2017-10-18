package Strings;

import java.util.Arrays;
import java.util.Scanner;

/*Sample Input 0

anagram
margana
Sample Output 0

Anagrams

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
*/
public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] ca = a.toUpperCase().toCharArray();
        char[] cb = b.toUpperCase().toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca,cb);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
