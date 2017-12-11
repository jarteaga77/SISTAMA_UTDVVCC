
package ordenCompraCSS.dominio.ordenCompra;

/**
 *
 * @author jarteaga
 */
public class Detalle_orden_compraCSS 
{
    private String descripcion;
    private float cantidad;
    private float vlorUnitario;
    private int id_unidad;
    private String referencia;
    private long id_consecutivo_orden; 
    private float item_detalle;
    private long iva;
    private long subtotal;
    private long total;
    private long dto_comercial;
    private int id_iva;
    private int cod_sinco;
    
  
    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public float getVlorUnitario() {
        return vlorUnitario;
    }

    public void setVlorUnitario(float vlorUnitario) {
        this.vlorUnitario = vlorUnitario;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public long getId_consecutivo_orden() {
        return id_consecutivo_orden;
    }

    public void setId_consecutivo_orden(long id_consecutivo_orden) {
        this.id_consecutivo_orden = id_consecutivo_orden;
    }

    public float getItem() {
        return item_detalle;
    }

    public void setItem(float item_detalle) {
        this.item_detalle = item_detalle;
    }


    public long getIva() {
        return iva;
    }

    public void setIva(long iva) {
        this.iva = iva;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getDto_comercial() {
        return dto_comercial;
    }

    public void setDto_comercial(long dto_comercial) {
        this.dto_comercial = dto_comercial;
    }

    public int getId_iva() {
        return id_iva;
    }

    public void setId_iva(int id_iva) {
        this.id_iva = id_iva;
    }

    public float getItem_detalle() {
        return item_detalle;
    }

    public void setItem_detalle(float item_detalle) {
        this.item_detalle = item_detalle;
    }

    public int getCod_sinco() {
        return cod_sinco;
    }

    public void setCod_sinco(int cod_sinco) {
        this.cod_sinco = cod_sinco;
    }
    
    
}
