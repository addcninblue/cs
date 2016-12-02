import java.util.ArrayList;

public class tester {
    private static ArrayList<Pet> petList = new ArrayList<Pet>(); // elements are references to Pet objects
    public static void main (String [] args){
        Pet dog = new Dog("fido");
        petList.add(dog);
        Pet cat = new Cat("lmao");
        petList.add(cat);
        Pet loudafdog = new LoudDog("annoying");
        petList.add(loudafdog);
        allSpeak();
    }

    public static void allSpeak(){
        for(Pet pet: petList){
            System.out.println(pet.speak());
        }
    }
}
