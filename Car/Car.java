public class Car {
    private double fuelEfficiency;
    private double fuelRemaining;

    public Car(double startFuelEfficiency){
        fuelEfficiency = startFuelEfficiency;
    }

    public void drive(double miles){
        fuelRemaining -= miles / fuelEfficiency;
    }

    public double getFuelLevel(){
        return fuelRemaining;
    }

    public void tank(double fuelIncrease){
        fuelRemaining += fuelIncrease;
    }
}
