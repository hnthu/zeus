import java.util.Scanner;

/*Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime*/
public class day25 {
    private static boolean isPrime(int n) {
        if(n==2) return true;
        if(n<2 || n%2==0)
            return false;
        for(int i=3;i<n/2; i+=2)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for( int i=0; i < n; i++) {
            System.out.println(isPrime(scanner.nextInt())?"Prime":"Not prime");
        }
    }
}
