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

public class MyFlag extends JComponent{

    /**
    * rectangle
    */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        ItalianFlag flag = new ItalianFlag(0,0,200);
        flag.draw(g2);
    }

    /**
    * Rectangle
    */
    // public void paintComponent(Graphics g){
    //     Graphics2D g2 = (Graphics2D) g;

    //     Rectangle green = new Rectangle(0,0,200,400);
    //     g2.setColor(Color.GREEN);
    //     g2.draw(green);
    //     g2.fill(green);

    //     Rectangle white = new Rectangle(200, 0, 200, 400);
    //     g2.setColor(Color.WHITE);
    //     g2.draw(white);
    //     g2.fill(white);

    //     Rectangle red = new Rectangle(400, 0, 200, 400);
    //     g2.setColor(Color.RED);
    //     g2.draw(red);
    //     g2.fill(red);
    // }

}
