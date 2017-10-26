package BasicsofInputOutput;

import java.util.Scanner;

/*Given a character
C
C, print the ASCII value of that character.

Input:
First and only line in input contains a character
C
C.

Output:
Print the ASCII value of the character
C
C.
*/
public class ASCIIValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNext()) {
                String c = sc.next();
                System.out.println(c.codePointAt(0));
            }
        }
    }
}
