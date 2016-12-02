/**
 * Generic description
 *
 * @author Daniel Phan
 * @version today
 */
public class JUnitImposter {
    public static void main(String[] args) throws Exception {
        Worker[] workers = new Worker[2];
        workers[0] = new HourlyWorker("Steve", 11.24);
        workers[1] = new SalariedWorker("Mike", 11.24);
        //not checking the name
        //if the name doesn't work, that's on you
        for(Worker w: workers) {
            AssertEquals(w.computePay(39), 438.36, 13);
        }
        AssertEquals(workers[0].computePay(66), 887.96, 15);
        AssertEquals(workers[1].computePay(66), 741.84, 16);
        System.out.println("Passed all tests.");
    }
    static void AssertEquals(double actual, double expected, int line) throws Exception {
        String actualRounded = String.format("%.2f", actual);
        if(!actualRounded.equals(expected + "")) {
            String errorMessage = String.format(
                    "Mismatch at line %d\nExpected: %s\nActual: %s", line, expected + "", actualRounded
            );
            throw new Exception(errorMessage);
        }
        System.out.println("ok");
    }
}
