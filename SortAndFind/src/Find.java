public class Find {
    private int[] nums;
    private int numberToFind;
    private boolean isBinarySearch;

    private int indexFoundAt;
    private int traversalDistance;

    public Find(int[] nums, int numberToFind, boolean isBinarySearch){
        this.nums = nums;
        this.numberToFind = numberToFind;
        this.isBinarySearch = isBinarySearch;
        this.traversalDistance = 0;

        if(isBinarySearch){
            binarySearch();
        } else {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == numberToFind){
                    this.traversalDistance = i + 1;
                    this.indexFoundAt = i;
                }
            }
        }
    }

    /**
     * Searches for value and saves indexFoundAt and traversalDistance
     */
    private void binarySearch(){
        int bottom = 0;
        int top = nums.length;
        int mid;

        try {
            while (top - bottom >= 0) {
                traversalDistance += 1;
                mid = (top + bottom) / 2;
                if (nums[mid] == this.numberToFind) {
                    this.indexFoundAt = mid;
                    break;
                } else if (nums[mid] < this.numberToFind) {
                    bottom = mid + 1;
                } else {
                    top = mid - 1;
                }
            }
        } catch (IndexOutOfBoundsException e){
            this.traversalDistance = 0;
            return;
        }
    }

    public int getIndexFoundAt(){
        return indexFoundAt;
    }

    public int getTraversalDistance(){
        return traversalDistance;
    }
}
