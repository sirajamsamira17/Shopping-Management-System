
package shoppingsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class addemplyee extends JFrame implements ActionListener{
    
    
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1;
    
    addemplyee(){
        
     JLabel name=new JLabel("NAME");
     name.setFont(new Font("Tahoma",Font.PLAIN,17));
     name.setBounds(60,30,90,30);
     add(name);
     t1=new JTextField();
      t1.setBounds(150,30,140,30);
     add(t1);
     
     JLabel age=new JLabel("AGE");
     age.setFont(new Font("Tahoma",Font.PLAIN,17));
     age.setBounds(60,70,90,30);
     add(age);
     t2=new JTextField();
     t2.setBounds(150,70,140,30);
     add(t2);
          

     
     JLabel gender=new JLabel("GENDER");
     gender.setFont(new Font("Tahoma",Font.PLAIN,16));
     gender.setBounds(60,120,90,30);
     add(gender);
     r1=new JRadioButton("Male");
     r1.setFont(new Font("Tahoma",Font.PLAIN,12));
     r1.setBounds(150,110,55,50);
     add(r1);
     r2=new JRadioButton("Female");
     r2.setFont(new Font("Tahoma",Font.PLAIN,12));
     r2.setBounds(220,110,70,50);
     add(r2);  
     
     
     JLabel job=new JLabel("JOB");
     job.setFont(new Font("Tahoma",Font.PLAIN,17));
     job.setBounds(60,160,90,30);
     add(job);
     String str[]={"Manager","Receiptionist","Accountant","Salesman","Cleaner"};
     c1=new JComboBox(str);
   c1.setBounds(150,160,140,30);
   add(c1);
     
     JLabel salary=new JLabel("SALARY");
     salary.setFont(new Font("Tahoma",Font.PLAIN,17));
     salary.setBounds(60,200,90,30);
     add(salary);
     t4=new JTextField();
     t4.setBounds(150,200,140,30);
     add(t4);
     
     JLabel contact=new JLabel("CONTACT");
     contact.setFont(new Font("Tahoma",Font.PLAIN,17));
     contact.setBounds(60,240,90,30);
     add(contact);
     t5=new JTextField();
     t5.setBounds(150,240,140,30);
     add(t5);
     
     JLabel email=new JLabel("EMAIL");
     email.setFont(new Font("Tahoma",Font.PLAIN,17));
     email.setBounds(60,280,90,30);
     add(email);
     t6=new JTextField();
     t6.setBounds(150,280,140,30);
     add(t6);
     
     b1=new JButton("Submit");
     b1.setBackground(Color.black);
     b1.setForeground(Color.white);
     b1.setBounds(150,320,140,30);
     add(b1);
     b1.addActionListener(this);
     
     
     setLayout(null);
     setBounds(400,100,600,500);
     getContentPane().setBackground(Color.white);
     setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
       String name=t1.getText();
       String age=t2.getText();
       String salary=t4.getText();
       String contact=t5.getText();
       String email=t6.getText();
       String gender=null;
       if(r1.isSelected()){
           gender="Male";
                   
       }else if (r2.isSelected()){
           gender="Female";
       }
       
       String job=(String)c1.getSelectedItem();
      conn c=new conn();
      String str="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+contact+"','"+email+"')";
       
       try{
          c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"New Employee is Successfully Added");
            this.setVisible(false);
       }catch(Exception e){
           
       }
      //this.setVisible(false);
   }
     public static void main(String[]args){
          new addemplyee().setVisible(true);
    }
            
}

