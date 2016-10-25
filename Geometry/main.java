import java.util.Scanner;

/**
 * Tester class for Geometry
 * @author Addison Chan
 * @version 10/24/16
 */
public class main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the radius: ");
        double radius = in.nextDouble();

        System.out.print("Please enter the height: ");
        double height = in.nextDouble();

        System.out.print("\n");  // better formatting

        // follows this general format:
        // A ___ with radius ____ and height ____ would have ____ of ____.
        System.out.println(String.format("A sphere with radius %s would have a volume of %s", radius, Geometry.sphereVolume(radius)));
        System.out.println(String.format("A sphere with radius %s would have a surface area of %s", radius, Geometry.sphereSurface(radius)));

        System.out.println(String.format("A cylinder with radius %s and height %s would have a volume of %s", radius, height, Geometry.cylinderVolume(radius, height)));
        System.out.println(String.format("A cylinder with radius %s and height %s would have a surface area of %s", radius, height, Geometry.cylinderSurface(radius, height)));

        System.out.println(String.format("A cone with radius %s and height %s would have a volume of %s", radius, height, Geometry.coneVolume(radius, height)));
        System.out.println(String.format("A cone with radius %s and height %s would have a surface area of %s", radius, height, Geometry.coneSurface(radius, height)));
    }
}
