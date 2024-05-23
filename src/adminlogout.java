
package shoppingsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class adminlogout extends JFrame implements ActionListener {
    JButton b1;
    adminlogout()
    {
    
        setLayout(null);
        //getContentPane().setBackground(Color.white);
        setBounds(280,100,800,500);
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(0,0,500,500);
        p1.setLayout(null);
        add(p1);
        b1=new JButton("Logout");
        b1.setBackground(new  Color(51,204,255));
        b1.setForeground(Color.black);
        b1.setBounds(570,418,140,30);
       b1.addActionListener(this);
        add(b1);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/adminlogout.jpg"));
    Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel l1=new JLabel(i3);
    l1.setBounds(70,55,300,300);
    p1.add(l1);
    setVisible(true);
        
}
    public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==b1){
         //  System.exit(0);
          new dashboard().setVisible(true);
       }
    }
public static void main(String[]args){
             new adminlogout().setVisible(true);
    }
            
}
