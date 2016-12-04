import java.util.ArrayList;

public class Hotel
{
    private Reservation[] rooms;
    // each element corresponds to a room in the hotel;
    // if rooms[index] is null, the room is empty;
    // otherwise, it contains a reference to the Reservation
    // for that room, such that
    // rooms[index].getRoomNumber() returns index

    private ArrayList<String> waitList;
    // contains names of guests who have not yet been
    // assigned a room because all rooms are full

    /**
     * Requests a room
     * (Postcondition: a valid Reservation)
     * @return Reservation the new Reservation
	 * @param guestName name of the guest that wants a room
     * (Precondition: guestName is a string)
     */
    // if there are any empty rooms (rooms with no reservation),
    // then create a reservation for an empty room for the
    // specified guest and return the new Reservation;
    // otherwise, add the guest to the end of waitList
    // and return null
    public Reservation requestRoom(String guestName){
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i] == null){
                rooms[i] = new Reservation(guestName, i);
                return new Reservation(guestName, i);
            }
        }
        waitList.add(guestName);
        return null;
    }

    /**
     * Cancels and reassigns a room to someone on the waitlist
     * (Postcondition: the list is updated and person is added to list)
	 * @param res Reservation to change
     * (Precondition: res is a valid Reservation)
     */
    // release the room associated with parameter res, effectively
    // canceling the reservation;
    // if any names are stored in waitList, remove the first name
    // and create a Reservation for this person in the room
    // reserved by res; return that new Reservation;
    // if waitList is empty, mark the room specified by res as empty and
    // return null
    // precondition: res is a valid Reservation for some room
    // in this hotel
    public Reservation cancelAndReassign(Reservation res){
        int i = res.getRoomNumber();
        if(waitList.size() == 0){
            rooms[i] = null;
            return null;
        } else {
            rooms[i] = new Reservation(waitList.get(waitList.size() - 1), i);
            waitList.remove(waitList.size() - 1);
            return new Reservation(waitList.get(waitList.size() - 1), i);
        }
    }

    // constructors and other methods not shown
}
