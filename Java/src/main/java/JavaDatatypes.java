import java.util.Scanner;

/*Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
* */
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String num = s.next();
            StringBuilder stb = new StringBuilder("");
            try {
                long lo = Long.parseLong(num);
                stb.insert(0,"* long\n");
                try {
                    int in = Integer.parseInt(num);
                    stb.insert(0,"* int\n");
                    try {
                        short sh = Short.parseShort(num);
                        stb.insert(0,"* short\n");
                        try {
                            byte by = Byte.parseByte(num);
                            stb.insert(0,"* byte\n");
                        }
                        catch (NumberFormatException ne) {
                        }
                    }
                    catch (NumberFormatException ne) {
                    }
                }
                catch (NumberFormatException ne) {
                }
            }
            catch (NumberFormatException ne) {
            }
            if(stb.toString().isEmpty()) {
                System.out.println(num + " can't be fitted anywhere.");
            }
            else {
                System.out.println(num + " can be fitted in:");
                System.out.print(stb.toString());
            }
        }
    }
}
