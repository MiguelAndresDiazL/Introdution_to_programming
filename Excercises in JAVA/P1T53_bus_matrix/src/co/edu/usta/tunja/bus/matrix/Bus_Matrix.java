package co.edu.usta.tunja.bus.matrix;

import javax.swing.*;

public class Bus_Matrix {
    public static void main(String[] args) {
        char[][] matrix;
        String fila;
        fila = JOptionPane.showInputDialog("Digite el numero de filas ");

        matrix = new char[Integer.parseInt(fila)][4];


        for (int i = 0; i < Integer.valueOf(fila); i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0)
                    matrix[i][j] = 'D';
                else
                    matrix[i][j] = 'X';
            }
        }
        int option = 0;
        do {
            showDataMatrix(matrix);
            option = Integer.valueOf(JOptionPane.showInputDialog(" por favor ponga 1 para añadir a un pasajero o 2 para salir: (D= Disponible), (O= ocupado), (x=no disponible) "));
            if (option == 1) {
                String row = JOptionPane.showInputDialog("por favor digite la fila que quiera ocupar: ");
                String column = JOptionPane.showInputDialog("por favor digite la columna que quiera ocupar: ");
                int rowNumber = Integer.valueOf(row);
                int columnNumber = Integer.valueOf(column);
                int validation = validatePassegerPosition(matrix, rowNumber, columnNumber);
                switch (validation) {
                    case -1:
                        JOptionPane.showMessageDialog(null, "la Posicion esta ocupada");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "la posicion no existe");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "la posicion no esta disponible");
                        break;
                    case 2:
                        matrix[rowNumber][columnNumber] = 'O';
                        break;

                }
            }
        } while (option == 1);
        JOptionPane.showMessageDialog(null, "Estas son las  posiciones de los puestos en el bus: 4 no disponibles, 7 disponibles-1 pasajeros  -vamos a partir-" +
                ":");

    }

    public static int validatePassegerPosition(char[][] matrix, int row, int column) {
        if (row >= matrix.length || column >= matrix[0].length) {
            return 0;
        }
        if (matrix[row][column] == 'O') {
            return -1;
        }
        if (matrix[row][column] == 'X') {
            return 1;
        }
        return 2;
    }

    public static void showDataMatrix(char[][] matrix) {
        String matrixInString = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                matrixInString += matrix[i][j] + " ";
            }
            matrixInString += "\n";
        }
        JOptionPane.showMessageDialog(null, matrixInString);
    }
}

