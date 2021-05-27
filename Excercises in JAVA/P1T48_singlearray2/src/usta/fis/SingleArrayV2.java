package usta.fis;

import java.util.Scanner;

public class SingleArrayV2 {
    public static void main(String[] args) {
        int [] mySingleArray;
        int size=0;
        int i=0;
        int grade=0;
        int sumatoria=0;
        float averageResult;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the size for your Single array: ");
        size = keyboard.nextInt();
        mySingleArray = new int[size];

        System.out.println("Please type the grades that you know the average: ");

        while (i<mySingleArray.length){
            System.out.println("Please type the "+(i+1)+" grade: ");
            grade = keyboard.nextInt();
            mySingleArray[i] = grade;
            i++;
        }

        for (int j = 0; j < ; j++) {
            System.out.println(mySingleArray[j]+",");
            
        }
        
        averageResult=calculateAverage(mySingleArray);
        System.out.println("Your sum of the grades are: "+sumatory(mySingleArray));
        System.out.println("Your average grade are: "+averageResult);


    }
    public static int sumatory(int [] mySingleArray){
        int counter=0, sum=0;
        while (counter< mySingleArray.length){
            sum = sum + mySingleArray[counter];
            counter++;
        }
        return sum;
    }

    public static float calculateAverage(int [] mySingleArray) {
        int counter = 0, sum = 0;
        float average = 0;
        sum = sumatory(mySingleArray);

        average= sum/ mySingleArray.length;
        return average;
    }

}
