package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame{
    
    JButton back;
    String pinnumber;
    
    MiniStatement(String pinnumber) {
        this.pinnumber = pinnumber;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setTitle("Mini Statement");

          JLabel mini = new JLabel();
          mini.setBounds(20, 140, 400, 200);
          add(mini);
          
          JLabel bank = new JLabel("Indian Bank");
          bank.setBounds(130, 20, 150, 20);
          bank.setFont(new Font("Raleway", Font.BOLD, 20));
          add(bank);
          
          JLabel card = new JLabel();
          card.setBounds(20, 80, 300, 20);
          add(card);
          
          JLabel balance = new JLabel();
          balance.setBounds(20, 400, 300, 20);
          add(balance);
          
          try{
              Conn c = new Conn();
              ResultSet rs = c.s.executeQuery("select * from login where pinnumber = '"+pinnumber+"' "); 
              while(rs.next()) {
                  card.setText("Card Number " + rs.getString("cardnumber").substring(0,4) + "xxxxxxxx" + rs.getString("cardnumber").substring(12));
              }
              
          } catch(Exception e) {
              System.out.println(e);
          }

          try{
              Conn c = new Conn();
              int bal = 0 ;
              ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"' ");
              while(rs.next()) {
                  mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                  if (rs.getString("type").equals("Deposit")){
                        bal += Integer.parseInt(rs.getString("amount"));
                    }else{
                        bal -= Integer.parseInt(rs.getString("amount"));
                    }
              }
              
              balance.setText("Your Account Balance is Rs " + bal );
              
          } catch(Exception e) {
              System.out.println(e);
          }

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocation(20, 20);
        //setUndecorated(true);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
