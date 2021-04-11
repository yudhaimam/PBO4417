package Transportasi;
import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.goStraight();
        mobilku.turnLeft();
        mobilku.turnRight();
        Bicycle pitku = new Bicycle();
        pitku.ringBell();
    }
}