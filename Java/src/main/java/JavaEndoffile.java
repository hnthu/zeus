import java.util.Scanner;

/*Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
*/
public class JavaEndoffile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        while(s.hasNext()) {
            System.out.println((i++)+" "+ s.nextLine());
        }
    }
}
