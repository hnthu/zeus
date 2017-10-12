import java.util.Scanner;

/*Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird*/
public class day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1 || (n%2==0 && n >= 6 && n <= 20)){
            ans = "Weird";
        }
        else{
            // Complete the code
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
