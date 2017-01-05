/**
 * Created by addison on 1/4/17.
 */
public class SelectionSort {

    /**
     * Performs a selection sort on an array of ints
     * @param nums the array to sort
     * (Postcondition: num array is not empty)
     * @return sorted array
     * (Precondition: sorted array)
     */
    public static int[] selectionSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int minIndex = getMin(nums, i);
            int newNumber = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = newNumber;
        }
        return nums;
    }

    /**
     * Returns index of minimum
     * @param nums the array to find the minimum in
     * @param index the index to start at
     * (Postcondition: nums is not empty, index is valid)
     * @return the index of the minimum number in array
     * (Precondition: index of minimum number)
     */
    public static int getMin(int[] nums, int index){
        int minIndex = index; // starting index
        int min = nums[index];

        for(int i = index; i < nums.length; i++){
            min = Math.min(nums[i], min);
            if(nums[i] == Math.min(nums[i], min)){
                minIndex = i;
            }
        }
        return minIndex;
    }
}
