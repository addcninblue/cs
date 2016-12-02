public class SalariedWorker extends Worker {
    /**
     * Constructor for SalariedWorker
     * (Postcondition: none)
	 * @param name name of worker
	 * @param salaryRate salary rate of worker
     * (Precondition: salaryRate >= 0)
     */
    public SalariedWorker(String name, double salaryRate){
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
        return (salaryRate * hours);
    }
}
