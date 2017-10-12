import java.util.Scanner;

/*Sample Input

4
1 4 3 2
Sample Output

2 3 4 1*/
public class day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=n-1;i>=0;i--) {
            System.out.print(arr[i]);
            if(i!=0) {
                System.out.print(" ");
            }
        }
        in.close();
    }
}
