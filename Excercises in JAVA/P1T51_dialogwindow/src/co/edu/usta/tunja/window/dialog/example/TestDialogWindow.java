package co.edu.usta.tunja.window.dialog.example;

import javax.swing.*;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class TestDialogWindow {
    public static void main(String[] args) {
        //mensaje basico
        //JOptionPane.showMessageDialog(null, "Operación realizada correctamente");

        //mensaje en forma de advertencia
        //JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);GE);

        //mensaje con un icono especial
        /*@Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Image image = new ImageIcon(getClass().getResource("/resources/icon-pencil-png.png")).getImage();
            g.drawImage(image, x, y, c);
        }

        @Override
        public int getIconWidth() {
            return 50;
        }

        @Override
        public int getIconHeight() {
            return 50;

        }
        MyIcon icon = new MyIcon();
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION, icon);
         */

        /*poder digitar texto en el mensjae en pantalla
        Scanner Mensaje= new Scanner(System.in);
        JOptionPane.showInputDialog(Mensaje);
        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
         */

        //dialogo para confirmar,negar o cancelar
        /*
        JOptionPane.showConfirmDialog(Componente padre, "Mensaje");
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
        */
        String answer;
        int amount=0, operation=0;
        float result;
        int [] array;
        answer= JOptionPane.showInputDialog("Hi , This program is a calculator, " +
                "\n and do it a arithmetic operations, " +
                "\n please type the amount of numbers that you will use");
        amount=Integer.valueOf(answer);
        array= new int[amount];

        answer= JOptionPane.showInputDialog("Please type: \n 1 to sum \n 2 to subtract \n 3 to multiply \n 4 to divide, or 0 to exit ");
        operation=Integer.valueOf(answer);
        for (int i = 0; i < amount; i++) {
            answer= JOptionPane.showInputDialog("Please type the "+(i+1)+" the number");
            array[i]=Integer.valueOf(answer);
        }
        result= calculator(array,operation);
        JOptionPane.showMessageDialog(null, "Your result is: "+result);
    }
    public static float calculator (int []array, int operation){
        float result=0;
        //TODO: develop the operations
        for (int i = 0; i < array.length; i++) {
            if (operation == 1) {
                result += array[i];
            }
            if (operation == 2) {
                result -= array[i];
                if (i == 0) {
                    result *= -1;
                }
            }
            if (operation == 3) {
                if (i == 0) {
                    result = 1;
                }
                result *= array[i];
            }
            if (operation == 4) {
                result += array[i];
            }
        }
        if (operation==4){
            result/= array.length;
        }
            return result;
        }
        }


