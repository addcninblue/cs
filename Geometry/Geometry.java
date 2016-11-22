import java.lang.Math;
import java.awt.geom.*;

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

    /**
    * Finds the perimeter of an ellipse
    * (Postcondition: perimeter > 0)
	* @param e Ellipse2D to calculate perimeter of
    * (Precondition: Ellipse2D e exists)
    */
    public static double perimeter(Ellipse2D.Double e){
        double a = e.height / (double) 2;  // semimajor axis
        double b = e.width / (double) 2;  // semiminor axis
        return (Math.PI * (3*(a+b) - Math.sqrt((3*a + b) * (a + 3*b))));
    }

    /**
    * Finds the area of an ellipse
    * (Postcondition: perimeter > 0)
	* @param e Ellipse2D to calculate area of
    * (Precondition: Ellipse2D e exists)
    */
    public static double area(Ellipse2D.Double e){
        double a = e.height / (double) 2;  // semimajor axis
        double b = e.width / (double) 2;  // semiminor axis
        return (a * b * Math.PI);
    }

    /**
    * Returns whether or not a point is inside an ellipse
    * (Postcondition: returns true or false)
	* @param p Point2D to check whether is inside Ellipse2D e
	* @param e Ellipse2D used to check if p is inside
    * (Precondition: Point2D p exists and Ellipse2D e exists)
    */
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e){
        return (e.contains(p.getX(), p.getY()));
    }

    /**
    * Returns whether or not a point is on an ellipse
    * (Postcondition: returns true or false)
	* @param p Point2D to check whether is on Ellipse2D e
	* @param e Ellipse2D used to check if p is on
    * (Precondition: Point2D p exists and Ellipse2D e exists)
    */
    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e){
        double a = e.width / (double) 2;  // semimajor axis
        double b = e.height / (double) 2;  // semiminor axis
        // System.out.print(String.format("%s %s", e.x, e.y));
        double x = p.getX() - e.getCenterX();
        double y = p.getY() - e.getCenterY();
        // System.out.println(String.format("%s %s %s %s",a,b,x,y));
        // System.out.print(Math.abs(((Math.pow(x,2) / Math.pow(a,2)) + (Math.pow(y,2) / Math.pow(b,2))) - 1));
        return (Math.abs(((Math.pow(x,2) / Math.pow(a,2)) + (Math.pow(y,2) / Math.pow(b,2))) - 1) < 0.1);
    }
}
