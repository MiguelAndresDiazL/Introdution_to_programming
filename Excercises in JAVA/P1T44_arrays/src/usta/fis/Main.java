package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de notas a registrar: ");
        int numberNotes = entrada.nextInt();
        double[] numbers = new double[numberNotes];
        double counter_notes = 0;
        int count = 0;
        p_show_info_program();
        for (int counter = 0; counter < numbers.length; counter++) {

            System.out.print((counter + 1) + ". Digite el numero: ");
            numbers[counter] = Double.parseDouble(entrada.next());
            double valueNote = 0;
            if (counter == 0) {
                valueNote = numbers[counter] * 0.1;


            }
            if (counter == 1) {
                valueNote = numbers[counter] * 0.3;
            }
            if (counter ==2){
                valueNote = numbers[counter] * (0.6 / (numbers.length - 2));
            }
            System.out.println("El valor de la nota es: " + valueNote);
            counter_notes = valueNote + counter_notes;
            count = count + counter;
        }
        System.out.println("su numero de calificaciones es: " + count);
        System.out.println("Su promedio calificacion del corte es " + (counter_notes));
        for (double counter : numbers) {
            System.out.println(counter);
        }
    }
        public static void p_show_info_program () {
            System.out.println("╔═════════════════════════════╗");
            System.out.println("║      arrays-soft V1.0       ║");
            System.out.println("║  Maker:Miguel Andres Diaz   ║");
            System.out.println("║   Date: 2021-April-26       ║");
            System.out.println("╚═════════════════════════════╝");
        }

}