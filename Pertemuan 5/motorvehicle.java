package Praktikum;

public class MotorVehicle extends Vehicle {
    int sizeOfEngine = 1;
    String licencePlate = "H 1 IDN";

    MotorVehicle(){}
    
    MotorVehicle(int sizeEng, String lcPlate){
        this.sizeOfEngine = sizeEng;
        this.licencePlate = lcPlate;
    }

    public int getSizeOfEngine(){
        return this.sizeOfEngine;
    }

    public String getLicencePlate(){
        return this.licencePlate;
    }

}