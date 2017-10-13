import java.util.Arrays;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        this.maximumDifference = elements[elements.length-1] - elements[0];
    }
}
