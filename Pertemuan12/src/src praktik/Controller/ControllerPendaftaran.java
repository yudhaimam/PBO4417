/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.Controller;

import Praktek.DAO.DAOPendaftar;
import Praktek.DAOInterface.IntPendaftar;
import Praktek.Model.Pendaftar;
import Praktek.Model.TabelModelPendaftar;
import Praktek.View.FormPendaftaran;
import Praktek.View.Admin;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author personal
 */
public class ControllerPendaftaran {
    FormPendaftaran frameP;
    Admin frameA;
    IntPendaftar ImplPendaftar;
    List<Pendaftar> lb;
    
    public ControllerPendaftaran(FormPendaftaran frameP){
        this.frameP = frameP;
        ImplPendaftar = new DAOPendaftar();
    }
    
    public ControllerPendaftaran(Admin frameA){
        this.frameA = frameA;
        ImplPendaftar = new DAOPendaftar();
        lb = ImplPendaftar.getAll();
    }
    
    public void reset(){
        frameP.getTxtID().setText("");
        frameP.getTxtNama().setText("");
        frameP.getTxtNIK().setText("");
        frameP.getTxtJk().setSelectedItem("");
        frameP.getTxtAlamat().setText("");
        frameP.getTxtUsia().setText("");
        frameP.getTxtAlasan().setText("");
    }
    
    public void isiTable(){
        lb = ImplPendaftar.getAll();
        TabelModelPendaftar tmb = new TabelModelPendaftar(lb);
        frameA.getTableData().setModel(tmb);
    }
    
    public void isiField(int row){
        frameP.getTxtID().setText(lb.get(row).getId().toString());
        frameP.getTxtNama().setText(lb.get(row).getNama());
        frameP.getTxtNIK().setText(lb.get(row).getNik());
        frameP.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frameP.getTxtAlamat().setText(lb.get(row).getAlamat());
        frameP.getTxtUsia().setText(lb.get(row).getUsia());
        frameP.getTxtAlasan().setText(lb.get(row).getAlasan());
    }
    
    public void insert(){
        if(!frameP.getTxtNama().getText().trim().isEmpty() & !frameP.getTxtNIK().getText().trim().isEmpty()){
            Pendaftar p = new Pendaftar();
            p.setId(Integer.parseInt(frameP.getTxtID().getText()));
            p.setNama(frameP.getTxtNama().getText());
            p.setNik(frameP.getTxtNIK().getText());
            p.setJk(frameP.getTxtJk().getSelectedItem().toString());
            p.setAlamat(frameP.getTxtAlamat().getText());
            p.setUsia(frameP.getTxtUsia().getText());
            p.setAlasan(frameP.getTxtAlasan().getText());
            ImplPendaftar.insert(p);
            JOptionPane.showMessageDialog(null, "Anda Telah Terdaftar");
        } else{
            JOptionPane.showMessageDialog(frameP, "Data Tidak Boleh Kosong");
        }
    }
    
    public void update(){
        
    }
    
    public void delete(){
        if(!frameA.getTxtID().getText().trim().isEmpty()){
            int id = Integer.parseInt(frameA.getTxtID().getText());
            ImplPendaftar.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else{
            JOptionPane.showMessageDialog(frameA, "Masukkan ID untuk menghapus");
        }
    }
    
    public void isiTableCariNama(){
        lb = ImplPendaftar.getCariNama(frameA.getTxtCariNama().getText());
        TabelModelPendaftar tmb = new TabelModelPendaftar(lb);
        frameA.getTableData().setModel(tmb);
    }
    
    public void cariNama(){
        if(!frameA.getTxtCariNama().getText().trim().isEmpty()){
            ImplPendaftar.getCariNama(frameA.getTxtCariNama().getText());
            isiTableCariNama();
        } else{
            JOptionPane.showMessageDialog(frameA, "Silakan Masukkan Nama Terlebih Dahulu");
        }
    }
    
    
    
}
