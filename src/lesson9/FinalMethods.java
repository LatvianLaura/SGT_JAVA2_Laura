package lesson9;

public class FinalMethods {

    public final void printHello() {
        System.out.println("Hello!");
    }
}

class ExtendedFinalMethods extends FinalMethods {

    //FINAL methods can not be overriden
    //@Override
    //public void printHello() {
    //System.out.println("Bye!");
    }
}