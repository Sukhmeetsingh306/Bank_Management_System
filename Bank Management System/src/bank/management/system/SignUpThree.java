package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{
    
    JRadioButton savacc , fixacc, curacc, recacc;
    JCheckBox atmca, intban, mobban, emal, cheb, estate, iher;
    JButton submit, cancel;
    String formno;
    String pinnumber, cardnumber;
    
    SignUpThree(String formno) {
        
        this.formno = formno;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
            
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
            
        JLabel personal = new JLabel("Page 3: Account Details");
        personal.setFont(new Font("Raleway", Font.BOLD, 25));
        personal.setBounds(240, 60, 400, 30);
        add(personal);
            
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(100, 140, 200, 30);
        add(type);
            
        savacc = new JRadioButton("Saving Account");
        savacc.setFont(new Font("Arial", Font.PLAIN, 16));
        savacc.setBounds(100, 180, 160, 20);
        savacc.setBackground(Color.WHITE);
        savacc.setForeground(Color.BLACK);
        add(savacc);
        
        fixacc = new JRadioButton("Fixed Deposit Account");
        fixacc.setFont(new Font("Arial", Font.PLAIN, 16));
        fixacc.setBounds(350, 180, 250, 20);
        fixacc.setBackground(Color.WHITE);
        fixacc.setForeground(Color.BLACK);
        add(fixacc);
        
        curacc = new JRadioButton("Current Account");
        curacc.setFont(new Font("Arial", Font.PLAIN, 16));
        curacc.setBounds(100, 220, 200, 20);
        curacc.setBackground(Color.WHITE);
        curacc.setForeground(Color.BLACK);
        add(curacc);
        
        recacc = new JRadioButton("Recurring Deposit Account");
        recacc.setFont(new Font("Arial", Font.PLAIN, 16));
        recacc.setBounds(350, 220, 300, 20);
        recacc.setBackground(Color.WHITE);
        recacc.setForeground(Color.BLACK);
        add(recacc);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(savacc);
        bg.add(fixacc);
        bg.add(curacc);
        bg.add(recacc);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 20));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel carddetail = new JLabel("Your 16-Digit Card Number:");
        carddetail.setFont(new Font("Raleway", Font.PLAIN, 12));
        carddetail.setBounds(100, 325, 200, 20);
        add(carddetail);
        
        JLabel numb = new JLabel("XXXX-XXXX-XXXX-5678");
        numb.setFont(new Font("Raleway", Font.BOLD, 20));
        numb.setBounds(300, 300, 250, 30);
        add(numb);
        
        JLabel pinn = new JLabel("PIN:");
        pinn.setFont(new Font("Raleway", Font.BOLD, 20));
        pinn.setBounds(100, 360, 200, 30);
        add(pinn);
        
        JLabel pinndetail = new JLabel("Your 4-Digit PIN Number:");
        pinndetail.setFont(new Font("Raleway", Font.PLAIN, 12));
        pinndetail.setBounds(100, 385, 200, 20);
        add(pinndetail);
        
        JLabel pinnu = new JLabel("XXXX");
        pinnu.setFont(new Font("Raleway", Font.BOLD, 20));
        pinnu.setBounds(300, 360, 200, 30);
        add(pinnu);
        
        JLabel serv = new JLabel("Services Required:");
        serv.setFont(new Font("Raleway", Font.BOLD, 20));
        serv.setBounds(100, 440, 200, 30);
        add(serv);
        
        atmca = new JCheckBox("ATM CARD");
        atmca.setBackground(Color.WHITE);
        atmca.setForeground(Color.BLACK);;
        atmca.setFont(new Font("Arial", Font.PLAIN, 16));
        atmca.setBounds(100, 490, 120, 30);
        add(atmca);
        
        intban = new JCheckBox("Internet Banking");
        intban.setBackground(Color.WHITE);
        intban.setForeground(Color.BLACK);;
        intban.setFont(new Font("Arial", Font.PLAIN, 16));
        intban.setBounds(320, 490, 200, 30);
        add(intban);
        
        mobban = new JCheckBox("Mobile Banking");
        mobban.setBackground(Color.WHITE);
        mobban.setForeground(Color.BLACK);;
        mobban.setFont(new Font("Arial", Font.PLAIN, 16));
        mobban.setBounds(100, 540, 200, 30);
        add(mobban);
        
        emal = new JCheckBox("EMAIL & SMS Alerts");
        emal.setBackground(Color.WHITE);
        emal.setForeground(Color.BLACK);;
        emal.setFont(new Font("Arial", Font.PLAIN, 16));
        emal.setBounds(320, 540, 250, 30);
        add(emal);
        
        cheb = new JCheckBox("Cheque Book");
        cheb.setBackground(Color.WHITE);
        cheb.setForeground(Color.BLACK);;
        cheb.setFont(new Font("Arial", Font.PLAIN, 16));
        cheb.setBounds(100, 590, 200, 30);
        add(cheb);
        
        estate = new JCheckBox("E-Statement");
        estate.setBackground(Color.WHITE);
        estate.setForeground(Color.BLACK);;
        estate.setFont(new Font("Arial", Font.PLAIN, 16));
        estate.setBounds(320, 590, 200, 30);
        add(estate);
        
        iher = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        iher.setBackground(Color.WHITE);
        iher.setForeground(Color.BLACK);;
        iher.setFont(new Font("Arial", Font.BOLD, 12));
        iher.setBounds(100, 660, 550, 20);
        add(iher);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 16));
        submit.setBounds(200, 700, 100, 30);
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);;
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 16));
        cancel.setBounds(370, 700, 100, 30);
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);;
        cancel.addActionListener(this);
        add(cancel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
            
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        
        if(ae.getSource() == submit) {
            String accountType = null;
            if(savacc.isSelected()) {
                accountType = "Saving Account"; 
            } else if (fixacc.isSelected()) {
                accountType = "Fixed Account";
            } else if (curacc.isSelected()) {
                accountType = "Current Account";
            } else if(recacc.isSelected()) {
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            cardnumber ="" + Math.abs((random.nextLong() % 90000000L) + 7834091300000000L);
            
            pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            
            String facility = "";
            if(atmca.isSelected()) {
                facility = facility + "ATM CARD";
            } else if (intban.isSelected()) {
                facility = facility + "Internet Banking";
            } else if (mobban.isSelected()) {
                facility = facility + "Mobile Banking";
            } else if (emal.isSelected()) {
                facility = facility + "EMAIL & SMS Alerts";
            } else if (cheb.isSelected()) {
                facility = facility + "Cheque Book";
            } else if (estate.isSelected()) {
                facility = facility + "E-Statement";
            }
            
            /*if(accountType.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Details");
                return;
            }*/
            
            if(facility.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Details");
                return;
            }
            
            try{
                Conn cb = new Conn();
                
                String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                String query2 = "insert into login values('"+formno+"',  '"+cardnumber+"', '"+pinnumber+"')";
                 
                cb.s.executeUpdate(query1);
                cb.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber );
                
                setVisible(false);
                new Login(pinnumber);
                
            } catch(Exception e) {
                System.out.println(e);
            }
            
        } else if(ae.getSource() == cancel){
            setVisible(false);
            new Login(pinnumber);  
        }
    }
    
    public static void main(String[] args) {
        new SignUpThree("");
    }
}
