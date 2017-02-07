import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

        JFrame frame = new JFrame("Merge Sort");
        DrawParts drawParts = new DrawParts(nums, input.getNumberToFind(), input.isBinarySearch());
        frame.add(drawParts);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.pack();
        frame.setSize(screenSize.width, screenSize.height);
        Color base02 = new Color(7, 54, 66);
        frame.getContentPane().setBackground(base02);

        // set default close behavior
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show screen
        frame.setVisible(true);

//        if (find.getTraversalDistance() == 0){
//            System.out.print("Could not find given number");
//        } else {
//            System.out.format("Found at index %d in %d hops", find.getIndexFoundAt(), find.getTraversalDistance());
//        }

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
