
package ordenCompraCSS.reporte;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import ordenesCompra.conexion.Conexion;


/**
 *
 * @author jarteaga
 */
public class ReporteOrdenCompraCAS 

{
    
  private Conexion nueva=new Conexion();//Variable  de tipo conexion
  private final String encabezado="/UTDVVCC/recursos/logocss.jpg";//Ruta del logo de la empresa
  //private final String pie="/UTDVVCC/recursos/pie.png";
  
  
    public void ejecutarReporte(int  ordenCompra)
    {
        try
        {
        JasperReport reporte;// varible de tipo JasperReport     
        JasperReport subreporteComparativo;
        JasperReport subreporteTotalOrden;
        JasperPrint reporte_view;// Varible de tipo JasperPrint utilizada para imprimir el reporte
        
        URL  in = this.getClass().getResource("/ordenCompraCSS/reporte/Ordenes_Compra_Reporte_CSS.jasper");//Ruta del reporte maestro
        URL in1= this.getClass().getResource("/ordenCompraCSS/reporte/reporte_ordenes_compra_total_css.jasper");
        URL in2= this.getClass().getResource("/ordenCompraCSS/reporte/reporte_orden_comparativo_cas.jasper");
        reporte = (JasperReport) JRLoader.loadObject( in );//La variable de tipo JasperReport utiliza la clase JRLoadrer y el metodo loadObject y recibe como parametro una varible de tipo url con la ruta del reporte. 
        subreporteComparativo= (JasperReport)JRLoader.loadObject(in2);
        subreporteTotalOrden = (JasperReport) JRLoader.loadObject( in1 ); 
        
        //subreporteCondicion=(JasperReport) JRLoader.loadObject( in2 );
        
         Map parametros = new HashMap();// Mapeo de los parametros
         parametros.clear();//Limpia la varible parametros
         parametros.put("orden",ordenCompra);//Nombre del parametro en el reporte y la variable q se le va asignar al parametro
         parametros.put("comparativo",subreporteComparativo);
         parametros.put("ordenTotal",subreporteTotalOrden);
         parametros.put("encabezado",this.getClass().getResourceAsStream(encabezado));//Carga la imagen encabezado en el reporte
         //parametros.put("pie",this.getClass().getResourceAsStream(pie));//Carga la imagen pie en el reporte
  
         reporte_view= JasperFillManager.fillReport(reporte, parametros, nueva.getConnection());//impresion del reporte, el metodo fillreport recibe como parametros variable de tipo jasperReport, parametros y la instancia de la conexion con la BD 
         //JasperViewer.viewReport(reporte_view , false );
         JasperViewer jviewer = new JasperViewer(reporte_view,false);//Se carga el reporte
         jviewer.setTitle("Orden de Compra CSS");
         jviewer.setVisible(true);

         nueva.desconectar();
        
        
        }catch(JRException e)
        {
           System.out.println(e);
        }
    }
 
}
