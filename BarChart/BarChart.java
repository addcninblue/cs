/**
 * 
 * @author Addison Chan
 * @version 10/10/16
 */ 

import java.lang.Math;
import javax.swing.*;
import java.awt.*;

public class BarChart extends JComponent {

    // heights of the bars
    private int[] heights = new int[]{32, 40, 57, -25, 82, -30, 10};

    /**
    * testing to paint a rectangle
    * @param g Graphics to paint on.
    */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Color cyan = new Color(42, 161, 152);
        Color orange = new Color(203, 75, 22);
        Color yellow = new Color(181,137,0);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int yLocation = screenSize.height / 2;
        int increment = screenSize.width / heights.length;
        int maxHeight = getMax(heights);
        Rectangle r1 = new Rectangle();

        for(int i = 0; i < heights.length ; i++){
            int actualHeight = Math.abs((int)(((double)heights[i] / (double)maxHeight) * (double)yLocation));

            Rectangle r = new Rectangle();
            if (i % 2 == 0)
                // g2.setColor(Color.GREEN);
                g2.setColor(cyan);
            else
                g2.setColor(orange);
            if (heights[i] > 0){
                // System.out.println(increment*i + " " + (yLocation + actualHeight));
                r.setLocation(increment*i, yLocation - actualHeight);
                r.setSize(increment, actualHeight);
                g2.fill(r);
            } else { // rectangle is negative
                // System.out.println(increment*i + " " + yLocation);
                r.setLocation(increment*i, yLocation);
                r.setSize(increment, actualHeight);
                g2.fill(r);
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
    * Main class. It calls BarChart and sets the screensize to the screen size of the computer.
    */
    public static void main (String [] args){
        // name is BarChart
        JFrame frame = new JFrame("Addison Chan");
        frame.add(new BarChart());

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.pack();
        frame.setSize(screenSize.width,screenSize.height);       
        Color base02 = new Color(7, 54, 66);
        frame.getContentPane().setBackground(base02);

        // set default close behavior
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show screen
        frame.setVisible(true);
    }
}
