package Strings;

import java.util.Scanner;

/*Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
Sample Output

true
true
true
false
false
false
*/
public class JavaRegex {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }
        }

    }

    private static class MyRegex {
        String zeroTo255 = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
        public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
    }
}
