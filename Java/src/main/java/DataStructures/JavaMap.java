package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933
*/
public class JavaMap {
    public static void main(String []argh)
    {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();
            Map ma = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();
                ma.put(name, phone);
                in.nextLine();
            }
            while (in.hasNext()) {
                String s = in.nextLine();
                Integer ph = (Integer) ma.get(s);
                if (ph != null) {
                    System.out.println(s + "=" + ph);
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
