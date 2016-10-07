
/**
 * Write a description of class BalloonTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class BalloonTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Balloon lucy = new Balloon();
        boolean cont = true;
        while (cont == true)
        {
            System.out.print("How much air to add? ");
            double air = input.nextDouble();
            lucy.addAir(air);
            
            System.out.print("Continue? (y/n) ");
            String optOut = input.next();
            if (!optOut.equals("y"))
                cont = false;
         }
         
         System.out.println("Radius: " + lucy.getRadius());
         System.out.println("Volume: " + lucy.getVolume());
         System.out.println("Surface Area: " + lucy.getSurfaceArea());
        
    }
}
