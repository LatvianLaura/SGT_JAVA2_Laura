package practice;

public class Rectangle {

    private double length;
    private double breadth;

    public void printArea  () {
        System.out.println("The area is " + (length + breadth)*2);
    }

    public void printPerimeter  () {
        System.out.println("The perimeter is " + (length * breadth));
    }

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
