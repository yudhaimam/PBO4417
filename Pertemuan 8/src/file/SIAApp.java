package com;

public class SiaApp {
    public static void main(String[] args) {       
        Mahasiswa mhs1 = new Mahasiswa("DOI","A0023");
        mhs1.ambil_mk("Kalkulus");
        mhs1.ambil_mk("Agama");
        mhs1.ambil_mk("Web Lanjut");
        mhs1.get_info();

    }


}