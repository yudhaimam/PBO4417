package com;

import java.util.ArrayList;

public class Mahasiswa{
    private String nama;
    private String nim;
    private ArrayList<String> mk = new ArrayList<>();

    Mahasiswa(){}
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public void ambil_mk(String mk){
        this.mk.add(mk);
    }

    public void get_info(){
       System.out.println("Nama: " + this.nama);
       System.out.println("NIM: " + this.nim);
       for (int i = 0; i < this.mk.size(); i++) {
           System.out.println(this.mk.get(i));
       }
    }


}