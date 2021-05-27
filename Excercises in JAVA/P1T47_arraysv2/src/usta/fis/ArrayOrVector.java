package usta.fis;

import java.util.Scanner;

public class ArrayOrVector {
    public static void main(String[] args) {
        int value=0;
        int count =0;
        int []arrayV1 = new int[5];
        Scanner keyboard=new Scanner(System.in);

        System.out.println("please type 5 values to the array:");

        for (int i = 0; i < arrayV1.length; i++) {
            System.out.println("please type value "+(i+1));
            int number =  keyboard.nextInt();
            if(number % 2 != 0){
                arrayV1[i]= number;
            }else{
                System.out.println("The number " + number + " is not pair");
                i--;
            }

        }
        for (int i = 0; i < arrayV1.length; i++) {
            System.out.println("The value "+arrayV1[i]);
        }
        }
    }


