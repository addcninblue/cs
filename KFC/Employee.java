
/**
 * Contains information about an employee
 * 
 * @author Addison Chan
 * @version 11/01/16
 */
public class Employee
{
    private String name;
    private double hoursWorked;
    private double wage;

    /**
     * Create an employee with given name and wage.Initializes hoursWorked to 0.
     * (Postcondition: none. It is a constructor.)
     * @param aWage wage of the employee
     * @param aName name of the employee
     * (Precondition: aName is a String, and aWage >= 0)
     */
    public Employee(String aName, double aWage)
    {
        this.name = aName;
        this.wage = aWage;
        this.hoursWorked = 0;
    }

    /**
     * Set working hours.
     * (Postcondition: hours >=0.)
     * @param hours the amount of additional hours an employee works
     * (Precondition: hours >= 0)
     */
    public void setHours(double hours)
    {
        this.hoursWorked += hours;
    }

    /**
     * Retrieves the total numbers of hours worked.
     * (Postcondition: hours >= 0)
     * (Precondition: hours >= 0)
     */
    public double getHours()
    {
        return hoursWorked;
    }

    /**
     * Sets new wage.
     * (Postcondition: wage >= 0)
     * (Precondition: aWage >= 0)
     */
    public void setWage(double aWage)
    {
        this.wage = aWage;
    }

    /**
     * Returns employee name.
     * (Postcondition: name is set)
     * (Precondition: none)
     */
    public String getName(){
        return this.name;
    }

    /*
     * Returns employee wage (pay per hour).
     * (Postcondition: wage >= 0)
     * (Precondition: wage >= 0)
     */
    public double getWage()
    {
        return this.wage;
    }

}

