import java.util.Scanner;

/*Sample Input

3
5 2
8 5
2 2
Sample Output

1
4
0
*/
public class day29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            System.out.println(bitwiseMaxButK(N,K));
        }
    }

    private static int bitwiseMaxButK(int n, int k) {
        int max = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <= n ; j++) {
                if((i&j)<k && (i&j)>max)
                    max = i&j;
            }
            
        }
        return max;
    }
}
