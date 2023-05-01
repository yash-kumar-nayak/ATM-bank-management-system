
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;




public class Deposit extends JFrame implements ActionListener{
     JTextField amount;
     JButton back,deposit;
     String pinnumber;
    Deposit( String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);
        
        
           JLabel text=new JLabel("Enter the Amount You Want To Deposit");
        text.setBounds(190, 310, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD,28));
         amount.setBounds(175, 350, 320, 25);
         image.add(amount);
        
         deposit =new JButton("Deposit");
        deposit.setBounds(383, 525, 130, 30);
        deposit.setBackground(Color.green);
        image.add(deposit);
       deposit.addActionListener(this);
        
         back =new JButton("Back");
        back.setBounds(383, 560, 130, 30);
        image.add(back);
        back.addActionListener(this);
        
        
        setUndecorated(true);
        setLayout(null);
         getContentPane().setBackground(Color.WHITE);
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
          public static void main(String[] args) {
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==deposit){
           String number=amount.getText();
           java.util.Date date=new java.util.Date(); 
           if(number.equals("")){
               JOptionPane.showMessageDialog(null,"Please Enter The Amount ");
           }
           else{
               try{
               Conn conn=new Conn();
               String query="insert into bank values ('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
               conn.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Rs "+number+" Deposited Sucessfully");
               setVisible(false);
               new Transactions(pinnumber).setVisible(true);
               }
               
               
                catch(Exception e){
                   System.out.println(e);
                   }
           }
          
           
           
           
       }
       else if(ae.getSource()==back){
           new Transactions(pinnumber).setVisible(true);
       }
       
    }
}
