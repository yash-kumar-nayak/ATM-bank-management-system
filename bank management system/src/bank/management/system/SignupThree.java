
package bank.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
        
public class SignupThree extends JFrame implements ActionListener  {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignupThree( String formno){
        this.formno=formno;
        setTitle("SUBMISSION FORM");
        
        JLabel additionalDetails=new JLabel("Page 3: Account Details ");
		 additionalDetails.setFont(new Font("Raleway", Font.ITALIC,25));
		 additionalDetails.setBounds(290, 70, 400, 30);
		 add(additionalDetails);
                 
        JLabel name=new JLabel("Account Type");
		 name.setFont(new Font("Raleway", Font.BOLD,23));
		 name.setBounds(130,130,200,30);
		 add(name);
                 
                 
                r1=new JRadioButton();
                r1.setBounds(150, 170,20 ,30);
                r1.setBackground(Color.WHITE);
		add(r1);
         JLabel sa=new JLabel("Saving Account");
		 sa.setFont(new Font("Raleway", Font.BOLD,15));
		 sa.setBounds(180,170,150,30);
		 add(sa);
                 
                 
                r2=new JRadioButton();
                r2.setBounds(430, 170,20 ,30);
                r2.setBackground(Color.WHITE);
		add(r2);
                
                 JLabel ca=new JLabel("Current Account");
		 ca.setFont(new Font("Arial", Font.BOLD,15));
		 ca.setBounds(450,170,150,30);
		 add(ca);
                 
                r3=new JRadioButton();
                r3.setBounds(150, 200,20 ,30);
                r3.setBackground(Color.WHITE);
		add(r3);
                  JLabel rd=new JLabel("Recurring Deposit");
		 rd.setFont(new Font("Arial", Font.BOLD,15));
		 rd.setBounds(180,200,150,30);
		 add(rd);
                
                 
                 
                r4=new JRadioButton();
                r4.setBounds(430, 200,20 ,30);
                r4.setBackground(Color.WHITE);
		add(r4);
                
                     JLabel fd=new JLabel("Fixed Deposit ");
		 fd.setFont(new Font("Arial", Font.BOLD,15));
		 fd.setBounds(450,200,150,30);
		 add(fd);

                 
                 
                 ButtonGroup accountgroup=new ButtonGroup();
		 accountgroup.add(r1);
		 accountgroup.add(r2);
		 accountgroup.add(r3);
		 accountgroup.add(r4);
        
                   JLabel cn=new JLabel("Card Number:");
		 cn.setFont(new Font("Raleway", Font.BOLD,23));
		 cn.setBounds(130,260,170,30);
		 add(cn);
                   JLabel cnl=new JLabel("Your 16 Digits Card Number");
		 cnl.setFont(new Font("Arial", Font.BOLD,10));
		 cnl.setBounds(135,280,150,30);
		 add(cnl);
                 
                   JLabel cnx=new JLabel("XXXX-XXXX-XXXX-1535");
		 cnx.setFont(new Font("Raleway", Font.BOLD,22));
		 cnx.setBounds(400,260,300,30);
		 add(cnx);
                 
                 
                   JLabel pin=new JLabel("PIN:");
		 pin.setFont(new Font("Raleway", Font.BOLD,23));
		 pin.setBounds(130,320,150,30);
		 add(pin);
                   JLabel pint=new JLabel("Your 4 Digits Password");
		 pint.setFont(new Font("Arial", Font.BOLD,10));
		 pint.setBounds(132,340,150,30);
		 add(pint);
                 
                   JLabel pinx=new JLabel("XXXX");
		 pinx.setFont(new Font("Raleway", Font.BOLD,22));
		 pinx.setBounds(400,323,300,30);
		 add(pinx);
        
           JLabel service=new JLabel("Services Required");
		 service.setFont(new Font("Raleway", Font.BOLD,23));
		 service.setBounds(130,380,300,30);
		 add(service);
                 
                 c1=new JCheckBox("ATM CARD");
                 c1.setBackground(Color.WHITE);
                 c1.setFont(new Font("Raleway", Font.BOLD,16));
                  c1.setBounds(150,430,200,30);
                  add(c1);
                 c2=new JCheckBox("Internet Banking");
                 c2.setBackground(Color.WHITE);
                 c2.setFont(new Font("Raleway", Font.BOLD,16));
                  c2.setBounds(430,430,200,30);
                  add(c2);
                 c3=new JCheckBox("Mobile Banking");
                 c3.setBackground(Color.WHITE);
                 c3.setFont(new Font("Raleway", Font.BOLD,16));
                  c3.setBounds(150,460,200,30);
                  add(c3);
                 c4=new JCheckBox("EMAIL & SMS ALERT");
                 c4.setBackground(Color.WHITE);
                 c4.setFont(new Font("Raleway", Font.BOLD,16));
                  c4.setBounds(430,460,200,30);
                  add(c4);
                 c5=new JCheckBox("Cheque Book");
                 c5.setBackground(Color.WHITE);
                 c5.setFont(new Font("Raleway", Font.BOLD,16));
                  c5.setBounds(150,490,200,30);
                  add(c5);
                 c6=new JCheckBox("E-Statement");
                 c6.setBackground(Color.WHITE);
                 c6.setFont(new Font("Raleway", Font.BOLD,16));
                  c6.setBounds(430,490,200,30);
                  add(c6);
                  
                 c7=new JCheckBox("I Hereby Declares That The Above Entered Details are Correct to The Best of My Knowledge");
                 c7.setBackground(Color.WHITE);
                 c7.setFont(new Font("Raleway", Font.BOLD,13));
                  c7.setBounds(130,600,600,30);
                  add(c7);
                  
                  
                  
                  
                   
                 
                 
                    cancel=new JButton("Cancel");
		 cancel.setForeground(Color.WHITE);
		 cancel.setBackground(Color.BLACK);
		 cancel.setFont(new Font("Raleway", Font.ITALIC,14));
		 cancel.setBounds(250,660,100,30);
		 cancel.addActionListener(this);
		 add(cancel); 
                 
                 
                  submit=new JButton("Submit");
		 submit.setForeground(Color.WHITE);
		 submit.setBackground(Color.BLACK);
		 submit.setFont(new Font("Raleway", Font.ITALIC,14));
		 submit.setBounds(420,660,100,30);
		 submit.addActionListener(this);
		 add(submit); 
                 
         
        setLayout(null);
         getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(300,20);
		setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new SignupThree("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==submit){
        String accounttype=null;
        if(r1.isSelected()){
            accounttype="Saving Account";
        }
        else if(r2.isSelected()){
            accounttype="Current Account";
        }
        else if(r3.isSelected()){
            accounttype="Recurring Deposit Account";
        }
        else if(r4.isSelected()){
            accounttype="Fixed Deposit Account";
            
        }
        
        
        Random random=new Random();
        String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
        String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
        
        String facility="";
        String dec="";
        if(c1.isSelected()){
            facility=facility+" ATM CARD";
        } if(c2.isSelected()){
            facility=facility+" Internet Banking";
        }
         if(c3.isSelected()){
            facility=facility+" Mobile Banking";
        }
        if(c4.isSelected()){
            facility=facility+" EMAIL & SMS ALERT";
        }
         if(c5.isSelected()){
            facility=facility+" Cheque Book";
        }
         if(c6.isSelected()){
            facility=facility+" E-Statement";
        }
         if(c7.isSelected()){
             dec="yes";
         }
        
                try {
            if(accounttype==null){
                JOptionPane.showMessageDialog(null, "Please choose One Account Type");
            }
            if(dec.equals("")){
                JOptionPane.showMessageDialog(null, "Accept The Declaration");
            }
            
            
            else {
                Conn conn=new Conn();
                 String query1="insert into signupthree values('"+formno+"' ,'"+accounttype+"' ,'"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                 String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n Pin: "+pinnumber);
               setVisible(false);
                        new Deposit(pinnumber).setVisible(true);
            }
                }
        catch (Exception e) {
               System.out.println(e);
        }
        
        
 
        }
        
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
        

    }

   
}
