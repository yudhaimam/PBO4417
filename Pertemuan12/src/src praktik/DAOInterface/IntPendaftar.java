/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.DAOInterface;
import java.util.List;
import Praktek.Model.Pendaftar;

/**
 *
 * @author personal
 */
public interface IntPendaftar {
    public void insert(Pendaftar p);
    public void update(Pendaftar p);
    public void delete(int id);
    public List<Pendaftar> getAll();
    public List<Pendaftar> getCariNama(String nama);
}
