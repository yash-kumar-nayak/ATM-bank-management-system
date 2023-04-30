
package bank.management.system;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;
import javax.swing.*;



public class SignupTwo  extends JFrame implements ActionListener {
    JComboBox religion,category,income,education,occupation;
    JTextField panNumber,aadharNumber;
    JRadioButton senioryes,seniorno,eyes,eno;
    JButton next;
    String formno;
    SignupTwo(String formno){
        this.formno=formno;
         setLayout(null);
         setTitle(" PAGE 2 : NEW ACCOUNT APPLICATION FORM");
         
         
         JLabel additionalDetails=new JLabel("Page 2: Additional Details ");
		 additionalDetails.setFont(new Font("Raleway", Font.ITALIC,22));
		 additionalDetails.setBounds(290, 80, 400, 30);
		 add(additionalDetails);
                 
         JLabel name=new JLabel("Religion:");
		 name.setFont(new Font("Raleway", Font.BOLD,20));
		 name.setBounds(100,140,200,30);
		 add(name);
		 
                 String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
                 religion=new JComboBox(valReligion);
		 religion.setBounds(300, 140,300 ,30);
                 religion.setBackground(Color.WHITE);
		 add(religion);

		 
		 
//Category
		 JLabel fname=new JLabel("Category:");
		 fname.setFont(new Font("Raleway", Font.BOLD,20));
		 fname.setBounds(100,190,200,30);
		 add(fname);
		 
		 String valCategory[]={"General","OBC","SC","ST","Other"};
                 category=new JComboBox(valCategory);
		 category.setBounds(300, 190,300 ,30);
                 category.setBackground(Color.WHITE);
		 add(category);
// Income
		 JLabel dob=new JLabel("Income:");
		 dob.setFont(new Font("Raleway", Font.BOLD,20));
		 dob.setBounds(100,240,200,30);
		 add(dob);
                 
                 
                  String incomeCategory[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Up to 10,00,000"};
                 income=new JComboBox(incomeCategory);
		 income.setBounds(300, 240,300 ,30);
                 income.setBackground(Color.WHITE);
		 add(income);
		 
		 
//combination words--- educational qualification		 
		 JLabel gender=new JLabel("Educational:");
		 gender.setFont(new Font("Raleway", Font.BOLD,20));
		 gender.setBounds(100,290,200,30);
		 add(gender);
		 	 
		 JLabel email=new JLabel("Qualification:");
		 email.setFont(new Font("Raleway", Font.BOLD,20));
		 email.setBounds(100,315,200,30);
		 add(email);
		 
		  String educationValues[]={"High school","Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
                 education=new JComboBox(educationValues);
		 education.setBounds(300, 300,300 ,30);
                 education.setBackground(Color.WHITE);
		 add(education);
		 
//Occupation		 
		 JLabel maritalStatus=new JLabel("Occupation:");
		 maritalStatus.setFont(new Font("Raleway", Font.BOLD,20));
		 maritalStatus.setBounds(100,360,200,30);
		 add(maritalStatus);
		 
		 
		   String occupationValues[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
                 occupation=new JComboBox(occupationValues);
		 occupation.setBounds(300, 360,300 ,30);
                 occupation.setBackground(Color.WHITE);
		 add(occupation);
		
//	panNumber	 
		 JLabel address=new JLabel("PAN Number:");
		 address.setFont(new Font("Raleway", Font.BOLD,20));
		 address.setBounds(100,420,200,30);
		 add(address);
		 
		 
		 panNumber =new JTextField();
		 panNumber.setBounds(300, 420,300 ,30);
		 panNumber.setFont(new Font("Arial",Font.BOLD,14));
		 add(panNumber);
		 
		 
//	aadharNumber	 
		 JLabel city=new JLabel("Aadhar Number:");
		 city.setFont(new Font("Raleway", Font.BOLD,20));
		 city.setBounds(100,470,200,30);
		 add(city);
		 
		 
		 aadharNumber =new JTextField();
		 aadharNumber.setBounds(300, 470,300 ,30);
		 aadharNumber.setFont(new Font("Arial",Font.BOLD,14));
		 add(aadharNumber);

		 
// Senior Citizen
		 JLabel state=new JLabel("Senior Citizen:");
		 state.setFont(new Font("Raleway", Font.BOLD,20));
		 state.setBounds(100,520,200,30);
		 add(state);
		 
		senioryes=new JRadioButton("Yes");
		 senioryes.setBounds(300, 520,80 ,30);
		 senioryes.setBackground(Color.WHITE);
		 add(senioryes);
                 
		seniorno =new JRadioButton("No");
		 seniorno.setBounds(450, 520,80 ,30);
		 seniorno.setBackground(Color.WHITE);
		 add(seniorno);
                 
                 
                 ButtonGroup seniorGroup=new ButtonGroup();
		 seniorGroup.add(senioryes);
		 seniorGroup.add(seniorno);
                 
                 
                  
                 
                 
		 
//Existing Account		 
		 JLabel pincode=new JLabel("Existing Account :");
		 pincode.setFont(new Font("Raleway", Font.BOLD,20));
		 pincode.setBounds(100,570,200,30);
		 add(pincode);
		 
		 eyes=new JRadioButton("Yes");
		 eyes.setBounds(300, 570,80 ,30);
		 eyes.setBackground(Color.WHITE);
		 add(eyes);
                 
		eno =new JRadioButton("No");
		 eno.setBounds(450, 570,80 ,30);
		 eno.setBackground(Color.WHITE);
		 add(eno);
                 
                 
                 ButtonGroup existingGroup=new ButtonGroup();
		 existingGroup.add(eyes);
		 existingGroup.add(eno);
		 
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
    
    public static void main(String[] args) {
        new SignupTwo("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        it return object thats why we need to type cast it and also we use get selecteditem for dropbox
        String Sreligion=(String)religion.getSelectedItem();
        String Scategory=(String)category.getSelectedItem();
        String Sincome=(String)income.getSelectedItem();
        String Seducation=(String)education.getSelectedItem();
        String Soccupation=(String)occupation.getSelectedItem();
                String seniorcitizen =null;
		 if(senioryes.isSelected()) {
			 seniorcitizen="Yes";
		 }
		 else if(seniorno.isSelected()) {
			 seniorcitizen="No";
		 }
		 
                 
                 String existingGroup =null;
		 if(eyes.isSelected()) {
			 existingGroup="Yes";
		 }
		 else if(eno.isSelected()) {
			 existingGroup="No";
		 }
                 String Span=panNumber.getText();
                 String Saadhar=aadharNumber.getText();
                 
                 try {
                     if(Span.equals("")) {
					JOptionPane.showMessageDialog(null, "PAN Number is Mandatory");
				}
                     else if(Saadhar.equals("")) {
					JOptionPane.showMessageDialog(null, "Aadhar Number is Mandatory");
				}
                     else if(seniorcitizen==null) {
					JOptionPane.showMessageDialog(null, "Please choose Senior Citizen Box");
				}
                     else if(existingGroup==null) {
					JOptionPane.showMessageDialog(null, "Please choose Existing Account Box");
				}
                     else{
                         Conn c=new Conn();
				 String quary="insert into signuptwo values('"+formno+"' ,'"+Sreligion+"' ,'"+Scategory+"','"+Sincome+"','"+Seducation+"','"+Soccupation+"','"+Span+"', '"+Saadhar+"','"+seniorcitizen+"','"+existingGroup+"')";
			c.s.executeUpdate(quary);
                        setVisible(false);
                        new SignupThree(formno).setVisible(true);
                     }
                             
            
        } 
                 
                 
                 catch (Exception e) {
                     System.out.println(e);
        }
                 
                 
                 
    }
    
    
}
