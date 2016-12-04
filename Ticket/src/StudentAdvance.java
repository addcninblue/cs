public class StudentAdvance extends Advance{
    private double price;

    /**
     * Ticket constructor
     * (Postcondition: Ticket is initialized)
     * @param daysInAdvance number of days ticket was bought in advance
     * (Precondition: none)
     */
    public StudentAdvance(int daysInAdvance){
        super(daysInAdvance);
        price = super.getPrice() / 2.0;
    }

    /**
     * Returns the price of the ticket
     * (Postcondition: ticket is returned)
     * @return price of ticket
     * (Precondition: none)
     */
    public double getPrice(){
        return price;
    }
}
