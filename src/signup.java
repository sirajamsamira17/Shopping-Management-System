
package shoppingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    signup(){
        setBounds(350,150,800,400);
       getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new  Color(133,193,233));
        p1.setBounds(0,0,380,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel  l1=new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(30,20,140,40);
        p1.add(l1);
         t1=new JTextField();
        t1.setBounds(174,25,150,30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
         JLabel  l2=new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(30,60,140,40);
        p1.add(l2);
         t2=new JTextField();
        t2.setBounds(174,65,150,30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
         JLabel l3=new JLabel("Passward");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(30,105,140,40);
        p1.add(l3);
           t3=new JPasswordField();
        t3.setBounds(174,110,150,30);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4=new JLabel("Email");
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        l4.setBounds(30,150,140,40);
        p1.add(l4);
         t4=new JTextField();
        t4.setBounds(174,155,150,30);
       t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
      
    
           b1=new JButton("Signup");
          b1.setBounds(30,250,135,30);
          b1.addActionListener(this);
         p1. add(b1);
           b2=new JButton("Back");
          b2.setBounds(170,250,135,30);
          b2.addActionListener(this);
         p1. add(b2);
         JPanel p2=new JPanel();
       // p2.setBackground(new  Color(133,193,233));
        p2.setBounds(400,20,380,400);
        p2.setBackground(Color.white);
        p2.setLayout(null);
        add(p2);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/login2.png"));
        JLabel l6=new JLabel(i1);
        
    l6.setBounds(55,30,225,225);
    p2.add(l6);
        
    }
    public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==b1){
         String Username=  t1.getText();
          String Name=  t2.getText();
           String Passward=  t3.getText();
            String Email=  t4.getText();
            String str="insert into signup values('"+Username+"','"+Name+"','"+Passward+"','"+Email+"')";
            try{
                conn c=new conn();
               c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                
                
                 this.setVisible(false);
          new login().setVisible(true);
            }catch(Exception e){
         
            }
       }else if(ae.getSource()==b2){
           
        this .setVisible(false);
       }
       
    }
     public static void main(String[] args) {
      new signup().setVisible(true); 
}
}