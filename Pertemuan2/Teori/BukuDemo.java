public class BukuDemo {
    public static void main(String[] args) {
        Buku OOPJava = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        Buku DasarPemrogramanJava = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);

        OOPJava.cetakBuku();
        DasarPemrogramanJava.cetakBuku();
    }
}

class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;

    Buku() {

    }

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public void cetakBuku() {
        System.out.println(this.judul + ", " + this.pengarang + ", " + this.penerbit + ", " + this.tahun);
    }
}