import java.util.Scanner;
import java.awt.geom.*;

/**
 * Tester class for Geometry
 * @author Addison Chan
 * @version 10/24/16
 */
public class main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("1) Areas and Volumes of of Spheres, Cylinders, and Cones");
        System.out.println("2) Computations involving Ellipse");
        System.out.print("Please enter your choice: ");
        int userChoice = in.nextInt();
        switch (userChoice) {
            case 1:{  // areas and volumes

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

                break;
            }
            case 2:{

                System.out.print("Please print, in order and separated by spaces, the top left x and y coordinates: ");
                int x = in.nextInt();
                int y = in.nextInt();

                System.out.print("Please print the width and height of the ellipse, separated by spaces: ");
                double width = in.nextDouble();
                double height = in.nextDouble();

                System.out.print("Please print the coordinates of the point to check: ");
                double xp = in.nextDouble();
                double yp = in.nextDouble();
                System.out.format("%s, %s, %s, %s, %s, %s", x,y,width,height,xp,yp);

                Point2D.Double p = new Point2D.Double(xp, yp);
                Ellipse2D.Double e = new Ellipse2D.Double(x, y, width, height);

                System.out.println(String.format("The perimeter (circumference) of the ellipse is %s.", Geometry.perimeter(e)));
                System.out.println(String.format("The area of the ellipse is %s.", Geometry.area(e)));

                if(e.contains(xp, yp)){
                    System.out.println(String.format("The point (%s,%s) is inside the circle", xp, yp));
                }

                if (Geometry.isOnBoundary(p, e)){
                    System.out.println(String.format("The point (%s,%s) is approximately on the circle", xp, yp));
                }else if (Geometry.isInside(p, e)){
                    System.out.println(String.format("The point (%s,%s) is inside the circle", xp, yp));
                }else{
                    System.out.println(String.format("The point (%s,%s) is outside of the circle", xp, yp));
                }
                break;
            }

            default:
                break;
        }
    }
}
