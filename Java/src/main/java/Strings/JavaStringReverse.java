package Strings;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/*Sample Input

madam
Sample Output

Yes
*/
public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(StringUtils.reverse(A).equals(A)?"Yes":"No");
    }
}
