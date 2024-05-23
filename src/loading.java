
package shoppingsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class loading extends JFrame implements Runnable{
    Thread t1;
    JProgressBar p;
    public void run(){
        try{
          for(int i=0;i<101;i++)
          {
              int m=p.getMaximum();
              int n=p.getValue();
              if(n<m){
                  p.setValue(p.getValue()+1);
                  //home
              }else{ i=101;
                  setVisible(false);
              }
              
          Thread.sleep(80);
          }
        }catch(Exception e){}
    }
    
    loading(String user){
        String Username=user;
        t1=new Thread(this);
        setBounds(830,400,450,280);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel  l1=new JLabel("Shopping System Application");
        l1.setBounds(100,20,500,40);
        l1.setFont(new Font("Raileway",Font.BOLD,19));
        l1.setForeground(Color.blue);
        add(l1);
        
        p=new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(140,60,180,25);
        add(p);
           JLabel  l3=new JLabel("Please Wait...");
        l3.setBounds(180,80,150,35);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.red);
        add(l3);
        
         JLabel  l4=new JLabel("Welcome "+Username);
        l4.setBounds(20,83,120,250);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setForeground(Color.red);
        add(l4);
        t1.start();
    }
            
    public static void main(String[] args) {
      new loading("").setVisible(true);
    }
    

}
