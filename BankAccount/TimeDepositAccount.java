/**
 * TimeDepositAccount class
 * @author Addison Chan
 * @version 11/22/16
 */

public class TimeDepositAccount extends BankAccount {
    double interestRate;
    int monthsLeftToMaturity;

    /**
     * Constructor for TimeDepositAccount
     * (Postcondition: Account is initialized)
     * @param balance initial balance of account
     * @param monthsLeftToMaturity months for maturity
     * @param interestRate the interst rate
     * (Precondition: none)
     */
    public TimeDepositAccount(double balance, int monthsLeftToMaturity, double interestRate){
        super();
        this.interestRate = interestRate;
        this.monthsLeftToMaturity = monthsLeftToMaturity;
        super.setBalance(balance);
    }

    /**
     * Withdraws money from an account
     * (Postcondition: returns withdrawalAmount >= 0)
     * @param withDrawalAmount amount to withdraw
     * @return withdrawal amount
     * (Precondition: withdrawalAmount >= 0)
     */
    public double withdraw(double withdrawalAmount){
        if(withdrawalAmount < 0){
            return 0;
        }
        if (monthsLeftToMaturity > 0 && withdrawalAmount <= super.getBalance()){
            super.setBalance(super.getBalance() - withdrawalAmount - 10);
            return withdrawalAmount;
        } else if(withdrawalAmount <= super.getBalance()){
            super.setBalance(super.getBalance() - withdrawalAmount);
            return withdrawalAmount;
        } else {
            return 0;
        }
    }

    /**
     * Adds the interest for a month
     * (Postcondition: none)
     * (Precondition: none)
     */
    public void addInterest(){
        if(monthsLeftToMaturity > 0)
            monthsLeftToMaturity--;
        System.out.format("%s months left till mature\n", monthsLeftToMaturity);
        super.setBalance(super.getBalance()*(1+interestRate));
    }
}
