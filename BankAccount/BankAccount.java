public class BankAccount {
    private double balance;
    public String accountHolder;
    public String accountNumber;

    /**
     * Constructor for BankAccount
     * (Postcondition: none)
     * (Precondition: none)
     */
    public BankAccount(){
    balance = 0;
    accountHolder = "";
    accountNumber = "";
    }

    /**
     * Deposits money into account
     * (Postcondition: none)
     * @param depositAmount amount of money to deposit
     * (Precondition: depositAmount >= 0)
     */
    public void deposit(double depositAmount){ // no return value
        if(depositAmount < 0)
            return;
        balance += depositAmount;
    }

    /**
     * Withdraws money
     * (Postcondition: withdrawalAmount >= 0)
     * @param withdrawalAmount amount of money to withdraw
     * @return amount of money withdrawn
     * (Precondition: withdrawalAmount >= 0)
     */
    public double withdraw (double withdrawalAmount){
        if (withdrawalAmount <= balance){
            balance -= withdrawalAmount;
            return withdrawalAmount;
        } else {
            return 0;
        }
    }

    /**
     * Prints statement
     * (Postcondition: none)
     * (Precondition: none)
     */
    public void printStatement(){
        System.out.println("Your balance is " + balance);
    }

    /**
     * Returns the balance of a BankAccount
     * (Postcondition: balance is double)
     * @return balance of acount
     * (Precondition: none)
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Sets balance of account
     * (Postcondition: none)
     * @param balance balance left
     * (Precondition: balance >= 0)
     */
    public void setBalance(double balance){
        this.balance = balance;
    }
}
