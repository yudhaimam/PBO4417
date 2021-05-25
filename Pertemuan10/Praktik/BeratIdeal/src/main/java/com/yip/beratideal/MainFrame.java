package com.yip.beratideal;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
/**
 *
 * @author ASUS
 */
public class MainFrame extends Frame implements ActionListener{
    Label xNim, xNama, xBerat, xTinggi, xResult;
    TextField xyNim, xyNama, xyBerat, xyTinggi;
    Button hitung;
    MainFrame(){
        Frame frame = new Frame();
        xNim = new Label("NIM");
        xNama = new Label("NAMA");
        xBerat = new Label("BERAT");
        xTinggi = new Label("TINGGI");
        xResult = new Label("HASIL");
        xyNim = new TextField();
        xyNama = new TextField();
        xyBerat = new TextField();
        xyTinggi = new TextField();
        hitung = new Button("HITUNG");
        xNim.setBounds(50, 75, 70, 20);
        xNama.setBounds(50, 115, 70, 20);
        xBerat.setBounds(50, 155, 70, 20);
        xTinggi.setBounds(50, 195, 70, 20);
        xyNim.setBounds(130, 75, 180, 20);
        xyNama.setBounds(130, 115, 180, 20);
        xyBerat.setBounds(130, 155, 180, 20);
        xyTinggi.setBounds(130, 195, 180, 20);
        hitung.setBounds(50, 235, 70, 30);
        xResult.setBounds(50, 325, 500, 20);
        hitung.addActionListener(this);
        frame.add(xNim);frame.add(xNim);frame.add(xNama);frame.add(xBerat);frame.add(xTinggi);
        frame.add(xResult);frame.add(xyNim);frame.add(xyNama);frame.add(xyBerat);frame.add(xyTinggi);
        frame.add(hitung);
        frame.setLayout(null);
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String zNim = xyNim.getText();
        String zNama = xyNama.getText();
        double zBerat = Double.parseDouble(xyBerat.getText());
        double zTinggi = Double.parseDouble(xyTinggi.getText())/100;
        double hasil = 0;
        if(e.getSource()== hitung){
            hasil = vBerat/Math.pow(vTinggi,2);
            System.out.println(hasil);
            if(hasil >= 18.5 && hasil <= 24.9){
                xResult.setText(zNim + ", " +zNama+",  Berat Ideal");
            }else{
                xResult.setText(zNim + ", " +zNama+", Berat Belum Ideal");
            }
        }
    }
    public static void main(String[] args) {
        new MainFrame();
    }
}
