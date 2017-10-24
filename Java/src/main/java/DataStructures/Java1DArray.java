package DataStructures;

import java.util.Scanner;

/*Sample Input

5
10
20
30
40
50
Sample Output

10
20
30
40
50
*/
public class Java1DArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Declare array a here

        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            // Fill array a here
            a[i] = val;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}