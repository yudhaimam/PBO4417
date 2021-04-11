package Transportasi;

public class Vehicle {
    public double speed;
    public double color;

    public Vehicle() {

    }

    public void goStraight() {
        System.out.println("Maju...");
    }

    public void turnLeft() {
        System.out.println("Belok Kiri");
    }

    public void turnRight() {
        System.out.println("Belok Kanan");
    }
}