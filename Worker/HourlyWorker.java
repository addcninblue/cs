public class HourlyWorker extends Worker{
    /**
     * Constructor for HourlyWorker
     * (Postcondition: none)
	 * @param name name of worker
	 * @param salaryRate salary rate of worker
     * (Precondition: salaryRate >= 0)
     */
    public HourlyWorker(String name, double salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }

    /**
     * Computes the weekly pay for every worker
     * (Postcondition: pay >= 0)
	 * @param hours hours worked
     * (Precondition: hours >= 0)
     */
    public double computePay(int hours){
        if(hours > 40){
            return (salaryRate * 40 + 1.5*(hours - 40)*salaryRate);
        } else {
            return (salaryRate * hours);
        }
    }
}

