package co.edu.usta.tunja.capicua;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String cadena="",resultString="";
        int counter=0;
        int extremos=0;
        System.out.println("This program show info about of capicua letters or numbers with limit 10 chars,° or numbers ENTER to end");
        cadena = keyboard.next();
        resultString=capicuaAnswer(cadena);
        System.out.println("The analysis result of the string is "+resultString);
        System.out.println(extremos);
    }
    public static String capicuaAnswer(String cadena){
        if(capicuaMethod(cadena)==true){
            return "IS capicua";
        }
        return "NOT IS capicua";

    }

    public static boolean capicuaMethod(String cadena){
        int extremo;
        char []charArray;
        charArray=new char[cadena.length()];
        charArray=cadena.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]!=charArray[charArray.length-(i+1)]){
                extremo=i;
                return false;
            }
        }
        return true;
    }
}

