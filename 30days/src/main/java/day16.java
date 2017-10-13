import java.util.Scanner;

/*Sample Input 0

3
Sample Output 0

3
Sample Input 1

za
Sample Output 1

Bad String*/
public class day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            System.out.println(Integer.valueOf(S));
        }
        catch (java.lang.NumberFormatException nfe) {
            System.out.println("Bad String");
        }
    }
}
