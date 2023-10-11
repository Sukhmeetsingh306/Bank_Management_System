package bank.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{

    JTextField amt; 
    JButton withdraw, back;
    String pinnumber;
    
    Withdrawl(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter Withdrawl Amount");
        text.setBounds(240, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system", Font.BOLD, 16));
        image.add(text);
        
        amt = new JTextField();
        amt.setFont(new Font("system", Font.BOLD, 22));
        amt.setBounds(170, 350, 320, 25);
        image.add(amt);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.setForeground(Color.BLACK);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == withdraw) {
            String amount = amt.getText();
            
            Date date = new Date();
            if(amount.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter the Amount");
            } else {
                try{
                    Conn ca = new Conn();
                   
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";

                    ca.s.executeUpdate(query);
                
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" Withdraw Successfully" );
                    
                    
                    setVisible(false);
                    new Transactions(pinnumber);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            
        }else if(ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber);
        }
    }
    
    public static void main(String[] args) {
        new Withdrawl("");
    }
}
