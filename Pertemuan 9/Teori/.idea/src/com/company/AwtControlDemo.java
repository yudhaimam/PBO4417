package com.company;
import java.awt.*;
import java.awt.event.*;
public class AwtControlDemo {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private void PrepareGUI() {
        mainFrame = new Frame("Demo Java AWT");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showEventDemo(){
        headerLabel.setText("Contoh Kontrol pada Button");
        Button okButton = new Button("OK");
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");

        okButton.setActionCommand("ok");
        submitButton.setActionCommand("submit");
        cancelButton.setActionCommand("cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }
    public class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if(command.equals("ok")){
                statusLabel.setText("OK Button ter-klik");
            }
            else if(command.equals("submit")){
                statusLabel.setText("Submit Button ter-klik");
            }
            else if(command.equals("cancel")){
                statusLabel.setText("Cancel Button ter-klik");
            }

        }
    }
    public static void main(String[] args){
        AwtControlDemo demo = new AwtControlDemo();
        demo.PrepareGUI();
        demo.showEventDemo();
    }
}
