package BasicsofInputOutput;

import javafx.util.Pair;

import java.util.Scanner;
import java.util.Vector;

/*SAMPLE INPUT
2
18
40
SAMPLE OUTPUT
19 WS
45 AS
*/
public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Pair<Integer, String>[] seats = new Pair[109];
        calculate(seats);
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            System.out.println(seats[s].getKey()+ " " + seats[s].getValue());
        }
    }

    private static void calculate(Pair<Integer, String>[] seats) {
        int i = 0;
        while(i<108) {
            for (int j = 0; j < 6 ; j++) {
                i++;
                int key = i+(11-2*j);
                String type = (j==0||j==5) ? "WS" : (j==1||j==4) ? "MS" : "AS";
                seats[i] = new Pair<>(key, type);
                seats[key] = new Pair<>(i, type);
            }
            i+=6;
        }
    }
}
