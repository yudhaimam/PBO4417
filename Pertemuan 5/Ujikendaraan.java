package Praktikum;

public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.goStraight();
        v1.turnLeft();
        v1.turnLeft();

        System.out.println();
        
        Bicycle b1 = new Bicycle();
        b1.goStraight();
        b1.ringBell();
        
        System.out.println();
        
        MotorVehicle m1 = new MotorVehicle();
        m1.goStraight();
        System.out.println("Size of engine: " + m1.getSizeOfEngine());
        System.out.println("Licence plate: " + m1.getLicencePlate());
        
        System.out.println();

        MotorVehicle m2 = new MotorVehicle(10,"G 9842 MLY");
        m2.goStraight();
        System.out.println("Size of engine: " + m2.getSizeOfEngine());
        System.out.println("Licence plate: " + m2.getLicencePlate());


    }
}