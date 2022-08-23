package com.sunglowsys.juiform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUi extends JFrame{
    private JPanel main;
    private JTextField textName;
    private JTextField textAddress;
    private JButton okButton;
    private JTextField textForm;
    private JTextField textEmail;
    private JTextField textPassword;

    public MainUi() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = textName.getText();
                String address = textAddress.getText();
                String form = textForm.getText();
                String email = textEmail.getText();
                String password = textPassword.getText();


                if (name.trim().length()==0){
                    JOptionPane.showConfirmDialog(rootPane,"Name is can not be empty");
                }else if (address.trim().length()==0){
                    JOptionPane.showConfirmDialog(rootPane,"Address can not be empty");

                }else if (form.trim().length()==0){
                    JOptionPane.showConfirmDialog(rootPane,"form can not be empty");
                }else if (email.trim().length()==0){
                    JOptionPane.showConfirmDialog(rootPane,"email can not be empty");
                }else if (password.trim().length()==0){
                    JOptionPane.showConfirmDialog(rootPane,"password can not be empty");
                }else {
                    JOptionPane.showConfirmDialog(rootPane,"valid.....");
                }

            }
        });
    }

    public static void main(String[] args) {
        MainUi m = new MainUi();
        m.setContentPane(new MainUi().main);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        m.pack();
    }
}
