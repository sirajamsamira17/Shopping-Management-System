package shoppingsystem;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;



public class forgetpassward  extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    forgetpassward(){
   
        getContentPane().setBackground(Color.white);
        setBounds(350,150,800,380);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(0,0,400,380);
        p1.setLayout(null);
        add(p1);
        
        JLabel  l1=new JLabel("Username");
        l1.setBounds(30,25,100,40);
        p1.add(l1);
        t1=new JTextField();
        t1.setBounds(105,30,150,25);
        p1.add(t1);
        b1=new JButton("Search");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(280,30,100,25);
        b1.addActionListener(this);
        p1.add(b1);
        
        JLabel  l2=new JLabel("Name");
        l2.setBounds(30,65,100,40);
        p1.add(l2);
        t2=new JTextField();
        t2.setBounds(105,75,150,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel  l3=new JLabel("Email");
        l3.setBounds(30,105,100,40);
        p1.add(l3);
        t3=new JTextField();
        t3.setBounds(105,115,150,25);
        p1.add(t3);
        b3=new JButton("Retrieve");
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(278,115,100,25);
        b3.addActionListener(this);
        p1.add(b3);
        
        JLabel  l4=new JLabel("Passward");
        l4.setBounds(30,145,100,40);
        p1.add(l4);
        t4=new JTextField();
        t4.setBounds(105,155,150,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
         b2=new JButton("Back");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(103,260,150,25);
        b2.addActionListener(this);
        p1.add(b2);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/unlock.png"));
    Image i2=i1.getImage().getScaledInstance(225,225,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel l5=new JLabel(i3);
    l5.setBounds(450,50,225,225);
    add(l5);
    }
      public void actionPerformed(ActionEvent ae){
          conn c=new conn();
          
       
       if(ae.getSource()==b2){
           new login().setVisible(true);
           this.setVisible(false);
           
       }else if(ae.getSource()==b1){
           try{
           String str="select * from signup where Username='"+t1.getText()+"'";
         ResultSet rs= c.s.executeQuery(str);
         while(rs.next()){
             t2.setText(rs.getString("Name"));
            
         }
           }catch(Exception e){} 
          
       }else if(ae.getSource()==b3){
          try{
           String str="select * from signup where Email='"+t3.getText()+"'";
         ResultSet rs= c.s.executeQuery(str);
         if(rs.next()){
             t4.setText(rs.getString("Passward"));
         }
         else 
       {
           JOptionPane.showMessageDialog(null,"Invalid Email");
           this.setVisible(false);
       }
           }catch(Exception e){} 
            
       }
       
       }

public static void main(String[] args) {
      new forgetpassward().setVisible(true);
    }
    

}
