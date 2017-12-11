
package cotizacion.dominio.cotizacionesCAS;


import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ordenesCompra.conexion.ConexionBD;

/**
 *
 * @author jarteaga
 */
public class DaoCotizacionCAS 

{
    ConexionBD nueva =new ConexionBD();
    
    private static long id_cotizacion;
    
    public static long getIdCotizacion() {
        return DaoCotizacionCAS.id_cotizacion;
    }

    public static void setIdCotizacion(long id_cotizacion) {
        DaoCotizacionCAS.id_cotizacion = id_cotizacion;
    }

    public void guardar(cotizacionCAS cot)
    {
        try
        {
      
        ResultSet obj=  nueva.executeQuery("INSERT INTO cotizaciones.cotizacion_cas (fecha_cotizacion,centro_costos,item_ccostos,cargo_a,fecha_trans_cotizacion,id_usuario)VALUES"
                + "('"+cot.getFecha_cotizacion()+"',"+cot.getId_ccostos()+","+cot.getId_item_ccostos()+",'"+cot.getCargo_a()+"','"+cot.getFecha_transacion()+"',"+cot.getId_usuario()+")RETURNING consecutivo_cotizacion ");
        
           while(obj.next()==true)
           {
               setIdCotizacion(obj.getLong("consecutivo_cotizacion"));
           }  
     
        nueva.desconectar();
        
        JOptionPane.showMessageDialog(null, "Se registro con exito la cotización");
        
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
