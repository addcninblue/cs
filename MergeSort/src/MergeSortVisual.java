/**
 * Created by addison on 1/4/17.
 */

// import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MergeSortVisual extends JComponent {

    private int[] nums; //heights

    private int[] currentGroup = new int[]{0,0};
    private int cursor;

    public MergeSortVisual(int[] nums){
        this.nums = nums;
        // this.nums = new int[]{1, 10, 3, 4, 5};
    }

    /**
     * Paints all rectangles
     * (Postcondition: rectangles painted)
	 * @param g Graphics to paint on
     * (Precondition: g is valid)
     */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Color cyan = new Color(42, 161, 152);
        Color orange = new Color(203, 75, 22);
        Color yellow = new Color(181,137,0);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int yLocation = screenSize.height / 2;
        int increment = screenSize.width / nums.length;
        int maxHeight = getMax(nums);
        Rectangle r1 = new Rectangle();

        for(int i = 0; i < nums.length ; i++){
            int actualHeight = Math.abs((int)(((double)nums[i] / (double)maxHeight) * (double)yLocation));

            Rectangle r = new Rectangle();
            // if (i % 2 == 0)
            // System.out.format("%s, %s, %s\n", i, cursor, nums[smallest]);
            if(i == cursor){
                g2.setColor(orange);
            } else if(currentGroup[0] <= i && i < currentGroup[1]) {
                g2.setColor(orange);
            } else {
                g2.setColor(cyan);
            }
            // else
                // g2.setColor(orange);
            if (nums[i] > 0){
                // System.out.println(increment*i + " " + (yLocation + actualHeight));
                r.setLocation(increment*i, yLocation - actualHeight);
                r.setSize(increment, actualHeight);
                if(i == cursor){
                    g2.fill(r);
                } else {
                    g2.draw(r);
                }
            } else { // rectangle is negative
                // System.out.println(increment*i + " " + yLocation);
                r.setLocation(increment*i, yLocation);
                r.setSize(increment, actualHeight);
                if(i == cursor){
                    g2.fill(r);
                } else {
                    g2.draw(r);
                }
            }
        }
        // System.out.println("paintComponent: " + System.currentTimeMillis());
    }

    /**
    * Get the maximum number in the array
    * @param array The array to find the maximum number of.
    */
    public int getMax(int[] array){
        int maximum = 0;
        for(int i = 0; i < array.length; i++){
            if (Math.abs(array[i]) > maximum)
                maximum = Math.abs(array[i]);
        }
        return maximum;
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
        if(end - start == 1 || end - start == 0) // TODO ????
            return new int[]{start, end};
        int aStart = start;
        int aEnd = (end + start) / 2;
        int bStart = (end + start) / 2;
        int bEnd = end;
        repaint();
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
            // System.out.println(aIndices[0] + i);
            if(bIndex >= b.length || (aIndex < a.length && a[aIndex] <= b[bIndex])){
                nums[aIndices[0] + i] = a[aIndex];
                aIndex++;
            } else {
                nums[aIndices[0] + i] = b[bIndex];
                bIndex++;
            }
            cursor = aIndices[0] + i;
            repaint();
            try {
                Thread.sleep(50);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        return new int[]{aIndices[0], bIndices[1]};
    }

    // /**
    //  * Performs a merge sort on an array of ints
    //  * (Postcondition: num array is not empty)
    //  * @return sorted array
    //  * (Precondition: sorted array)
    //  */
    // public int[] mergeSort(){
    //     int[] a = new int[nums.length / 2];
    //     int[] b = new int[nums.length / 2 + nums.length % 2];
    //     for(int i = 0; i < a.length; i++){
    //         a[i] = nums[i];
    //         // System.out.print(a[i]);
    //     }
    //     for(int i = 0; i < b.length; i++){
    //         b[i] = nums[nums.length/2 + i];
    //         // System.out.print(b[i]);
    //     }
    //     // return a;
    //     return merge(mergeSort(a), mergeSort(b));
    // }

    // public int[] mergeSort(int[] array){
    //     if(array.length == 1 || array.length == 0)
    //         return array;
    //     int[] a = new int[array.length / 2];
    //     int[] b = new int[array.length / 2 + array.length % 2];
    //     for(int i = 0; i < a.length; i++){
    //         a[i] = array[i];
    //         // System.out.print(a[i]);
    //     }
    //     for(int i = 0; i < b.length; i++){
    //         b[i] = array[array.length/2 + i];
    //         // System.out.print(b[i]);
    //     }
    //     // return a;
    //     return merge(mergeSort(a), mergeSort(b));
    // }

    // public int[] merge(int[] a, int[] b){
    //     int[] output = new int[a.length + b.length];
    //     int aIndex = 0;
    //     int bIndex = 0;
    //     for(int i = 0; i < a.length + b.length; i++){
    //         if(bIndex >= b.length || (aIndex < a.length && a[aIndex] <= b[bIndex])){
    //             output[i] = a[aIndex];
    //             aIndex++;
    //         } else {
    //             output[i] = b[bIndex];
    //             bIndex++;
    //         }
    //     }
    //     return output;
    // }

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
