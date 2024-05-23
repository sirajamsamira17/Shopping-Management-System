
package shoppingsystem;

import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
import java.sql.*;  
public class searchproduct extends JFrame implements ActionListener {  

    JLabel l1, l2, l3, l4, l5,l6;  
    JTextField t1, t2, t3, t4, t5,t6;  
    JButton b1;  
   
    searchproduct() {  
  
        l1 = new JLabel("Enter Id:");  
        l1.setBounds(20, 20, 100, 20);  
        t1 = new JTextField(20);  
        t1.setBounds(130, 20, 200, 20);  
        b1 = new JButton("Submit");  
        b1.setBounds(170, 60, 100, 20);  
        b1.addActionListener(this);  
        
        //lb = new JLabel("Fetching Student Information From Database");  
        //lb.setBounds(30, 80, 450, 30);  
        //lb.setForeground(Color.red);  
        //lb.setFont(new Font("Serif", Font.BOLD, 20));  
        //setVisible(true);  
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //setSize(500, 500); 
        
        l2 = new JLabel("Id:");  
        l2.setBounds(20, 120, 100, 20);  
        t2 = new JTextField(50);  
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setBounds(130, 120, 200, 20);  
        
        l3 = new JLabel("Name:");  
        l3.setBounds(20, 150, 100, 20);  
        t3 = new JTextField(100);  
         t3.setBorder(BorderFactory.createEmptyBorder());
        t3.setBounds(130, 150, 200, 20);
        
        l4= new JLabel("Size:");  
        l4.setBounds(20, 180, 100, 20);  
        t4 = new JTextField(50); 
        t4.setBorder(BorderFactory.createEmptyBorder());
        t4.setBounds(130, 180, 200, 20);
        
        l5= new JLabel("Price");  
        l5.setBounds(20, 210, 100, 20);  
        t5 = new JTextField(50);  
         t5.setBorder(BorderFactory.createEmptyBorder());
        t5.setBounds(130, 210, 100, 20);  
        
        l6 = new JLabel("Quantity");  
        l6.setBounds(20, 240, 100, 20);  
        t6 = new JTextField(50);  
         t6.setBorder(BorderFactory.createEmptyBorder());
        t6.setBounds(130, 240, 100, 20);  
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setBounds(300,100,500, 500); 
        setLayout(null);
         setVisible(true); 
    
        add(l1);  
        add(t1);  
        add(b1);
        
        add(l2);  
        add(t2);  
        
        add(l3);  
        add(t3);  
        add(l4);  
        add(t4);  
        add(l5);  
        add(t5);  
        add(l6);  
        add(t6);
         
        t2.setEditable(false);  
        t3.setEditable(false);  
        t4.setEditable(false);  
        t5.setEditable(false); 
        t6.setEditable(false); 
    }  
    public void actionPerformed(ActionEvent e) {  
         
        try {  
            String str = t1.getText();  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");  
            PreparedStatement s = c.prepareStatement("select * from product where Id=?");  
            s.setString(1, str);  
            ResultSet rs = s.executeQuery();  
        
      
            if (rs.next()) {  
                String s1 = rs.getString(1);  
                String s2 = rs.getString(2);  
                String s3 = rs.getString(3);  
                String s4 = rs.getString(4); 
                String s5 = rs.getString(5); 
                
                t2.setText(s1);  
                t3.setText(s2);  
                t4.setText(s3);  
                t5.setText(s4);
                t6.setText(s5);      
                        
    
                        
                        
            } else {  
                JOptionPane.showMessageDialog(null, "ID not Found");  
                this.setVisible(false);
            }  
      
        } catch (Exception ex) {  
            System.out.println(ex);  
        }  
    }  
 
    public static void main(String args[]) {  
        new searchproduct();  
    }  
}  


      