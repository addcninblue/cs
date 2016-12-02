public class LoudDog extends Dog{
    /**
     * Constructor for loud dog
     * (Postcondition: loud dog is made)
	 * @param name name of loud dog
     * (Precondition: name exists)
     */
    public LoudDog(String name){
        super(name);
    }

    /**
     * Returns loud dog's speaking
     * (Postcondition: string)
     * @return what a loud dog says
     * (Precondition: none)
     */
    public String speak(){
        return super.speak() + " " + super.speak();
    }
}
