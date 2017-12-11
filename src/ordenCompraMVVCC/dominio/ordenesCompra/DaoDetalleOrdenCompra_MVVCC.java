
package ordenCompraMVVCC.dominio.ordenesCompra;

import javax.swing.JOptionPane;
import ordenesCompra.conexion.ConexionBD;

/**
 *
 * @author jarteaga
 */
public class DaoDetalleOrdenCompra_MVVCC 

{
    ConexionBD nueva=new ConexionBD();
 
    
    public void guardarDetalle(Detalle_orden_compra_MVVCC detalle)
    {
        try
        {
        
        nueva.executeUpdateQuery("INSERT INTO ordenescompra.detalle_orden_compra_mvvcc(descripcion,cantidad,id_unidad,referencia,consecutivo_ordencompra,subtotal,vlor_unitario,item_det_orden,total,id_iva,dto_comercial,iva,codigo_sinco)VALUES('"+detalle.getDescripcion()+"',"+detalle.getCantidad()+","+detalle.getId_unidad()+",'"+detalle.getReferencia()+"',"+detalle.getId_consecutivo_orden()+","+detalle.getSubtotal()+","+detalle.getVlorUnitario()+","+detalle.getItem()+", "+detalle.getTotal()+", "+detalle.getId_iva()+", "+detalle.getDto_comercial()+", "+detalle.getIva()+", "+detalle.getCod_sinco()+")");
     
        nueva.desconectar();
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
         }
    }
    
    public void updateDetalle(Detalle_orden_compra_MVVCC detalle, int id_detalle)
    {
         try
        {
        
       // long subtotal=(long) (detalle.getVlorUnitario() * detalle.getCantidad());
        
        nueva.executeUpdateQuery("UPDATE ordenescompra.detalle_orden_compra_mvvcc SET descripcion='"+detalle.getDescripcion()+"', cantidad="+detalle.getCantidad()+", referencia='"+detalle.getReferencia()+"', vlor_unitario="+detalle.getVlorUnitario()+", subtotal="+detalle.getSubtotal()+", id_unidad="+detalle.getId_unidad()+", total="+detalle.getTotal()+" WHERE id_detalle_orden_compra="+id_detalle+" AND consecutivo_ordencompra="+detalle.getId_consecutivo_orden()+"");
        nueva.desconectar();
        
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
         }
    }
 
}
