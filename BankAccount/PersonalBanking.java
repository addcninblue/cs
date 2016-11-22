
/**
 * Write a description of class PersonalBanking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PersonalBanking
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial balance, maturity month count, and interest: ");
        double balance = input.nextDouble();
        int maturity = input.nextInt();
        double interestRate = input.nextDouble();
        TimeDepositAccount a = new TimeDepositAccount(balance, maturity, interestRate);
        boolean loop = true;
        
        while (loop)
        {
            System.out.println("Enter [1] to deposit.");
            System.out.println("Enter [2] to withdraw.");
            System.out.println("Enter [3] to add interest (end of month).");
            System.out.println("Enter [4] to print balance.");
            System.out.println("Press any key to exit.");
            System.out.print("Please choose: ");
            String select = input.next();
            if (select.equals("1"))
            {   
                System.out.print("Enter deposit amount: ");
                double depositAmount = input.nextDouble();
                a.deposit(depositAmount);
            }
            else if (select.equals("2"))
            {
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = input.nextDouble();
                a.withdraw(withdrawAmount);
            }
            else if (select.equals("3"))
            {
                a.addInterest();
            }
            else if (select.equals("4"))
            {
                System.out.println("Your current balance: " + a.getBalance());
            }
            else
            {
                loop = false;
            }
        }
    }
}
