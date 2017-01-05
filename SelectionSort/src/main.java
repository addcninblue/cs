/**
 * Created by addison on 1/4/17.
 */
public class main {
    public static void main (String [] args){
        // int[] nums = {2,5,3,21};
        int[] nums = {2,7,3,2,5,6,7,3,45,7,8,9,3,5,6,7,43,3,5,6,7};
        // output should be 2 3 5 21
        int[] output = SelectionSort.selectionSort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.format("%d ", nums[i]);
        }
    }
}
