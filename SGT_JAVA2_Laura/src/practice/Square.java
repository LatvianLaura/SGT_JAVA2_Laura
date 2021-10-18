package practice;

public class Square extends Rectangle{
public Square () {
}
public  Square (double lenght) {
    super(lenght,lenght);
}
    public void printArea  (double length) {
        System.out.println("The area is " + (4*length));
    }

    public void printPerimeter  (double length, double breadth) {
        System.out.println("The perimeter is " + (length * length));
    }

}
