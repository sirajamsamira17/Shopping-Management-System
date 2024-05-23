
package shoppingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class newcustomerform extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1,b2;
    
    newcustomerform(){
        
     JLabel l1=new JLabel("NEW CUSTOMER FORM");
     l1.setFont(new Font("Tahoma",Font.BOLD,16));
     l1.setForeground(Color.blue);
     l1.setBounds(30,20,190,30);
     add(l1);
    
    
     JLabel l2=new JLabel("Id");
     l2.setFont(new Font("Tahoma",Font.PLAIN,16));
     l2.setBounds(30,70,90,30);
     add(l2);
    String str[]={"NID","Passport","Driving License"};
    c1=new JComboBox(str);
   c1.setBounds(110,70,180,25);
   add(c1);
  
     
     JLabel l3=new JLabel("Number");
     l3.setFont(new Font("Tahoma",Font.PLAIN,16));
     l3.setBounds(30,106,90,30);
     add(l3); 
     t3=new JTextField();
     t3.setBounds(110,106,180,30);
     add(t3);
      
     JLabel l4=new JLabel("Name");
     l4.setFont(new Font("Tahoma",Font.PLAIN,16));
     l4.setBounds(30,142,90,30);
     add(l4); 
      t4=new JTextField();
     t4.setBounds(110,142,180,30);
     add(t4);
         
        
     JLabel l5=new JLabel("Gender");
     l5.setFont(new Font("Tahoma",Font.PLAIN,16));
     l5.setBounds(30,187,90,30);
     add(l5);
     r1=new JRadioButton("Male");
     r1.setFont(new Font("Tahoma",Font.PLAIN,12));
     r1.setBounds(110,178,55,50);
     add(r1);
     r2=new JRadioButton("Female");
     r2.setFont(new Font("Tahoma",Font.PLAIN,12));
     r2.setBounds(170,178,119,50);
     add(r2); 
      
     JLabel l6=new JLabel("Contact");
     l6.setFont(new Font("Tahoma",Font.PLAIN,16));
     l6.setBounds(30,235,90,30);
     add(l6);
      t5=new JTextField();
     t5.setBounds(110,235,180,30);
     add(t5);
 
     JLabel l7=new JLabel("Email");
     l7.setFont(new Font("Tahoma",Font.PLAIN,16));
     l7.setBounds(30,271,90,30);
     add(l7);
      t6=new JTextField();
     t6.setBounds(110,271,180,30);
     add(t6);
     b1=new JButton("Submit");
     b1.setBackground(Color.black);
     b1.setForeground(Color.white);
     b1.setBounds(30,330,100,30);
     add(b1);
     b1.addActionListener(this);
     
     b2=new JButton("Back");
     b2.setBackground(Color.black);
     b2.setForeground(Color.white);
     b2.setBounds(155,330,100,30);
     add(b2);
     b2.addActionListener(this);
     
       getContentPane().setBackground(Color.white); 
           /*JPanel l8=new JPanel();
         l8.setBounds(240,20,100,30);
     add(l8);  */ 
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/try.jpg"));
        JLabel l8=new JLabel(i1);
        l8.setBounds(350,20,360,360);
        add(l8);
              
     
       
        
        
        
      setLayout(null);
     setBounds(250,100,750,420);
     setVisible(true);
           
        
        
        
        
    }
   
    
    
    public void actionPerformed(ActionEvent ae){
       String Number=t3.getText();
       String Name=t4.getText();
      
       String Contact=t5.getText();
       String Email=t6.getText();
       String gender=null;
       if(r1.isSelected()){
           gender="Male";
                   
       }else if (r2.isSelected()){
           gender="Female";
       }
       
       String ID=(String)c1.getSelectedItem();
      conn c=new conn();
      String str="insert into customer values('"+ID+"','"+Number+"','"+Name+"','"+gender+"','"+Contact+"','"+Email+"')";
       
       try{
          c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"New Customer is Successfully Added");
            this.setVisible(false);
       }catch(Exception e){
           
       }
    
    
   if(ae.getSource()==b2){
           
     this.setVisible(false);
    
   }
    
    }  
    
    
    
    public static void main(String[]args){
          new newcustomerform().setVisible(true);
    }
            

 
    
    
    
}
