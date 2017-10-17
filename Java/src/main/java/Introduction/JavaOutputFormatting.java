package Introduction;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================
*/
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        DecimalFormat df = new DecimalFormat("000");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.println(s1 + String.format("%"+(15-s1.length())+"s"," ")+df.format(x));
        }
        System.out.println("================================");

    }
}
