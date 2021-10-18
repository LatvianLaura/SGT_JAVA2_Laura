package practice;

public class Main {
    public static void main(String[] args) {


        //1 - method of parent class by object of parent class
        ParentClass parentClass = new ParentClass();
        parentClass.printParent();

        //2 - method of child class by object of child class
        ChildClass childClass = new ChildClass();
        childClass.printChild();

        //3 - method of parent class by object of child class
        childClass.printParent();

        //4 we can use private method only within the same class, otherwise it will not work!!!
        //parentClass.printSomethingPrivate();
        //childClass.printSomethingPrivate();

        Employee employee = new Employee("John", 30, "254545454", "Riga, Jurmalas gatve 100", 20000.21);
        Manager manager = new Manager("Jack", 50, "25465987", "Riga, Tallinas iela 24", 252525.25);

        employee.printSalary();
        manager.printSalary();

       // Print the area and perimeter of a rectangle and a square.


        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(3,3);

        rectangle.printPerimeter();
        rectangle.printArea();

        square.printArea();
        square.printPerimeter();

    }
}
