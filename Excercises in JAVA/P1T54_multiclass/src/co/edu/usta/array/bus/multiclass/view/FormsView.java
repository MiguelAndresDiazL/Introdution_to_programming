package co.edu.usta.array.bus.multiclass.view;

import co.edu.usta.array.bus.multiclass.logic.Vehicle;
import jdk.jshell.Snippet;

import javax.swing.*;

public class FormsView {
    private static Vehicle myVehicle, myColor, myBrand, myWidth,myHeight,myChar,mydoor,mywheels;
    //create a program that do it manage the bus places with difference x for unavailable, D available, 0 for buy.
    //the bus have 4  columns but the number of rows must be specified by the driver
    public static void main(String[] args) {
        myVehicle= new Vehicle();
        myColor=new Vehicle();
        myBrand=new Vehicle();
        myWidth=new Vehicle();
        myHeight=new Vehicle();
        myChar=new Vehicle();
        mydoor=new Vehicle();
        mywheels=new Vehicle();
        String value, showInfo, colorvalue,showColor,Brandvalue, showBrand, value2,row,column;
        Float WidthValue, ShowWidth, heightvalue, Showheight ;
        char placesValue,showplaces;
        int doorValue,showDoor,wheelsValue,showWheels, valueConfirmDialog;
        //read the value
        value=JOptionPane.showInputDialog("Please type the kind of service of your vehicle");
        //set the value in the ServiceType  variable
        myVehicle.setServiceType(value);
        //get the ServiceType value stored in the variable
        showInfo=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null, "your kind service for this vehicle is "+showInfo);


        colorvalue=JOptionPane.showInputDialog("Please type the color of your vehicle");
        myColor.setColorType(colorvalue);
        showColor=myColor.getColorType();

        Brandvalue=JOptionPane.showInputDialog("Please type the Brand of your vehicle");
        myBrand.setBrandType(Brandvalue);
        showBrand=myBrand.getBrandType();
        JOptionPane.showMessageDialog(null, "The color of your vehicle is "+showColor);


        //WidthValue=JOptionPane.showInputDialog("Please type the Width of your vehicle");
        //myWidth.setWidthType(WidthValue);
        //ShowWidth=myWidth.getWidth();
        JOptionPane.showMessageDialog(null, "The width of your vehicle is "+showBrand);


        //heightvalue=JOptionPane.showInputDialog("Please type the height of your vehicle");
        //myHeight.setBrandType(heightvalue);
        //Showheight= myWidth.getWidth();
        //JOptionPane.showMessageDialog(null, "The height of your vehicle is "+Showheight);

         //1
        value=JOptionPane.showInputDialog("Please type the rows:");
        //1.1
                myVehicle.createPlacesArray(value);
                //2
                myVehicle.initPlacesArray();
                do {
                    //3
                    showInfo = myVehicle.arrayToShow();
                    //3.1
                    JOptionPane.showMessageDialog(null, showInfo);
                    //4 request row
                    row = JOptionPane.showInputDialog("Please type the row to fill: ");
                    //4 request column
                    column = JOptionPane.showInputDialog("Please type the column to fill: ");
                    //5
                    showInfo = myVehicle.fillPlace(row, column);
                    JOptionPane.showMessageDialog(null, showInfo);
                    //6
                    valueConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you want include another passenger(YES)?, \n" +
                            " or leave away a but (NO) ");
                }while(valueConfirmDialog==JOptionPane.YES_OPTION);
                showInfo= myVehicle.StatusOfBusPlaces();
                JOptionPane.showMessageDialog(null,showInfo);



        JOptionPane.showMessageDialog(null, "The places of your vehicle is "+showInfo);


        //doorValue=JOptionPane.showInputDialog("Please type the doors of your vehicle");
        //mydoor.setBrandType(doorValue);
        //showplaces=mydoor.getDoorNumber();
        //JOptionPane.showMessageDialog(null, "The doorNumber of your vehicle is "+showDoor);


        //wheelsValue=JOptionPane.showInputDialog("Please type the wheels of your vehicle");
        //mywheels.setBrandType(wheelsValue);
        //showWheels=mywheels.getWheelsNumbers();
       // JOptionPane.showMessageDialog(null, "The wheelsNumbers of your vehicle is "+showWheels);


    }
}
