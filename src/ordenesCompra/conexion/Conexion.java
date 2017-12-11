
package ordenesCompra.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jarteaga
 */
public class Conexion 
{
    
   private final String bd = "SistemaUTDVVCC";
   private final String login = "postgres";
   private final String password = "postgres";
  //private final String url = "jdbc:postgresql://192.168.1.249:5432/"+bd;
  private final String url = "jdbc:postgresql://192.168.1.128:5432/"+bd;
   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para postgres
         Class.forName("org.postgresql.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);
         if (conn!=null){
            System.out.println("Conexión a base de datos "+bd+". listo");
         }
      }catch(  Exception e){
          JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
      System.out.println("La conexion a la  base de datos "+bd+" a terminado");
   }
    
}
