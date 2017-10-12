import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Sample Input

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
Sample Output

sam=99912222
Not found
harry=12299933*/
public class day8 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dictionary.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dictionary.get(s) != null) {
                System.out.println(s+"="+dictionary.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
