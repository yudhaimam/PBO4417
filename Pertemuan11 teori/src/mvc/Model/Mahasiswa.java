/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author abdil
 */
public class Mahasiswa {

    //getter
    public Integer getId() {
        return id;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJk() {
        return jk;
    }

    public String getAlamat() {
        return alamat;
    }

    //setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    private Integer id;
    private String nim;
    private String nama;
    private String jk;
    private String alamat;
}
