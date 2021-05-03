package usta.fis;
/*
Maker: Miguel Diaz
Date: 15/04/2021
Description: This software its about sum,subtract, multiplication or division two numbers
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n1 =0;
        int n2 =0;
        int operation =0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.println("Input your option: 1 sum- 2 subtract-3 multiplication- 4 division- 5 prime number-6 calculate prime numbers-0 exit");
            operation = keyboard.nextInt();
            if (operation!=0) {
                System.out.println("input first number:");
                n1 = keyboard.nextInt();
                if (operation > 0 && operation < 5) {
                    System.out.println("input second number:");
                    n2 = keyboard.nextInt();
                }
            }
            System.out.println("the result is: "+p_operate_numbers(n1,n2,operation));
        }while (operation != 0);
    }
    public static String p_operate_numbers(int n1, int n2, int operation){
        int result=0;
        String convert="";
        switch (operation){
            case 1:
                result =n1+n2;
                break;
            case 2:
                result =n1-n2;
                break;
            case 3:
                result =n1*n2;
                break;
            case 4:
                result =n1/n2;
                break;
            case 5:
                convert= "Its not a prime number";
                if (p_validate_prime(n1)){
                    convert = "its a prime number";
                }
                break;
            case 6:
                convert= "the prime numbers are: "+p_prime_numbers(n1);
                break;
            default:
                convert="Exit";
                System.exit(0);
        }
        if (convert.isEmpty()){
            convert=String.valueOf(result);;
        }
        return  convert;
    }
    public static String p_prime_numbers(int limit) {
        String prime_numbers="";
        int p_pos_counter=0;
        int []int_prime_numbers=new int[100];
        for (int counter = 1; counter <= limit; counter++) {
            if (p_validate_prime(counter)){
                prime_numbers=prime_numbers+String.valueOf(counter)+", ";
                int_prime_numbers[p_pos_counter]=counter;
                p_pos_counter++;
            }
        }
        return prime_numbers;
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
    public static void p_show_info_program() {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║     calculator-soft  V1.0   ║");
        System.out.println("║  Maker:Miguel Andres Diaz   ║");
        System.out.println("║  Date: 2021-April-15        ║");
        System.out.println("╚═════════════════════════════╝");
    }

}
