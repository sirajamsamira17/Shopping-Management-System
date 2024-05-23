
package shoppingsystem;

import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.*;

    

public class viewproduct extends JFrame implements ActionListener{
   
    JTable t1;
    JButton b1,b2;
    viewproduct(){
        t1=new JTable();
        t1.setBounds(140,50,700,400);
        add(t1);
        JLabel l1=new JLabel("ID");
        l1.setBounds(190,20,60,20);
        add(l1);
        JLabel l2=new JLabel("Product name");
        l2.setBounds(295,20,40,20);
        add(l2);
        JLabel l3=new JLabel("Size");
        l3.setBounds(460,20,60,20);
        add(l3);
         JLabel l4=new JLabel("Price");
        l4.setBounds(580,20,60,20);
        add(l4);
         JLabel l5=new JLabel("quantity");
        l5.setBounds(740,20,60,20);
        add(l5);
        
        
    b1=new JButton("Load Data");   
        b1.setBounds(350,520,120,30);
        b1.setBackground(Color.black);
       b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
       b2=new JButton("Back");   
        b2.setBounds(500,520,120,30);
        b2.setBackground(Color.black);
       b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.white);
         setLayout(null);
     setBounds(130,40,1100,600);
     setVisible(true);
       
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            try{
                conn c=new conn();
                String str="SELECT * FROM product";
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));//package theke ashche
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
           
           this.setVisible(false);
           
        
        
        }
        
        
    }
    public static void main(String[] args){
        
    
          new viewproduct ().setVisible(true);
    }
}
