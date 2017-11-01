package DataStructures;

import java.util.BitSet;
import java.util.Scanner;

/*Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output

0 0
1 0
1 1
1 2
*/
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            executeAction(sc.next(), sc.nextInt(), sc.nextInt(), b1, b2);
        }
    }

    private static void executeAction(String action, int p1, int p2, BitSet b1, BitSet b2) {
        switch (action) {
            case "AND":
                if (p1 == 1)
                    doAnd(b1, b2);
                else
                    doAnd(b2, b1);
                break;
            case "SET":
                if (p1 == 1)
                    doSet(b1, p2);
                else
                    doSet(b2, p2);
                break;
            case "FLIP":
                if (p1 == 1)
                    doFlip(b1, p2);
                else
                    doFlip(b2, p2);
                break;
            case "OR":
                if (p1 == 1)
                    doOr(b1, b2);
                else
                    doOr(b2, b1);
                break;
            case "XOR":
                if (p1 == 1)
                    doXor(b1, b2);
                else
                    doXor(b2, b1);
                break;
        }
        display(b1, b2);
    }

    private static void doXor(BitSet b1, BitSet b2) {
        b1.xor(b2);
    }

    private static void display(BitSet b1, BitSet b2) {
        System.out.println(b1.cardinality() + " " + b2.cardinality());
    }

    private static void doOr(BitSet b1, BitSet b2) {
        b1.or(b2);
    }

    private static void doFlip(BitSet b1, int p2) {
        b1.flip(p2);
    }

    private static void doSet(BitSet b1, int p2) {
        b1.set(p2);
    }

    private static void doAnd(BitSet b1, BitSet b2) {
        b1.and(b2);
    }
}
