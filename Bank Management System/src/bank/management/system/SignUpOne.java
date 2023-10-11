package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener{
        
        long random;
        //JLabel formo;
        JTextField tname, tfname, tmail, taddress, tcity, tstate, tpinc;
        JRadioButton rmale, fermale, single, maried, others;
        JButton next;
        JDateChooser tdate;
        
        SignUpOne() {
        
            setLayout(null);
            
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
            
            Random ran = new Random();
            random = Math.abs((ran.nextLong() % 9000L) + 1000L);
            
            JLabel formo = new JLabel("APPLICATION FORM NO. " + random);
            formo.setFont(new Font("Raleway", Font.BOLD, 38));
            formo.setBounds(140, 20, 600, 40);
            add(formo);
            
            JLabel personal = new JLabel("Page 1: Personal Details");
            personal.setFont(new Font("Raleway", Font.BOLD, 22));
            personal.setBounds(290, 80, 400, 30);
            add(personal);
            
            JLabel name = new JLabel("Name:");
            name.setFont(new Font("Raleway", Font.BOLD, 20));
            name.setBounds(100, 140, 140, 30);
            add(name);
            
            tname = new JTextField();
            tname.setFont(new Font("Arial", Font.PLAIN, 20));
            tname.setBounds(300, 140, 400, 30);
            add(tname);
            
            JLabel fname = new JLabel("Father Name:");
            fname.setFont(new Font("Raleway", Font.BOLD, 20));
            fname.setBounds(100, 190, 140, 30);
            add(fname);
            
            tfname = new JTextField();
            tfname.setFont(new Font("Arial", Font.PLAIN, 20));
            tfname.setBounds(300, 190, 400, 30);
            add(tfname);
                        
            JLabel dob = new JLabel("Date Of Birth:");
            dob.setFont(new Font("Raleway", Font.BOLD, 18));
            dob.setBounds(100, 240, 140, 30);
            add(dob);

            tdate = new JDateChooser();
            tdate.setFont(new Font("Arial", Font.PLAIN, 19));
            tdate.setBounds(300,240, 400, 30);
            tdate.setBackground(Color.BLACK);
            tdate.setForeground(Color.WHITE);
            add(tdate);
            
            JLabel gender = new JLabel("Gender:");
            gender.setFont(new Font("Raleway", Font.BOLD, 20));
            gender.setBounds(100, 290, 140, 30);
            add(gender);
            
            rmale = new JRadioButton("Male");
            rmale.setFont(new Font("Arial", Font.PLAIN, 19));
            rmale.setBounds(300, 290, 100, 30);
            rmale.setBackground(Color.WHITE);
            rmale.setForeground(Color.BLACK);
            add(rmale);
            
            fermale = new JRadioButton("Female");
            fermale.setFont(new Font("Arial", Font.PLAIN, 19));
            fermale.setBounds(400, 290, 100, 30);
            fermale.setBackground(Color.WHITE);
            fermale.setForeground(Color.BLACK);
            add(fermale);
            
            ButtonGroup bg = new ButtonGroup();
            bg.add(rmale);
            bg.add(fermale);
            
            JLabel mail = new JLabel("Email:");
            mail.setFont(new Font("Raleway", Font.BOLD, 20));
            mail.setBounds(100, 340, 140, 30);
            add(mail);
            
            tmail = new JTextField();
            tmail.setFont(new Font("Arial", Font.PLAIN, 20));
            tmail.setBounds(300, 340, 400, 30);
            add(tmail);
            
            JLabel status = new JLabel("Marital Status:");
            status.setFont(new Font("Raleway", Font.BOLD, 18));
            status.setBounds(100, 390, 140, 30);
            add(status);
            
            maried = new JRadioButton("Married");
            maried.setFont(new Font("Arial", Font.PLAIN, 19));
            maried.setBounds(300, 390, 100, 30);
            maried.setBackground(Color.WHITE);
            maried.setForeground(Color.BLACK);
            add(maried);
            
            single = new JRadioButton("UnMarried");
            single.setFont(new Font("Arial", Font.PLAIN, 16));
            single.setBounds(400, 390, 120, 30);
            single.setBackground(Color.WHITE);
            single.setForeground(Color.BLACK);
            add(single);
            
            others = new JRadioButton("Others");
            others.setFont(new Font("Arial", Font.PLAIN, 19));
            others.setBounds(530, 390, 100, 30);
            others.setBackground(Color.WHITE);
            others.setForeground(Color.BLACK);
            add(others);
            
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(maried);
            bg1.add(single);
            bg1.add(others);
            
            JLabel address = new JLabel("Address:");
            address.setFont(new Font("Raleway", Font.BOLD, 20));
            address.setBounds(100, 440, 140, 30);
            add(address);
            
            taddress = new JTextField();
            taddress.setFont(new Font("Arial", Font.PLAIN, 20));
            taddress.setBounds(300, 440, 400, 30);
            add(taddress);
            
            JLabel city = new JLabel("City:");
            city.setFont(new Font("Raleway", Font.BOLD, 20));
            city.setBounds(100, 490, 140, 30);
            add(city);
            
            tcity = new JTextField();
            tcity.setFont(new Font("Arial", Font.PLAIN, 20));
            tcity.setBounds(300, 490, 400, 30);
            add(tcity);
            
            JLabel stat = new JLabel("State:");
            stat.setFont(new Font("Raleway", Font.BOLD, 20));
            stat.setBounds(100, 540, 140, 30);
            add(stat);
            
            tstate = new JTextField();
            tstate.setFont(new Font("Arial", Font.PLAIN, 20));
            tstate.setBounds(300, 540, 400, 30);
            add(tstate);
            
            JLabel pinc = new JLabel("Pin Code:");
            pinc.setFont(new Font("Raleway", Font.BOLD, 20));
            pinc.setBounds(100, 590, 140, 30);
            add(pinc);
            
            tpinc = new JTextField();
            tpinc.setFont(new Font("Arial", Font.PLAIN, 20));
            tpinc.setBounds(300, 590, 400, 30);
            add(tpinc);
            
            next = new JButton("Next");
            next.setFont(new Font("Arial", Font.PLAIN, 16));
            next.setBounds(615, 640, 80, 30);
            next.setBackground(Color.WHITE);
            next.setForeground(Color.BLACK);
            next.addActionListener(this);
            add(next);

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
            
            setSize(850, 800);
            setLocation(350,10);
            setVisible(true);
        }
        
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = tname.getText();
        String father_name = tfname.getText();
        String dob =((JTextField) tdate.getDateEditor().getUiComponent()).getText();
                
        String gender = null;
        if(rmale.isSelected()) {
            gender = "MALE";
        } else if(fermale.isSelected()) {
            gender = "FEMALE";
        }
        
        String email = tmail.getText();
        
        String marital = null;
        if(maried.isSelected()) {
            marital = "Married";
        } else if (single.isSelected()) {
            marital = "UnMarried";
        } else if (others.isSelected()) {
            marital = "Other";
        }
        
        String address = taddress.getText();
        String city = tcity.getText();
        String state = tstate.getText();
        String pin = tpinc.getText();
        
        if(name.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        if(father_name.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        if(dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        if(email.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        if(address.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        if(city.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        if(state.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        if(pin.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Details");
            return;
        }
        
        try{
            Conn c = new Conn();
            
            String query = "insert into signup values('"+formno+"', '"+name+"', '"+father_name+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
            c.s.executeUpdate(query);
            
            //JOptionPane.showMessageDialog(null, "Sucessful");
            
            setVisible(false);
            new SignUpTwo(formno);
            
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
        
    public static void main(String[] args) {
        new SignUpOne();
    }
}
