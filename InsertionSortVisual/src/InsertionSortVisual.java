/**
 * Created by addison on 1/4/17.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InsertionSortVisual extends JComponent {

    private int[] nums; //heights

    private int cursor, currentIterator;

    public InsertionSortVisual(int[] nums){
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
            // System.out.format("%s, %s, %s\n", i, cursor, nums[currentIterator]);
            if(i == cursor){
                g2.setColor(orange);
            } else if (i == currentIterator){
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
                if(i == cursor || i == currentIterator){
                    g2.fill(r);
                } else {
                    g2.draw(r);
                }
            } else { // rectangle is negative
                // System.out.println(increment*i + " " + yLocation);
                r.setLocation(increment*i, yLocation);
                r.setSize(increment, actualHeight);
                if(i == cursor || i == currentIterator){
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

    public int[] insertionSort(){
        for(int i = 1; i < nums.length; i++){
            cursor = i;
            currentIterator = i;
            repaint();
            try {
                Thread.sleep(10);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            int currentNum = nums[i];
            int j;
            for(j = i - 1; (j >= 0) && nums[j] > currentNum; j--){
                nums[j+1] = nums[j];
                repaint();
                try {
                    Thread.sleep(10);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                currentIterator = j;
            }
            nums[j+1] = currentNum;
        }
        return nums;
    }

}
