import java.util.Scanner;
public class main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        Matrix a = new Matrix(row,column);
        a.initializeMatrix();
        output.printMatrix(a.data);
    }
}
