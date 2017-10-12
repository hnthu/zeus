import java.util.Scanner;

/*Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20*/
public class day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printMultiple(n);
    }

    private static void printMultiple(int n) {
        printMul(1,n);
    }

    private static void printMul(int start, int n) {
        if(start <= 10) {
            System.out.println(n + " x " + start + " = " + n*start);
            printMul(++start, n);
        }
    }
}
