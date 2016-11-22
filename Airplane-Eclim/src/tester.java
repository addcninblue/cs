public class tester {
    public static void main (String [] args){
        // Airplane airplane = new Airplane();
        Seat seat = new Seat(1, 3, true, false, false);
        System.out.format("%s%s", seat.row, (char)(seat.column + 64));
    }
}
