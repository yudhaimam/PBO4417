package com.yip.awttutorial;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ASUS
 */
public class SimpleCalculator extends Frame implements ActionListener {
    TextField t1,t2,t3;
    Button b1,b2;
    SimpleCalculator(){
        Frame f = new Frame();
        t1= new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b1 = new Button("+");
        b2 = new Button("-");
        t1.setBounds(50, 75, 200, 25);
        t2.setBounds(50, 125, 200, 25);
        t3.setBounds(50, 175, 200, 25);
        b1.setBounds(50, 225, 50, 50);
        b2.setBounds(125, 225, 50, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(t1);f.add(t2);f.add(t3);f.add(b1);f.add(b2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
    }
    public void actionPerformed(ActionEvent e){
        String text1 = t1.getText();
        String text2 = t2.getText();
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);
        int c = 0;
        if(e.getSource()==b1){
            c = a + b;
        }else if(e.getSource()==b2){
            c = a - b;
        }
        String result = String.valueOf(c);
        t3.setText(result);
        dispose();
    }
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}