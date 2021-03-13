public class MobilDemo2 {
    public static void main(String[] args) {
        Mobil2 myCar = new Mobil2();
        myCar.hidupkanMobil();
        myCar.ubahGigi(2);
        System.out.print("Mobil dalam keadaan nyala : " + myCar.active + " Gigi Mobil sekarang " + myCar.gigi);
    }
}

class Mobil2 {
    boolean active = false;
    int gigi;

    Mobil2() {

    }

    public void hidupkanMobil() {
        active = true;
    }

    public void matikanMobil() {
        active = false;
    }

    public void ubahGigi(int newGigi) {
        if (active) {
            gigi = newGigi;
        }
    }
}
