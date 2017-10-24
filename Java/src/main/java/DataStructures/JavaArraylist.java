package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
*/
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ArrayList<Integer>> li = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int j =0;
            String line = sc.nextLine();
            ArrayList<Integer> lt = new ArrayList();
            if(!line.isEmpty()) {
                String[] de = line.split(" ");
                for (String s : de) {
                    lt.add(Integer.valueOf(s));
                }
            }
            li.add(lt);
        }
        int  k =sc.nextInt();
        for (int i = 0; i < k; i++) {
            try {
                int in = li.get(sc.nextInt() - 1).get(sc.nextInt());
                System.out.println(in);
            }
            catch (IndexOutOfBoundsException ie) {
                System.out.println("ERROR!");
            }
        }
    }
}
