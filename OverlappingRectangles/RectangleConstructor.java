/**
 * Constructs two rectangles and shows their overlap.
 * @author Addison Chan
 * @version 10/08/16
 */ 

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class RectangleConstructor extends JComponent {

    /**
    * Paints two rectangles and their overlap
    * @param g Graphics
    */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Scanner in = new Scanner(System.in);

        System.out.print("Please input the first Rectangle's dimensions in this format (x, y, length, width): ");
        int r1x1 = in.nextInt();
        int r1y1 = in.nextInt();
        int r1length = in.nextInt();
        int r1width = in.nextInt();

        System.out.print("Please input the second Rectangle's dimensions in this format (x, y, length, width): ");
        int r2x1 = in.nextInt();
        int r2y1 = in.nextInt();
        int r2length = in.nextInt();
        int r2width = in.nextInt();

        // first rectangle
        // Rectangles r1 = new Rectangles(r1x1, r1y1, r1length, r1width);
        Rectangle r1 = new Rectangle(r1x1, r1y1, r1length, r1width);
        draw(r1, g2, 1);

        // second rectangle
        Rectangle r2 = new Rectangle(r2x1, r2y1, r2length, r2width);
        draw(r2, g2, 2);

        // overlap rectangle
        Rectangle r3 = r1.intersection(r2);
        draw(r3, g2, 3);

        // print area
        if (!r3.isEmpty()){
            Point location = r3.getLocation();
            int width = (int) r3.getWidth();
            int length = (int) r3.getHeight();
            int area = width * length;
            // double area = r3.getSize().getWidth() * r3.getSize().getHeight();
            String areaString = "The overlapping area is " + area;

            int xlocation = (int)location.getX();
            int ylocation = (int)location.getY();

            int xPosOfString = xlocation + (width/2);
            int yPosOfString = ylocation + (length/2);
            g2.setColor(Color.BLACK);
            g2.drawString(areaString, xPosOfString, yPosOfString);
            // g2.drawString(areaString, (int)location.getX(), (int)location.getY());
        }
    }

    /**
    * Draws the rectangle
    * @param r Rectangle to color and draw
    * @param g2 The Graphics2D to draw on.
    * @param color Color of rectangle: true -> blue; false -> red
    */
    public void draw(Rectangle r, Graphics2D g2, int color){
        if (color == 1)
            g2.setColor(Color.BLUE);
        else if (color == 2)
            g2.setColor(Color.YELLOW);
        else
            g2.setColor(Color.GREEN);
        g2.fill(r);
    }
}
