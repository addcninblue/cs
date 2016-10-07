/**
 * has all the properties of an French Flag
 *
 * @author Addison Chan
 * @version 10/06/16
 */ 

// import java.awt.Rectangle;
// import java.awt.Graphics2D;
// import java.awt.Color;
import java.awt.*;

public class FrenchFlag {
    private int xLeft; // top left x coordinate
    private int yTop; //top left y coordinate
    private int width; //width of flag

    /**
    * Constructor for French Flag.
    * @param x gets upper left x coordinate
    * @param y gets upper left y coordinate
    * @param newWidth gets width of rectangle
    */
    public FrenchFlag(int x, int y, int newWidth){
        xLeft = x;
        yTop = y;
        width = newWidth;
    }

    /**
    * draws the flag
    * @param g2 flag to draw
    */
    public void draw(Graphics2D g2){
        Rectangle blue = new Rectangle(xLeft, yTop, width, 400);
        g2.setColor(Color.BLUE);
        g2.fill(blue);

        Rectangle white = new Rectangle(xLeft + width, yTop, width, 400);
        g2.setColor(Color.WHITE);
        g2.fill(white);

        Rectangle red = new Rectangle(xLeft + (width*2), yTop, width, 400);
        g2.setColor(Color.RED);
        g2.fill(red);
    }
}
