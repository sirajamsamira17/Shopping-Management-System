package shoppingsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class addproduct extends JFrame implements ActionListener{
    
    
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1;
    
    addproduct(){
        
     JLabel id=new JLabel("ID");
     id.setFont(new Font("Tahoma",Font.PLAIN,14));
     id.setBounds(60,30,90,30);
     add(id);
     t1=new JTextField();
      t1.setBounds(200,30,140,30);
     add(t1);
     
     JLabel productname=new JLabel("Product Name");
     productname.setFont(new Font("Tahoma",Font.PLAIN,14));
     productname.setBounds(60,70,100,30);
     add(productname);
     t2=new JTextField();
     t2.setBounds(200,70,140,30);
     add(t2);
     
     JLabel size=new JLabel("Size");
     size.setFont(new Font("Tahoma",Font.PLAIN,14));
     size.setBounds(60,110,90,30);
     add(size);
      String str[]={"XS","S","M","L","Xl","XXL"};
     c1=new JComboBox(str);
   c1.setBounds(200,110,140,30);
   add(c1);
   
       JLabel price=new JLabel("Price");
     price.setFont(new Font("Tahoma",Font.PLAIN,14));
     price.setBounds(60,150,90,30);
     add(price);
     t3=new JTextField();
     t3.setBounds(200,150,140,30);
     add(t3);
     
         JLabel quantity=new JLabel("Quantity");
     quantity.setFont(new Font("Tahoma",Font.PLAIN,14));
     quantity.setBounds(60,190,90,30);
     add(quantity);
     t4=new JTextField();
     t4.setBounds(200,190,140,30);
     add(t4);
     
    
     b1=new JButton("Submit");
     b1.setBackground(Color.black);
     b1.setForeground(Color.white);
     b1.setBounds(150,300,140,30);
     b1.addActionListener(this);
       add(b1);
     
     
     setLayout(null);
     setBounds(400,100,500,500);
     setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
       String id=t1.getText();
       String productname=t2.getText();
       String price=t3.getText();
       String quantity=t4.getText();
       
      
       
       String size=(String)c1.getSelectedItem();
      conn c=new conn();
      String str="insert into product values('"+id+"','"+productname+"','"+size+"','"+price+"','"+quantity+"')";
       
       try{
          c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"New Product is Successfully Added");
            this.setVisible(false);
       }catch(Exception e){
           
       }
   
   }
    }
     public static void main(String[]args){
          new addproduct().setVisible(true);
    }
            
}

