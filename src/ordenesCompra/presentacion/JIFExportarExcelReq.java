
package ordenesCompra.presentacion;


import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ordenesCompra.conexion.ConexionBD;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author jarteaga
 */
public class JIFExportarExcelReq extends javax.swing.JInternalFrame {

    
   private  DefaultTableModel modelo;
   public static MDIPrincipal principal;


    public JIFExportarExcelReq() {
        initComponents();
        modelo = new DefaultTableModel();

        modelo.addColumn("Requision N°");
        modelo.addColumn("Fecha");
        modelo.addColumn("Centro Costos");
        modelo.addColumn("Cargo A");
        modelo.addColumn("Item");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Detalle Requisición");
        modelo.addColumn("Observación");
        modelo.addColumn("UM");
        modelo.addColumn("Observación General");
        modelo.addColumn("Usuario");
 

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tabla_orden = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        b_buscar_fecha = new javax.swing.JButton();
        date_desde = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        date_hasta = new com.toedter.calendar.JDateChooser();
        btn_requisicion = new javax.swing.JButton();
        b_exportar_excel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar Requisición");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jt_tabla_orden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt_tabla_orden);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Hasta:");

        b_buscar_fecha.setText("Buscar");
        b_buscar_fecha.setToolTipText("Buscar orden por fecha");
        b_buscar_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscar_fechaActionPerformed(evt);
            }
        });

        date_desde.setDateFormatString("yyyy/MM/dd");

        jLabel1.setText("Desde:");

        date_hasta.setDateFormatString("yyyy/MM/dd");

        btn_requisicion.setText("Requisiciones");
        btn_requisicion.setToolTipText("Generar todas las ordenes");
        btn_requisicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_requisicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_buscar_fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_requisicion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_buscar_fecha)
                        .addComponent(btn_requisicion))
                    .addComponent(date_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(date_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14))
        );

        b_exportar_excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/xls.png"))); // NOI18N
        b_exportar_excel.setToolTipText("Exportar a Hoja de calculo");
        b_exportar_excel.setBorderPainted(false);
        b_exportar_excel.setContentAreaFilled(false);
        b_exportar_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exportar_excelActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_exportar_excel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_exportar_excel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_exportar_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exportar_excelActionPerformed
    
        //creamos un filtro de archivos para definir que archivos ver en el JFileChooser
        javax.swing.filechooser.FileNameExtensionFilter filterXls = new javax.swing.filechooser.FileNameExtensionFilter("Documentos MS Excel 95/2003", "xls");
 
        //instanciamos una ventana de seleccion de archivo
        final JFileChooser fc = new JFileChooser();
 
        //agregamos el filtro al filechooser
        fc.setFileFilter(filterXls);
 
        //capturamos la respuesta del usuario
        int returnVal = fc.showSaveDialog(null);
 
        //definimos el comportamiento de la ventana
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
 
        if (returnVal == JFileChooser.APPROVE_OPTION) {
 
            //@SuppressWarnings("UnusedAssignment")
            FileOutputStream fileOut = null;
           // @SuppressWarnings("UnusedAssignment")
            File fileXLS = null;
            try {
                //Creamos un objeto archivo con la ruta seleccionada
                fileXLS = fc.getSelectedFile();
 
 //Validamos si en la ruta el archivo se ha especificado la extensión
                String name = fileXLS.getName();
                if (name.indexOf('.') == -1) {
       //De no ser asi le agregamos
                    name += ".xls";
                    fileXLS = new File(fileXLS.getParentFile(), name);
                }
                fileOut = new FileOutputStream(fileXLS);
            
                     //Creamos la cabecera
                final String[] headers = {"REQUISICIÓN N°", "FECHA", "CENTRO COSTOS", "CARGO A","ITEM","CANTIDAD", "DETALLE REQUISICIÓN", "OBSERVACIÓN", "UM","OBSERVACIÓN GENERAL","USUARIO"};
                
                
                HSSFWorkbook wb = new HSSFWorkbook();
                HSSFSheet sheet = wb.createSheet("REQUISICIONES");
                HSSFRow rowhead = sheet.createRow(0);
                
                //Definimos el estilo de la cabecera
                CellStyle headerStyle = wb.createCellStyle();
  //Color de fondo
                headerStyle.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
  //Estilo de la fuente
                Font hfont = wb.createFont();
                hfont.setBoldweight(Font.BOLDWEIGHT_BOLD);
                headerStyle.setFont(hfont);
  //Alineacion Horizontal
                headerStyle.setAlignment(CellStyle.ALIGN_CENTER);
                // Creamos una fila, las filas empiezan en 0
                Row titleRow = sheet.createRow((short) 0);
  //Creamos una celda para nuestra fila
                Cell hCell = titleRow.createCell((short) 0);               

                Row row = sheet.createRow((short) 0);
 /**
  Creamos nuestras celdas de acuerdo a nuestro array headers
  Por cada cabecera creamos una celda y le asignamos el estilo.
 */
                for (int i = 0; i < headers.length; i++) { 
                    Cell cell = row.createCell(i);
                    cell.setCellValue(headers[i]);
                    cell.setCellStyle(headerStyle);
  //Asigna automaticamente el tamaño
                    sheet.autoSizeColumn(i);
                }
              
//                Obtiene el nombre de cabecera de las columnas      
//                for(int i = 0; i < jt_tabla_orden.getColumnCount(); i++)
//                {
//                 rowhead.createCell(i).setCellValue(jt_tabla_orden.getColumnName(i));
//                }  
                    
                //Cremos la fila y columna que contenga la JTable
                    for(int fil=1; fil<=jt_tabla_orden.getRowCount(); fil++)
                    {    
                
                        rowhead = sheet.createRow(fil);
                        for(int col=0; col<jt_tabla_orden.getColumnCount(); col++)
                        {
                        rowhead.createCell(col).setCellValue(String.valueOf(jt_tabla_orden.getValueAt(fil -1 , col)));
                        }
                    }
 
                for (int i = 0; i < headers.length; i++) {
                    sheet.autoSizeColumn(i);
                }
// // Escribimos el libro
                
                 wb.write(fileOut);
              
                fileOut.close(); 
                
              
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error",JOptionPane.ERROR_MESSAGE);
            }

            
        }
    }//GEN-LAST:event_b_exportar_excelActionPerformed

    private void btn_requisicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_requisicionActionPerformed
         LimpiarJTabla();
         consultarReqTodos();
    }//GEN-LAST:event_btn_requisicionActionPerformed

    private void b_buscar_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscar_fechaActionPerformed
        LimpiarJTabla();
        
       Date fechaI=date_desde.getDate();
       Date fechaF=date_hasta.getDate();
       
       consultarReqFecha(fechaI, fechaF);
        
      
    }//GEN-LAST:event_b_buscar_fechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar_fecha;
    private javax.swing.JButton b_exportar_excel;
    private javax.swing.JButton btn_requisicion;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date_desde;
    private com.toedter.calendar.JDateChooser date_hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jt_tabla_orden;
    // End of variables declaration//GEN-END:variables

 public void LimpiarJTabla()
    {

        for(int i=modelo.getRowCount()-1;i>=0;i--)
        {
            modelo.removeRow(i);          
        }
    }

public void consultarReqTodos()
{
     try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT req.idreq,req.fecha_req,(ccostos.nombre_centro_costos ||'-'|| item.nombre_item_ccostos)AS centro,"
                     + "req.cargoa_req, det.item_det_req,det.cant_det_req,det.detalle_det_req,det.obs_det_req,um.unidad,req.obs_gen,"
                     + "(usu.nombre_usu ||' '||usu.apellido_usu) AS usuario "
                     + "FROM requisicion.requisicion req JOIN requisicion.detallerequisicion det ON req.idreq=det.requisicion_idreq "
                     + "JOIN utdvvcc.itemccostos item ON item.id_item_ccostos=req.id_item_ccostos "
                     + "JOIN unidad_medida um ON det.uni_det_req=um.id_unidad "
                     + "JOIN utdvvcc.centrocostos ccostos ON ccostos.id_centrocostos=item.id_centrocostos "
                     + "JOIN usuariosistema.usuariosreq usu ON usu.idusuario=req.usuarios_idusuario "
                     + "ORDER BY req.idreq, det.item_det_req ASC");
    
          
        while(obj.next()==true) 
        {
        
        Object [] datos = new Object[11];
        
        for (int i=0;i<11;i++)
        {
            datos[i] =obj.getObject(i+1);    
        }

         modelo.addRow(datos);
         jt_tabla_orden.setModel(modelo);

        }

         nueva.desconectar();
   
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
}



public void consultarReqFecha(Date fechaI, Date fechaF)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT req.idreq,req.fecha_req,(ccostos.nombre_centro_costos ||'-'|| item.nombre_item_ccostos)AS centro,"
                     + "req.cargoa_req, det.item_det_req,det.cant_det_req,det.detalle_det_req,det.obs_det_req,um.unidad,req.obs_gen,"
                     + "(usu.nombre_usu ||' '||usu.apellido_usu) AS usuario "
                     + "FROM requisicion.requisicion req JOIN requisicion.detallerequisicion det ON req.idreq=det.requisicion_idreq "
                     + "JOIN utdvvcc.itemccostos item ON item.id_item_ccostos=req.id_item_ccostos "
                     + "JOIN unidad_medida um ON det.uni_det_req=um.id_unidad "
                     + "JOIN utdvvcc.centrocostos ccostos ON ccostos.id_centrocostos=item.id_centrocostos "
                     + "JOIN usuariosistema.usuariosreq usu ON usu.idusuario=req.usuarios_idusuario "
                     + "WHERE req.fecha_req BETWEEN '"+fechaI+"' AND '"+fechaF+"' "
                     + "ORDER BY req.idreq, det.item_det_req ASC");

        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[11];
        
            for (int i=0;i<11;i++)
             {
                datos[i] =obj.getObject(i+1);
    
             }

         modelo.addRow(datos);
         jt_tabla_orden.setModel(modelo);
     
        }
       
         nueva.desconectar();
   
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    

}
