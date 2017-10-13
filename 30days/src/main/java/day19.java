import java.util.Scanner;

/*Sample Input

6
Sample Output

I implemented: AdvancedArithmetic
12*/
public class day19 {
    interface AdvancedArithmetic{
        int divisorSum(int n);
    }
    static class Calculator implements AdvancedArithmetic{
        public int divisorSum(int n) {
            int result = 1+(n>1?n:0);
            for(int i = 2; i < n; i++) {
                result += (n%i == 0 ? i : 0);
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
