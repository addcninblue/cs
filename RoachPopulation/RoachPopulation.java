/**
 * Simulates a roach population
 * @author Addison Chan
 * @version 10/04/16
 */ 

public class RoachPopulation {
    private int population;

    /**
     * sets initial population to user input
     * @param population
     */
    public RoachPopulation(int population){
        this.population = population;
    }

    /**
    * doubles population
    */
    public void breed(){
        population *= 2;
    }

    /**
    * multiplies population and rounds it
    * @param breedRatio
    */
    public void labBreed(double breedRatio){
        population = (int)Math.round(population *= (1+breedRatio));
    }

    /**
    * kills 10% of roaches
    * Rounds down if there is a fraction of a roach.
    */
    public void spray(){
        population = (int)Math.floor(population *= 0.9);
    }

    /**
    * kills the whole population
    */
    public void wipeOut(){
        population = 0; // rip
    }

    /**
    * @return number of roaches
    */
    public int getRoaches(){
        return population;
    }
}
