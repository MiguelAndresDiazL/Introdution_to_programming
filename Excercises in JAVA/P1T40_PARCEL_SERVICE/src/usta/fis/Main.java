package usta.fis;

/*AUTHOR    : Miguel Andres Diaz Lache
 DATE       : 25 March of 2021
 DESCRIPTION: this software calculate the calculate the cost of parcel service in some countrys
 */
import java.util.Scanner;
public class Main {
    public static final double NORTHAMERICAWEIGHT = 1100;
    public static final double CENTRALAMERICAWEIGHT = 1000;
    public static final double SOUTHAMERICAWEIGHT = 1200;
    public static final double EUROPEWEIGHT = 2400;
    public static final double ASIAWEIGHT = 2700;

    public static final int NORTHAMERICA = 1;
    public static final int CENTRALAMERICA = 2;
    public static final int SOUTHAMERICA = 3;
    public static final int EUROPE = 4;
    public static final int ASIA = 5;

    public static void main(String[] args) {

        p_show_info_program();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the country of destination(1-5)");
        int v_country = keyboard.nextInt();
        if(validate_country(v_country)){
            System.out.println("input the weight of service");
            double v_weight = keyboard.nextDouble();

            double v_total_cost = calculate_weight(v_country,v_weight);

            System.out.println("the total cost of the packages is $"+v_total_cost+" for " + get_name_country(v_country));
        }else{
            System.err.println("Country not valid");
        }


    }
    public static void p_show_info_program() {

        //DESCRIPTION:this method show info program (software)
        System.out.println("-------------------------------");
        System.out.println("!     country-parcel    V1.0  !");
        System.out.println("! Maker:Miguel Andres Diaz    !");
        System.out.println("! Date: 2021-march-25         !");
        System.out.println("-------------------------------");
    }

    public static boolean validate_country(int v_country){
        return v_country == NORTHAMERICA || v_country == CENTRALAMERICA || v_country == SOUTHAMERICA || v_country == EUROPE || v_country == ASIA;
    }

    public static String get_name_country(int v_country){

        switch (v_country){
            case NORTHAMERICA:
                return "North America";
            case CENTRALAMERICA:
                return "Central America";
            case SOUTHAMERICA:
                return "South America";
            case EUROPE:
                return "Europe";
            case ASIA:
                return "Asia";
        }
        return "";
    }
    public static double calculate_weight(int v_country, double v_weight) {
        //DESCRIPTION: this method return the cost of the country of the packages

        switch (v_country){
            case NORTHAMERICA:
                return NORTHAMERICAWEIGHT * v_weight;
            case CENTRALAMERICA:
                return CENTRALAMERICAWEIGHT * v_weight;
            case SOUTHAMERICA:
                return SOUTHAMERICAWEIGHT * v_weight;
            case EUROPE:
                return EUROPEWEIGHT * v_weight;
            case ASIA:
                return ASIAWEIGHT * v_weight;
        }
        return 0;
    }


    } //comando final ojo

