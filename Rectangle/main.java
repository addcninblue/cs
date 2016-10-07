import java.util.Scanner;

public class main {
    public static void main (String [] args){
        while(true){
            Scanner in = new Scanner(System.in);
            Rectangle a = new Rectangle();

            System.out.print("Please input the rectangle's width (default 1): ");
            a.setWidth(in.nextDouble());
            System.out.print("Please input the rectangle's length (default 1): ");
            a.setLength(in.nextDouble());

            System.out.println("The perimeter is " + a.perimeter());
            System.out.println("The area is " + a.area());

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
