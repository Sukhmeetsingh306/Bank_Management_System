package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balance, exit;
    String pinnumber;
    
    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900, 900);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(225, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.setForeground(Color.BLACK);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.setForeground(Color.BLACK);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.setForeground(Color.BLACK);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.setForeground(Color.BLACK);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balance = new JButton("Balance Enquiry");
        balance.setBounds(355, 485, 150, 30);
        balance.setForeground(Color.BLACK);
        balance.addActionListener(this);
        image.add(balance);
        
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900, 900);
        setLocation(300, 0);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit) {
            System.exit(0);
            //setVisible(false);
        } else if (ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber);
        } else if (ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber);
        } else if (ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber);
        } else if (ae.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber);
        } else if (ae.getSource() == balance) {
            setVisible(false);
            new BalanceEnquiry(pinnumber);
        } else if (ae.getSource() == ministatement) {
            new MiniStatement(pinnumber);
        }
            
    }
    
    public static void main(String[] args) {
        new Transactions("");
    }
}