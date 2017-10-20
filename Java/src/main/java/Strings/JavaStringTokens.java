package Strings;


import java.util.Arrays;
import java.util.Scanner;

/*Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
*/
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] sp = s.trim().isEmpty() ? new String[0] : s.trim().split("[ !,?._'@]+");
        System.out.println(sp.length);
        Arrays.stream(sp).forEach(st -> System.out.println(st));
        scan.close();
    }
}
