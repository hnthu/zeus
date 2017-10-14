import java.util.Arrays;
import java.util.Scanner;

/*SAMPLE INPUT
4
SAMPLE OUTPUT
YES
0 1 0 0
0 0 0 1
1 0 0 0
0 0 1 0*/
public class nQueensProblem {

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
        int N = s.nextInt();
        int[][] board = new int[N][N];
        nQueens(board, N);
        display(board);

    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }

    private static boolean nQueens(int[][] board, int n) {
        if(n==0)
            return true;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(isAttack(i,j,board,n)) {
                    continue;
                }
                board[i][j] = 1;
                if(nQueens(board,n-1)) {
                    return true;
                }
                board[i][j] =0;
            }
        }
        return false;
    }

    private static boolean isAttack(int i, int j, int[][] board, int n) {
        for (int k = 0; k < board.length; k++) {
            if(board[i][k]==1 || board[k][j]==1)
                return true;
        }
        for (int k = 0; k < board.length; k++) {
            for (int l = 0; l < board.length; l++) {
                if(k+l==i+j && board[k][l]==1)
                    return true;
                if(k-l==i-j && board[k][l]==1)
                    return true;
            }
        }
        return false;
    }

}
