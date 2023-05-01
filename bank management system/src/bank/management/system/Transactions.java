
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Transactions extends JFrame implements ActionListener{
    JButton deposit,cashWithdrawl,exit,fastCash,miniStatment,pinChange,balanceEnquiry;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);
        
        
        JLabel text=new JLabel("Please Select Your Transaction");
        text.setBounds(215, 310, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(157, 455, 130, 30);
        image.add(deposit);
        deposit.addActionListener(this);
        
        cashWithdrawl=new JButton("Cash Withdrawl");
        cashWithdrawl.setBounds(383, 455, 130, 30);
        image.add(cashWithdrawl);
        cashWithdrawl.addActionListener(this);
        
        
        fastCash=new JButton("Fast Cash");
        fastCash.setBounds(157, 490, 130, 30);
        image.add(fastCash);
        fastCash.addActionListener(this);
        
        miniStatment=new JButton("Mini Statement");
        miniStatment.setBounds(383, 490, 130, 30);
        image.add(miniStatment);
        miniStatment.addActionListener(this);
    
        pinChange=new JButton("PIN change");
        pinChange.setBounds(157, 525, 130, 30);
        image.add(pinChange);
        pinChange.addActionListener(this);
        
        
        balanceEnquiry=new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(383, 525, 130, 30);
        image.add(balanceEnquiry);
        balanceEnquiry.addActionListener(this);
        
        exit=new JButton("Exit");
        exit.setBounds(383, 560, 130, 30);
        
        image.add(exit);
        exit.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Transactions("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==cashWithdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fastCash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinChange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==balanceEnquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==miniStatment){
            
            new MiniStatement(pinnumber).setVisible(true);
        }
      
    }
}
