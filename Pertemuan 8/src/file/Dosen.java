package com;

public class Dosen{
    private String nama;
    private String id;

    Dosen(String nama, String id){
        this.nama = nama;
        this.id = id;
    }

    public void get_info() {
        System.out.println("Nama Dosen: " + this.nama);
        System.out.println("ID Dosen: " + this.id);
    }

}