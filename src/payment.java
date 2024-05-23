
package shoppingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class payment extends JFrame implements ActionListener {
   JButton b1,b2;
    payment(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/bkash.png"));
        Image i2=i1.getImage().getScaledInstance(800,650,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,800,650);
        add(l1);   
        
        
        
        
         b1=new JButton("Pay");
         b1.setBounds(540,20,120,40);
         b1.setFont(new Font("Tahoma",Font.BOLD,14));
         b1.setBackground(Color.red);
         b1.setForeground(Color.black);
         b1.addActionListener(this);
         l1.add(b1);
        b2=new JButton("Back");
        b2.setBounds(670,20,120,40);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
         b2.setBackground(new  Color(255,0,0));
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        l1.add(b2);
        
        
    
        
        
        
        
     setBounds(220,20,800,650);
     getContentPane().setBackground(Color.white);
     setLayout(null);
     setVisible(true); 
            
        
    }
    
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
            new bkash().setVisible(true);
            
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    
    
    
    
    
    
    
    
    
    
    
    
     }
    
    
    public static void main(String[]args){
          new payment().setVisible(true);
          
          
     }
}
