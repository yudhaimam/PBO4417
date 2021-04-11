package Transportasi;


public class UjiKendaraan {
    public static void main(String[] args) {
        Car mobilku = new Car();
        KendaraanMelaju(mobilku);
    }
    public static <T extends Vehicle> void KendaraanMelaju(T Kendaraan){
        Kendaraan.goStraight();
    }
}