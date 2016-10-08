/**
 * Displays the French flag
 * @author Addison Chan
 * @version 10/04/16
 */ 

import javax.swing.JFrame;

public class Frame {
    public static void main (String [] args){
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("French Flag");

        MyFlag m = new MyFlag();
        frame.add(m);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
