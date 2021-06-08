/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author personal
 */
public class TabelModelPendaftar extends AbstractTableModel{
    List<Pendaftar> lb;
    
    public TabelModelPendaftar(List<Pendaftar> lb){
        this.lb = lb;
    }
    
    @Override
    public int getRowCount() {
        return lb.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "NIK";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Usia";
            case 6:
                return "Alasan";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lb.get(row).getId();
            case 1:
                return lb.get(row).getNama();
            case 2:
                return lb.get(row).getNik();
            case 3:
                return lb.get(row).getJk();
            case 4:
                return lb.get(row).getAlamat();
            case 5:
                return lb.get(row).getUsia();
            case 6:
                return lb.get(row).getAlasan();
            default:
                return null;
        }
    }
    
}
