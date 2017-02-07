import javax.swing.*;
import java.awt.*;

public class Find extends JComponent {
    private int[] nums;
    private int numberToFind;
    private boolean isBinarySearch;

    private int indexFoundAt;
    private int traversalDistance;

    private int top;
    private int mid;
    private int bottom;

    public Find(int[] nums, int numberToFind, boolean isBinarySearch){
        this.nums = nums;
        this.numberToFind = numberToFind;
        this.isBinarySearch = isBinarySearch;
        this.traversalDistance = 0;
    }

    public void find(){
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

    private void binarySearch(){
        bottom = 0;
        top = nums.length;

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
                repaint();
                try {
                    Thread.sleep(10);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
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


    /**
     * Paints all rectangles
     * (Postcondition: rectangles painted)
     * @param g Graphics to paint on
     * (Precondition: g is valid)
     */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Color cyan = new Color(42, 161, 152);
        Color orange = new Color(203, 75, 22);
        Color yellow = new Color(181,137,0);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int yLocation = screenSize.height / 2;
        int increment = screenSize.width / nums.length;
        int maxHeight = getMax(nums);
        Font font = new Font("Sans Serif", Font.PLAIN, 25);
        g2.setFont(font);
        g2.setColor(orange);
        g2.drawString("Finding",0 ,25 );

        for(int i = 0; i < nums.length ; i++){
            int actualHeight = Math.abs((int)(((double)nums[i] / (double)maxHeight) * (double)yLocation));

            Rectangle r = new Rectangle();
            // if (i % 2 == 0)
            // System.out.format("%s, %s, %s\n", i, cursor, nums[smallest]);
            if(i == mid){
                g2.setColor(orange);
            } else if(bottom <= i && i < top) {
                g2.setColor(orange);
            } else {
                g2.setColor(cyan);
            }
            // else
            // g2.setColor(orange);
            if (nums[i] > 0){
                // System.out.println(increment*i + " " + (yLocation + actualHeight));
                r.setLocation(increment*i, yLocation - actualHeight);
                r.setSize(increment, actualHeight);
                if(i == mid){
                    g2.fill(r);
                } else {
                    g2.draw(r);
                }
            } else { // rectangle is negative
                // System.out.println(increment*i + " " + yLocation);
                r.setLocation(increment*i, yLocation);
                r.setSize(increment, actualHeight);
                if(i == mid){
                    g2.fill(r);
                } else {
                    g2.draw(r);
                }
            }
        }
        // System.out.println("paintComponent: " + System.currentTimeMillis());
    }

    /**
     * Get the maximum number in the array
     * @param array The array to find the maximum number of.
     */
    public int getMax(int[] array){
        int maximum = 0;
        for(int i = 0; i < array.length; i++){
            if (Math.abs(array[i]) > maximum)
                maximum = Math.abs(array[i]);
        }
        return maximum;
    }
}
