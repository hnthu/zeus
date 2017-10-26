package BasicsofInputOutput;

import java.util.Scanner;

/*SAMPLE INPUT
1 10 1
SAMPLE OUTPUT
10*/
public class CountDivisors {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(countD(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }

    private static int countD(int s, int n, int k) {
        int count=0;
        int start = s/k+(s%k==0?0:1);
        while(start*k<=n) {
            count++;
            start++;
        }
        return count;
    }
}
