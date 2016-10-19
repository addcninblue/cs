/**
 * Creates two rectangles and returns and prints the overlapping values.
 * @author Addison Chan
 * @version 10/06/16
 */ 

import javax.swing.JFrame;

public class OverlappingRectangles {
    /**
     * The main method where it creates the JFrame and calls the RectangleConstructor class.
     */
    public static void main (String [] args){
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("OverlappingRectangles");

        RectangleConstructor m = new RectangleConstructor();
        frame.add(m);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
