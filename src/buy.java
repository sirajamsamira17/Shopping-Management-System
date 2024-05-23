
package shoppingsystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.ImageIcon;

        

public class buy extends JFrame implements ActionListener {
      Choice c1;
      JLabel l1,l2,l22,l3,l4,l5,l6,l7,l77,l66;
      JTextField t5,t2;
      JButton b1,b2,b3;
  
    buy(){
      
       l1=new JLabel("Buy Product");
         l1.setFont(new Font("Tahoma",Font.BOLD,16));
        l1.setForeground(Color.black);
        l1.setBounds(100,10,300,40);
        add(l1);
        
         /*l2=new JLabel("Username");
         //l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l2.setForeground(Color.black);
        l2.setBounds(30,50,120,40);
        add(l2);
         l22=new JLabel();
         //l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l22.setForeground(Color.black);
        l22.setBounds(150,50,120,40);
        add(l22);*/
        
        
        /* l3=new JLabel("hh");
         //l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l3.setForeground(Color.black);
        l3.setBounds(30,80,120,40);
        add(l3);*/
        
        l4=new JLabel("Select Item");
         //l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l4.setForeground(Color.black);
        l4.setBounds(30,110,120,40);
        add(l4);
        c1=new Choice();
        c1.add("Belt");
        c1.add("Dress");
        c1.add("Jeans");
        c1.add("Shirt");
        c1.add("Shoes");
        c1.add("Trouser");
        c1.add("Pant");
        c1.setBounds(150,125,180,40);
        add(c1);
        
        l5=new JLabel("Total Quantity");
         //l2.setFont(new Font("Tahoma",Font.BOLD,16));

       l5.setBounds(30,145,120,40);
        add(l5);
         t5=new JTextField("1");
        t5.setBounds(150,158,140,20);
        add(t5);
        
        l6=new JLabel("TotalPrice");
         l6.setBounds(30,180,120,40);
        add(l6);
        l66=new JLabel();
        l66.setForeground(Color.red);
         l66.setBounds(150,180,120,40);
        add(l66);
        
        
        /* l7=new JLabel("Contact");
         //l2.setFont(new Font("Tahoma",Font.BOLD,16));
         l7.setBounds(30,210,120,40);
          l77=new JLabel();
         //l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l77.setForeground(Color.black);
        l77.setBounds(150,210,120,40);
        add(l77);*/
        
        //add(l7);
         try{
             conn c=new conn();
             ResultSet rs=c.s.executeQuery("select * from signup where Username=''");
             while(rs.next()){
               
      
                  l77.setText(rs.getString("Contact"));
             }
         }catch(Exception e){
             
         }
        
        
        
        
        
        
        b1=new JButton("Check price");
     b1.setBackground(Color.black);
     b1.setForeground(Color.white);
     b1.setBounds(45,300,140,30);
      b1.addActionListener(this);
     add(b1);
    
      b2=new JButton("Back");
     b2.setBackground(Color.black);
     b2.setForeground(Color.white);
     b2.setBounds(190,300,140,30);
      b2.addActionListener(this); 
     add(b2);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/cart22.jpg"));
        JLabel l9=new JLabel(i1);
        l9.setBounds(400,18,626,417);
        add(l9);
          
              
        
          setBounds(180,100,1000,450);
    getContentPane().setBackground(Color.white);
        setLayout(null);
       setVisible(true);  
        
        
        
    }
    
 public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           String p=c1.getSelectedItem();
           int cost=0;
           if(p.equals("Belt")){
               cost+=800;
              
           }else if(p.equals("Dress")){
               cost+=1500;
           }else if(p.equals("Jeans")){
               cost+=1000;
           }  else if(p.equals("Shirt")){
               cost+=600;            
           }else if(p.equals("Shoes")){
               cost+=900;
           }else if(p.equals("Trouser")){
               cost+=400;
           }else if(p.equals("Pant")){
               cost+=500;
           }
           
          int quantity=Integer.parseInt(t5.getText());
          cost*=quantity;
           l66.setText("Tk"+cost);
           
        }else if(ae.getSource()==b2){
     this.setVisible(false);       
    }
 }
        
        
        
public static void main(String[] args){
          new buy().setVisible(true);
          
          
     
}    
     
}