import java.util.Scanner;

/*Sample Input

4
-1
10
16
18
Sample Output

Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.*/
public class day4 {

        private int age;

        public day4(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                initialAge = 0;
            }
            age = initialAge;
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            System.out.println(age < 13 ? "You are young." : age >= 13 && age < 18 ? "You are a teenager." : "You are old.");
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            day4 p = new day4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
