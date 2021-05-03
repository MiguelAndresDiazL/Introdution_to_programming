package co.edu.usta;

import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numbers = new int[3];
        //int counter_notas=0;
        for(int counter=0;counter<3;counter++){
            System.out.print((counter+1)+". Digite el numero: ");
            numbers[counter]= entrada.nextInt();
            //counter_notas=counter_notas+counter;
        }
        //System.out.println("la cantidad de notas es"+ counter_notas);
        System.out.println("Su calificacion del corte es");
        for( int counter:numbers){
            System.out.println(counter);
        }
    }



}

