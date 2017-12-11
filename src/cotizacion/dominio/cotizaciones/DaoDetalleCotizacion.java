
package cotizacion.dominio.cotizaciones;

import javax.swing.JOptionPane;
import ordenesCompra.conexion.ConexionBD;

/**
 *
 * @author jarteaga
 */
public class DaoDetalleCotizacion 
{
    
    ConexionBD nueva =new ConexionBD();
    
    public void guardarDetalle(detalle_cotizacion detalle)
    {
        try
        {
            
           detalle.setSubtotal(detalle.getCant_prod_servicio() * detalle.getVlor_unitario()- detalle.getDescuento());
    
        nueva.executeUpdateQuery("INSERT INTO cotizaciones.detalle_cotizacion(nit_proveedor,item,detalle_prod_servicio,cantidad_prod_servicio,vlor_unitario,cotizacion,estado,consecutivo_cotizacion,id_unidad,subtotal,requisicion,descuento,referencia)VALUES ("+detalle.getNit_proveedor()+", "+detalle.getItem()+",'"+detalle.getDetalle_prod_servicio()+"',"+detalle.getCant_prod_servicio()+", "+detalle.getVlor_unitario()+", '"+detalle.getCotizacion()+"',"+detalle.getEstado()+", "+detalle.getConsecutivo_cotizacion()+", "+detalle.getUnidad()+","+detalle.getSubtotal()+","+detalle.getRequisicion()+","+detalle.getDescuento()+",'"+detalle.getReferencia()+"')");
        
        nueva.desconectar();
       
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
