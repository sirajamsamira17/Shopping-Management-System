
package shoppingsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*public class splash {
    
    
    public static void main(String[]args){
        //splashFrame frame=new splashFrame();
        //frame.setVisible(true);
        new splashFrame().setVisible(true);
       // int x=1;
       // for(int i=0;i<=980;i++,x+=4){
      //  frame.setLocation(480,250);
        //frame.setSize(x+i,i);
        //try{
          //  Thread.sleep(10);
        //}catch(Exception e){}
       // }
    //frame.setVisible(true);
}
}
class splashFrame extends JFrame implements ActionListener{
    //Thread t1;
    
    splashFrame(){
      
    setLayout(null);
    setVisible(true);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/splash.png"));
       // Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
          //ImageIcon i3=new ImageIcon(i2);
          JLabel l1=new JLabel(i1);
    //l3.setBounds(50,40,225,225);
    //add(l3);
        
        setBounds(200,60,980,495);
         add(l1);
       // t1=new Thread(this);
       // t1.start();
       
    /*}
    public void run(){
        try{
            //Thread.sleep(8000);
            this.setVisible(false);
        }catch(Exception e){}*/
  public class splash  extends JFrame implements ActionListener {
    JButton b1;
splash(){
    
    //setExtendedState(JFrame.MAXIMIZED_BOTH);
    setBounds(200,50,980,600);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shoppingsystem/icon/splash.png"));
    JLabel l1=new JLabel(i1);
    l1.setBounds(15,0,980,600);
    add(l1);
    
 
    
    JButton b1=new JButton("NEXT");
    b1.setBackground(Color.orange);
    b1.setForeground(Color.white);
    b1.setBounds(810,490,100,50);
    b1.addActionListener( this);
    l1.add(b1);
    setLayout(null);
    setVisible(true);
}

  public void actionPerformed(ActionEvent ae){
          
       
       new dashboard().setVisible(true);
   this .setVisible(false);
   
  }
    public static void main(String[] args) {
      new splash();
    }
    
}
