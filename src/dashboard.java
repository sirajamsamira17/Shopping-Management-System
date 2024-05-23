
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
import javax.swing.JMenu;
import javax.swing.JPanel;

public class dashboard extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5;
    dashboard(){
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(null);
       
        JPanel p1=new JPanel();
        p1.setBounds(0,0,300,700);
        p1.setBackground(new  Color(51,204,255));
       // p1.setBackground(Color.);
        p1.setLayout(null);;
        add(p1);
       
       JPanel p2=new JPanel();
       p2.setBounds(300,0,1000,700);
       p2.setBackground(Color.white);
       p2.setLayout(null);;
       add(p2);
        /*JPanel p3=new JPanel();
        p3.setBounds(300,45,1000,700);
        p3.setBackground(Color.white);
        p3.setLayout(null);;
        add(p3);*/
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/dash.jpg"));
         Image i2=i1.getImage().getScaledInstance(1000,682,Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
         JLabel l1=new JLabel(i3);
        l1.setBounds(15,0,1000,682);
         p2.add(l1);
       
   
        
    
        JLabel l3=new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma",Font.BOLD,24));
        l3.setForeground(Color.black);
        l3.setBounds(80,10,300,40);
        p1.add(l3);
       b1=new JButton("USER");
          b1.setBounds(0,80,300,45);
           b1.setFont(new Font("Tahoma",Font.BOLD,14));
           b1.setBackground(new  Color(51,204,255));
           b1.setForeground(Color.black);
         b1.addActionListener(this);
         p1. add(b1);
        b2=new JButton("ADMIN");
         b2.setBounds(0,125,300,45);
         b2.setFont(new Font("Tahoma",Font.BOLD,14));
         b2.setBackground(new  Color(51,204,255));
         b2.setForeground(Color.black);
         b2.addActionListener(this);
         p1. add(b2);
         
          b3=new JButton("CALCULATOR");
          b3.setBounds(0,170,300,45);
          b3.setFont(new Font("Tahoma",Font.BOLD,14));
          b3.setBackground(new  Color(51,204,255));
          b3.setForeground(Color.black);
          b3.addActionListener(this);
          p1. add(b3);
          
          b4=new JButton("NOTEPAD");
          b4.setBounds(0,215,300,45);
          b4.setFont(new Font("Tahoma",Font.BOLD,14));
          b4.setBackground(new  Color(51,204,255));
          b4.setForeground(Color.black);
          b4.addActionListener(this);
          p1. add(b4);
          b5=new JButton("ABOUT");
          b5.setBounds(0,260,300,45);
          b5.setFont(new Font("Tahoma",Font.BOLD,14));
          b5.setBackground(new  Color(51,204,255));
          b5.setForeground(Color.black);
          b5.addActionListener(this);
          p1. add(b5);
    }
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getActionCommand().equals("USER")){
            new login().setVisible (true);
         } else  if(ae.getActionCommand().equals("ADMIN")){
            new Adminlogin().setVisible (true);
    
        }else if(ae.getActionCommand().equals("CALCULATOR")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }else if(ae.getActionCommand().equals("NOTEPAD")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){}
        }
    }
    
     public static void main(String[]args){
          new dashboard().setVisible(true);
          
          
     }
     
     

}
