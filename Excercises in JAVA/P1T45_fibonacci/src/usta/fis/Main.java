package usta.fis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int serie=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your limit numbers for the fabonacci series: ");
        serie = keyboard.nextInt();
        int fibo_array[] = new int[100];
        fibo_array = serie_fibonacci(serie);
        System.out.println("the fabonacci series for number" + serie + "its:");
        for (int i = 0; i < serie; i++) {
            if (fibo_array[i] > 0) {
                System.out.println(fibo_array[i] + ", ");
            }
        }
    }

     public static int [] serie_fibonacci(int limit) {
        int fibo_array[]= new int[100];
        fibo_array[0]=0;
        fibo_array[1]=1;
         for (int i = 1; (fibo_array[i-1]+fibo_array[i]) < limit; i++) {
         fibo_array[i+1] = fibo_array[i-1] + fibo_array[i];
         fibo_array[i+2] = -1;
         }return fibo_array;
     }
    public static void p_show_info_program () {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║      fabonacci-soft V1.0    ║");
        System.out.println("║  Maker:Miguel Andres Diaz   ║");
        System.out.println("║   Date: 2021-April-26       ║");
        System.out.println("╚═════════════════════════════╝");
    }
    }

