public class Bug {
    boolean direction; // true for right, false for left 
    int place; //units where the bug is

    public Bug(int place){
        direction = true;
        this.place = place;
    }

    public void turn(){
        direction = !direction;
    }

    public void move(){
        if(direction){place++;}
        else {place--;}
    }

    public int getPosition(){
        return place;
    }
}
