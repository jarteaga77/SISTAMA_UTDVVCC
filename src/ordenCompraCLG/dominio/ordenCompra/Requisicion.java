
package ordenCompraCLG.dominio.ordenCompra;

import ordenesCompra.dominio.ordenesCompra.*;

/**
 *
 * @author jarteaga
 */
public class Requisicion 

{
    private int it;
    private String descripcion;
    private float cant;

    public Requisicion(int it, String descripcion, float cant) {
        this.it = it;
        this.descripcion = descripcion;
        this.cant = cant;
    }
   

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }
  
}
