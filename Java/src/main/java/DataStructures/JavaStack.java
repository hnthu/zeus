package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true
*/
public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Map m = new HashMap<Character, Character>();
        m.put('}','{');
        m.put(']','[');
        m.put(')','(');
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isBalance(m, input));
        }

    }

    private static boolean isBalance(Map m, String input) {
        Stack st = new Stack();
        for(Character c : input.toCharArray()) {
            if(!st.isEmpty()) {
                Character stc = (Character) st.peek();
                Character cf = (Character) m.get(c);
                if(cf != null) {
                    if(cf.compareTo(stc)==0) {
                        st.pop();
                    }
                    else {
                        return false;
                    }
                }
                else {
                    st.push(c);
                }
            }
            else {
                st.push(c);
            }

        }
        return st.isEmpty();
    }
}
