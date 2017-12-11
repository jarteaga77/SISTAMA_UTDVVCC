
package ordenesCompra.dominio.ordenesCompraCIVSAS;

import java.util.Date;

/**
 *
 * @author jarteaga
 */
public class ordenCompra 
{
    
    private long consecutivo;
    private long nit_proveedor;
    private String requisicion;
    private int id_centroCostos;
    private int id_item_ccostos;
    private int id_usuario;
    private Date fecha_hora;
    private String cotizacion;
    private int dto_financiero;
    private String cargo_orden;
    private String observacion;
    private String condiciones;
    private boolean estado_dtocome;
    private int dto_comer;


 
   

    public long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public int getId_centroCostos() {
        return id_centroCostos;
    }

    public void setId_centroCostos(int id_centroCostos) {
        this.id_centroCostos = id_centroCostos;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public long getNit_proveedor() {
        return nit_proveedor;
    }

    public void setNit_proveedor(long nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public String getRequisicion() {
        return requisicion;
    }

    public void setRequisicion(String requisicion) {
        this.requisicion = requisicion;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public int getDto_financiero() {
        return dto_financiero;
    }

    public void setDto_financiero(int dto_financiero) {
        this.dto_financiero = dto_financiero;
    }

    public String getCargo_orden() {
        return cargo_orden;
    }

    public void setCargo_orden(String cargo_orden) {
        this.cargo_orden = cargo_orden;
    }

    public int getId_item_ccostos() {
        return id_item_ccostos;
    }

    public void setId_item_ccostos(int id_item_ccostos) {
        this.id_item_ccostos = id_item_ccostos;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public boolean isEstado_dtocome() {
        return estado_dtocome;
    }

    public void setEstado_dtocome(boolean estado_dtocome) {
        this.estado_dtocome = estado_dtocome;
    }

    public int getDto_comer() {
        return dto_comer;
    }

    public void setDto_comer(int dto_comer) {
        this.dto_comer = dto_comer;
    }

    
    
    
    
    
    
    
    
}
