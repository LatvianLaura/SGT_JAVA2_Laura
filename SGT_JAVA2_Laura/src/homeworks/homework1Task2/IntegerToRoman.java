package homeworks.homework1Task2;

public class IntegerToRoman {
    public static String intToRoman(int num) {
/*
        int symbols = 0;
        String result = "";
        int[] numbs = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        if (num < 1 || num > 3999) {
            System.out.println("Invalid roman number value!");
        }


        for (int i = numbs.length - 1; i >= 0; i--) {
            symbols = num / numbs[i];
            num %= numbs[i];
            if (symbols > 0) {
                result += romans[i].repeat(symbols);
                symbols--;
            }
            if (num < 1 || num > 3999) {
                System.out.println("Invalid roman number value!");
            }
        }
            return result;
        }
    }  */


        String result = "";
        int[] numbs = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        if (num < 1 || num > 3999) {
            System.out.println("This is an invalid Roman number value!");
        }
        while (num > 0) {
            int maxFound = 0;
            for (int i = 0; i < numbs.length; i++) {
                if (num >= numbs[i]) {
                    maxFound = i;
                }
            }
            result += romans[maxFound];
            num -= numbs[maxFound];
        }
        return result;

    }
}


