package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

/*Sample Input

5
1 -2 4 -5 1
Sample Output

9
*/
public class JavaSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int z = 0; z <= n-i; z++) {
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum+=arr[z+j];
                }
                if(sum<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
