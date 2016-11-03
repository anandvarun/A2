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
public class Validation 
{
    Connection con;

    ResultSet rs;
    Validation()
    {
        try{
            
          
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
        //ip:username,password
        //return boolean
    public Boolean checkLogin(String username,String password)
    {
        try {
             
             Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/login","root","");  
 

Statement stmt=con.createStatement(); 
String quey="select * from users where username='"+ username + "'and password='" + password + "'";
ResultSet rs=stmt.executeQuery(quey);  
 
 

                        
          
            
            if(rs.next())
            { 
                con.close(); 
                //TRUE iff the query founds any corresponding data
                
                return true;
                
            }
            else
            {
                con.close(); 
                return false;
                 
            }
        } 
        catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
            return false;
        }
}
}