package DataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Sample Output

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

    private static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            if(o1.score!=o2.score) {
                return o2.score-o1.score;
            }
            return o1.name.compareTo(o2.name);
        }
    }
}
