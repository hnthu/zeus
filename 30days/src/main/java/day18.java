import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*Sample Input

racecar
Sample Output

The word, racecar, is a palindrome.*/
public class day18 {
    // Write your code here.
    LinkedList queue;
    Stack stack;

    day18() {
        queue = new LinkedList();
        stack = new Stack();
    }

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    char popCharacter() {
        return (char)stack.pop();
    }

    char dequeueCharacter() {
        return (char)queue.poll();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        day18 p = new day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
