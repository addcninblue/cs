import javax.swing.*;
import java.awt.*;

/**
 * Created by addison on 2/6/17.
 */

public class Main extends JComponent {

    private static int[] nums; //heights

    public static void main(String[] args) {
        Input input = new Input();
        input.getInput();
        nums = input.getNums();

//        nums = generateNumbers(200, -100, 100); // debug

        MergeSort mergeSort = new MergeSort(nums);
        mergeSort.mergeSort();
        System.out.print("Sorted: ");
        int[] sorted = mergeSort.getNums();
        for(int i : sorted){
            System.out.format("%d ", i);
        }
        System.out.println();

        // find phase

        Find find = new Find(sorted, input.getNumberToFind(), input.isBinarySearch());
        if (find.getTraversalDistance() == 0){
            System.out.print("Could not find given number");
        } else {
            System.out.format("Found at index %d in %d hops", find.getIndexFoundAt(), find.getTraversalDistance());
        }
    }

    /**
     * Generates an array of numbers to sort
     * @param size       size of array to generate
     * @param lowerBound lower bound of numbers to generate
     * @param upperBound upper bound of numbers to generate
     * @return array of ints
     */
    public static int[] generateNumbers(int size, int lowerBound, int upperBound) {
        int[] output = new int[size];
        int range = upperBound - lowerBound;
        for (int i = 0; i < size; i++) {
            output[i] = (int) Math.floor((Math.random() * range) + lowerBound);
        }
        return output;
    }
}
