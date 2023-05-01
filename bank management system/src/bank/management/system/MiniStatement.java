package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class MiniStatement extends JFrame implements ActionListener {
    JButton exit;
    MiniStatement(String pinnumber){
        setTitle("MINI STATEMENT");
        setLayout(null);
        
        JLabel mini=new JLabel();
        add(mini);
        JLabel bank=new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);
        
        JLabel card=new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        JLabel balance=new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);
        
        try {
            Conn conn=new Conn();
            ResultSet rs =conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number:"+rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        try {
            Conn conn=new Conn();
            int bal=0;
           ResultSet rs =conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
           while(rs.next()){
               mini.setText(mini.getText()+ "<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
            if(rs.getString("type").equals("Deposit")){
                        bal +=Integer.parseInt(rs.getString("amount"));
                    }
                    else {
                        bal -=Integer.parseInt(rs.getString("amount"));
                    }
           }
           balance.setText("Your Account Balance is Rs "+ bal);
        } catch (Exception e) {
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);
        setSize(400,600);
        getContentPane().setBackground(new Color(115, 194, 251));
        setVisible(true);
        setLocation(150,100);
        
        
        
        
        exit=new JButton("EXIT");
        exit.setBounds(20,500,100,25);
        exit.addActionListener(this);
        exit.setBackground(Color.red);
        exit.setForeground(Color.white);
                add(exit);
    }
    
    public static void main(String[] args) {
        new MiniStatement("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
}