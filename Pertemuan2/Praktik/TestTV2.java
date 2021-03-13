public class TestTV2 {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());
    }
}

class TV {
    int channel = 7;
    int volumeLevel = 1;
    Boolean on = false;

    TV() {

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on == true) {
            if (newChannel <= 120 && newChannel >= 1) {
                channel = newChannel;
            } else {
                System.out.println("Maaf channel tidak di temukan");
            }
        }

    }

    public void setVolume(int newVolumeLevel) {
        if (on == true) {
            if (newVolumeLevel <= 7 && newVolumeLevel >= 0) {
                volumeLevel = newVolumeLevel;
            } else {
                System.out.println("maaf inputan tidak valid untuk volume level, mohon mengisi di antara 1-7");
            }
        }

    }

    public void channelUp() {
        if (channel == 120) {
            channel = 1;
        } else {
            channel++;
        }
    }

    public void channelDown() {
        if (on == true) {
            if (channel == 1) {
                channel = 120;
            } else {
                channel--;
            }
        }
    }

    public void volumeUp() {
        if (on == true) {
            if (volumeLevel == 7) {
                System.out.println("volume ada pada level maximum");
            } else {
                volumeLevel++;
            }
        }
    }

    public void volumeDown() {
        if (on == true) {
            if (volumeLevel == 0) {
                System.out.println("volume ada pada level minimum");
            } else {
                volumeLevel--;
            }
        }
    }

}

class Manusia {
    String nama = "noname";
    boolean punyaTV = false;

    Manusia() {

    }

    Manusia(String nama) {
        this.nama = nama;
    }

    String namaSaya() {
        return nama;
    }

    void beliTV(TV newTv) {
        punyaTV = true;
    }

    void jualSemuaTV() {
        punyaTV = false;
    }

    boolean cekTV() {
        return punyaTV;
    }
}