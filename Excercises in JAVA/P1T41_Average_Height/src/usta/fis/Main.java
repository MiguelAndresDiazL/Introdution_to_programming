package usta.fis;
/*
Makers: Miguel Diaz, Juan Villamil, Daniela Vargas
Date: 26/03/2021
Description: This software its about calculate the average height(Cm) of 5 childrens
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int multiplication=0;
        int division=0;
        int v_sum_height=0;
       double v_average_height;
        for (int i=1;i<=5;i++) {
            System.out.println("height of children:[" + i + "]");
            v_sum_height = v_sum_height + p_children_height();
            if(i==3){
                multiplication= p_children_height()*50;
            }else
                division= p_children_height()/10;

        }






        v_average_height= v_sum_height/5;
        System.out.println("The average height is:"+v_average_height);
        System.out.println("MULTIPLICATION: "+multiplication);
        System.out.println("DIVISON: "+division);
    }
    public static void p_show_info_program() {
        //DESCRIPTION: this method show info program (software)
        System.out.println("------------------------------------------------------------------");
        System.out.println("!               SOFT-HEIGHT VERSION 1,0                          !");
        System.out.println("!    MAKERS: Miguel Andres Diaz,Juan Villamil, Daniela Vargas    !");
        System.out.println("!               Date: 25 march 2021                              !");
        System.out.println("------------------------------------------------------------------");
    }
    public static int p_children_height(){
        //Description: this methods will return the height of the childrens
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the childrens height in Cm");
        int v_height =keyboard.nextInt();
        while (v_height < 50 || v_height > 200){
            System.err.println("ERR: the height cannot most be less 50 Cm and cannot more than 200 Cm");
            v_height =keyboard.nextInt();
        }
        return v_height;
    }
}