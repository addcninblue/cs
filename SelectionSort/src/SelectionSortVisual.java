/**
 * Created by addison on 1/4/17.
 */

// import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectionSortVisual extends JComponent {

    private int[] nums; //heights

    private int cursor, smallest;

    public SelectionSortVisual(int[] nums){
        this.nums = nums;
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
            System.out.format("%s, %s, %s\n", i, cursor, nums[smallest]);
            if(i == cursor){
                g2.setColor(orange);
            } else if (i == smallest){
                g2.setColor(yellow);
            } else {
                g2.setColor(cyan);
            }
            // else
                // g2.setColor(orange);
            if (nums[i] > 0){
                // System.out.println(increment*i + " " + (yLocation + actualHeight));
                r.setLocation(increment*i, yLocation - actualHeight);
                r.setSize(increment, actualHeight);
                if(i == cursor || i == smallest){
                    g2.fill(r);
                } else {
                    g2.draw(r);
                }
            } else { // rectangle is negative
                // System.out.println(increment*i + " " + yLocation);
                r.setLocation(increment*i, yLocation);
                r.setSize(increment, actualHeight);
                if(i == cursor || i == smallest){
                    g2.fill(r);
                } else {
                    g2.draw(r);
                }
            }
        }
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

    /**
     * Performs a selection sort on an array of ints
     * (Postcondition: num array is not empty)
     * @return sorted array
     * (Precondition: sorted array)
     */
    public int[] selectionSort(){
        for(int i = 0; i < nums.length; i++){
            cursor = i;
            smallest = getMin(nums, i);
            int newNumber = nums[smallest];
            System.out.print(newNumber);
            repaint();
            try {
                Thread.sleep(500);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            nums[smallest] = nums[i];
            nums[i] = newNumber;
        }
        return nums;
    }

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
            if(nums[minIndex] > nums[i])
                minIndex = i;
        }
        return minIndex;
    }

}
