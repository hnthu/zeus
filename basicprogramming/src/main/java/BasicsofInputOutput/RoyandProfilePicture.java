package BasicsofInputOutput;

import java.util.Scanner;

/*SAMPLE INPUT
180
3
640 480
120 300
180 180
SAMPLE OUTPUT
CROP IT
UPLOAD ANOTHER
ACCEPTED
*/
public class RoyandProfilePicture {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if(a<L || b <L)
                System.out.println("UPLOAD ANOTHER");
            else if(a==b && a >=L)
                System.out.println("ACCEPTED");
            else
                System.out.println("CROP IT");
        }

    }
}
