package usta.fis;
/*
Makers: Miguel Diaz
Date: 15/04/2021
Description: This software its about sum,subtract, multiplication or division two numbers
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        Scanner entrada= new Scanner(System.in);
        int n1,n2,resultado,opcion;
        boolean op= true;
        while(op){
            System.out.println("*******************************************************");
            System.out.println("                      Menu                             ");
            System.out.println("1. Sum-2 subtract-3 multiplication-4 division-0-exit   ");
            System.out.println("               Input your option:                      ");
            System.out.println("*******************************************************");
            opcion= entrada.nextInt();

            if (opcion ==0) {
                System.out.println("The program finish");
                break;
            }else{
                switch (opcion){
                    case 1:
                        System.out.print("Sum: ");
                        System.out.print("input your first number:");
                        n1=entrada.nextInt();
                        System.out.print("input your second number:");
                        n2= entrada.nextInt();
                        resultado = (n1+n2);
                        System.out.println("your sum is " +resultado);
                        break;


                    case 2:
                        System.out.print("Subtract: ");
                        System.out.print("input your first number:");
                        n1=entrada.nextInt();
                        System.out.print("input your second number:");
                        n2=entrada.nextInt();
                        resultado = (n1-n2);
                        System.out.println("your subtract is: " +resultado);
                        break;


                    case 3:
                        System.out.print("Multiplication: ");
                        System.out.print("input your first number:");
                        n1=entrada.nextInt();
                        System.out.print("input your second number:");
                        n2=entrada.nextInt();
                        resultado= (n1*n2);
                        System.out.println("your multiplication is: " +resultado);
                        break;


                    case 4:
                        System.out.print("Division: ");
                        System.out.print("input your first number:");
                        n1=entrada.nextInt();
                        System.out.print("input your second number:");
                        n2=entrada.nextInt();
                        resultado= (n1/n2);
                        System.out.println("your division is: "+resultado);
                        break;


                    default:
                        System.err.print("ERR:not valid option");
                        break;
                }
            }

        }
    }
    public static void p_show_info_program() {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║     calculator-soft  V1.0   ║");
        System.out.println("║  Maker:Miguel Andres Diaz   ║");
        System.out.println("║  Date: 2021-April-15        ║");
        System.out.println("╚═════════════════════════════╝");
    }
}