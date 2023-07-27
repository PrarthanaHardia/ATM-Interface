/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankmanagementsystem;

import java.awt.HeadlessException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Prarthana
 */
public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField jcard;
    JPasswordField jpin;

    public Login() throws HeadlessException {
        setLayout(null);
        this.setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        this.add(l11);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 450, 40);
        add(text);

        JLabel card = new JLabel("Card No. :");
        card.setFont(new Font("Raleway", Font.BOLD, 28));
        card.setBounds(125, 150, 375, 30);
        add(card);

        jcard = new JTextField();
        jcard.setBounds(300, 150, 230, 30);
        add(jcard);

        JLabel pin = new JLabel("Pin :");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125, 220, 375, 30);
        add(pin);
        jpin = new JPasswordField();
        jpin.setBounds(300, 220, 230, 30);
        add(jpin);

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        login.addActionListener(this);
        clear = new JButton("clear");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);
        clear.addActionListener(this);
        signup = new JButton("SIGN up");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        add(signup);
        signup.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 450);
        setVisible(true);
        this.setLocation(550, 200);
    }

//    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            if (ae.getSource() == login) {

                Conn c1 = new Conn();
                String cardno = this.jcard.getText();
                String pin = this.jpin.getText();
                String q = "select * from login where cardno = '" + cardno + "' and pin = '" + pin + "'";
                ResultSet rs = c1.s.executeQuery(q);
                if (rs.next()) {
                    this.setVisible(false);
                    (new Transactions(pin)).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Incorrect Card Number or PIN");
                }
            } else if (ae.getSource() == clear) {
                jcard.setText("");
                jpin.setText("");
            } else if (ae.getSource() == signup) {

                setVisible(false);
                (new Signup()).setVisible(true);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }
    }
//    
//    

    public static void main(String[] args) {
        new Login();
    }
}
