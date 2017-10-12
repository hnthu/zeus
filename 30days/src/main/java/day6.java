import java.util.Scanner;

/*Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak*/
public class day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            String s = scanner.next();
            for(int i = 0; i< s.length(); i+=2){
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
            for(int i = 1; i< s.length(); i+=2) {
                System.out.print(s.charAt(i));
            }
            System.out.print("\n");
            t--;
        }
    }
}
