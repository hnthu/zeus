package Strings;

import java.util.Scanner;

/*Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
*/
public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int k = s.nextInt();
        s.close();
        display(str, k);
    }

    private static void display(String str, int k) {
        String mis = "";
        String mas = "";

        for (int i = 0; i < str.length() - k + 1; i++) {
            String temp = str.substring(i,i+k);
            if(temp.compareTo(mis)<0 || mis.isEmpty())
                mis = temp;
            if(temp.compareTo(mas)>0)
                mas = temp;
        }
        System.out.printf("%s\n%s",mis,mas);
    }
}
