package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
*/
public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List li = new ArrayList();
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String action = sc.next();
            if(action.compareTo("Insert") == 0) {
                insert(li, sc.nextInt(), sc.nextInt());
            }
            else if(action.compareTo("Delete") == 0) {
                delete(li, sc.nextInt());
            }
        }
        System.out.println(li.toString().replaceAll("[\\[\\],]",""));
    }

    private static void delete(List li, int i) {
        li.remove(i);
    }

    private static void insert(List li, int i, int i1) {
        li.add(i,i1);
    }

}
