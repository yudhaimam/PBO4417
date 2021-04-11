package Transportasi;

public class MotorCycle extends MotorVehicle {
    private int numGear;

    public MotorCycle(){

    }
    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }
    public int getGearFoot(){
        return this.numGear;
    }
}