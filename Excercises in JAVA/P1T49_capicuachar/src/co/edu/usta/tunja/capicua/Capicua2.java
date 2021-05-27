package co.edu.usta.tunja.capicua;

import java.util.Scanner;

public class Capicua2 {
    public static String sumNumbers(int number) {
        String numberStr = String.valueOf(number);
        int numberOne = 0;
        int numberTwo = 0;
        int middle = (int) Math.ceil(((double) numberStr.length()) / 2.0);
        boolean isUnpair = numberStr.length() % 2 != 0;
        for (int i = 0; i < numberStr.length(); i++) {
            int digitNumber = Integer.parseInt(numberStr.charAt(i) + "");
            int indexInChar = i + 1;
            if (middle > indexInChar) {
                numberOne += digitNumber;
            } else if (middle == indexInChar) {
                if (isUnpair) {
                    numberOne += digitNumber;
                    numberTwo += digitNumber;
                } else {
                    numberOne += digitNumber;
                }

            } else {
                numberTwo += digitNumber;
            }
        }

        return numberOne + " " + numberTwo;
    }

    //Forma usando strings
    public static int reverseNumber(int number) {
        String numberStr = String.valueOf(number);
        String reverseString = "";
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reverseString += numberStr.charAt(i);
        }

        return Integer.parseInt(reverseString);
    }

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("please input the first number: ");
        int numberOne = keyboard.nextInt();
        int reverseNumber = reverseNumber(numberOne);
        if (reverseNumber == numberOne) {
            System.out.println("The number is capicua");
        } else {
            System.out.println("The number is not capicua");
        }

        System.out.println(sumNumbers(numberOne));
    }
}

