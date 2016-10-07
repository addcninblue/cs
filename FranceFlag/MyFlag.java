/**
 * Constructs a rectangle
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
    * Contruct rectangle
    * @param g The old graphics class
    */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        FrenchFlag flag = new FrenchFlag(0,0,200);
        flag.draw(g2);
    }

}
