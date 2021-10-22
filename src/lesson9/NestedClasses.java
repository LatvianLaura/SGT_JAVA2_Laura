package lesson9;

public class NestedClasses {

    //INNER CLASS
    public class InnerClass {
        public String printInnerClass()  {
            System.out.println("This is Inner class ");
            return "Some String returned";
        }
    }

    private  String printSmthFromNestedClass() {
        InnerClass inner = new InnerClass();
        return inner.printInnerClass();
    }
}

class MainApplication {
    public static void main(String[] args) {
        NestedClasses.InnerClass inner = new NestedClasses.InnerClass();
    }

}
