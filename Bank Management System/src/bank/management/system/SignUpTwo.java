package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
        
        JTextField  tpan, taadhr;
        JRadioButton senys, senno, exaccys, exaccno;
        JButton next;
        JComboBox treligion, tcategory, tincome, tedu, toccuption;
        String formno;
        
        SignUpTwo(String formno) {
            this.formno = formno;
            setLayout(null);
            
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
            
            JLabel personal = new JLabel("Page 2: Additional Details");
            personal.setFont(new Font("Raleway", Font.BOLD, 25));
            personal.setBounds(290, 60, 400, 30);
            add(personal);
            
            JLabel religion = new JLabel("Religion:");
            religion.setFont(new Font("Raleway", Font.BOLD, 20));
            religion.setBounds(100, 140, 140, 30);
            add(religion);
            
            String str[] = {
                "Hindu", "Muslim", "Sikh", "Christian", "Other"
            };
            treligion = new JComboBox(str);
            treligion.setFont(new Font("Arial", Font.PLAIN, 16));
            treligion.setBounds(300, 140, 400, 30);
            treligion.setBackground(Color.WHITE);
            treligion.setForeground(Color.BLACK);
            add(treligion);
            
            JLabel caetgory = new JLabel("Category:");
            caetgory.setFont(new Font("Raleway", Font.BOLD, 20));
            caetgory.setBounds(100, 190, 140, 30);
            add(caetgory);
            
            String str1[] = {
                "General", "OBC", "SC", "ST", "BC", "Other"
            };
            tcategory = new JComboBox(str1);
            tcategory.setFont(new Font("Arial", Font.PLAIN, 16));
            tcategory.setBounds(300, 190, 400, 30);
            tcategory.setBackground(Color.WHITE);
            tcategory.setForeground(Color.BLACK);
            add(tcategory);
                        
            JLabel income = new JLabel("Income:");
            income.setFont(new Font("Raleway", Font.BOLD, 20));
            income.setBounds(100, 240, 140, 30);
            add(income);
            
            String str2[] = {
                "NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "< 10,00,000", "> 10,00,000"
            };
            tincome = new JComboBox(str2);
            tincome.setFont(new Font("Arial", Font.PLAIN, 16));
            tincome.setBounds(300, 240, 400, 30);
            tincome.setBackground(Color.WHITE);
            tincome.setForeground(Color.BLACK);
            add(tincome);
            
            JLabel edu = new JLabel("Educational");
            edu.setFont(new Font("Raleway", Font.BOLD, 20));
            edu.setBounds(100, 300, 140, 30);
            add(edu);
            
            JLabel ocu = new JLabel("Qualification:");
            ocu.setFont(new Font("Raleway", Font.BOLD, 20));
            ocu.setBounds(100, 330, 140, 30);
            add(ocu);
            
            String str3[] = {
                "Non-Graduation", "Graduation", "Post Graduation", "Doctrate", "Other"
            };
            tedu = new JComboBox(str3);
            tedu.setFont(new Font("Arial", Font.PLAIN, 16));
            tedu.setBounds(300, 330, 400, 30);
            tedu.setBackground(Color.WHITE);
            tedu.setForeground(Color.BLACK);
            add(tedu);
            
            JLabel occuption = new JLabel("Occupation:");
            occuption.setFont(new Font("Raleway", Font.BOLD, 20));
            occuption.setBounds(100, 390, 140, 30);
            add(occuption);
            
            String str4[] = {
                "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"
            };
            toccuption = new JComboBox(str4);
            toccuption.setFont(new Font("Arial", Font.PLAIN, 16));
            toccuption.setBounds(300, 390, 400, 30);
            toccuption.setBackground(Color.WHITE);
            toccuption.setForeground(Color.BLACK);
            add(toccuption);
            
            JLabel pann = new JLabel("PAN Number:");
            pann.setFont(new Font("Raleway", Font.BOLD, 20));
            pann.setBounds(100, 450, 140, 30);
            add(pann);
            
            tpan = new JTextField();
            tpan.setFont(new Font("Arial", Font.PLAIN, 20));
            tpan.setBounds(300, 450, 400, 30);
            add(tpan);
            
            JLabel aadhr = new JLabel("Aadhar NO:");
            aadhr.setFont(new Font("Raleway", Font.BOLD, 20));
            aadhr.setBounds(100, 510, 140, 30);
            add(aadhr);
            
            taadhr = new JTextField();
            taadhr.setFont(new Font("Arial", Font.PLAIN, 20));
            taadhr.setBounds(300, 510, 400, 30);
            add(taadhr);
            
            JLabel senior = new JLabel("Senior Citizen:");
            senior.setFont(new Font("Raleway", Font.BOLD, 20));
            senior.setBounds(100, 570, 140, 30);
            add(senior);
            
            senys = new JRadioButton("Yes");
            senys.setFont(new Font("Arial", Font.PLAIN, 19));
            senys.setBounds(300, 570, 100, 30);
            senys.setBackground(Color.WHITE);
            senys.setForeground(Color.BLACK);
            add(senys);
            
            senno = new JRadioButton("No");
            senno.setFont(new Font("Arial", Font.PLAIN, 19));
            senno.setBounds(400, 570, 100, 30);
            senno.setBackground(Color.WHITE);
            senno.setForeground(Color.BLACK);
            add(senno);
            
            ButtonGroup bg = new ButtonGroup();
            bg.add(senys);
            bg.add(senno);
            
            JLabel existingacc = new JLabel("Existing ACC:");
            existingacc.setFont(new Font("Raleway", Font.BOLD, 20));
            existingacc.setBounds(100, 630, 160, 30);
            add(existingacc);
            
            exaccys = new JRadioButton("Yes");
            exaccys.setFont(new Font("Arial", Font.PLAIN, 19));
            exaccys.setBounds(300, 630, 100, 30);
            exaccys.setBackground(Color.WHITE);
            exaccys.setForeground(Color.BLACK);
            add(exaccys);
            
            exaccno = new JRadioButton("No");
            exaccno.setFont(new Font("Arial", Font.PLAIN, 19));
            exaccno.setBounds(400, 630, 100, 30);
            exaccno.setBackground(Color.WHITE);
            exaccno.setForeground(Color.BLACK);
            add(exaccno);
            
            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(exaccys);
            bg1.add(exaccno);
            
            next = new JButton("Next");
            next.setFont(new Font("Arial", Font.PLAIN, 16));
            next.setBounds(615, 670, 80, 30);
            next.setBackground(Color.WHITE);
            next.setForeground(Color.BLACK);
            next.addActionListener(this);
            add(next);
            
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(850, 800);
            setLocation(350,10);
            setVisible(true);
        }
        
        public void actionPerformed(ActionEvent ae) {
            String religion = (String)treligion.getSelectedItem();
            String category = (String)tcategory.getSelectedItem();
            String income = (String)tincome.getSelectedItem();
            String education = (String)tedu.getSelectedItem();
            String occuption = (String)toccuption.getSelectedItem();
            String pan = tpan.getText();
            String aadhar = taadhr.getText();
            
            if(pan.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Details");
                return;
            }
            
            if(aadhar.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Details");
                return;
            }
            
            String senior = null;
            if(senys.isSelected()) {
                senior = "YES";
            } else if(senno.isSelected()) {
                senior = "NO";
            }
            
            String existingacc = null;
            if(exaccys.isSelected()) {
                existingacc = "YES";
            } else if (exaccno.isSelected()) {
                existingacc = "NO";
            }
            
            try{
                Conn c = new Conn();
                
                String query = "insert into signuptwo values('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occuption+"', '"+pan+"', '"+aadhar+"', '"+senior+"', '"+existingacc+"')";
                c.s.executeUpdate(query);

                //JOptionPane.showMessageDialog(null, "Sucessful");
            
                setVisible(false);
                new SignUpThree(formno);
                
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        
        public static void main(String[] args) {
            new SignUpTwo("");
        }
}
