/**
 * has all the properties of an Italian Flag
 *
 * @author Addison Chan
 * @version 10/06/16
 */ 

// import java.awt.Rectangle;
// import java.awt.Graphics2D;
// import java.awt.Color;
import java.awt.*;

public class ItalianFlag {
    private int xLeft;
    private int yTop;
    private int width;

    /**
    * Constructor for Italian Flag.
    * @param x gets upper left x coordinate
    * @param y gets upper left y coordinate
    * @param newWidth gets width of rectangle
    */
    public ItalianFlag(int x, int y, int newWidth){
        xLeft = x;
        yTop = y;
        width = newWidth;
    }

    /**
    * draws the flag
    * @param g2 flag to draw
    */
    public void draw(Graphics2D g2){
        Rectangle green = new Rectangle(xLeft, yTop, width, 400);
        g2.setColor(Color.GREEN);
        g2.fill(green);

        Rectangle white = new Rectangle(xLeft + width, yTop, width, 400);
        g2.setColor(Color.WHITE);
        g2.fill(white);

        Rectangle red = new Rectangle(xLeft + (width*2), yTop, width, 400);
        g2.setColor(Color.RED);
        g2.fill(red);
    }


}
