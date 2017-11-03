package BasicsofInputOutput;

import java.util.Scanner;

/*SAMPLE INPUT
abcdE
SAMPLE OUTPUT
ABCDe
*/
public class ToggleString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println(swapCase(sc.next()));
        }
    }
    public static String swapCase(final String str) {
        final int strLen = str.length();
        final int newCodePoints[] = new int[strLen]; // cannot be longer than the char array
        int outOffset = 0;
        for (int i = 0; i < strLen; ) {
            final int oldCodepoint = str.codePointAt(i);
            final int newCodePoint;
            if (Character.isUpperCase(oldCodepoint)) {
                newCodePoint = Character.toLowerCase(oldCodepoint);
            } else if (Character.isTitleCase(oldCodepoint)) {
                newCodePoint = Character.toLowerCase(oldCodepoint);
            } else if (Character.isLowerCase(oldCodepoint)) {
                newCodePoint = Character.toUpperCase(oldCodepoint);
            } else {
                newCodePoint = oldCodepoint;
            }
            newCodePoints[outOffset++] = newCodePoint;
            i += Character.charCount(newCodePoint);
        }
        return new String(newCodePoints, 0, outOffset);
    }
}
