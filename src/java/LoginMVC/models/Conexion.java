
package LoginMVC.models;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Conexion 
{
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "logindb";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    
    public java.sql.Connection con;
    
    public Conexion()
    {
        try
        {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e)
        {
            System.out.println("Error");
        } catch (SQLException e)
        {
            System.out.println("Error");
        }
    
    }
    
    public static void main(String[] args)
    {
        Conexion con = new Conexion();
    }
}    
    
    
    
    
    
    
    
    
    
    
    
    
    

