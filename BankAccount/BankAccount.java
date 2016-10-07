public class BankAccount {
    private double balance;
    public String accountHolder;
    public String accountNumber;

    public BankAccount(){
    balance = 0;
    accountHolder = "";
    accountNumber = "";
    }

    // public BankAccount (double userBalance, String name, String number){
    //     balance = userBalance;
    //     accountHolder = name;
    //     accountNumber = number;
    // }

    public void deposit(double depositAmount){ // no return value
        balance += depositAmount;
    }

    public double withdraw (double withdrawalAmount){
        if (withdrawalAmount <= balance){
            balance -= withdrawalAmount;
            return withdrawalAmount;
        } else {
            return 0;
        }
    }

    public void printStatement(){
        System.out.println("Your balance is " + balance);
    }

    public double getBalance(){
        return balance;
    }
}
