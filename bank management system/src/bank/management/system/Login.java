
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	 

	JButton login,signup,clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	Login() {
		 setTitle("AUTOMATED TELLER MACHINE");
		 setLayout(null);  //there are many layout like gride and many more.
		 
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
		 Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new  ImageIcon(i2);
		 JLabel label=new JLabel(i3);
		 label.setBounds(100, 10, 100, 100);
		 add(label);
                 
                  ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
		 Image l2=l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon l3=new  ImageIcon(l2);
		 JLabel l4=new JLabel(l3);
		 l4.setBounds(630, 350, 100, 100);
		 add(l4);
                 
                 
		 ImageIcon s1=new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
		 Image s2=s1.getImage().getScaledInstance(800, 450, Image.SCALE_DEFAULT);
		ImageIcon s3=new  ImageIcon(s2);
		 JLabel s4=new JLabel(s3);
		 s4.setBounds(0, 0, 800, 450);
		 add(s4);
		 
		 JLabel text=new JLabel("Welcome To ATM");
                 text.setForeground(Color.white);
		 text.setFont(new Font("AvantGarde", Font.BOLD,38));
		 text.setBounds(250, 40, 400, 30);
		 s4.add(text);
		 
		 JLabel cardno=new JLabel("Card No:");
                 cardno.setForeground(Color.white);
		 cardno.setFont(new Font("Raleway", Font.BOLD,28));
		 cardno.setBounds(120, 150, 150, 30);
		 s4.add(cardno);
		 
		 cardTextField=new JTextField();
		 cardTextField.setBounds(300, 150,230 ,30);
		 cardTextField.setFont(new Font("Arial",Font.BOLD,16));
		 s4.add(cardTextField);
		 
		 JLabel pin=new JLabel("PIN:");
                  pin.setForeground(Color.white);
		 pin.setFont(new Font("Raleway", Font.BOLD,28));
		 pin.setBounds(120, 220, 400, 30);
		 s4.add(pin);
		 
		 
		 pinTextField=new JPasswordField();
		 pinTextField.setBounds(300, 220,230 ,30);
		 pinTextField.setFont(new Font("Arial",Font.BOLD,16));
		 add(pinTextField);
		 
		 
		 login=new JButton("SIGN IN");
		 login.setBounds(300,300,100,30);
		 login.setBackground(Color.BLACK);
		 login.setForeground(Color.WHITE);
		 login.addActionListener(this);
		 s4.add(login);
		 
		 
		 
		 clear=new JButton("CLEAR");
		 clear.setBounds(430,300,100,30);
		 clear.setBackground(Color.BLACK);
		 clear.setForeground(Color.WHITE);
		 clear.addActionListener(this);
		 s4.add(clear);
		 
		 
		 signup=new JButton("SIGN UP");
		 signup.setBounds(300,350,230,30);
		 signup.setBackground(Color.BLACK);
		 signup.setForeground(Color.WHITE);
		 signup.addActionListener(this);
		 s4.add(signup);
		 
		 
		 
		getContentPane().setBackground(Color.WHITE);
		
		
		setSize(800,480);
		setVisible(true);
		setLocation(350,200); //from where its start in viewport of desktop
	}
	//this is an abstract method in actionlistner 
	 public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource()==clear) {
			 cardTextField.setText("");
			 pinTextField.setText("");
		 }
		 
		 else if(ae.getSource()==login) {
			 Conn conn=new Conn();
                         String cardnumber=cardTextField.getText();
                         String pinnumber=pinTextField.getText();
                         String query="select * from login where cardnumber = '"+cardnumber+"' and pin ='"+pinnumber+"'";
                         try {
                          ResultSet rs= conn.s.executeQuery(query);
                          
                          if(rs.next()){
                              setVisible(false);
                              new Transactions(pinnumber).setVisible(true);
                          }
                          else{
                              JOptionPane.showMessageDialog(null,"Incorrect Card Number & PIN ");
                          }
                     } catch (Exception e) {
                             System.out.println("e");
                     }
		 }
		 else if (ae.getSource()==signup) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}
	 }

	public static void main(String[] args) {
		new Login();

	}
	

}
