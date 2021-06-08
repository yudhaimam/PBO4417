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
public class Pendaftar {

    public Integer getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getJk() {
        return jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getUsia() {
        return usia;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    private Integer id;
    private String nama;
    private String nik;
    private String jk;
    private String alamat;
    private String usia;
    private String alasan;
}
