public class Dog extends Pet{
    /**
     * Constructor for dog
     * (Postcondition: dog is made)
	 * @param name name of dog
     * (Precondition: name exists)
     */
    public Dog(String name){
        super(name);
    }

    /**
     * Returns dog's speaking
     * (Postcondition: string)
     * @return what a dog says
     * (Precondition: none)
     */
    public String speak(){
        return "Woof";
    }
}
