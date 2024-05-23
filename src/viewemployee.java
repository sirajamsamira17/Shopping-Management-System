
package shoppingsystem;
import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.*;

    

public class viewemployee extends JFrame implements ActionListener{
   
    JTable t1;
    JButton b1,b2;
    viewemployee(){
        t1=new JTable();
        t1.setBounds(100,50,900,400);
        add(t1);
        JLabel l1=new JLabel("NAME");
        l1.setBounds(120,20,60,20);
        add(l1);
        JLabel l2=new JLabel("AGE");
        l2.setBounds(260,20,60,20);
        add(l2);
        JLabel l3=new JLabel("GENDER");
        l3.setBounds(395,20,60,20);
        add(l3);
         JLabel l4=new JLabel("JOB");
        l4.setBounds(530,20,60,20);
        add(l4);
         JLabel l5=new JLabel("SALARY");
        l5.setBounds(650,20,60,20);
        add(l5);
         JLabel l6=new JLabel("CONTACT");
        l6.setBounds(790,20,60,20);
        add(l6);
         JLabel l7=new JLabel("EMAIL");
        l7.setBounds(920,20,60,20);
        add(l7);
        
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
     setBounds(130,60,1100,600);
     setVisible(true);
       
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            try{
                conn c=new conn();
                String str="SELECT * FROM employee";
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));//package theke ashche
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
            //new.ADMIN().setVisible(true);
           this.setVisible(false);
           
        
        
        }
        
        
    }
    public static void main(String[] args){
        
    
          new viewemployee().setVisible(true);
    }
}
