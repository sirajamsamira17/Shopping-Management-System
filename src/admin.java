
package shoppingsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;

public class admin extends JFrame  implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
   admin(){
       
       
     b1=new JButton("Employee Details");
          b1.setBounds(20,39,230,35);
           b1.setFont(new Font("Tahoma",Font.BOLD,14));
           b1.setBackground(Color.black);
           b1.setForeground(Color.white);
        b1.addActionListener(this);
         add(b1);
       
        b2=new JButton("Add Employee");
          b2.setBounds(20,80,230,35);
           b2.setFont(new Font("Tahoma",Font.BOLD,14));
           b2.setBackground(Color.black);
           b2.setForeground(Color.white);
        b2.addActionListener(this);
         add(b2);
       
       b3=new JButton("Product Details");
          b3.setBounds(20,120,230,35);
           b3.setFont(new Font("Tahoma",Font.BOLD,14));
           b3.setBackground(Color.black);
           b3.setForeground(Color.white);
        b3.addActionListener(this);
         add(b3);
         b4=new JButton("Add Product");
        b4.setBounds(20,160,230,35);
        b4.setFont(new Font("Tahoma",Font.BOLD,14));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
         add(b4);;
        b5=new JButton("Search Product");
        b5.setBounds(20,200,230,35);
        b5.setFont(new Font("Tahoma",Font.BOLD,14));
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.addActionListener(this);
         add(b5);;
       
        b6=new JButton("Delete Product");
        b6.setBounds(20,240,230,35);
        b6.setFont(new Font("Tahoma",Font.BOLD,14));
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b6.addActionListener(this);
         add(b6);
         
        b7=new JButton("Logout");
        b7.setBounds(20,280,230,35);
        b7.setFont(new Font("Tahoma",Font.BOLD,14));
        b7.setBackground(Color.black);
        b7.setForeground(Color.white);
        b7.addActionListener(this);
         add(b7);
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/admin3.png"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(330,25,378,321);
        add(l1);
          
          
          
          
        setBounds(300,100,750,400);
     getContentPane().setBackground(Color.white);
        setLayout(null);
       setVisible(true); 
       
   } 
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Employee Details")){
            new viewemployee().setVisible (true);
        }else if(ae.getActionCommand().equals("Add Employee")){
            new addemplyee().setVisible(true);
            //this.setVisible(false);   
        }else if(ae.getActionCommand().equals("Product Details")){
          new viewproduct().setVisible(true);
            
        }else if(ae.getActionCommand().equals("Add Product")){
           new addproduct().setVisible(true);
            
       }else if(ae.getActionCommand().equals("Search Product")){
          new searchproduct ().setVisible(true);
       }else if(ae.getActionCommand().equals("Delete Product")){
          new deleteproduct ("").setVisible(true);
       }else if(ae.getActionCommand().equals("Logout")){
          new adminlogout ().setVisible(true);

            
}
    
    } 
    public static void main(String[] args){
          new admin().setVisible(true);
          
          
     }
     
     
}