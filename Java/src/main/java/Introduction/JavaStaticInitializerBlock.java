package Introduction;

import java.util.Scanner;

/*Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
*/
public class JavaStaticInitializerBlock {
    static int B,H;
    static boolean flag;
    static {
        Scanner s = new Scanner(System.in);
        B = s.nextInt();
        H = s.nextInt();
        flag= true;
        if(B<=0 || H<=0) {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
