
/**
 * To test your RoachPopulation class
 * 
 * @author (Lucy) 
 * @version (10/4)
 */
import java.util.*;
public class Terminix
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial population of roach colony: ");
        int initialPop = input.nextInt();
        RoachPopulation lucy = new RoachPopulation(initialPop);
        boolean cont = true;
        while (cont == true)
        {
            System.out.println("Enter -1- to naturally breed the roaches.");
            System.out.println("Enter -2- to scientifically breed the roaches.");
            System.out.println("Enter -3- to spray the roaches.");
            System.out.println("Enter -4- to carpet bomb the roaches.");
            System.out.println("Enter -0- to terminate the program.");
            System.out.println("--------------------------------");
            int action = input.nextInt();
            switch(action){
                case(1):
                    lucy.breed();
                    break;
                case(2):
                    System.out.println("Print multiplier: ");
                    double multiplier = input.nextDouble();
                    lucy.labBreed(multiplier);
                    break;
                case(3):
                    lucy.spray();
                    break;
                case(4):
                    lucy.wipeOut();
                    break;
                case(0):
                    cont = false;
                    break;
                default:
                    System.out.println("Not a choice.");
            }
         }
         System.out.println("Surviving roach population: " + lucy.getRoaches());
    }
}
