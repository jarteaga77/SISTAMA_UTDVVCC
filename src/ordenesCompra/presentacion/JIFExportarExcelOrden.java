
package ordenesCompra.presentacion;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class JIFExportarExcelOrden extends javax.swing.JInternalFrame {

    
   private  DefaultTableModel modelo;
   public static MDIPrincipal principal;


    public JIFExportarExcelOrden() {
        initComponents();
        modelo = new DefaultTableModel();

        modelo.addColumn("Orden N°");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nit");
        modelo.addColumn("Razón Social");
        modelo.addColumn("C.Costos");
        modelo.addColumn("Item C.Costos");
        modelo.addColumn("Item");
        modelo.addColumn("Descripción");
        modelo.addColumn("Referencia");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Vlor. Unitario");
        modelo.addColumn("Dto.Comercial");
        modelo.addColumn("IVA %");
        modelo.addColumn("IVA");   
        modelo.addColumn("Subtotal");
        modelo.addColumn("Total");
        modelo.addColumn("Observación");
        modelo.addColumn("Id Usuario");
        modelo.addColumn("Nombre Usuario");
        modelo.addColumn("Apellido Usuario");
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
        jdate_desde = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jdate_hasta = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        rb_cas = new javax.swing.JRadioButton();
        rb_utd = new javax.swing.JRadioButton();
        rb_mvvcc = new javax.swing.JRadioButton();
        rb_clg = new javax.swing.JRadioButton();
        rb_civ = new javax.swing.JRadioButton();
        b_exportar_excel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        b_buscar_orden = new javax.swing.JButton();
        txt_orden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_ordenes = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txt_proveedor = new javax.swing.JTextField();
        cb_proveedor = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar Ordenes de Compra");

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango de fecha"));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Hasta:");

        b_buscar_fecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        b_buscar_fecha.setText("Buscar");
        b_buscar_fecha.setToolTipText("Buscar orden por fecha");
        b_buscar_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscar_fechaActionPerformed(evt);
            }
        });

        jdate_desde.setDateFormatString("yyyy/MM/dd");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Desde:");

        jdate_hasta.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdate_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdate_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_buscar_fecha)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_buscar_fecha)
                    .addComponent(jdate_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jdate_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionador de busqueda"));

        buttonGroup1.add(rb_cas);
        rb_cas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_cas.setText("CSS");

        buttonGroup1.add(rb_utd);
        rb_utd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_utd.setSelected(true);
        rb_utd.setText("UTDVVCC");

        buttonGroup1.add(rb_mvvcc);
        rb_mvvcc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_mvvcc.setText("UTCMVVCC");

        buttonGroup1.add(rb_clg);
        rb_clg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_clg.setText("CLG");

        buttonGroup1.add(rb_civ);
        rb_civ.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_civ.setText("CIV S.A.S");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_utd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_cas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_mvvcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_clg)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(321, Short.MAX_VALUE)
                    .addComponent(rb_civ)
                    .addGap(2, 2, 2)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_utd)
                    .addComponent(rb_cas)
                    .addComponent(rb_mvvcc)
                    .addComponent(rb_clg))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rb_civ)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de orden"));

        b_buscar_orden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        b_buscar_orden.setText("Buscar");
        b_buscar_orden.setToolTipText("Buscar por orden N°");
        b_buscar_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscar_ordenActionPerformed(evt);
            }
        });

        txt_orden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ordenKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Orden de compra N°:");

        b_ordenes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        b_ordenes.setText("Ordenes de Compra");
        b_ordenes.setToolTipText("Generar todas las ordenes");
        b_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ordenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_buscar_orden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_ordenes)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_buscar_orden)
                    .addComponent(b_ordenes))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));

        txt_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_proveedorKeyReleased(evt);
            }
        });

        cb_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_proveedorActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_proveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_exportar_excel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(b_exportar_excel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
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
                final String[] headers = {"ORDEN N°", "FECHA", "NIT PROVEEDOR", "RAZÓN SOCIAL","C.COSTOS","ITEM C.COSTOS", "ITEM", "DESCRIPCION","REFERENCIA", "CANTIDAD","VLOR. UNITARIO","DTO. COMERCIAL","%IVA","IVA", "SUBTOTAL","TOTAL","OBSERVACIÓN","ID USUARIO", "NOMBRE", "APELLIDO"};
                
                
                HSSFWorkbook wb = new HSSFWorkbook();
                HSSFSheet sheet = wb.createSheet("Ordenes de Compra");
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

    private void b_buscar_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscar_ordenActionPerformed
        LimpiarJTabla();
        
        if(rb_utd.isSelected()==true)
        {
           if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrden(orden);
            txt_orden.setText("");  
        }
         else 
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
            txt_orden.setText("");
        }
      }else if(rb_cas.isSelected()==true)
      {
            if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenCAS(orden);
            txt_orden.setText("");
        }
         else 
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
            txt_orden.setText("");
        }
          
      }else if(rb_mvvcc.isSelected()==true)
      {
             if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenMVVCC(orden);
            txt_orden.setText("");
        }
         else 
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
            txt_orden.setText("");
        }
      }else if(rb_clg.isSelected()==true)
      {
             if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenCLG(orden);
            txt_orden.setText("");
        }
         else 
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
            txt_orden.setText("");
        }
      }else if(rb_civ.isSelected()==true)
      {
             if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenCIV(orden);
            txt_orden.setText("");
        }
         else 
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
            txt_orden.setText("");
        }
    
      }  
        
    }//GEN-LAST:event_b_buscar_ordenActionPerformed

    private void b_ordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ordenesActionPerformed
        LimpiarJTabla();
        
        if(rb_utd.isSelected()==true)
        {
            consultarOrdenTodos();
            
        }else if(rb_cas.isSelected()==true)
        {
            consultarOrdenTodosCAS();
        }else if(rb_mvvcc.isSelected()==true)
        {
            consultarOrdenTodosMVVCC();
        }
        else if(rb_clg.isSelected()==true)
        {
            consultarOrdenTodoCLG();
        }

    }//GEN-LAST:event_b_ordenesActionPerformed

    private void b_buscar_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscar_fechaActionPerformed
        LimpiarJTabla();
        
        if(rb_utd.isSelected()==true)
        {
           Date fechaI=jdate_desde.getDate();
           Date fechaF=jdate_hasta.getDate();
        
           consultarOrdenFecha(fechaI,fechaF);
            
        }else if(rb_cas.isSelected()==true)
        {
            Date fechaI=jdate_desde.getDate();
            Date fechaF=jdate_hasta.getDate();
            
            consultarOrdenFechaCAS(fechaI, fechaF);
        }else if(rb_mvvcc.isSelected()==true)
        {
            Date fechaI=jdate_desde.getDate();
            Date fechaF=jdate_hasta.getDate();
            
            consultarOrdenFechaMVVCC(fechaI, fechaF);
        }
        else if(rb_clg.isSelected()==true)
        {
            Date fechaI=jdate_desde.getDate();
            Date fechaF=jdate_hasta.getDate();
            
            consultarOrdenFechaCLG(fechaI, fechaF);
        }
        
         else if(rb_civ.isSelected()==true)
        {
            Date fechaI=jdate_desde.getDate();
            Date fechaF=jdate_hasta.getDate();
            
            consultarOrdenFechaCIV(fechaI, fechaF);
        }
      
    }//GEN-LAST:event_b_buscar_fechaActionPerformed

    private void txt_ordenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ordenKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
       {
        
        LimpiarJTabla();
        
        if(rb_utd.isSelected()==true)
        {
            if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrden(orden);
            txt_orden.setText("");
       
        }
        else {
                JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
                txt_orden.setText("");
            }
      }else if(rb_cas.isSelected()==true)
      {
              if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenCAS(orden);
            txt_orden.setText("");
       
        }
        else {
                JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
                txt_orden.setText("");
             }
      }else if(rb_mvvcc.isSelected()==true)
      {
              if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenMVVCC(orden);
            txt_orden.setText("");
       
        }
        else {
                JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
                txt_orden.setText("");
            }
      }   else if(rb_clg.isSelected()==true)
      {
              if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenCLG(orden);
            txt_orden.setText("");
       
        }
        else {
                JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
                txt_orden.setText("");
            }
      }  else if(rb_civ.isSelected()==true)
      {
              if(txt_orden.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo Orden de Compra vacio, \ndigite el número de la orden");
        }else
        if(txt_orden.getText().matches("[0-9]*"))
        {
            int  orden=Integer.parseInt(txt_orden.getText());
            consultarOrdenCIV(orden);
            txt_orden.setText("");
       
        }
        else {
                JOptionPane.showMessageDialog(null, "El campo Orden de Compra es de tipo numérico, \ndigite el número de la orden nuevamente");
                txt_orden.setText("");
            }
      }   
     }
    }//GEN-LAST:event_txt_ordenKeyPressed

    private void txt_proveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_proveedorKeyReleased
          if(evt.getKeyCode()== KeyEvent.VK_SHIFT)
        {
            try {
                cb_proveedor.removeAllItems();
                buscarProveedores();
            } catch (SQLException ex) {
                Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txt_proveedorKeyReleased

    private void cb_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_proveedorActionPerformed
        if(cb_proveedor.getSelectedItem()!=null)
            {
            try {
                ConexionBD nueva=new ConexionBD();
                long nit;
                
                String nombre=cb_proveedor.getSelectedItem().toString();
                ResultSet obj=nueva.executeQuery("SELECT nit_proveedor FROM proveedores.proveedor WHERE prove_razon_social='"+nombre+"'");
                
                while(obj.next())
                {
                    nit=obj.getLong("nit_proveedor");
                    txt_proveedor.setText("");
                    txt_proveedor.setText(String.valueOf(nit));
                }
                nueva.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
    }//GEN-LAST:event_cb_proveedorActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
         LimpiarJTabla();
        
         long  nit=Long.parseLong(txt_proveedor.getText());
         
        if(rb_utd.isSelected()==true)
        {   
           consultarOrdenProveedorUTD(nit);
            
        }else if(rb_cas.isSelected()==true)
        {
           consultarOrdenCASProveedores(nit);
                       
        }else if(rb_mvvcc.isSelected()==true)
        {
            consultarOrdenMVVCCProveedores(nit);           
        }
        else if(rb_clg.isSelected()==true)
        {
            consultarOrdenProveedorCLG(nit);
        }
        
         else if(rb_civ.isSelected()==true)
        {
            consultarOrdenProveedorCIV(nit);
        }
                    
    }//GEN-LAST:event_btn_buscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar_fecha;
    private javax.swing.JButton b_buscar_orden;
    private javax.swing.JButton b_exportar_excel;
    private javax.swing.JButton b_ordenes;
    private javax.swing.JButton btn_buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate_desde;
    private com.toedter.calendar.JDateChooser jdate_hasta;
    private javax.swing.JTable jt_tabla_orden;
    private javax.swing.JRadioButton rb_cas;
    private javax.swing.JRadioButton rb_civ;
    private javax.swing.JRadioButton rb_clg;
    private javax.swing.JRadioButton rb_mvvcc;
    private javax.swing.JRadioButton rb_utd;
    private javax.swing.JTextField txt_orden;
    private javax.swing.JTextField txt_proveedor;
    // End of variables declaration//GEN-END:variables

 public void LimpiarJTabla()
    {

        for(int i=modelo.getRowCount()-1;i>=0;i--)
        {
            modelo.removeRow(i);          
        }
    }
 
 public void consultarOrden(int  orden)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra o JOIN ordenescompra.detalle_orden_compra d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.consecutivo_orden_compra="+orden+" "
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY "
                     + "o.consecutivo_orden_compra,d.item_det_orden ASC");
       
            
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
 
  public void consultarOrdenCAS(int orden)
{
    try
    {

             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,"
                     + "c.nombre_ccostos,i.nombre_ccostos_cc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.total,d.subtotal,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_css o JOIN ordenescompra.detalle_orden_compra_css d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN css.item_ccostos_cc i ON o.id_itemccostos=i.id_item_ccostos_cc "
                     + "JOIN css.centro_costos c ON i.id_ccostos_cc=c.idccostoscc "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.o.consecutivo_orden_compra="+orden+""                   
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_ccostos_cc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.total,d.subtotal,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra, d.item_det_orden ASC");
      
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
  
  public void consultarOrdenMVVCC(int orden)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario FROM ordenescompra.orden_compra_mvvcc o JOIN ordenescompra.detalle_orden_compra_mvvcc d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN mvvcc.item_ccostos i ON o.id_itemccostos=i.id_item_ccostos_mvvcc "
                     + "JOIN mvvcc.centro_costos c ON i.id_ccostos_mvvcc=c.id_ccostos   "                    
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON iva.id_iva=d.id_iva "
                     + "WHERE o.consecutivo_orden_compra='"+orden+"'"
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra,d.item_det_orden ASC");
       
       
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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

public void consultarOrdenTodos()
{
     try
    {
        
        
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra o JOIN ordenescompra.detalle_orden_compra d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "GROUP BY "
                     + "o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra,d.item_det_orden ASC");
    
          
        while(obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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

public void consultarOrdenTodosCAS()
{
     try
    {
  
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_orden,o.nit_proveedor, "
                     + "p.prove_razon_social,c.nombre_ccostos,\ni.nombre_ccostos_cc, d.item_det_orden,"
                     + "d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,iva.iva_descripcion,d.iva,d.total,d.subtotal,"
                     + "o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_css o JOIN ordenescompra.detalle_orden_compra_css d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN css.item_ccostos_cc i ON o.id_itemccostos=i.id_item_ccostos_cc "
                     + "JOIN css.centro_costos c ON i.id_ccostos_cc=c.idccostoscc "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_orden,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos, "
                     + "i.nombre_ccostos_cc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.total,d.subtotal,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra, d.item_det_orden ASC");
        
          
        while(obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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

public void consultarOrdenTodosMVVCC()
{
     try
    {

             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario FROM ordenescompra.orden_compra_mvvcc o JOIN ordenescompra.detalle_orden_compra_mvvcc d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN mvvcc.item_ccostos i ON o.id_itemccostos=i.id_item_ccostos_mvvcc "
                     + "JOIN mvvcc.centro_costos c ON i.id_ccostos_mvvcc=c.id_ccostos   "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON iva.id_iva=d.id_iva "
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra,d.item_det_orden ASC");
     
        while(obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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

public void consultarOrdenFecha(Date fechaI, Date fechaF)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra o JOIN ordenescompra.detalle_orden_compra d ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.fecha_transaccion between '"+fechaI+"' AND '"+fechaF+"' "
                     + "GROUP BY "
                     + "o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra,d.item_det_orden ASC");

        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
            for (int i=0;i<20;i++)
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
    
public void consultarOrdenFechaCAS(Date fechaI, Date fechaF)
{
    try
    {
        
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,"
                     + "c.nombre_ccostos,i.nombre_ccostos_cc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.total,d.subtotal,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_css o JOIN ordenescompra.detalle_orden_compra_css d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN css.item_ccostos_cc i ON o.id_itemccostos=i.id_item_ccostos_cc "
                     + "JOIN css.centro_costos c ON i.id_ccostos_cc=c.idccostoscc "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.fecha_transaccion BETWEEN '"+fechaI+"' AND '"+fechaF+"'"                   
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_ccostos_cc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.total,d.subtotal,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra, d.item_det_orden ASC");
   
  
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
            for (int i=0;i<20;i++)
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

public void consultarOrdenFechaMVVCC(Date fechaI, Date fechaF)
{
    try
    {
        
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario FROM ordenescompra.orden_compra_mvvcc o JOIN ordenescompra.detalle_orden_compra_mvvcc d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN mvvcc.item_ccostos i ON o.id_itemccostos=i.id_item_ccostos_mvvcc "
                     + "JOIN mvvcc.centro_costos c ON i.id_ccostos_mvvcc=c.id_ccostos   "                    
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON iva.id_iva=d.id_iva "
                     + "WHERE o.fecha_transaccion BETWEEN '"+fechaI+"' AND '"+fechaF+"'"
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra,d.item_det_orden ASC");
      
       
  
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
            for (int i=0;i<20;i++)
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


        public void buscarProveedores() throws SQLException
    {
        
        ConexionBD nueva=new ConexionBD();
        ResultSet obj=nueva.executeQuery("SELECT prove_razon_social FROM proveedores.proveedor WHERE prove_razon_social ilike '%"+txt_proveedor.getText().toUpperCase()+"%' ORDER BY prove_razon_social ASC");
        
        while(obj.next())
        {
            cb_proveedor.addItem(obj.getObject("prove_razon_social"));
        }
      
        nueva.desconectar();
        
    }
        
        
      public void consultarOrdenProveedorUTD(long  nit)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra o JOIN ordenescompra.detalle_orden_compra d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.nit_proveedor="+nit+" "
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY "
                     + "o.consecutivo_orden_compra,d.item_det_orden ASC");
       
            
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
      
      
      
  public void consultarOrdenCASProveedores(long nit)
{
    try
    {

             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,"
                     + "c.nombre_ccostos,i.nombre_ccostos_cc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.total,d.subtotal,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_css o JOIN ordenescompra.detalle_orden_compra_css d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN css.item_ccostos_cc i ON o.id_itemccostos=i.id_item_ccostos_cc "
                     + "JOIN css.centro_costos c ON i.id_ccostos_cc=c.idccostoscc "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.nit_proveedor="+nit+""                   
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_ccostos_cc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.total,d.subtotal,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra, d.item_det_orden ASC");
      
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
  
  public void consultarOrdenMVVCCProveedores(long nit)
{
    try
    {
       
        
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario FROM ordenescompra.orden_compra_mvvcc o JOIN ordenescompra.detalle_orden_compra_mvvcc d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra JOIN proveedores.proveedor p ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN mvvcc.item_ccostos i ON o.id_itemccostos=i.id_item_ccostos_mvvcc "
                     + "JOIN mvvcc.centro_costos c ON i.id_ccostos_mvvcc=c.id_ccostos   "                    
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON iva.id_iva=d.id_iva "
                     + "WHERE o.nit_proveedor='"+nit+"'"
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_mvvcc, d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,iva.iva_descripcion,"
                     + "d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.consecutivo_orden_compra,d.item_det_orden ASC");
       
       
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
  
  
  
  public void consultarOrdenCLG(int  orden)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_clg o JOIN ordenescompra.dt_orden_clg d "
                     + "ON o.id_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.id_orden_compra="+orden+" "
                     + "GROUP BY o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY "
                     + "o.id_orden_compra,d.item_det_orden ASC");
       
            
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
  
  public void consultarOrdenTodoCLG()
{
     try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_clg o JOIN ordenescompra.dt_orden_clg d "
                     + "ON o.id_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "GROUP BY "
                     + "o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.id_orden_compra,d.item_det_orden ASC");
    
          
        while(obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
  
  
  public void consultarOrdenFechaCLG(Date fechaI, Date fechaF)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_clg o JOIN ordenescompra.dt_orden_clg d ON o.id_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.fecha_transaccion between '"+fechaI+"' AND '"+fechaF+"' "
                     + "GROUP BY "
                     + "o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY o.id_orden_compra,d.item_det_orden ASC");

        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
            for (int i=0;i<20;i++)
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

         public void consultarOrdenProveedorCLG(long  nit)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_clg o JOIN ordenescompra.dt_orden_clg d "
                     + "ON o.id_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN utdvvcc.itemccostos i ON o.id_itemccostos=i.id_item_ccostos "
                     + "JOIN utdvvcc.centrocostos c ON i.id_centrocostos=c.id_centrocostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.nit_proveedor="+nit+" "
                     + "GROUP BY o.id_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.sigla_ccostos,"
                     + "i.nombre_item_ccostos,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,d.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY "
                     + "o.id_orden_compra,d.item_det_orden ASC");
       
            
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
         
         
         public void consultarOrdenCIV(int  orden)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_civsas,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_civsas o JOIN ordenescompra.detalle_orden_civsas d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN civsas.item_ccostos i ON o.id_itemccostos=i.id_item_ccostos_civsas "
                     + "JOIN civsas.centro_costos c ON i.id_ccostos_civsas=c.id_ccostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.consecutivo_orden_compra="+orden+" "
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_civsas,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY "
                     + "o.consecutivo_orden_compra,d.item_det_orden ASC");
       
            
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
         
         
         public void consultarOrdenFechaCIV(Date fechaI, Date fechaF)
{
    try
    {
             ConexionBD nueva=new ConexionBD();
            ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_civsas,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_civsas o JOIN ordenescompra.detalle_orden_civsas d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN civsas.item_ccostos i ON o.id_itemccostos=i.id_item_ccostos_civsas "
                     + "JOIN civsas.centro_costos c ON i.id_ccostos_civsas=c.id_ccostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.fecha_transaccion BETWEEN '"+fechaI+"' AND '"+fechaF+"' "
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_civsas,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY "
                     + "o.consecutivo_orden_compra,d.item_det_orden ASC");

        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
            for (int i=0;i<20;i++)
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
         
         
         
      public void consultarOrdenProveedorCIV(long  nit)
    {
    try
    {
             ConexionBD nueva=new ConexionBD();
             ResultSet obj=nueva.executeQuery("SELECT o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_civsas,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "FROM ordenescompra.orden_compra_civsas o JOIN ordenescompra.detalle_orden_civsas d "
                     + "ON o.consecutivo_orden_compra=d.consecutivo_ordencompra "
                     + "JOIN proveedores.proveedor p  ON o.nit_proveedor=p.nit_proveedor "
                     + "JOIN civsas.item_ccostos i ON o.id_itemccostos=i.id_item_ccostos_civsas "
                     + "JOIN civsas.centro_costos c ON i.id_ccostos_civsas=c.id_ccostos "
                     + "JOIN usuariosistema.usuario u ON o.id_usuario=u.cedula "
                     + "JOIN tipos_iva iva ON d.id_iva=iva.id_iva "
                     + "WHERE o.nit_proveedor="+nit+" "
                     + "GROUP BY o.consecutivo_orden_compra,o.fecha_transaccion,o.nit_proveedor, p.prove_razon_social,c.nombre_ccostos,"
                     + "i.nombre_item_civsas,d.item_det_orden,d.descripcion,d.referencia,d.cantidad,d.vlor_unitario,o.dto_comercial,"
                     + "iva.iva_descripcion,d.iva,d.subtotal,d.total,o.observacion,o.id_usuario,u.nombre_usuario,u.apellido_usuario "
                     + "ORDER BY "
                     + "o.consecutivo_orden_compra,d.item_det_orden ASC");
       
            
        while (obj.next()==true) 
        {
        
        Object [] datos = new Object[20];
        
        for (int i=0;i<20;i++)
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
