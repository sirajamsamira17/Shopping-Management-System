package shoppingsystem;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class Adminlogin extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    Adminlogin(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(350,150,700,380);
        
        
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(0,0,300,300);
        p1.setLayout(null);
        add(p1);
        
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/login.png"));
    Image i2=i1.getImage().getScaledInstance(225,225,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel l1=new JLabel(i3);
    l1.setBounds(30,60,225,225);
    p1.add(l1);
        JPanel p2=new JPanel();
       // p2.setBackground(Color.white);
        p2.setBounds(320,40,350,280);
        p2.setLayout(null);
        add(p2);
      
        JLabel  l2=new JLabel("Username");
        l2.setBounds(30,20,100,40);
        p2.add(l2);
        t1=new JTextField();
        t1.setBounds(30,60,170,35);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        
        JLabel l3=new JLabel("Password");
        l3.setBounds(30,80,100,40);
        p2.add(l3);
        t2=new JPasswordField();
        t2.setBounds(30,120,170,35);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
       
         b1=new JButton("Login");
          b1.setBounds(22,180,140,30);
         b1.addActionListener(this);
         p2. add(b1);
        
           
         b2=new JButton("Forget Password");
         b2.setBounds(170,180,140,30);
         b2.addActionListener(this);
         p2. add(b2);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==b1){
           try{
               String Username=t1.getText();
               String Passward=t2.getText();
                String str="select * from adminacc where Username ='"+Username+"' AND Passward='"+Passward+"'";
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(str);
                if(rs.next()){
                    
                     this.setVisible(false);
                     new admin().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                }
           }catch(Exception e){
               
           }
              
       }else if(ae.getSource()==b2){
           new forgetpassward().setVisible(true);
        this .setVisible(false);
       }
    }
     public static void main(String[] args) {
      new Adminlogin();
    
}
}
