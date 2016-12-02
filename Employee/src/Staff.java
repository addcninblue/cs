//********************************************************************
// Staff.java Author: Lewis/Loftus
//
// Represents the personnel staff of a particular business.
//********************************************************************
public class Staff
{
    StaffMember[] staffList;
    //-----------------------------------------------------------------
    // Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff ()
    {
        staffList = new StaffMember[9];
        staffList[0] = new Executive ("Sam", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee ("Carla", "456 Off Line",
                "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee ("Woody", "789 Off Rocker",
                "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
                "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.",
                "555-8374");
        staffList[5] = new Volunteer ("Cliff", "321 Duds Lane",
                "555-7282");
        // Luc's Tester
        staffList[6] = new Commission ("Tacyang", "123 Main Street",
                "123-4567", "123-45-6789", 10, 0.5);
        staffList[7] = new Commission ("Seungri", "123 Lenark Street",
                "987-6543", "987-65-4321", 20, 1);
        staffList[8] = new Commission ("G-Dragon", "123 ok road",
                "987-6543", "987-65-4321", 30, 0.25);
        ((Executive)staffList[0]).awardBonus (500.00);
        ((Hourly)staffList[3]).addHours (40);
        ((Commission)staffList[6]).addHours(40);
        ((Commission)staffList[6]).addSales(100);
        ((Commission)staffList[7]).addHours(30);
        ((Commission)staffList[7]).addSales(1000);
        ((Commission)staffList[8]).addHours(10);
        ((Commission)staffList[8]).addSales(10);
    }
    //-----------------------------------------------------------------
    // Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;
        for (int count=0; count < staffList.length; count++)
        {
            System.out.println (staffList[count]);
            amount = staffList[count].pay(); // polymorphic
            if (amount == 0.0)
                System.out.println ("Thanks!");
            else
                System.out.println ("Paid: " + amount);
            System.out.println ("-----------------------------------");
        }
    }
}
