import java.util.Scanner;

/*Sample Input

3
Sample Output

6*/
public class day9 {
    static int factorial(int n) {
        // Complete this function
        return n<2?1:n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
