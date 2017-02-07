import javax.swing.*;

/**
 * Created by addison on 2/7/17.
 */
public class DrawParts extends JComponent {
    public DrawParts(int[] nums, int numberToFind, boolean isBinarySearch){
        MergeSortVisual mergeSort = new MergeSortVisual(nums);
        mergeSort.mergeSort();
        int[] sorted = mergeSort.getNums();

        Find find = new Find(sorted, numberToFind, isBinarySearch);
        find.find();

    }
}
