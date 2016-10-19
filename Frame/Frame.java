/**
 * Display an empty frame
 * @author Addison Chan
 * @version 10/04/16
 *
 * To show a frame:
 * 1. Construct an object of JFrame
 *      JFrame Frame = new JFrame();
 * 2. Set the size of the frame
 *      frame.setSize(300,400); // 300 pixels wide and 400 pixels tall
 * 3. Optional - title of the frame
 *      frame.setTitle("Lucy");
 * 4. Set the "default close operation"
 *      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *      if omitted, program keeps running even after frame is closed
 * 5. Make the frame visible
 *      Frame.setVisible(true);
 */ 

import javax.swing.JFrame;

public class Frame {
    public static void main (String [] args){
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("Italian Flag");

        MyFlag m = new MyFlag();
        frame.add(m);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        setSize(screenSize.width,screenSize.height);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
