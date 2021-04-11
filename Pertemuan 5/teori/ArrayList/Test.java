import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ParkirMobil parkirMobil1 = new ParkirMobil("RI 1", "RI 2", "RI 3", "H 1");
        parkirMobil1.CekKendaraan();
        parkirMobil1.rubahPlat("RI 3", "RI 100");
        parkirMobil1.keluar("RI 1");
        parkirMobil1.CekKendaraan();
    }
}

class ParkirKendaraan {
    ArrayList<String> platKendaraan = new ArrayList<String>();

    ParkirKendaraan(String... plat) {
        for (String tiapPlat : plat) {
            masuk(tiapPlat);
        }
    }

    public void masuk(String plat) {
        platKendaraan.add(plat);
        System.out.println("Kendaraan ber plat " + plat + " telah masuk ke parkiran");
    }

    public void keluar(String plat) {
        platKendaraan.remove(new String(plat));
        System.out.println("Kendaraan ber plat " + plat + " telah keluar dari parkiran");
    }

    public void rubahPlat(String platLama, String platBaru) {
        for (int i = 0; i < platKendaraan.size(); i++) {
            if (platKendaraan.get(i) == platLama) {
                platKendaraan.set(i, platBaru);
                System.out.println("Plat kendaraan: " + platLama + ". Telah diubah menjadi: " + platBaru);
                break;
            }
        }
    }

    public void CekKendaraan() {
        if (platKendaraan.size() != 0) {
            System.out.print("Plat kendaraan yang masih ada di parkiran : ");
            for (int i = 0; i < platKendaraan.size(); i++) {
                System.out.print(platKendaraan.get(i) + ", ");
            }
        } else {
            System.out.println("Tidak ada kendaraan yang berada di parkiran");
        }
    }
}

class ParkirMotor extends ParkirKendaraan {
    public void masuk(String plat) {
        platKendaraan.add(plat);
        System.out.println("Motor ber plat " + plat + " telah masuk ke parkiran");
    }

    public void keluar(String plat) {
        platKendaraan.remove(new String(plat));
        System.out.println("Motor ber plat " + plat + " telah keluar dari parkiran");
    }

    public void rubahPlat(String platLama, String platBaru) {
        for (int i = 0; i < platKendaraan.size(); i++) {
            if (platKendaraan.get(i) == platLama) {
                platKendaraan.set(i, platBaru);
                System.out.println("Plat Motor: " + platLama + ". Telah diubah menjadi: " + platBaru);
                break;
            }
        }
    }
}

class ParkirMobil extends ParkirKendaraan {
    ParkirMobil(String... plat) {
        for (String tiapPlat : plat) {
            masuk(tiapPlat);
        }
    }

    public void masuk(String plat) {
        platKendaraan.add(plat);
        System.out.println("Mobil ber plat " + plat + " telah masuk ke parkiran");
    }

    public void keluar(String plat) {
        platKendaraan.remove(new String(plat));
        System.out.println("Mobil ber plat " + plat + " telah keluar dari parkiran");
    }

    public void rubahPlat(String platLama, String platBaru) {
        for (int i = 0; i < platKendaraan.size(); i++) {
            if (platKendaraan.get(i) == platLama) {
                platKendaraan.set(i, platBaru);
                System.out.println("Plat Mobil: " + platLama + ". Telah diubah menjadi: " + platBaru);
                break;
            }
        }
    }
}