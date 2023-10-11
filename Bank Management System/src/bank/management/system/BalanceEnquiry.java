package bank.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    
    BalanceEnquiry(String pinnumber) {
        this.pinnumber = pinnumber;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        Conn c = new Conn();
        int balance = 0;
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
                while(rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
            } catch (Exception e) {
                    System.out.println(e);
                }
        
        JLabel text = new JLabel("Your Balance Amount is Rs " + balance);
        text.setBounds(170, 300, 400, 35);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("system", Font.BOLD, 16));
        image.add(text);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber);
        }
    }
    
  public static void main(String[] args) {
      new BalanceEnquiry("");
  }  
}
