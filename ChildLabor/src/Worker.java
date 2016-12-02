/**
 * Worker
 * @author Addison Chan
 * @version 11/28/16
 */

public abstract class Worker {
    public String name;
    public double salaryRate;

    /**
     * Computes the weekly pay for every worker
     * (Postcondition: pay >= 0)
	 * @param hours hours worked
     * (Precondition: hours >= 0)
     */
    public abstract double computePay(int hours);

    /**
     * Returns name of worker
     * (Postcondition: name is a string)
     * (Precondition: none)
     */
    public String getName(){
        return name;
    }
}
