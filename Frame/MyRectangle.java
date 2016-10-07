/**
 * To draw two overrlapping rectangles onto the frame.
 *
 * Drawing a Component onto the frame
 *  //Cannot draw directly onto the frame, but rather we construct a 
 *  JComponent object and add it to the frame
 *
 * @author Addison Chan
 * @version 10/06/16
 */ 

import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyRectangle extends Jcomponent {

    /**
    * Drawing directions go here. We will draw two overlapping rectangles in this method.
    * @param g graphical utility to help us draw.
    */
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;
        Rectangle r1 = new Rectangle(0, 0, 200, 400);
        Rectangle r2 = new Rectangle(500, 100, 100, 300);
        g2.draw(r1);
        g2.draw(r2);
    }
    
}
