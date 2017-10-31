package DataStructures;

import java.util.*;

/*Sample Input

6 3
5 3 5 2 3 2
Sample Output

3*/
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m-1; i++) {
            int input = in.nextInt();
            deque.add(input);
            set.add(input);
        }
        for (int i = m-1; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);
            if (set.size() > max) {
                max = set.size();
                if (max == m) {
                    break;
                }
            }
            int first = deque.remove();
            if (!deque.contains(first)) set.remove(first);
        }

        System.out.println(max);
    }
}
