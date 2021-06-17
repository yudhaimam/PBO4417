/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.Model;

/**
 *
 * @author personal
 */
public class Barang {

    public Integer getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
    private Integer id;
    private String nama;
    private Integer jumlah;
}
