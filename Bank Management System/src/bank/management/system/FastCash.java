package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton hundred, fivehundred, thousand, twothousand, fivethousand, tenthousand, exit;
    String pinnumber;
    
    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900, 900);
        add(image);
        
        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(225, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system", Font.BOLD, 16));
        image.add(text);
        
        hundred = new JButton("Rs 100");
        hundred.setBounds(170, 415, 150, 30);
        hundred.setForeground(Color.BLACK);
        hundred.addActionListener(this);
        image.add(hundred);
        
        fivehundred = new JButton("Rs 500");
        fivehundred.setBounds(355, 415, 150, 30);
        fivehundred.setForeground(Color.BLACK);
        fivehundred.addActionListener(this);
        image.add(fivehundred);
        
        thousand = new JButton("Rs 1,000");
        thousand.setBounds(170, 450, 150, 30);
        thousand.setForeground(Color.BLACK);
        thousand.addActionListener(this);
        image.add(thousand);
        
        twothousand= new JButton("Rs 2,000");
        twothousand.setBounds(355, 450, 150, 30);
        twothousand.setForeground(Color.BLACK);
        twothousand.addActionListener(this);
        image.add(twothousand);
        
        fivethousand = new JButton("Rs 5,000");
        fivethousand.setBounds(170, 485, 150, 30);
        fivethousand.setForeground(Color.BLACK);
        fivethousand.addActionListener(this);
        image.add(fivethousand);
        
        tenthousand = new JButton("Rs 10,000");
        tenthousand.setBounds(355, 485, 150, 30);
        tenthousand.setForeground(Color.BLACK);
        tenthousand.addActionListener(this);
        image.add(tenthousand);
        
        exit = new JButton("BACK");
        exit.setBounds(355, 520, 150, 30);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        image.add(exit);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900, 900);
        setLocation(300, 0);
        
        setUndecorated(true);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         if  (ae.getSource()== exit){
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);

         }else {
            String amount =((JButton)ae.getSource()).getText().substring(3);
            Conn c= new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
                int balance =0;
                while(rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','WithDrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs"+amount+"Debited Successfully");

                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
         }
             
         
     }

    
//    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource() == exit) {
//            setVisible(false);
//            new Transactions(pinnumber).setVisible(true);
//        } else {
//            String amount =((JButton)ae.getSource()).getText().substring(3); // substring is use to cut the letter from the text when they are not in the need as per making the text to reduce its length
//            
//            Conn c = new Conn();
//            try{
//                ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
//                int balance = 0;
//                while(rs.next()) {
//                    if (rs.getString("type").equals("Deposit")) {
//                        balance += Integer.parseInt(rs.getString("amount"));
//                    } else {
//                        balance -= Integer.parseInt(rs.getString("amount"));
//                    }
//                }
//                
//                
//                if(ae.getSource() != exit && balance < Integer.parseInt(amount)) {
//                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
//                    return;
//                }   
//                
//                
//                Date date = new Date();
//                
//                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
//                
//                c.s.executeUpdate(query);
//                
//                JOptionPane.showMessageDialog(null, "Rs" +amount+ "Debited Successfully");
//                
//                setVisible(false);
//                new Transactions(pinnumber).setVisible(true);
//                
//            } catch(Exception e) {
//                System.out.println(e);
//            }
//        }
//            
//    }
    
    public static void main(String[] args) {
        new FastCash("");
    }
}

