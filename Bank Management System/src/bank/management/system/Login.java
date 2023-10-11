package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField card;
    JPasswordField pin;
    JButton sign, tclear, signup;
    String pinnumber;
    
    Login(String pinnumber) {
       this.pinnumber = pinnumber;
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       setTitle("AUTOMATION TELLER MACHINE");
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(70, 10, 100, 100);
       add(image);
       
       JLabel ttitle = new JLabel("Welcome to ATM");
       ttitle.setBounds(200, 50, 400, 40);
       ttitle.setFont(new Font("Osward", Font.BOLD, 38));
       add(ttitle);
        
       JLabel lcard = new JLabel("Card NO: ");
       lcard.setBounds(120, 110, 150, 40);
       lcard.setFont(new Font("Raleway", Font.BOLD, 28));
       add(lcard);
       
       card = new JTextField();
       card.setBounds(260, 118, 250, 30);
       card.setFont(new Font("Arial", Font.PLAIN, 15));
       card.addActionListener(this);
       add(card);
       
       JLabel lpin = new JLabel("PIN:");
       lpin.setBounds(120, 160, 150, 40);
       lpin.setFont(new Font("Raleway", Font.BOLD, 28));
       add(lpin);
       
       pin = new JPasswordField();
       pin.setBounds(260, 168, 250, 30);
       pin.setFont(new Font("Raleway", Font.PLAIN, 15));
       pin.addActionListener(this);
       add(pin);
       
       sign = new JButton("SIGN IN ");
       sign.setBounds(280, 230, 100, 30);
       sign.setFont(new Font("Raleway", Font.PLAIN,14));
       sign.setBackground(Color.WHITE);
       sign.setForeground(Color.BLACK);
       sign.addActionListener(this);
       add(sign);
       
       tclear = new JButton("CLEAR");
       tclear.setBounds(390, 230, 100, 30);
       tclear.setFont(new Font("Raleway", Font.PLAIN,14));
       tclear.setBackground(Color.WHITE);
       tclear.setForeground(Color.BLACK);
       tclear.addActionListener(this);
       add(tclear);
       
       signup = new JButton("SIGN UP ");
       signup.setBounds(280, 270, 210, 30);
       signup.setFont(new Font("Raleway", Font.PLAIN,14));
       signup.setBackground(Color.WHITE);
       signup.setForeground(Color.BLACK);
       signup.addActionListener(this);
       add(signup);

       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setSize(800, 400);
       setVisible(true);
       setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == tclear) {
            card.setText("");
            pin.setText("");
        } else if(ae.getSource() == sign) {
            
            Conn ca = new Conn();
            
            String cardnumber = card.getText();
            pinnumber = pin.getText();
            
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";

            try{
                ResultSet rs = ca.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please Check Your Details");
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
            
            
        } else if(ae.getSource() == signup){
            setVisible(false);
            new SignUpOne();
        }
    }
    
   public static void main(String[] args) {
           new Login("");
   }
}