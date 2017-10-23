package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Sample Input

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
*/
public class TagContentExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            //Write your code here
            Pattern p = Pattern.compile("<([^>/]+)>([^<\1]+)<\\/\\1>");
            Matcher m = p.matcher(line);
            boolean none = true;
            while(m.find()) {
                System.out.println(m.group(2));
                none = false;
            }
            if (none)
                System.out.println("None");
            testCases--;
        }
    }
}
