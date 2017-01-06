/**
 * Created by addison on 1/4/17.
 */

// import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JComponent{

    private static int[] nums; //heights


    public static void main (String [] args){

        nums = SelectionSort.generateNumbers(50, -100, 100);

        JFrame frame = new JFrame("Selection Sort");
        SelectionSortVisual selectionSort = new SelectionSortVisual(nums);
        frame.add(selectionSort);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.pack();
        frame.setSize(screenSize.width,screenSize.height);
        Color base02 = new Color(7, 54, 66);
        frame.getContentPane().setBackground(base02);

        // set default close behavior
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show screen
        frame.setVisible(true);

        selectionSort.selectionSort();

        // // sort nums
        // for(int i = 0; i < nums.length; i++){
        //     System.out.format("%d ", nums[i]);
        // }
        // System.out.println();
        // int[] output = SelectionSort.selectionSort(nums);
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
