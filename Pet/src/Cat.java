public class Cat extends Pet {
    /**
     * Constructor for cat
     * (Postcondition: cat is made)
	 * @param name name of cat
     * (Precondition: name exists)
     */
    public Cat(String name){
        super(name);
    }

    /**
     * Returns cat's speaking
     * (Postcondition: string)
     * @return what a cat says
     * (Precondition: none)
     */
    public String speak(){
        return "Meow";
    }
}
