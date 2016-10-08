/**
 * I am Italian and this is my flag.
 * @author Addison Chan
 * @version 10/06/16
 */ 

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.Color;
import java.awt.geom.*;

public class MyFlag extends JComponent{

    /**
    * rectangle
    */
    public void paintComponent(Graphics g){
        int x1 = 100;
        int y1 = 100;
        int length = 100;
        int width = 100;
        int x2 = 100;
        int y2 = 100;
        Graphics2D g2 = (Graphics2D) g;
        // Ellipse2D.Double circle = new Ellipse2D.Double(x,y,diameter, diameter);
        Ellipse2D.Double egg = new Ellipse2D.Double(300, 300, 400, 600);
        g2.draw(egg);

        // Line2D.Double segment = new Line2D.Double(x1, y1, length, width);
        Line2D.Double segment = new Line2D.Double(x1, y1, length, width);
        g2.draw(segment);

        Point2D.Double pt1 = new Point2D.Double(x1, y1);
        Point2D.Double pt2 = new Point2D.Double(x2, y2);
        Line2D.Double segment2 = new Line2D.Double(pt1, pt2);

        //display a message
        g2.drawString("Message", 0, 0); //prints message at location 0,0
    }
}
