
/**
 * Tester class for Bug.java
 * 
 * @author (Lucy) 
 * @version (a version number or a date)
 */
import java.util.*;

public class BugExterminator
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial position of your bug: ");
        int position = input.nextInt();
        Bug lucy = new Bug(position);
        boolean cont = true;
        while (cont == true)
        {
            System.out.println("Enter -M- to move.");
            System.out.println("Enter -T- to turn.");
            System.out.println("Enter -E- to exterminate.");
            System.out.println("--------------------------------");
            String action = input.next();
            if (action.equalsIgnoreCase("M"))
                lucy.move();
            else if (action.equalsIgnoreCase("T"))
                lucy.turn();
            if (action.equalsIgnoreCase("E"))
                cont = false;
         }
         
         System.out.println("Your bug is dead at " + lucy.getPosition());
         
        
    }
}

