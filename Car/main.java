import java.util.Scanner;
public class main {
    public static void main (String [] args){
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.print("Please input your car's efficiency, in mpg: ");
            double fuelEfficiency = in.nextDouble();
            System.out.print("Please input how much fuel you have: ");
            double fuel = in.nextDouble();
            System.out.print("Please input how far you drove with the car: ");
            double milesDriven = in.nextDouble();

            Car userCar = new Car(fuelEfficiency);
            userCar.tank(fuel);
            userCar.drive(milesDriven);
            System.out.println("The remaining amount of fuel is " + userCar.getFuelLevel());

            System.out.println("Would you like to continue?");
            in.nextLine();
            System.out.print("y/n: ");
            String yesNo = in.nextLine();
            if (yesNo.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
