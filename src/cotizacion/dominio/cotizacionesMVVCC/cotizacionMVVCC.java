
package cotizacion.dominio.cotizacionesMVVCC;

import java.util.Date;

/**
 *
 * @author jarteaga
 */
public class cotizacionMVVCC 

{
    
    private Date fecha_cotizacion;
    private int id_ccostos;
    private int id_item_ccostos;
    private String cargo_a;
    private Date fecha_transacion;
    private int id_usuario;
  

    public String getCargo_a() {
        return cargo_a;
    }

    public void setCargo_a(String cargo_a) {
        this.cargo_a = cargo_a;
    }

    public Date getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public void setFecha_cotizacion(Date fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
    }

    public int getId_ccostos() {
        return id_ccostos;
    }

    public void setId_ccostos(int id_ccostos) {
        this.id_ccostos = id_ccostos;
    }

    public int getId_item_ccostos() {
        return id_item_ccostos;
    }

    public void setId_item_ccostos(int id_item_ccostos) {
        this.id_item_ccostos = id_item_ccostos;
    }

    public Date getFecha_transacion() {
        return fecha_transacion;
    }

    public void setFecha_transacion(Date fecha_transacion) {
        this.fecha_transacion = fecha_transacion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    
    
    
    
}
