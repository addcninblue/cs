/**
 * Created by addison on 1/4/17.
 */

// import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tester extends JComponent{

    private static int[] nums; //heights


    public static void main (String [] args){

        nums = new int[]{1,2,3};
        MergeSortVisual mergeSort = new MergeSortVisual(nums);
        int[] output = mergeSort.mergeSort();
        int[] nums = mergeSort.getNums();
        for(int i : nums){
            System.out.print(i);
        }

        // // sort nums
        // for(int i = 0; i < nums.length; i++){
        //     System.out.format("%d ", nums[i]);
        // }
        // System.out.println();
        // int[] output = MergeSort.MergeSort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     System.out.format("%d ", nums[i]);
        // }

    }

    /**
     * Generates an array of numbers to sort
     * (Postcondition: array)
	 * @param size size of array to generate
     * @param lowerBound lower bound of numbers to generate
     * @param upperBound upper bound of numbers to generate
     * (Precondition: size > 0)
     * @return array of ints
     */
    public static int[] generateNumbers(int size, int lowerBound, int upperBound){
        int[] output = new int[size];
        int range = upperBound - lowerBound;
        for(int i = 0; i < size; i++){
            output[i] = (int)Math.floor((Math.random() * range) + lowerBound);
        }
        return output;
    }

}
