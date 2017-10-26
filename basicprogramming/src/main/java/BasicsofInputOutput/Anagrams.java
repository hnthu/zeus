package BasicsofInputOutput;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/*SAMPLE INPUT
1
cde
abc
SAMPLE OUTPUT
4
*/
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(ana(sc.next(), sc.next()));
        }
    }

    private static int ana(String f, String s) {
        int[] cf = new int['z'+1];
        int[] cs = new int['z'+1];
        for (int i = 0; i < f.length(); i++) {
            cf[f.codePointAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            cs[s.codePointAt(i)]++;
        }
        int count = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            count+=(cf[i]>cs[i]?cf[i]-cs[i]:cs[i]-cf[i]);
        }
        return count;
    }
}
