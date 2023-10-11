package bank.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PinChange extends JFrame implements ActionListener{
    
    String pinnumber;
    JTextField pin, repin;
    JButton change, back;
    
    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        getContentPane().setBackground(Color.WHITE);
        setLayout (null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900, 900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(250, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system", Font.BOLD, 16));
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN");
        pintext.setBounds(165,350, 180,25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("system", Font.BOLD, 16));
        image.add(pintext);
        
        pin = new JTextField();
        pin.setBounds(330, 350, 180, 25);
        pin.setForeground(Color.BLACK);
        pin.setFont(new Font("Railway", Font.BOLD, 16));
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN");
        repintext.setBounds(165, 390, 180, 25);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("system", Font.BOLD, 16));
        image.add(repintext);
        
        repin = new JTextField();
        repin.setBounds(330, 390, 180, 25);
        repin.setForeground(Color.BLACK);
        repin.setFont(new Font("Railway", Font.BOLD, 16));
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.setForeground(Color.BLACK);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900, 900);
        setLocation(300, 0);
        
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == change){
            try{
                String npin = pin.getText();
                String nrepin = repin.getText();

                if(!npin.equals(nrepin)) {
                    JOptionPane.showMessageDialog(null, "INCORRECT PIN");
                    return;
                }
                
                if(npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "ENTER PIN");
                    return;
                }
                
                if(nrepin.equals("")) {
                    JOptionPane.showMessageDialog(null, "ENTER PIN");
                    return;
                }
                
                Conn c = new Conn();
                
                String query1 = "update bank set pinnumber = '"+nrepin+"' where pinnumber = '"+pinnumber+"' ";
                String query2 = "update login set pinnumber = '"+nrepin+"' where pinnumber = '"+pinnumber+"' ";
                String query3 = "update signupthree set pinnumber = '"+nrepin+"' where pinnumber = '"+pinnumber+"' ";
                

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN CHANGED");
                
                setVisible(false);
                new Transactions(nrepin);
                
            }catch(Exception e) {
                System.out.println(e);
            }
        } else{
            setVisible(false);
            new Transactions(pinnumber);
        }
    } 
    

    public static void main(String[] args) {
        new PinChange("");
    }
}
