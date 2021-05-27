package co.edu.usta.tunja.array.bidimensional.v2;

import javax.swing.*;

public class Bidimensional {
    //this program declare a size of a diminesional array designed by user
    public static void main(String[] args) {
        int [][] matrix;
        int value, BiggestNumber, lenghtBiggestNumber;
        String columns,rows,input,matrixInString = "";

        columns= JOptionPane.showInputDialog("This program create dynamic bidimensional array" +
                "\n please type the size of column: ");
        rows= JOptionPane.showInputDialog(" please type the size of column");

        matrix= new int[Integer.parseInt(rows)][Integer.parseInt(columns)];

        JOptionPane.showMessageDialog(null, "Please type the values" +
                "for the bidimensional array of: "+rows+" rows and "+columns+" columns");
        for (int i = 0; i < Integer.valueOf(rows); i++) {
            for (int j = 0; j < Integer.valueOf(columns); j++) {
                input=JOptionPane.showInputDialog("Please type the value Array["+i+"]["+j+"]=");
                value=Integer.parseInt(input);
                matrix[i][j]=value;
            }
        }
        //TODO: create a code to show the content storage of the matrix value

        for (int i = 0; i < matrix.length ; i++){
            for (int j = 0; j < matrix[0].length ; j++) {

                matrixInString += matrix[i][j] + " ";
            }
            matrixInString += "\n";
        }
        JOptionPane.showMessageDialog(null,matrixInString);
        BiggestNumber=findBiggestValueMatrix(matrix);
        lenghtBiggestNumber=countDigitalNumber(BiggestNumber);




    }
    public static int findBiggestValueMatrix(int [][] matrix){
        int biggest=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (biggest>matrix[i][j]){
                    biggest=matrix[i][j];
                }
            }
        }
        return biggest;
    }
    public static int countDigitalNumber(int myNumber){
        String value = String.valueOf(myNumber);
        return value.length();
    }
    public static String Fillempty (int matrix){
        String empty="";
        if (matrix> 9){
            empty=" ";
        }
        if (matrix> 99){
                empty="  ";
            }
        if (matrix> 999){
                empty="   ";
            }
        if (matrix> 9999){
            empty="    ";
        }

        return empty;
    }
    }

