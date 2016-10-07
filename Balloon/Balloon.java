/**
 * Implement a class Balloon that models a spherical balloon that is being filled with air.j
 *
 * @author Addison Chan
 * @version 10/04/16
 */ 

import java.lang.Math;

public class Balloon {
    private double volume; // amount of air inside balloon

    /** 
     * Contructs an empty balloon (volume = 0)
     */
    public Balloon(){
        volume = 0;
    }

    /** 
     * Adds air to the balloon
     * @param amounts
     */
    public void addAir(double amounts){
        volume += amounts;
        // double newVolume = (4/3)*Math.pow(radius, 3)*Math.PI + amounts;
    }

    /**
     * Returns current volume of balloon
     * @return the current air volume
     */
    public double getVolume(){
        return volume;
    }

    /**
     * Computes and returns surface area
     * @return the surface area
     */
    public double getSurfaceArea(){
        double surfaceArea = 4 * Math.PI * Math.pow(this.getRadius(), 2);
        return surfaceArea;
    }

    /**
     * Computes and returns radius
     * @return the radius
     */
    public double getRadius(){
        double radius = Math.pow((volume * (3.0/4.0) / Math.PI), (1.0/3.0));
        return radius;
    }
}
