import java.util.Scanner;

/*Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2*/
public class day10 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while (n!=0) {
            n = (n & (n << 1));
            count++;
        }
        System.out.println(count);
    }
    private static int maximum(char[] two) {
        int count = 0;
        for(char b : two) {
            if(b!='1')
                break;
            count++;
        }
        return count;
    }
    private static char[] convert(int t) {
        StringBuilder str = new StringBuilder();
        while(t > 0) {
            str.append(t%2);
            t/=2;
        }
        return str.reverse().toString().toCharArray();
    }
}
