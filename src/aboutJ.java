
package shoppingsystem;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class aboutJ extends JFrame{
    String s;
    aboutJ(){
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(280,100,500,400);
        JLabel l1=new JLabel("Shopping Management System");
        l1.setForeground(Color.red);
        l1.setBounds(130,20,400,40);
        l1.setLayout(null);
       s=
        TextArea t1=new TextArea();
        add(l1);
        
         setVisible(true);
}

public static void main(String[]args){
             new aboutJ().setVisible(true);
    }
            
}