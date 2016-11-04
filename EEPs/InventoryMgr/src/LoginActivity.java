/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nirav Vyas
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author varunmurali
 */
public class LoginActivity {
     Connection con;

    ResultSet rs;
    PreparedStatement pst;
    LoginActivity(){
    try{
            
          
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public void TrackLogin(String username)
    {
        try {
            System.out.println("Starting track");
             
             Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/login","root","");  
 
String timeStamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime());
Statement stmt=con.createStatement(); 
System.out.println("Tracked");
String quey="insert into track values('"+ username + "','" + timeStamp + "','0', 'InventoryApp');" ;
stmt.executeUpdate(quey);  
 
 

                        
          
            
           
        } 
    
        catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
           
        }
    
    }
   
}
