/**
 * Checks if program works
 *
 * @author Daniel Phan
 * @version 11.21.16
 */
//how the fuck do we import JUnit stuff
public class JUnitImposter {
    public static void main(String[] args) throws Exception {
        TimeDepositAccount tda = new TimeDepositAccount(1000.10, 4, 0.2);
        tda.addInterest();
        AssertEquals(tda.getBalance(), 1200.12, 12);
        tda.deposit(205);
        AssertEquals(tda.getBalance(), 1405.12, 14);
        tda.withdraw(500);
        AssertEquals(tda.getBalance(), 895.12, 16);
        tda.withdraw(3000);
        AssertEquals(tda.getBalance(), 895.12, 18);
        for(int i = 0; i < 2; i++){
            tda.addInterest();
        }
        AssertEquals(tda.getBalance(), 1288.97, 22);
        tda.addInterest();
        AssertEquals(tda.getBalance(), 1546.77, 24);
        tda.withdraw(200);
        AssertEquals(tda.getBalance(), 1346.77, 26);
        tda.addInterest();
        AssertEquals(tda.getBalance(), 1616.12, 28);
    }
    static void AssertEquals(double item1, double item2, int line) throws Exception {
        String balance = String.format("%.2f", item1);
        if(!balance.equals(item2 + "")) {
            String errorMessage = String.format(
                    "Mismatch at line %d\nExpected: %s\nActual: %s", line, item2 + "", balance
            );
            throw new Exception(errorMessage);
        }
    }
}
