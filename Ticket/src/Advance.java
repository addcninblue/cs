public class Advance extends Ticket{
    private double price;

    /**
     * Ticket constructor
     * (Postcondition: Ticket is initialized)
     * @param daysInAdvance number of days ticket was bought in advance
     * (Precondition: none)
     */
    public Advance(int daysInAdvance){
        super();
        if(daysInAdvance >= 10)
            price = 30;
        else
            price = 40;
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
