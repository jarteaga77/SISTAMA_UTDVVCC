
package cotizacion.reporte;



import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jarteaga
 */
public class ReporteCotizacionCSS 

{
    
  private Conexion nueva=new Conexion();//Variable  de tipo conexion
  private final String logo="/UTDVVCC/recursos/logocsc.png";//Ruta del logo de la empresa

  
  
    public void ejecutarReporte(int  cotizacion)
    {
        try
        {
        JasperReport reporte;// varible de tipo JasperReport
        JasperReport subreportResumen;// varible de tipo JasperReport        
        JasperReport subreportTotal;
        //JasperReport subreporteCondicion;
        JasperPrint reporte_view;// Varible de tipo JasperPrint utilizada para imprimir el reporte
        
        URL  in = this.getClass().getResource("/cotizacion/reporte/reporteCotizacion_css.jasper");//Ruta del reporte maestro
        URL  in1 = this.getClass().getResource("/cotizacion/reporte/resumen_cotizacion_cas.jasper");//Ruta del subreporte
        URL in2= this.getClass().getResource("/cotizacion/reporte/reporte_total_resumen_cas.jasper");
        reporte = (JasperReport) JRLoader.loadObject( in );//La variable de tipo JasperReport utiliza la clase JRLoadrer y el metodo loadObject y recibe como parametro una varible de tipo url con la ruta del reporte.
        subreportResumen = (JasperReport) JRLoader.loadObject( in1 ); 
        subreportTotal=(JasperReport) JRLoader.loadObject( in2 );
        
         Map parametros = new HashMap();// Mapeo de los parametros
         parametros.clear();//Limpia la varible parametros
         parametros.put("consecutivo_cotizacion",cotizacion);//Nombre del parametro en el reporte y la variable q se le va asignar al parametro
         parametros.put("resumen",subreportResumen);
         parametros.put("total",subreportTotal);
         
         parametros.put("logo",this.getClass().getResourceAsStream(logo));//Carga la imagen encabezado en el reporte
        // parametros.put("pie",this.getClass().getResourceAsStream(pie));//Carga la imagen pie en el reporte
    
         reporte_view= JasperFillManager.fillReport(reporte, parametros, nueva.getConnection());//impresion del reporte, el metodo fillreport recibe como parametros variable de tipo jasperReport, parametros y la instancia de la conexion con la BD 
         //JasperViewer.viewReport(reporte_view , false );
         JasperViewer jviewer = new JasperViewer(reporte_view,false);//Se carga el reporte
         jviewer.setTitle("Cotizaciones Carlos Solarte");
         jviewer.setVisible(true);

         nueva.desconectar();
        
        
        }catch(JRException e)
        {
             System.out.println(e);
        }
    }
 
}
