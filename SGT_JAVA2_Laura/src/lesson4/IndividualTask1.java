package lesson4;

import java.util.Scanner;

public class IndividualTask1 {
    public static void main(String[] args) {

        System.out.println("Individual Task1 - converts a string to an integer: ");
/*
        // Defining strings:
        String string1 = "90ab";
        int intString1 = Integer.parseInt(string1);
        System.out.println(intString1);

        for (char ch : string1.toCharArray()) {
            if (Character.isDigit(ch)) {
                System.out.print(ch + "");
            }


         String string2 = "11";
         String string3 = "20000";
         int intString2 = Integer.parseInt(string2);
         int intString3 = Integer.parseInt(string3);


         System.out.println(intString2);
         System.out.println(intString3);
     }
 }

        String string1 = "555 a";
       int intString1 = Integer.parseInt(string1);
        if (string1.matches("^[0-9]+$") ){
            System.out.println(intString1);
        } else if (string1.matches("^[0-9]+$") == false) {
            System.out.println(intString1);


        }

    }*/


        Scanner sc = new Scanner(System.in);
        String inputString;

        //2
        System.out.println("Enter numbers, letters or both together:");
        inputString = sc.nextLine();

        //3
        System.out.println("From your entered: ");

        //4
        for (char ch : inputString.toCharArray()) {
            //5
            if (Character.isDigit(ch)) {
                System.out.print(ch + "");
            }
        }

    }
}


