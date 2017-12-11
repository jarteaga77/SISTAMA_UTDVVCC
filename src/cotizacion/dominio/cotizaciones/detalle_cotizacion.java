
package cotizacion.dominio.cotizaciones;

/**
 *
 * @author jarteaga
 */
public class detalle_cotizacion 
{
    
    private long nit_proveedor;
    private String detalle_prod_servicio;
    private float cant_prod_servicio;
    private long vlor_unitario;
    private int unidad;
    private String cotizacion;
    private boolean estado;
    private long consecutivo_cotizacion;
    private int item;
    private double subtotal;
    private long requisicion;
    private float descuento;
    private String referencia;

    public float getCant_prod_servicio() {
        return cant_prod_servicio;
    }

    public void setCant_prod_servicio(float cant_prod_servicio) {
        this.cant_prod_servicio = cant_prod_servicio;
    }

    public long getConsecutivo_cotizacion() {
        return consecutivo_cotizacion;
    }

    public void setConsecutivo_cotizacion(long consecutivo_cotizacion) {
        this.consecutivo_cotizacion = consecutivo_cotizacion;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getDetalle_prod_servicio() {
        return detalle_prod_servicio;
    }

    public void setDetalle_prod_servicio(String detalle_prod_servicio) {
        this.detalle_prod_servicio = detalle_prod_servicio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public long getNit_proveedor() {
        return nit_proveedor;
    }

    public void setNit_proveedor(long nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public long getVlor_unitario() {
        return vlor_unitario;
    }

    public void setVlor_unitario(long vlor_unitario) {
        this.vlor_unitario = vlor_unitario;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public long getRequisicion() {
        return requisicion;
    }

    public void setRequisicion(long requisicion) {
        this.requisicion = requisicion;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    

    
    
    
    
    
    
    
}
