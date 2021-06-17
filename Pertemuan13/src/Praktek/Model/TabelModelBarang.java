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
public class TabelModelBarang extends AbstractTableModel{
    List<Barang> list_barang;
    
    public TabelModelBarang(List<Barang> list_barang){
        this.list_barang = list_barang;
    }
    
    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public int getRowCount() {
        return list_barang.size();
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Jumlah";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return list_barang.get(row).getId();
            case 1:
                return list_barang.get(row).getNama();
            case 2:
                return list_barang.get(row).getJumlah();
            default:
                return null;
        }
    }
}
