import java.util.Calendar;
import java.util.Scanner;

/*Sample Input

9 6 2015
6 6 2015
Sample Output

45*/
public class day26 {
    private static long calculate(Calendar s, Calendar e) {
        if(e.after(s))
            return 0;
        long result = 0;
        int ky = s.get(Calendar.YEAR) - e.get(Calendar.YEAR);
        int km = s.get(Calendar.MONTH) - e.get(Calendar.MONTH);
        int kd = s.get(Calendar.DAY_OF_MONTH) - e.get(Calendar.DAY_OF_MONTH);
        if(ky>0) {
            result = 10000;
        }
        else if(km>0) {
            result = (km*500);
        }
        else if(kd>0){
            result = (kd*15);
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        Calendar ds = Calendar.getInstance();
        ds.set(year, month-1, day);
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        Calendar de = Calendar.getInstance();
        de.set(year2, month2-1, day2);
        System.out.println(calculate(ds,de));
    }
}
