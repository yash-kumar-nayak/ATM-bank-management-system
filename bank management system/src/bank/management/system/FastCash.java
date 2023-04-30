
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{
    JButton with100,with500,BACK,with1000,with10000,with2000,with5000;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);
        
        
        JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(215, 310, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        with100=new JButton("Rs 100");
        with100.setBounds(157, 455, 130, 30);
        image.add(with100);
        with100.addActionListener(this);
        
        with500=new JButton("Rs 500");
        with500.setBounds(383, 455, 130, 30);
        image.add(with500);
        with500.addActionListener(this);
        
        
        with1000=new JButton("Rs 1000");
        with1000.setBounds(157, 490, 130, 30);
        image.add(with1000);
        with1000.addActionListener(this);
        
        with2000=new JButton("Rs 2000");
        with2000.setBounds(383, 490, 130, 30);
        image.add(with2000);
        with2000.addActionListener(this);
    
        with5000=new JButton("Rs 5000");
        with5000.setBounds(157, 525, 130, 30);
        image.add(with5000);
        with5000.addActionListener(this);
        
        
        with10000=new JButton("Rs 10000");
        with10000.setBounds(383, 525, 130, 30);
        image.add(with10000);
        with10000.addActionListener(this);
        
        BACK=new JButton("BACK");
        BACK.setBounds(383, 560, 130, 30);
        image.add(BACK);
        BACK.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==BACK){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else {
            String amount=((JButton)ae.getSource()).getText().substring(3);
            Conn c=new Conn();
            try {
                ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }
                    else {
                        balance -=Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource()!=BACK && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }
           Date date=new Date();
           String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+ amount+"Debited Sucessfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

