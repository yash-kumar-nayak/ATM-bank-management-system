
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class BalanceEnquiry extends JFrame implements ActionListener {
    JButton BACK;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;
        
        
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);
        
        

        
        
        
           BACK=new JButton("BACK");
        BACK.setBounds(383, 560, 130, 30);
        BACK.addActionListener(this);
        image.add(BACK);
        
        
        
        
        
        
        
        
        
        Conn c=new Conn();
        int balance=0;
        try {
                ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
                
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }
                    else {
                        balance -=Integer.parseInt(rs.getString("amount"));
                    }
                }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
                JLabel text=new JLabel("Your  Account Balance Is :" +balance);
        text.setBounds(170, 310, 250, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        
                setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(true);
        new Transactions(pinnumber).setVisible(true);
    }
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
