

package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PinChange extends JFrame implements ActionListener{
       String pinnumber; 
       JPasswordField repin,pin;
       JButton BACK,change;
       PinChange(String pinnumber){
            this.pinnumber=pinnumber;
            setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);
        
        
        
           JLabel text=new JLabel("Change Your PIN");
        text.setBounds(265, 310, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        
        
        
        
           JLabel pintext=new JLabel("New PIN:");
        pintext.setBounds(165, 350, 120, 25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,16));
        image.add(pintext);
        
        
        pin=new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD,28));
         pin.setBounds(250, 350, 200, 25);
         image.add(pin);
            
        
              JLabel  repintext=new JLabel("Re-Enter:");
              repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD,16));
         repintext.setBounds(165, 380, 120, 25);
         image.add(repintext);
         
         repin=new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD,28));
         repin.setBounds(250, 380, 200, 25);
         image.add(repin);
        
         
         
         
             change=new JButton("CHANGE");
	 change.setBounds(383, 525, 130, 30);
         change.setBackground(Color.green);
         change.addActionListener(this);
         image.add(change);
	
           BACK=new JButton("BACK");
        BACK.setBounds(383, 560, 130, 30);
        BACK.addActionListener(this);
        image.add(BACK);
        
         
         
         
       
		 
         
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==change){
        try {
            String npin=pin.getText();
            String rpin=repin.getText();
            
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter New PIN ");
                return;
            }
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Re-enter New PIN ");
            }
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Enter PIN does not match ");
                return;
            }
            Conn conn=new Conn();
            String query1="update bank set pin = '"+rpin+"' where pin='"+pinnumber+"'";
            String query2="update login set pin = '"+rpin+"' where pin='"+pinnumber+"'";
            String query3="update signupthree set pin = '"+rpin+"' where pin='"+pinnumber+"'";
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
            setVisible(false);
            new Transactions(rpin).setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
    
}
