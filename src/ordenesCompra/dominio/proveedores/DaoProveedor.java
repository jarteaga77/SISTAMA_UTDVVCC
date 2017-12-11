
package ordenesCompra.dominio.proveedores;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ordenesCompra.conexion.ConexionBD;

/**
 *
 * @author jarteaga
 */
public class DaoProveedor 
{
    
    ConexionBD nueva=new ConexionBD();
    
    
  public void guardarProveedor(proveedor oprove, long nit)
    {
        try
        {
            
            ResultSet obj=nueva.executeQuery("SELECT nit_proveedor FROM proveedores.proveedor WHERE nit_proveedor="+nit+"");
            
            if(obj.next()== true)
            {
                JOptionPane.showMessageDialog(null, "No se puede registrar el proveedor! Ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
      
            nueva.executeUpdateQuery("INSERT INTO proveedores.proveedor (nit_proveedor, prove_razon_social, prove_direccion, prove_telefono1,prove_telefono2,prove_celular1,prove_celular2, prove_fax,prove_contacto1,prove_contacto2,id_ciudad,razon_comercial)VALUES("+oprove.getNit_proveedor()+",'"+oprove.getRazon_social()+"','"+oprove.getDireccion()+"','"+oprove.getTel1()+"','"+oprove.getTel2()+"','"+oprove.getCelular1()+"','"+oprove.getCelular2()+"', '"+oprove.getFax()+"', '"+oprove.getContacto1()+"', '"+oprove.getContacto2()+"', "+oprove.getId_ciudad()+", '"+oprove.getRazon_comercial()+"')");
                    
            nueva.desconectar();
            
            JOptionPane.showMessageDialog(null,"Se registro con exito el Proveedor");
            }
            
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminar(long nit)
    {
        
       try
       {
           nueva.executeUpdateQuery("DELETE FROM proveedores.proveedor WHERE nit_proveedor="+nit+"");
           nueva.desconectar();
           
           JOptionPane.showMessageDialog(null, "Se elimino con exito el Proveedor");
           
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
       }
            
    }
    
    
    public void actualizar(proveedor oprove, long nit)
    {
        try
        {
            nueva.executeUpdateQuery("UPDATE proveedores.proveedor SET prove_razon_social='"+oprove.getRazon_social()+"',prove_direccion='"+oprove.getDireccion()+"', prove_telefono1='"+oprove.getTel1()+"', prove_telefono2='"+oprove.getTel2()+"', prove_celular1='"+oprove.getCelular1()+"', prove_celular2='"+oprove.getCelular2()+"', prove_fax='"+oprove.getFax()+"', prove_contacto1='"+oprove.getContacto1()+"', prove_contacto2='"+oprove.getContacto2()+"', id_ciudad="+oprove.getId_ciudad()+", razon_comercial='"+oprove.getRazon_comercial()+"' WHERE nit_proveedor="+nit+"");
            
            nueva.desconectar();
            
            JOptionPane.showMessageDialog(null, "Se actulizo con exito el proveedor");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    
}
