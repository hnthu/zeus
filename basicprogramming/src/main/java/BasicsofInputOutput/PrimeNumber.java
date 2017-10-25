package BasicsofInputOutput;

import java.util.Arrays;
import java.util.Scanner;
/*SAMPLE INPUT
9
SAMPLE OUTPUT
2 3 5 7
*/
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimes(n);
    }

    private static void findPrimes(int n) {
        boolean[] arr = new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
        for (int i = 2; i < n; i++) {
            if(arr[i]) {
                for (int j = 2; j*i < n; j++) {
                    arr[j*i] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i])
                System.out.print(i+" ");
        }
    }
}
