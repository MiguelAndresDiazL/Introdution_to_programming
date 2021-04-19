package usta.fis;
/*
Makers: Miguel Diaz
Date: 15/04/2021
Description: This software its about sum or subtract two numbers
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_number_one = 0;
        int v_number_two = 0;
        int v_operation = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("input 1 for sum- 2 for subtract- 3 for multiplication -4 division");
        v_operation = keyboard.nextInt();

        System.out.println("the result is:" + p_operation_numbers(v_number_one, v_number_two, v_operation));
    }

    public static int p_operation_numbers(int v_number_one, int v_number_two, int v_operation) {
        if (v_operation == 1) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("input your first number");
            v_number_one = keyboard.nextInt();
            System.out.println("input your second number");
            v_number_two = keyboard.nextInt();
            return v_number_one + v_number_two;
        }
        if (v_operation == 2) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("input your first number");
            v_number_one = keyboard.nextInt();
            System.out.println("input your second number");
            v_number_two = keyboard.nextInt();
            return v_number_one - v_number_two;
        }
        if (v_operation == 3) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("input your first number");
            v_number_one = keyboard.nextInt();
            System.out.println("input your second number");
            v_number_two = keyboard.nextInt();
            return v_number_one * v_number_two;
        }


        Scanner keyboard = new Scanner(System.in);
        System.out.println("input your first number");
        v_number_one = keyboard.nextInt();
        System.out.println("input your second number");
        v_number_two = keyboard.nextInt();
        return v_number_one / v_number_two;

        }


    public static void p_show_info_program (){
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║     calculator- soft V1.0   ║");
        System.out.println("║  Maker:Miguel Andres Diaz   ║");
        System.out.println("║  Date: 2021-April-15        ║");
        System.out.println("╚═════════════════════════════╝");
    }

}