package homeworks.homework1Task1;
import homeworks.homework1Task1.StringToInteger;

public class TestToInteger {
    public static void main(String[] args) {

        int val = StringToInteger.myAtoi("-92");
        System.out.println("1. Checking '+' and '-' ");
        System.out.println("Integer value = " + val);

        System.out.println("2. Delete text/letters before/after numbers: ");
        int val2 = StringToInteger.myAtoi("349 is a number");
        System.out.println("Integer value = " + val2);

        System.out.println("3. Clear spaces: ");
        int val3 = StringToInteger.myAtoi("   32499    576");
        System.out.println("Integer value = " + val3);

        System.out.println("4. returns 0 if the String doesn't contain numbers ");
        int val4 = StringToInteger.myAtoi("This is not an integer");
        System.out.println("Integer value = " + val4);

        System.out.println("5. Cast Integers' min/max value");
        int val5 = StringToInteger.myAtoi("-999999999999999999999999999");
        System.out.println("Integer value = " + val5);

    }
    }


