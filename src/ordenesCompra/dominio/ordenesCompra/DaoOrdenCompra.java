
package ordenesCompra.dominio.ordenesCompra;


import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ordenesCompra.conexion.ConexionBD;

/**
 *
 * @author jarteaga
 */
public class DaoOrdenCompra 

{

    ConexionBD nueva=new ConexionBD();
    
    private static long id_orden;

    public static long getId_orden() {
        return id_orden;
    }

    public static void setId_orden(long id_orden) {
        DaoOrdenCompra.id_orden = id_orden;
    }

    public DaoOrdenCompra() {
    }
 
    public void guardarOrden(ordenCompra orden)
    {
        try
        {
           ResultSet obj= nueva.executeQuery("INSERT INTO ordenescompra.orden_compra(fecha_transaccion,nit_proveedor,id_itemccostos,id_requisicion,cotizacion,cargoa_orden,dto_financiero,observacion,id_usuario,condiciones)VALUES"
             + "('"+orden.getFecha_hora()+"',"+orden.getNit_proveedor()+","+orden.getId_item_ccostos()+","+orden.getRequisicion()+",'"+orden.getCotizacion()+"','"+orden.getCargo_orden()+"',"+orden.getDto_financiero()+",'"+orden.getObservacion()+"',"+orden.getId_usuario()+", '"+orden.getCondiciones()+"')RETURNING consecutivo_orden_compra");
   
           while(obj.next()==true)
           {
               setId_orden(obj.getLong("consecutivo_orden_compra"));
           }
            nueva.desconectar();
            
            //JOptionPane.showMessageDialog(null,"Se registro con exito la orden de compra");
            
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarOrden(ordenCompra orden)
    {
        try
        {
            nueva.executeUpdateQuery("UPDATE ordenescompra.orden_compra SET nit_proveedor="+orden.getNit_proveedor()+",fecha_transaccion='"+orden.getFecha_hora()+"', cotizacion='"+orden.getCotizacion()+"', id_itemccostos="+orden.getId_item_ccostos()+", cargoa_orden='"+orden.getCargo_orden()+"', dto_financiero="+orden.getDto_financiero()+", observacion='"+orden.getObservacion()+"', condiciones='"+orden.getCondiciones()+"' WHERE consecutivo_orden_compra="+orden.getConsecutivo()+"");
            nueva.desconectar();            
            //JOptionPane.showMessageDialog(null, "Se actualizo con exito la orden de compra"); 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
