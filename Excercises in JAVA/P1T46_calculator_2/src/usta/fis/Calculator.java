package usta.fis;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number0ne = 0;
        int numberTwo = 0;
        int operationToDo = 0;
        int result = 0;
        Scanner keyboard = new Scanner(System.in);

        programInfo();
        System.out.println("please type the first aritmetic operation: 1 to add, 2 to subtract, 3 to multiply, 4 divide, 5 to prime number : ");
        operationToDo = keyboard.nextInt();


        if (operationToDo !=0){
            System.out.println("please type the first number: ");
            number0ne = keyboard.nextInt();
        }
        if (operationToDo>0 && operationToDo <5){
            System.out.println("please type the second number: ");
            numberTwo = keyboard.nextInt();
        }
        result = operationCal(number0ne, numberTwo, operationToDo);

        System.out.println("The result is: " + result);


    }

    public static int operationCal(int number1, int number2, int operation) {
        String convert="";
        if (operation == 1) {
            return number1 + number2;
        }
        if (operation == 2) {
            return number1 - number2;
        }
        if (operation == 3) {
            return number1 * number2;
        }
        if (operation == 4) {
            if (number2 != 0) {
                return number1 / number2;
            }
            if (operation == 5) {

                if(p_validate_prime(number1)) {
                    System.out.println("Its a prime Number");
                    convert="Its prime Number";
                    return 1;
                }else
                    System.out.println("Its not a prime Number");
                convert="Its not a prime Number";
                return 0;
            }
        }
        return 0;
    }

    public static void programInfo() {
        System.out.println("This program add, subtract, multiply and divide 2 integer numbers");
        System.out.println("Developed by: Miguel Andres Diaz");
        System.out.println("Date: 7/05/2021");
    }


    public static boolean p_validate_prime(int prime) {
        int numbers_divide = 0;
        for (int i=1;i<=prime;i++) {
            if (prime % i == 0) {
                numbers_divide++;
            }
        }
        if (numbers_divide != 2) {
            return false;
        }
        return true;
    }
}
