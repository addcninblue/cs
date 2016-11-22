import java.util.Scanner;

public class tester {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        int choice;
        try{
            System.out.println("1. Bank Account");
            System.out.println("2. Timed Deposit Acccount");
            System.out.print("> ");

            choice = in.nextInt();
        } catch(Exception e){
            System.out.println("That was not a valid input.");
            return;
        }

        switch(choice){
            case(1):
                BankAccount a = new BankAccount();
                a.deposit(1000);
                a.printStatement();
                break;
            case(2):
                SecondChoice();
                break;
            default:
        }
    }

    /**
     * Timed Deposit Account
     * (Postcondition: none)
     * (Precondition: none)
     */
    public static void SecondChoice(){
        Scanner in = new Scanner(System.in);
        double interestRate;
        int monthsToMaturity;
        double balance;

        try{
            System.out.print("Please enter the interest rate: ");
            interestRate = in.nextDouble();
            System.out.print("Please enter the months to maturity: ");
            monthsToMaturity = in.nextInt();
            System.out.print("Enter your balance: ");
            balance = in.nextDouble();
            in.nextLine();
        }
        catch(Exception e){
            System.out.println("That was an invalid input.");
            return;
        }
        TimeDepositAccount timeDepositAccount = new TimeDepositAccount(balance, monthsToMaturity, interestRate);
        while(true){
            int selection;
            try{
                System.out.println("What would you like to do?");
                System.out.println("1. Month Passed.");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Add Money");
                System.out.println("4. Print Statement");
                System.out.println("0. Quit.");
                System.out.print("> ");
                selection = in.nextInt();
                switch(selection){
                    case(1):
                        timeDepositAccount.addInterest();
                        break;
                    case(2):
                        System.out.print("Enter the amount you would like to withdraw: ");
                        double withdrawalAmount = in.nextDouble();
                        System.out.format("Withdrew %s dollars\n", (double)timeDepositAccount.withdraw(withdrawalAmount));
                        break;
                    case(3):
                        System.out.print("Enter the amount you wish to deposit: ");
                        double addAmount = in.nextDouble();
                        timeDepositAccount.deposit(addAmount);
                    case(4):
                        timeDepositAccount.printStatement();
                        break;
                    case(0):
                        return;
                    default:
                        System.out.println("That was not a choice.");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Invalid input.");
                continue;
            }
        }
    }
}
