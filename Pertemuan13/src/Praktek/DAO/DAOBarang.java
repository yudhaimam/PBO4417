/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.DAO;

import Praktek.Koneksi.Koneksi;
import Praktek.Model.Barang;
import Praktek.DAOInterface.IBarang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author personal
 */
public class DAOBarang implements IBarang{
    Connection conn;
    
    final String insert = "INSERT INTO barang(id, nama, jumlah) VALUES (?,?,?);";
    final String update = "UPDATE barang SET nama=?, jumlah=? WHERE id=?;";
    final String delete = "DELETE FROM barang WHERE id=?;";
    final String select = "SELECT * FROM barang;";
    final String carinama = "SELECT * FROM barang WHERE nama LIKE ?;";
    
    public DAOBarang(){
        conn = Koneksi.connection();
    }

    @Override
    public void insert(barang a) {
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(insert);
            statement.setInt(1, a.getId());
            statement.setString(2, a.getNama());
            statement.setInt(3, a.getJumlah());        
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                a.setId(rs.getInt(1));
            }
        } catch(SQLException ex){
            System.out.println("Berhasil input");
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Input");
            }
        }
    }

    @Override
    public void update(barang a) {
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(update);
            statement.setString(1, a.getNama());
            statement.setInt(2, a.getJumlah());
            statement.setInt(3, a.getId());
            statement.executeUpdate();
        } catch(SQLException ex){
            System.out.println("Berhasil Update");
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Update");
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch(SQLException ex){
            System.out.println("Berhasil Delete");
        } finally{
            try{
                statement.close();
            }catch(SQLException ex){
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<Barang> getAll() {
        List<Barang> list_barang = null;
        try{
            list_barang = new ArrayList<Barang>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                barang a = new Barang();
                a.setId(rs.getInt("id"));
                a.setNama(rs.getString("nama"));
                a.setJumlah(rs.getInt("jumlah"));
                list_barang.add(b);
            }
        } catch(SQLException ex){
            Logger.getLogger(DAOBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_barang;
    }

    @Override
    public List<Barang> getCariNama(String nama) {
        List<Barang> list_barang = null;
        try{
            list_barang = new ArrayList<Barang>();
            PreparedStatement st = conn.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                barang a = new Barang();
                a.setId(rs.getInt("id"));
                a.setNama(rs.getString("nama"));
                a.setJumlah(rs.getInt("jumlah"));
                list_barang.add(b);
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DAOBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_barang;
    }
    
}
