
/**
 * Simulates a company
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class KFC
{
    private ArrayList<Employee> employees;   //list of employees in payroll.

    /**
     * Constructor for KFC
     * (Postcondition: initializes ArrayList employees)
     * (Precondition: none)
     */
    public KFC()
    {
        employees = new ArrayList<Employee>();
    }

    /**
     * Adds employee to list.
     * (Postcondition: employees +1)
     * (Precondition: e exists)
     */
    public void addEmployee(Employee e)
    {
        employees.add(e);
    }

    /**
     * Gives all employees a raise.
     * (Postcondition: all employees' wages exist)
     * @param increase amount of money to increase each employee by
     * (Precondition: all employees' wages are increased)
     */
    public void raiseForAll(double increase)
    {
        for(int i = 0; i < employees.size(); i++){
            employees.get(i).setWage(employees.get(i).getWage() + increase);
        }
    }

    /**
     * Increase wage for an employee with given name.
     * (Postcondition: wage of employee is increased)
     * @param name name of employee to add wage to
     * @param increase amount of money to increase each employee by
     * (Precondition: name exists and increase >= 0)
     */
    public void raiseIndividually(String name, double increase)
    {
        int indexOfEmployee = findEmployeeIndex(name);
        if (indexOfEmployee != -1)
            employees.get(indexOfEmployee).setWage(employees.get(indexOfEmployee).getWage() + increase);
        else
            System.out.println("Not an employee.");
    }

    /**
     * Removes employee with given name.
     * (Precondition: name exists)
     * @param name name of employee to remove from company
     * (Postcondition: the employee with the given name will be removed from the company)
     */
    public void remove(String name)
    {
        int indexOfEmployee = findEmployeeIndex(name);
        if (indexOfEmployee != -1)
            employees.remove(indexOfEmployee);
        else
            System.out.println("Not an employee.");
    }

    /**
     * Find an employee in list and returns their index. Returns -1 if not found.
     * (Precondition: name exists)
     * @param name name of employee to find
     * (Postcondition: index >= 0 if employee exists, -1 if it doesn't)
     */
    private int findEmployeeIndex(String name)
    {
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).getName().equals(name))
                return i;
        }
        return -1;  // not found
    }

    /**
     * Prints employees names, hours worked, and their total earnings.
     * Employee gets paid 1.5x for hours worked over 40 hours.
     * (Precondition: employees exist to print)
     * (Postcondition: prints payroll)
    */
    public void printPayroll()
    {
        for(int i = 0; i < employees.size(); i++){
            String name = employees.get(i).getName();
            double hours = employees.get(i).getHours();
            // hours
            double wage = 0;
            if (hours > 40)
                wage = 40 * employees.get(i).getWage() + (hours - 40) * 1.5 * employees.get(i).getWage();
            else
                wage = hours * employees.get(i).getWage();
            // System.out.format("%s worked for %s hours and earned %s.\n", name, hours, wage);
            System.out.format("%20s | %10s | %10s\n", name, hours, wage);
        }
    }

    /**
    * Adds working hours for an employee
    * (Postcondition: the given amount of hours will be added to the specified employee)
	* @param name name of employee to add hours to
	* @param hours number of hours worked
    * (Precondition: name exists, hours >= 0)
    */
    public void addHours(String name, double hours){
        int indexOfEmployee = findEmployeeIndex(name);
        if (indexOfEmployee != -1)
            employees.get(indexOfEmployee).setHours(hours);
        else
            System.out.println("Not an employee.");
    }
}
