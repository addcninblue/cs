/**
 * Created by addison on 1/4/17.
 */

// import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MergeSort extends JComponent {

    private int[] nums; //heights
    private int[] currentGroup = new int[]{0, 0};

    public MergeSort(int[] nums){
        this.nums = nums;
    }

    public int[] getNums(){
        return nums;
    }

    /**
     * Performs a merge sort on an array of ints
     * (Postcondition: num array is not empty)
     * @return sorted array
     * (Precondition: sorted array)
     */
    public int[] mergeSort(){
        int aStart = 0;
        int aEnd = nums.length / 2;
        int bStart = nums.length / 2;
        int bEnd = nums.length;
        return merge(mergeSort(aStart, aEnd), mergeSort(bStart, bEnd));
    }

    // sorts nums array
    // return is custom int[]:
    //   [start, end]
    public int[] mergeSort(int start, int end){
        if(end - start == 1 || end - start == 0)
            return new int[]{start, end};
        int aStart = start;
        int aEnd = (end + start) / 2;
        int bStart = (end + start) / 2;
        int bEnd = end;
            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        // return a;
        return merge(mergeSort(aStart, aEnd), mergeSort(bStart, bEnd));
    }

    public int[] merge(int[] aIndices, int[] bIndices){
        currentGroup[0] = aIndices[0];
        currentGroup[1] = bIndices[1];
        if(aIndices[1] - aIndices[0] == 0 || bIndices[1] - bIndices[0] == 0)
            return new int[]{aIndices[0], bIndices[1]};
        int[] a = new int[aIndices[1] - aIndices[0]];
        int[] b = new int[bIndices[1] - bIndices[0]];
        for(int i = 0; i < a.length; i++){
            a[i] = nums[aIndices[0] + i];
        }
        for(int i = 0; i < b.length; i++){
            b[i] = nums[bIndices[0] + i];
        }
        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < a.length + b.length; i++){
            if(bIndex >= b.length || (aIndex < a.length && a[aIndex] <= b[bIndex])){
                nums[aIndices[0] + i] = a[aIndex];
                aIndex++;
            } else {
                nums[aIndices[0] + i] = b[bIndex];
                bIndex++;
            }
        }
        return new int[]{aIndices[0], bIndices[1]};
    }
    /*
    /**
     * Returns index of minimum
     * @param nums the array to find the minimum in
     * @param index the index to start at
     * (Postcondition: nums is not empty, index is valid)
     * @return the index of the minimum number in array
     * (Precondition: index of minimum number)
     */
    public int getMin(int[] nums, int index){
        int minIndex = index; // starting index

        for(int i = index; i < nums.length; i++){
            if(nums[minIndex] > nums[i]){
                minIndex = i;
                // smallest = i;
            }
        }
        return minIndex;
    }

}
