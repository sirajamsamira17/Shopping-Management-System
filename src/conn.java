
package shoppingsystem;

import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){
   try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
       if(c==null)
           System.out.println("connection prblm");
       s=c.createStatement();
       
   }catch(Exception e){
       e.printStackTrace();
   }
 
}
}