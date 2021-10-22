package practice.lesson8;

import practice.lesson8.Rectangle;

public class Square extends Rectangle {

/*    @Override
    public double getLength() {
        return super.getLength();
    }*/

    public double calculateSquareArea(){
        return length*length;
    }

    public void printPerimeter (){
        System.out.println("The perimeter of the square is: " + 4*(length) );
    }
    public void printArea (){
        System.out.println("The area of the square is: " + length*length);
    }

    //this method for task 6
    public void printHelloMessageSquare (){
        System.out.println("Square is a rectangle");
    }

    public Square() {
    }

    public Square(double length, double breadth) {
        super(length, breadth);
    }
}