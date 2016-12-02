import java.util.ArrayList;

public class Kennel{
    private static ArrayList<Pet> petList = new ArrayList<Pet>(); // elements are references to Pet objects

    public static void main (String [] args){
        Pet dog = new Dog("fido");
        petList.add(dog);
        allSpeak();
    }

    /**
     * Speaks for all animals
     * (Postcondition: printlns out each animal's speech)
     * (Precondition: none)
     */
    // Postcondition: for each Pet in the kennel, its name followed by the result of a call to its speak method has been printed, one line per Pet
    public static void allSpeak(){
        for(Pet pet: petList){
            System.out.println(pet.speak());
        }
    }
}
