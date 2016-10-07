import java.util.Scanner;
public class Matrix {
    public int row, column; //both are public ints
    public double[][] data;

    public Matrix() { // no parameters
        row = 0;
        column = 0;
    }

    public Matrix(int newRow, int newColumn) { //if user gives two parameters
        row = newRow;
        column = newColumn;
        data = new double[row][column];
    }

    public void initializeMatrix(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < row; i++){
            System.out.print("Enter " + column +  " numbers in row " + i + " : ");
            for(int j = 0; j < column; j++){
                int a = input.nextInt();
                data[i][j] = a;
            }
        }
    }
}
