package homeworks.homework1Task1;

import java.math.BigInteger;

public class StringToInteger {

    public static int myAtoi(String s) {
        int numbers = 0;
        //replacing all letters and spaces with numbers
        String result = s.replaceAll("[^0-9-]", "");
        if (result.equals("")) {
            return numbers;
        }
        BigInteger maxMinResult = new BigInteger(result);
        if (maxMinResult.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0) {
            return Integer.MAX_VALUE;
        }
        if (maxMinResult.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) < 0) {
            return Integer.MIN_VALUE;
        }
        numbers = Integer.parseInt(result);
        return numbers;

    }
}




