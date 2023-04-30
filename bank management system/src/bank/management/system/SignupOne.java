package bank.management.system;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;
import javax.swing.*;

import javax.swing.JOptionPane;



public class SignupOne extends JFrame implements ActionListener{
	
	JTextField nameTextField,fnameTextField ,emailTextField,dobTextField;
	JTextField addressTextField,cityTextField,stateTextField,pinTextField;
	JRadioButton male,female,others,married,unmarried;
	
	JButton next;
	long random;
	 SignupOne() {
		 setTitle("PAGE 1 :NEW ACCOUNT APPLICATION FORM - PAGE 1");
		 setLayout(null);
		 Random ran=new Random();
		 random=Math.abs((ran.nextLong()%9000L)+1000L);
		 
		 
		 JLabel formno=new JLabel("APPLICATION FORM NO "+random);
		 formno.setFont(new Font("Raleway", Font.BOLD,38));
		 formno.setBounds(140, 20, 600, 40);
		 add(formno);
		 
		 
		 JLabel personalDetails=new JLabel("Page 1 : Personal Details ");
		 personalDetails.setFont(new Font("Raleway", Font.ITALIC,22));
		 personalDetails.setBounds(290, 80, 400, 30);
		 add(personalDetails);
		 
//name		 
		 JLabel name=new JLabel("Name:");
		 name.setFont(new Font("Raleway", Font.BOLD,20));
		 name.setBounds(100,140,200,30);
		 add(name);
		 
		 nameTextField =new JTextField();
		 nameTextField.setBounds(300, 140,300 ,30);
		 nameTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(nameTextField);

		 
		 
//father name
		 JLabel fname=new JLabel("Father's Name:");
		 fname.setFont(new Font("Raleway", Font.BOLD,20));
		 fname.setBounds(100,190,200,30);
		 add(fname);
		 
		 fnameTextField =new JTextField();
		 fnameTextField.setBounds(300, 190,300 ,30);
		 fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(fnameTextField);
// dob
		 JLabel dob=new JLabel("Date of Birth:");
		 dob.setFont(new Font("Raleway", Font.BOLD,20));
		 dob.setBounds(100,240,200,30);
		 add(dob);
		 
		 dobTextField =new JTextField();
		 dobTextField.setBounds(300, 240,300 ,30);
		 dobTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(dobTextField);
		 
		 
//gender		 
		 JLabel gender=new JLabel("Gender:");
		 gender.setFont(new Font("Raleway", Font.BOLD,20));
		 gender.setBounds(100,290,200,30);
		 add(gender);
		 
		  male=new JRadioButton("Male");
		 male.setBounds(300, 290,80 ,30);
		 male.setBackground(Color.WHITE);
		 add(male);
		 
		 female=new JRadioButton("Female");
		 female.setBounds(400, 290,100 ,30);
		 female.setBackground(Color.WHITE);
		 add(female);
		 
		 ButtonGroup genderGroup=new ButtonGroup();
		 genderGroup.add(male);
		 genderGroup.add(female);
		 
		 
//	email	 
		 JLabel email=new JLabel("E-mail:");
		 email.setFont(new Font("Raleway", Font.BOLD,20));
		 email.setBounds(100,340,200,30);
		 add(email);
		 
		 
		 emailTextField =new JTextField();
		 emailTextField.setBounds(300, 340,300 ,30);
		 emailTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(emailTextField);
		 
//maritalStatus		 
		 JLabel maritalStatus=new JLabel("Marital Status:");
		 maritalStatus.setFont(new Font("Raleway", Font.BOLD,20));
		 maritalStatus.setBounds(100,390,200,30);
		 add(maritalStatus);
		 
		  married=new JRadioButton("Married");
		 married.setBounds(300, 390,80 ,30);
		 married.setBackground(Color.WHITE);
		 add(married);
		 
		  unmarried=new JRadioButton("Unmarried");
		 unmarried.setBounds(400, 390,100 ,30);
		 unmarried.setBackground(Color.WHITE);
		 add(unmarried);
		 
		  others=new JRadioButton("Others");
		 others.setBounds(530, 390,100 ,30);
		 others.setBackground(Color.WHITE);
		 add(others);
		 
		 ButtonGroup maritalGroup=new ButtonGroup();
		 maritalGroup.add(married);
		 maritalGroup.add(unmarried);
		 maritalGroup.add(others);
		 
//	address	 
		 JLabel address=new JLabel("Address:");
		 address.setFont(new Font("Raleway", Font.BOLD,20));
		 address.setBounds(100,440,200,30);
		 add(address);
		 
		 
		 addressTextField =new JTextField();
		 addressTextField.setBounds(300, 440,300 ,30);
		 addressTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(addressTextField);
		 
		 
//	city	 
		 JLabel city=new JLabel("City:");
		 city.setFont(new Font("Raleway", Font.BOLD,20));
		 city.setBounds(100,490,200,30);
		 add(city);
		 
		 
		 cityTextField =new JTextField();
		 cityTextField.setBounds(300, 490,300 ,30);
		 cityTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(cityTextField);

		 
// state
		 JLabel state=new JLabel("State:");
		 state.setFont(new Font("Raleway", Font.BOLD,20));
		 state.setBounds(100,540,200,30);
		 add(state);
		 
		 stateTextField =new JTextField();
		 stateTextField.setBounds(300, 540,300 ,30);
		 stateTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(stateTextField);
		 
//pincode		 
		 JLabel pincode=new JLabel("Pin Code:");
		 pincode.setFont(new Font("Raleway", Font.BOLD,20));
		 pincode.setBounds(100,590,200,30);
		 add(pincode);
		 
		 pinTextField =new JTextField();
		 pinTextField.setBounds(300, 590,300 ,30);
		 pinTextField.setFont(new Font("Arial",Font.BOLD,14));
		 add(pinTextField);
		 
//button next
		  next=new JButton("Next");
		 next.setForeground(Color.WHITE);
		 next.setBackground(Color.BLACK);
		 next.setFont(new Font("Raleway", Font.ITALIC,20));
		 next.setBounds(620,660,80,30);
		 next.addActionListener(this);
		 add(next);
		 
		 
		 
		 
		 
		 getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(300,20);
		setVisible(true);
	}
	 
	 
	 
	 public void actionPerformed(ActionEvent ae) {
		 String formno= ""+random;
		 String name=nameTextField.getText();
		 String fname=fnameTextField.getText();
		 String dob=dobTextField.getText();
 
		 String gender =null;
		 if(male.isSelected()) {
			 gender="Male";
		 }
		 else if(female.isSelected()) {
			 gender="Female";
		 }
		 
		 String email=emailTextField.getText();
		 
		 String marital =null;
		 if(married.isSelected()) {
			 marital="Married";
		 }
		 else if(unmarried.isSelected()) {
			 marital="Unmarried";
		 }
		 else if(others.isSelected()){
			 marital="Other";
		 }
		 
		 String address=addressTextField.getText();
		 String city=cityTextField.getText();
		 String state=stateTextField.getText();
		 String pin=pinTextField.getText();
		 
		
		 try {
			 if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name is Mandatory");
				}
                         else if(fname.equals("")) {
					JOptionPane.showMessageDialog(null, "Father's Name is Mandatory");
				}
                         else if(dob.equals("")) {
					JOptionPane.showMessageDialog(null, "Date of Birth is Mandatory");
				}
                         else if(address.equals("")){
                             JOptionPane.showMessageDialog(null, "Address is required");
                         }
                         else if(gender == null){
                             JOptionPane.showMessageDialog(null, " Please choose Gender ");
                         }
                         else if(marital  == null){
                             JOptionPane.showMessageDialog(null, " Please choose Marital's status ");
                         }
                         else if(city.equals("")){
                             JOptionPane.showMessageDialog(null, " City is required");
                         }
                         else if(state.equals("")){
                             JOptionPane.showMessageDialog(null, "State is required");
                         }
                         else if(pin.equals("")){
                             JOptionPane.showMessageDialog(null, "Pin is Mandatory");
                         }
			else {

				Conn c=new Conn();
				 String quary="insert into signup values('"+formno+"' ,'"+name+"' ,'"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"', '"+pin+"','"+state+"')";
			c.s.executeUpdate(quary);
			 setVisible(false);
                         new SignupTwo(formno).setVisible(true);
			
 		}
		} catch (Exception e) {
			System.out.println(e);
		}
		 
		 
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		new SignupOne();

	}

}
