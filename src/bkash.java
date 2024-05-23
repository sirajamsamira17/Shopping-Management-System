
package shoppingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class bkash extends JFrame implements ActionListener {
    JButton b1;
    bkash(){
        JEditorPane j=new JEditorPane();
        j.setEditable(false);
        
        
        try{
            j.setPage("https://www.bkash.com/products-services/send-money");
        }catch(Exception e){
        
        j.setContentType("text/html");
        j.setText("<html>Could not load,Error 404</html");
        
        }
        add(j);
        JScrollPane js=new JScrollPane(j);
        getContentPane().add(js);
        
         b1=new JButton("Back");
         b1.setBounds(900,20,120,40);
         b1.setBackground(Color.red);
         b1.setForeground(Color.black);
         b1.addActionListener(this);
         j.add(b1);
        
        
        
     setBounds(110,45,1100,600);
    // getContentPane().setBackground(Color.white);
    // setLayout(null);
     //setVisible(true); 
            
        
        
        
        
        
        
        
        
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           
     this.setVisible(false);
     new payment().setVisible(true);
        }
    
    
    }
    
 public static void main(String[]args){
          new bkash().setVisible(true);
          
          
     }
}   
    
    
    
    
    
    
    

