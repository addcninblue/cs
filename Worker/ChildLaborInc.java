
/**
 * Testing Worker and its subclasses.
 * 
 * @author (Luc) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ChildLaborInc
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String cont = "y";
        while(cont.equalsIgnoreCase("y"))
        {
            Worker bee;
            System.out.print("Enter name and salary rate: ");
            String name = input.next();
            double salaryRate = input.nextDouble();
            
            System.out.println("Press [1] if this is a hourly worker.");
            System.out.println("Press [2] if this is a salaried worker.");
            if (input.nextInt() == 1)
                bee = new HourlyWorker(name, salaryRate);
            else 
                bee = new SalariedWorker(name,salaryRate);
            
            System.out.print("How many hours worked this week? ");
            int hours = input.nextInt();
            System.out.println(bee.getName() + "'s pay for the week is $" + bee.computePay(hours));
            
            System.out.print("Add more worker (y/n)? ");
            cont = input.next();
        }
                

        
    }
}
