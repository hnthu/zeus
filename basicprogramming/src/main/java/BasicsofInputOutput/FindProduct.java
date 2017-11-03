package BasicsofInputOutput;

import java.util.Scanner;

/*SAMPLE INPUT
5
1 2 3 4 5
SAMPLE OUTPUT
120
*/
public class FindProduct {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            int[] arr = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = sc.nextInt();
            }
            long sum = 1;
            for (int i = 0; i < t; i++) {
                sum = sum*arr[i]%1000000007;
            }
            System.out.println(sum);
        }
    }
}
