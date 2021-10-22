package homeworks.homework1Task2;

import java.util.Scanner;

public class TestToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number which will be converted to a Roman number: ");
        int input = scanner.nextInt();
        System.out.println(IntegerToRoman.intToRoman(input));
    }

}
