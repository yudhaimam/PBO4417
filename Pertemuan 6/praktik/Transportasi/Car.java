package Transportasi;

public class Car extends MotorVehicle{
    private boolean seatbelt = false;

    public Car(){

    }
    public void setSeatBelt(int seatbelt){
        if(seatbelt == 1){
            this.seatbelt=true;
        }
        else if(seatbelt == 0){
            this.seatbelt = false;
        }
    }
    public boolean getSeatBelt(){
        return this.seatbelt;
    }
}