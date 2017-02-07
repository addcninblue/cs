import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by addison on 2/6/17.
 */
public class Input {
    private int[] nums;
    private int numberToFind;
    private boolean isBinarySearch; // true for binary, false for single
    private Scanner in;

    public Input(){
        in = new Scanner(System.in);
    }

    public void getInput() throws InputMismatchException{
        ArrayList<Integer> nums = new ArrayList<>();
        while(true) {
            try {
                System.out.print("Enter a number (Enter . to stop): ");
                int num = in.nextInt();
                nums.add(num);
            } catch (InputMismatchException e){
                break;
            } finally {
                in.nextLine();
            }
        }
        this.nums = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            this.nums[i] = nums.get(i);
        }

        System.out.print("1) Binary Search\n2) Normal Search\n> ");
        int userChoice = in.nextInt();
        this.isBinarySearch = (userChoice == 1);

        System.out.print("Enter the number you would like to find: ");
        this.numberToFind = in.nextInt();
    }

    public int getNumberToFind(){
        return numberToFind;
    }

    public boolean isBinarySearch(){
        return isBinarySearch;
    }

    public int[] getNums(){
        return nums;
    }
}
