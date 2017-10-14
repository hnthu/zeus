import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
Sample Output

julia
julia
riya
samantha
tanya*/
public class day28 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<String> names1 = new ArrayList<String>();
        for(int i=0; i<N; i++) {
            String temp = scanner.next();
            if(scanner.next().contains("@gmail.com"))
                names1.add(temp);
        }
        String[]  names = names1.toArray((new String[0]));
        Arrays.sort(names);
        for(int i=0; i<names1.size(); i++) {
            System.out.println(names[i]);
        }
    }
}
