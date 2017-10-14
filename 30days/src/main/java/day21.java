import java.util.Scanner;

/*Input Format

The locked Solution class in your editor will pass different types of arrays to your printArray function.

Constraints

You must have exactly  function named printArray.
Output Format

Your printArray function should print each element of its generic array parameter on a new line.*/
public class day21 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }

    private static class Printer<T> {
        /**
         *    Method Name: printArray
         *    Print each element of the generic array on a new line. Do not return anything.
         *    @param A generic array
         **/

        // Write your code here
        public void printArray(T[] array) {
            for(T a:array) {
                System.out.println(a);
            }
        }
    }
}
