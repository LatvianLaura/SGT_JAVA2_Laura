package practice.lesson8;

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

        //Task 3
        Employee employee = new Employee("John", 30, "254545454", "Riga, Jurmalas gatve 100", 20000.21);
        Manager manager = new Manager("Jack", 50, "25465987", "Riga, Tallinas iela 24", 252525.25);

        employee.printSalary();
        manager.printSalary();

       // Print the area and perimeter of a rectangle and a square.


        //Task 4 to 5
        Rectangle rectangle = new Rectangle(2, 2);
        Square square = new Square(2, 2);

        square.printArea();
        square.printPerimeter();
        rectangle.printArea();
        rectangle.printPerimeter();

        double [] squareSideLengths = {1.1d,2.0d,3,0d,2.211d,5.4d,7.0d,8.0d,6.0d,8.5d,3.3d};
        double areaOf10Squares = 0;
        for (int i = 0; i < 10; i++) {
            Square squareToCalculateArea = new Square(squareSideLengths[i], squareSideLengths[i]);
            areaOf10Squares += squareToCalculateArea.calculateSquareArea();
        }
        System.out.println("The area of 10 squares is: " + areaOf10Squares);

        System.out.println();

        //Task 6
        System.out.println("The 6th task: ");
        square.printHelloMessageShape();
        square.printHelloMessageRectangle();
        square.printHelloMessageSquare();

        System.out.println();

        //7task
        System.out.println("The 7th task: ");
        System.out.println("Author Test: ");
        AuthorTest();
        System.out.println("Test Book: ");
        TestBook();

    }
    public static void AuthorTest() {
        Author anAuthor = new Author("Phil Knight", "phil@nike.com", 'm');
        System.out.println(anAuthor);   // call toString() === System.out.println(anAuthor.toString());
        anAuthor.setEmail("phil.knight@gmail.com");
        System.out.println(anAuthor);
    }

    public static void TestBook(){
        Author anAuthor = new Author("Phil Knight", "phil@nike.com", 'm');
        Book aBook = new Book("Sheo Dog", anAuthor, 21.99, 100);
        // Use an anonymous instance of Author
        Book anotherBook = new Book("more Java for dummy", new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'), 29.95, 888);
        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println("The author name is: " + aBook.getAuthorName());
        System.out.println("The authors mail is: " + aBook.getAuthorEmail());
        System.out.println("The gender of author is: " + aBook.getAuthorGender());
    }
}
