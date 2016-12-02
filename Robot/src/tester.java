public class main {
    public static void main (String [] args){
        Robot robot;
        robot = new Robot(new int[]{1,1,2,2}, 1, true);
        checkEquals(robot.clearHall(), 9, 5);

        robot = new Robot(new int[]{1,1,2,2}, 1, false);
        checkEquals(robot.clearHall(), 8, 8);

        robot = new Robot(new int[]{1,1,1,1}, 0, true);
        checkEquals(robot.clearHall(), 4, 11);
    }

    public static void checkEquals(int one, int two, int lineNumber){
        if(one != two){
            System.out.format("Error in line %d.\n", lineNumber);
            System.out.format("Your output: %d.\n", one);
            System.out.format("Expected output: %d.\n", two);
        } else {
            System.out.println("Passed.");
        }
    }
}
