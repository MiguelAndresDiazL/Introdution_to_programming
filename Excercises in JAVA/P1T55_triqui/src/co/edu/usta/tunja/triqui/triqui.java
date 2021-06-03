package co.edu.usta.tunja.triqui;

import javax.swing.*;

public class triqui {
    public static void main(String[] args) {
        char[][] matrix;
        String fila;
        fila = JOptionPane.showInputDialog("Digite el numero de filas (3 o 5): ");

        int filaNumber = Integer.parseInt(fila);

        matrix = new char[filaNumber][filaNumber];


        for (int i = 0; i < filaNumber; i++) {
            for (int j = 0; j < filaNumber; j++) {

                matrix[i][j] = 'D';

            }
        }
        MostrarMatrix(matrix);
        int optionValue = Integer.valueOf(JOptionPane.showInputDialog(" Digita  1 para jugar para jugar con O, 2 para jugar con X "));
        int optionMenu = 0;
        do {
            MostrarMatrix(matrix);
            optionMenu = Integer.valueOf(JOptionPane.showInputDialog(" Digita 3 para salir o 0 para continuar jugador " + (optionValue == 1 ? "O" : "X")));
            if (optionMenu == 0) {
                String row = JOptionPane.showInputDialog(" Digite la fila que quiera marcar: ");
                String column = JOptionPane.showInputDialog(" Digite la columna que quiera marcar: ");
                int rowNumber = Integer.valueOf(row);
                int columnNumber = Integer.valueOf(column);
                int validation = runGame(matrix, rowNumber, columnNumber);
                switch (validation) {
                    case -1:
                        JOptionPane.showMessageDialog(null, "la Posicion esta ocupada");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "la posicion no existe");
                        break;
                    case 2:
                        if (optionValue == 1) {
                            matrix[rowNumber][columnNumber] = 'O';
                            optionValue = 2;
                        } else {
                            matrix[rowNumber][columnNumber] = 'X';
                            optionValue = 1;
                        }

                        break;

                }
            }
        } while (optionMenu == 0 && validateMatrix(matrix) == 'N' && !isFilledMatrix(matrix));

        MostrarMatrix(matrix);
        switch (validateMatrix(matrix)) {
            case 'N':
                JOptionPane.showMessageDialog(null, "Nadie gano la partida ");
                break;
            case 'O':
                JOptionPane.showMessageDialog(null, "Gano el jugador O ");
                break;
            case 'X':
                JOptionPane.showMessageDialog(null, "Gano el jugador X ");
                break;
        }

    }

    private static int runGame(char[][] matrix, int row, int column) {
        if (row >= matrix.length || column >= matrix[0].length) {
            return 0;
        }
        if (matrix[row][column] == 'O' || matrix[row][column] == 'X') {
            return -1;
        }
        return 2;


    }

    //Si llega a regresar N significa que nadie gano
    private static char validateMatrix(char[][] matrix) {
        char value = ' ';

        for (int i = 0; i < matrix.length; i++) {
            value = matrix[i][0];
            if (value == 'D')
                continue;
            char isEqual = value;
            if (i == 0) {
                for (int j = i + 1; j < matrix.length; j++) {
                    if (value != matrix[j][j]) {
                        isEqual = 'N';
                        break;
                    }
                }
                if (isEqual == value) {
                    return value;
                }
            } else if (i == matrix.length - 1) {
                int j2 = 1;
                for (int j = i - 1; j > -1; j--) {
                    if (value != matrix[j][j2]) {
                        isEqual = 'N';
                        break;
                    }
                    j2++;
                }
                if (isEqual == value) {
                    return value;
                }
            }
            isEqual = value;
            for (int j = 1; j < matrix[i].length; j++) {
                if (value != matrix[i][j]) {
                    isEqual = 'N';
                    break;
                }
            }

            if (isEqual == value) {
                return value;
            }

        }

        return 'N';
    }

    //Retornar boolean
    private static boolean isFilledMatrix(char[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'D') {
                    return false;
                }

            }

        }

        return true;
    }

    public static void MostrarMatrix(char[][] matrix) {
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

