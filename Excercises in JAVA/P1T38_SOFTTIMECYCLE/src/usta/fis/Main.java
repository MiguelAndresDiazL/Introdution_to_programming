package usta.fis;
/*AUTHOR    : Miguel Andres Diaz Lache
 DATE       : 23 March of 2021
 DESCRIPTION: this software calculate the time between two cities
*/
import java.util.Scanner;  //para usar el tecaldo del software
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_distance = p_user_distance();


    }
    public static void p_show_info_program(){
        //Date       : 23 March of 2021
        //DESCRIPTION: this method show info software.
        System.out.println("----------------------------------------");
        System.out.println("!       SOFTCYCLE VERSION 1,0          !");
        System.out.println("!     MAKER: Miguel Andres Diaz        !");
        System.out.println("DESCR: Calculate time between two cities");
        System.out.println("----------------------------------------");
    }

    public static int p_user_distance(){
        Scanner keyboard = new Scanner (System.in); //use la variable keyboard como instancia para el teclado
        int v_distance;
        System.out.println("Input distance between two cities:");
        v_distance= keyboard.nextInt(); //pidiendo por teclado la variable de V_DISTANCE
        while(v_distance<0){
            System.err.println("ERR: the distance should be greater than zero");
            v_distance= keyboard.nextInt(); //pidiendo por teclado la variable de V_DISTANCE
        }
        return v_distance;
    }
}
