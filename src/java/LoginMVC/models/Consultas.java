
package LoginMVC.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas extends Conexion
{
    
   public boolean Autenticacion(String user,String pass) throws SQLException
   {
       Statement st = con.createStatement();
       ResultSet rs = null;
       String Consulta = "select * from Usuarios";
       rs = st.executeQuery(Consulta);
       while(rs.next())
       {
           if(user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contrasena")))
           {
               return true;
           }
       }
       return false;
   }
   public static void main(String[] args) {
       try {
           Consultas con = new Consultas();
           System.out.println(con.Autenticacion("marcos","123"));
       } catch (SQLException ex) {
           Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
}
