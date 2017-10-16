import java.util.Scanner;

/*Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
*/
public class JavaIfElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1 || (n%2==0 && n>=6 && n<=20)){
            ans = "Weird";
        }
        else{
            ans = "Not Weird";
            //Complete the code

        }
        System.out.println(ans);

    }
}
