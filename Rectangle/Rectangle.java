public class Rectangle {
    // declare default
    public double length;
    public double width;

    public Rectangle(){
        length = 1;
        width = 1;
    }
    public double perimeter(){
        return (2 * (length + width));
    }

    public double area(){
        return (width*length);
    }

    public void setLength(double newLength){
        if(newLength > 0){
            length = newLength;
        } else {
            System.out.println("That was invalid.\nLength defaulting to 1.");
        }
    }

    public void setWidth(double newWidth){
        if(newWidth > 0){
            width = newWidth;
        } else {
            System.out.println("That was invalid.\nWidth defaulting to 1.");
        }
    }

}
