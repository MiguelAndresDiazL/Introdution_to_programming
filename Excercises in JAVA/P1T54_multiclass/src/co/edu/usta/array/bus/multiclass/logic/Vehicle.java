package co.edu.usta.array.bus.multiclass.logic;

public class Vehicle {
    private String serviceType;
    private String Color;
    private String Brand;
    private float width;
    private float height;
    private char[][] places;
    private int doorNumber;
    private int wheelsNumbers;
    //setter and getter methods
    //set -->poner, Establecer o colocar
    //get --> obtener

    public void setServiceType(String serviceTypeValue) {
        serviceType = serviceTypeValue;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setColorType(String colorTypeValue) {
        Color = colorTypeValue;
    }

    public String getColorType() {
        return Color;
    }

    public void setBrandType(String BrandTypeValue) {
        Brand = BrandTypeValue;
    }

    public String getBrandType() {
        return Brand;
    }
    public void setWidthType(Float WidthTypeValue){
        width= WidthTypeValue;
    }
    public float getWidth() {
        return width;
    }
    public void setheightType(Float heightTypeValue){
        height= heightTypeValue;
    }
    public float getheight() {
        return height;
    }
    public void setPlacesType(char[][] placesTypeValue){
        places= placesTypeValue;
    }
    public char[][] getPlaces() {
        return places;
    }

    public void setDoorNumber(int doorNumberValue) {
        doorNumber = doorNumberValue;
    }
    public int getDoorNumber() {
        return doorNumber;
    }
    public void setwheelsNumber(int wheelsNumberValue) {
        wheelsNumbers = wheelsNumberValue;
    }
    public int getWheelsNumbers() {
        return wheelsNumbers;
    }

    public void createPlacesArray(String rows){
         int rowsInt=Integer.parseInt(rows);
         places=new char[rowsInt][4];
    }
    public void initPlacesArray(){
        boolean letters=true;
        //this instruction is do it for rows
        for (int i = 0; i < places.length; i++) {
            //this instruction is do it columns
            for (int j = 0; j <places[0].length ; j++) {
                if (letters==true){
                    places[i][j]='D';
                }else{
                    places[i][j]='X';
                }
            }
            if (letters==true){
                letters=false;
            }else{
                letters=true;
            }
        }
    }
    public String arrayToShow(){
        String returnString="";
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                returnString=returnString+places[i][j]+" ";
            }
            returnString=returnString+"\n";
        }
        return returnString;
    }
    public String fillPlace(String row, String column){
        int rowInt=Integer.parseInt(row);
        int columnInt=Integer.parseInt(column);

        places[rowInt][columnInt]="O";
        if(places[rowInt][columnInt]=="X"&&places[rowInt][columnInt]=="O"){
           return "The places is unavailable";
        }else{
            places[rowInt][columnInt]="O";
            return "The places is successfully fill";
        }
    }
    public String StatusOfBusPlaces(){
        int filledplaces=0, EmptyPlaces=0;
        //TODO: create a code to count the empty and filled places

        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j <places[0].length ; j++) {
                if(places[i][j]=="D"){
                    EmptyPlaces++;
                }else{
                    if (places[i][j]=="O"){
                        filledplaces++;
                    }
                }
            }
        }

        return "The amount of filed places is"+filledplaces+", the amount of empty places is "+EmptyPlaces;
    }
}


