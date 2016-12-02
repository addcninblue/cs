/**
 * Created by addison on 11/29/16.
 */
public class Commission extends Hourly{
    public double totalSales;
    public double commissionRate; // percentage of commission the employee earns on sales

    /**
     * Constructor for Commission
     * (Postcondition: none)
	 * @param eName employee name
	 * @param eAddress employee address
	 * @param ePhone employee phone number
	 * @param socSecNumber employee social security number
	 * @param rate hourly pay rate
	 * @param commissionRate commission rate
     * (Precondition: all are valid inputs)
     */
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    /**
     * Adds parameter to the total sales
     * (Postcondition: none)
	 * @param totalSales total extra sales
     * (Precondition: totalSales >= 0)
     */
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    /**
     * Gives pay for worker
     * (Postcondition: pay >= 0)
     * (Precondition: none)
     */
    public double pay(){
        double output =  super.pay() + (totalSales * commissionRate);
        this.totalSales = 0;
        return output;
    }

    /**
     * Overrides the toString method
     * (Postcondition: String)
     * (Precondition: none)
     */
    public String toString(){
        return String.format("%s\nTotal sales: $%.2f", super.toString(), totalSales);
    }
}
