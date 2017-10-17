package Introduction;

import java.util.Calendar;
import java.util.Scanner;

/*Sample Input

08 05 2015
Sample Output

WEDNESDAY
*/
public class JavaDateandTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

    private static String getDay(String day, String month, String year) {
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        int d = c.get(Calendar.DAY_OF_WEEK);
        switch(d) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
        }
        return null;
    }
}
