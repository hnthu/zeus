package BasicsofInputOutput;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

/*SAMPLE INPUT
3
sumit mitsu
ambuj jumba
abhi hibb
SAMPLE OUTPUT
YES
YES
NO

*/
public class TwoStrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                char input1[] = sc.next().toCharArray();
                Arrays.sort(input1);
                char input2[] = sc.next().toCharArray();
                Arrays.sort(input2);
                System.out.println(Arrays.equals(input1,input2)?"YES":"NO");
            }
        }
    }
}
