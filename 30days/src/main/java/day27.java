/*Objective
This challenge is very different from the others we've completed because it requires you to generate a valid test case for a problem instead of solving the problem. There is no input to read, you simply have to generate and print test values for the problem that satisfy both the problem's Input Format and the criteria laid out in the Task section. Check out the Tutorial tab for an instructional video on testing!

Consider the following problem (but do not solve it):

Problem Statement

A Discrete Mathematics professor has a class of  students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than  students are present when class starts. Given the arrival time of each student, determine if the class is canceled.
Input Format

The first line of input contains , the number of lectures.
The information for each lecture spans two lines. The first line has two space-separated integers,  (the number of students in the class) and  (the cancelation threshold). The second line contains  space-separated integers describing the array of students' arrival times ().

Note: Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () indicate the student arrived  minutes late. If a student arrives exactly on time , the student is considered to have entered before the class started.
Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.
Example

When properly solved, this input:
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
Produces this output:
YES
NO
For the first test case, . The professor wants at least  students in attendance, but only  arrive on time ( and ). Thus, the class is canceled.

For the second test case, . The professor wants at least  students in attendance, and  do arrive on time ( and ). Thus, the class is not canceled.
Task

Create and print a test case for the problem above that meet the following criteria:

The value of  must be distinct across all the test cases.
Array  must have at least  zero,  positive integer, and  negative integer.
Scoring

If you submit  correct test cases, you will earn  of the maximum score. You must submit  test cases to earn the maximum possible score.

Input Format

You are not responsible for reading anything from stdin.

Output Format

Print  lines of output that can be read by the Professor challenge as valid input. Your test case must result in the following output when fed as input to the Professor challenge's solution:

YES
NO
YES
NO
YES
Explanation

Your code must print lines of output that follow the Input Format in the Professor challenge above. For example, this partial solution to this challenge:

print('2')
print('4 3')
print('-1 -3 4 2')
print('5 2')
print('0 -1 2 1 4')
prints the following output that can be used as valid input for the Professor   challenge:

2
4 3
-1 -3 4 2
5 2
0 -1 2 1 4
When read by a valid solution to the Professor challenge, it produces the following output:

YES
NO
You must do something similar to this, except that the test case you develop must meet the constraints set in the Task section above.*/
import java.util.*;

public class day27 {
    public static void main(String[] args) {

        int t = 5;
        System.out.println(t);

        for (int i = 0, n = 46; i < t; i++, n += (int)Math.ceil(Math.log(n * n))) {

            int k = n - ((int)Math.ceil(Math.sqrt(n)));
            System.out.println(n + " " + k);

            int a[] = new int[n];
            Arrays.fill(a, 0, n, 0);

            if (i % 2 == 0) {
                Arrays.fill(a, 0, 2, -15);
                Arrays.fill(a, 5, n, 10);
            }
            else {
                Arrays.fill(a, 0, k >> 1, -15);
                Arrays.fill(a, k + 1, n, 10);
            }

            for (int ai : a) System.out.print(ai + " ");
            System.out.println();
        }
    }
}
