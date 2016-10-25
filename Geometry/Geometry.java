import java.lang.Math;

/**
 * Library for various geometric functions
 * @author Addison Chan
 * @version 10/24/16
 */
public class Geometry {

    /**
    * Computes the volume of a sphere with radius r
    * (Postcondition: volume >= 0)
    * @param r radius of sphere
    * @return the volume of the sphere
    * (Precondition: r >= 0)
    */
    public static double sphereVolume(double r){
        return (((double)4/(double)3) * Math.PI * Math.pow(r, 3));
    }

    /**
    * Computes and returns the surface area of a sphere with radius r
    * (Postcondition: surface area >= 0)
    * @param r radius of sphere
    * @return the surface area of the sphere
    * (Precondition: r >= 0)
    */
    public static double sphereSurface(double r){
        return (4 * Math.PI * Math.pow(r, 2));
    }

    /**
    * Computes and returns the volume of a cylinder with radius r and height h
    * (Postcondition: volume >= 0)
    * @param r radius of the cylinder
    * @param h height of the cylinder
    * @return the volume of the cylinder
    * (Precondition: r >= 0, h >= 0)
    */
    public static double cylinderVolume(double r, double h){
        return (Math.PI * Math.pow(r, 2) * h);
    }

    /**
    * Computes and returns the surface area of a cylinder given radius r and height h
    * (Postcondition: surface area >= 0)
	* @param r radius of the cylinder
    * @param h height of the cylinder
    * @return the surface area of the cylinder
    * (Precondition: r >= 0, h >= 0)
    */
    public static double cylinderSurface(double r, double h){
        return (2*(Math.PI * Math.pow(r,2)) + (h * Math.PI * 2 * r));
    }

    /**
    * Computes and returns the volume of a cone given radius r and height h
    * (Postcondition: volume >= 0)
	* @param r radius of the cylinder
	* @param h height of the cylinder
    * @return the volume of the cone 
    * (Precondition: r >= 0, h >= 0)
    */
    public static double coneVolume(double r, double h){
        return ((Math.PI * Math.pow(r, 2) * h) / (double) 3);
    }

    /**
    * Computes and returns the surface area of a cone given radius r and height h
    * (Postcondition: surface area >= 0)
	* @param r radius of the cylinder
	* @param h height of the cylinder
    * @return the surface area of the cone
    * (Precondition: r >= 0, h >= 0)
    */
    public static double coneSurface(double r, double h){
        return (Math.PI * r * (r + Math.sqrt(Math.pow(h,2) + Math.pow(r, 2))));
    }
}
