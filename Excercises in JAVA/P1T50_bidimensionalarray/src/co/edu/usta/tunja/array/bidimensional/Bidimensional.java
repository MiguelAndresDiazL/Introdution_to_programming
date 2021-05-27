package co.edu.usta.tunja.array.bidimensional;

import javax.swing.*;
import java.util.Scanner;

public class Bidimensional {
    public static void main(String[] args) {
        int rows = 5, columns = 4;
        Scanner keyboard = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        JOptionPane.showMessageDialog(null,"Please input the value for the bidimensional array (matrix): ");
        System.out.println("Please input the value for the bidimensional array (matrix): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("this value will locatein matrix[" + i + "][" + j + "]=");
                matrix[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("The values in orden of the matrix are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" "+matrix[i][j]+" ");
                if(matrix[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
