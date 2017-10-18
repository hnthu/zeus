package Strings;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/*Sample Input

hello
java
Sample Output

9
No
Hello Java
*/
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println(a.length()+b.length());
        System.out.println(a.compareTo(b)>0?"Yes":"No");
        System.out.println(StringUtils.capitalize(a)+" "+StringUtils.capitalize(b));
    }
}
