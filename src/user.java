
package shoppingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class user extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
    user(){
      
       b1=new JButton("New Customer Form");
       b1.setBounds(20,39,230,35);
       b1.setFont(new Font("Tahoma",Font.BOLD,14));
       b1.setBackground(Color.black);
       b1.setForeground(Color.white);
       b1.addActionListener(this);
       add(b1);  
       
        b2=new JButton("View Products");
        b2.setBounds(20,80,230,35);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
       b3=new JButton("Purchase Product");
       b3.setBounds(20,120,230,35);
       b3.setFont(new Font("Tahoma",Font.BOLD,14));
       b3.setBackground(Color.black);
       b3.setForeground(Color.white);
       b3.addActionListener(this);
        add(b3);   
         b4=new JButton("Payment");
        b4.setBounds(20,160,230,35);
        b4.setFont(new Font("Tahoma",Font.BOLD,14));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
         add(b4);
        b5=new JButton("Logout");
        b5.setBounds(20,200,230,35);
        b5.setFont(new Font("Tahoma",Font.BOLD,14));
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        add(b5);;
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/welcome.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(290,20,461,300);
        add(l1);
          
        
     setBounds(300,100,780,400);
     getContentPane().setBackground(Color.white);
     setLayout(null);
     setVisible(true);             
        
    }
    
  public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("New Customer Form")){
            new newcustomerform().setVisible (true);
        }else if(ae.getActionCommand().equals("View Products")){
            new viewproduct().setVisible(true);
            //this.setVisible(false);   
        }else if(ae.getActionCommand().equals("Purchase Product")){
          new buy().setVisible(true);
        }else if(ae.getActionCommand().equals("Payment")){
           new  payment().setVisible(true);
        }else if(ae.getActionCommand().equals("Logout")){
           new  signout().setVisible(true);
        }
  } 
 public static void main(String[] args){
          new user().setVisible(true);
          
          
        }
     
     
}