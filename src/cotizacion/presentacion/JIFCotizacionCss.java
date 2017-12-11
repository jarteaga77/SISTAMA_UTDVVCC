
package cotizacion.presentacion;

import cotizacion.dominio.cotizacionesCAS.DaoCotizacionCAS;
import cotizacion.dominio.cotizacionesCAS.DaoDetalleCotizacionCAS;
import cotizacion.dominio.cotizacionesCAS.cotizacionCAS;
import cotizacion.dominio.cotizacionesCAS.detalle_cotizacionCAS;
import cotizacion.reporte.ReporteCotizacionCSS;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ordenesCompra.conexion.ConexionBD;
import ordenesCompra.presentacion.JIFProveedor;
import ordenesCompra.presentacion.LimpiarCampos;
import ordenesCompra.presentacion.MDIPrincipal;

/**
 *
 * @author jarteaga
 */
public class JIFCotizacionCss extends javax.swing.JInternalFrame {

    private ConexionBD nueva =new ConexionBD();
    private cotizacionCAS cot; 
    private DaoCotizacionCAS daoCot;
    private detalle_cotizacionCAS detalle;
    private DaoDetalleCotizacionCAS dao_detalle;
    private int cant_cotizaciones=0;
    private JIFProveedor jifproveedor;
    private static long nit;
    private int contador=0;
    private ReporteCotizacionCSS jasper;
    
 
     LimpiarCampos limpiar =new LimpiarCampos();
    
    private DefaultTableModel modelo;
 
    
    public static MDIPrincipal principal;
    
    public JIFCotizacionCss() {
        initComponents();
        
        detalle=new detalle_cotizacionCAS();
        dao_detalle=new DaoDetalleCotizacionCAS();
        date_fecha_cotizacion.setDate(new Date());
        modelo= new DefaultTableModel(); 
        jasper=new ReporteCotizacionCSS();
   
    try
    {
        
        ResultSet obj=nueva.executeQuery("SELECT nombre_ccostos FROM css.centro_costos");
        
        while(obj.next())
        {
            cb_ccostos.addItem(obj.getObject("nombre_ccostos"));
        }
        
       ResultSet obj2=nueva.executeQuery("SELECT unidad FROM unidad_medida");
       
       while(obj2.next())
       {
           cb_und.addItem(obj2.getObject("unidad"));
       }
       
       
       ResultSet obj3=nueva.executeQuery("SELECT MAX(consecutivo_cotizacion)+1 as consecutivo  FROM cotizaciones.cotizacion_cas");
       
       while(obj3.next())
       {
           label_consecutivo.setText(String.valueOf(obj3.getLong("consecutivo")));
       }

        nueva.desconectar();
 
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
        //Modelo de tabla
        modelo.addColumn("Id");
        modelo.addColumn("Nit proveedor");
        modelo.addColumn("Item");
        modelo.addColumn("Descripción Producto y/o Servicio");
        modelo.addColumn("Referencia");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Vlor.Unitario");
        modelo.addColumn("Total");
 }
     //metodo get estatico para obtener el nit del proveedor
    public static long getnit()
    {
        return JIFCotizacionCss.nit;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_detalle_cotizacion = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_ref = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_req = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_cot = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_nit_proveedor = new javax.swing.JTextField();
        cb_proveedor = new javax.swing.JComboBox();
        b_aceptar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        b_prov = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txt_vlorunitario = new javax.swing.JTextField();
        b_buscar_prove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panel_cotizacion = new javax.swing.JPanel();
        date_fecha_cotizacion = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_consecutivo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_ccostos = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cb_item = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txt_cargoA = new javax.swing.JTextField();
        b_guardar = new javax.swing.JButton();
        panel_detalle = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_detalle = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_und = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txt_cant = new javax.swing.JTextField();
        b_registrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_item = new javax.swing.JTextField();
        panel_tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cotizacion = new javax.swing.JTable();
        b_terminar = new javax.swing.JButton();
        pane_encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_nit = new javax.swing.JLabel();
        label_empresa = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b_salir = new javax.swing.JButton();
        b_imprimir = new javax.swing.JButton();

        JD_detalle_cotizacion.setTitle("Detalle Cotizaciones");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Referencia:");

        jLabel14.setText("Requisición");

        jLabel15.setText("Cotización:");

        jLabel16.setText("Descuento: $");

        txt_desc.setText("0");

        jLabel17.setText("Proveedor:");

        txt_nit_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nit_proveedorKeyReleased(evt);
            }
        });

        cb_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_proveedorActionPerformed(evt);
            }
        });

        b_aceptar.setText("Aceptar");
        b_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_aceptarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/nuevo.png"))); // NOI18N
        b_prov.setBorderPainted(false);
        b_prov.setContentAreaFilled(false);
        b_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_provActionPerformed(evt);
            }
        });

        jLabel18.setText("Vlor.Unitario:$");

        b_buscar_prove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/Buscar.png"))); // NOI18N
        b_buscar_prove.setContentAreaFilled(false);
        b_buscar_prove.setFocusPainted(false);
        b_buscar_prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscar_proveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nit_proveedor))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_cot, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(6, 6, 6)
                                        .addComponent(txt_vlorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cb_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b_prov)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b_buscar_prove))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_req, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cancelar)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_req, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txt_vlorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txt_nit_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(b_prov))))
                    .addComponent(b_buscar_prove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_aceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_detalle_cotizacionLayout = new javax.swing.GroupLayout(JD_detalle_cotizacion.getContentPane());
        JD_detalle_cotizacion.getContentPane().setLayout(JD_detalle_cotizacionLayout);
        JD_detalle_cotizacionLayout.setHorizontalGroup(
            JD_detalle_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JD_detalle_cotizacionLayout.setVerticalGroup(
            JD_detalle_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle(" Cotizaciones  -  Carlos Solarte");
        setPreferredSize(new java.awt.Dimension(1110, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1125, 676));

        panel_cotizacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Cotización"));
        panel_cotizacion.setPreferredSize(new java.awt.Dimension(1120, 202));

        date_fecha_cotizacion.setFocusCycleRoot(true);
        date_fecha_cotizacion.setMaxSelectableDate(new java.util.Date(253370786493000L));

        jLabel3.setText("Fecha:");

        jLabel4.setText("Consecutivo N°:");

        label_consecutivo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        label_consecutivo.setText("000000");

        jLabel5.setText("Centro Costos:");

        cb_ccostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ccostosActionPerformed(evt);
            }
        });

        jLabel6.setText("Item:");

        jLabel7.setText("Cargo A: ");

        b_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/save.png"))); // NOI18N
        b_guardar.setToolTipText("Guardar cotización");
        b_guardar.setBorderPainted(false);
        b_guardar.setContentAreaFilled(false);
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_cotizacionLayout = new javax.swing.GroupLayout(panel_cotizacion);
        panel_cotizacion.setLayout(panel_cotizacionLayout);
        panel_cotizacionLayout.setHorizontalGroup(
            panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cotizacionLayout.createSequentialGroup()
                .addGroup(panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_cotizacionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fecha_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4))
                    .addGroup(panel_cotizacionLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cb_ccostos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_consecutivo)
                    .addGroup(panel_cotizacionLayout.createSequentialGroup()
                        .addGroup(panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_item, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_cotizacionLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(b_guardar)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cargoA, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_cotizacionLayout.setVerticalGroup(
            panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cotizacionLayout.createSequentialGroup()
                .addGroup(panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cotizacionLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(panel_cotizacionLayout.createSequentialGroup()
                                .addGroup(panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(label_consecutivo))
                                .addGap(2, 2, 2))))
                    .addGroup(panel_cotizacionLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(date_fecha_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_ccostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_cargoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(b_guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_detalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Cotizaciones"));
        panel_detalle.setPreferredSize(new java.awt.Dimension(1120, 76));

        jLabel8.setText("Detalle Producto y/o Servicio:");

        txt_detalle.setEnabled(false);

        jLabel9.setText("Unid.");

        cb_und.setEnabled(false);

        jLabel10.setText("Cantidad");

        txt_cant.setEnabled(false);

        b_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/aceptar.png"))); // NOI18N
        b_registrar.setToolTipText("Registrar linea_cotización");
        b_registrar.setBorderPainted(false);
        b_registrar.setContentAreaFilled(false);
        b_registrar.setEnabled(false);
        b_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registrarActionPerformed(evt);
            }
        });

        jLabel12.setText("N° Item:");

        txt_item.setEnabled(false);

        javax.swing.GroupLayout panel_detalleLayout = new javax.swing.GroupLayout(panel_detalle);
        panel_detalle.setLayout(panel_detalleLayout);
        panel_detalleLayout.setHorizontalGroup(
            panel_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detalleLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_und, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_registrar)
                .addContainerGap())
        );
        panel_detalleLayout.setVerticalGroup(
            panel_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cb_und, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_detalleLayout.createSequentialGroup()
                .addComponent(b_registrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_tabla.setPreferredSize(new java.awt.Dimension(1120, 202));

        tabla_cotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_cotizacion);

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        b_terminar.setText("Terminar");
        b_terminar.setToolTipText("Terminar proceso de cotización");
        b_terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_terminarActionPerformed(evt);
            }
        });

        pane_encabezado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Empresa:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nit:");

        label_nit.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        label_nit.setText("51992221");

        label_empresa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        label_empresa.setText("CAS Carlos Solarte");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/logocsc.png"))); // NOI18N

        javax.swing.GroupLayout pane_encabezadoLayout = new javax.swing.GroupLayout(pane_encabezado);
        pane_encabezado.setLayout(pane_encabezadoLayout);
        pane_encabezadoLayout.setHorizontalGroup(
            pane_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_encabezadoLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(label_empresa)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(label_nit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_encabezadoLayout.setVerticalGroup(
            pane_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_encabezadoLayout.createSequentialGroup()
                .addGroup(pane_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_encabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(pane_encabezadoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pane_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(label_empresa)
                            .addComponent(label_nit))))
                .addContainerGap())
        );

        b_salir.setText("Salir");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });

        b_imprimir.setText("Imprimir");
        b_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_cotizacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                    .addComponent(panel_detalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                    .addComponent(panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pane_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_terminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_imprimir)
                        .addGap(12, 12, 12)
                        .addComponent(b_salir)
                        .addGap(438, 438, 438))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pane_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_terminar)
                    .addComponent(b_salir)
                    .addComponent(b_imprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
      try
     {
          int centro_costos=0;
          int id_item_ccostos=0;
          int idusuario=MDIPrincipal.getSeccion();
          
          boolean bandera=false;
          
          cot=new cotizacionCAS();
          daoCot=new DaoCotizacionCAS();
          
          
          if(cb_ccostos.getSelectedItem()!=null)
          {
              String centro=cb_ccostos.getSelectedItem().toString();
              ResultSet obj=nueva.executeQuery("SELECT idccostoscc FROM css.centro_costos WHERE nombre_ccostos='"+centro+"'");
              
                while(obj.next())
                {
                    centro_costos=obj.getInt("idccostoscc");
                    
                }    
          }
          
          if(cb_item.getSelectedItem()!=null)
          {
              String item=cb_item.getSelectedItem().toString();
              ResultSet obj2=nueva.executeQuery("SELECT id_item_ccostos_cc FROM css.item_ccostos_cc WHERE nombre_ccostos_cc='"+item+"'");
            
              while(obj2.next())
              {
                  id_item_ccostos=obj2.getInt("id_item_ccostos_cc");
       
              }
          }
 
         cot.setFecha_cotizacion(date_fecha_cotizacion.getDate());
         cot.setId_ccostos(centro_costos);
         cot.setId_item_ccostos(id_item_ccostos);
         cot.setCargo_a(txt_cargoA.getText());
         cot.setFecha_transacion(new Date());
         cot.setId_usuario(idusuario);
          
          daoCot.guardar(cot);
          
          limpiar.limpiar(panel_cotizacion);
          deshabilitarCampos();
          habComponentesDetalles();
          
          label_consecutivo.setText(String.valueOf(DaoCotizacionCAS.getIdCotizacion()));
          
          do
          {
              try
              {
                   cant_cotizaciones=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número de cotizaciones:"));
                   
                   if(cant_cotizaciones <=0)
                   {
                       JOptionPane.showMessageDialog(null, "El número de cotizaciones debe ser mayores que cero", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                         bandera=true;
                   }
             
              }catch(NumberFormatException e)
              {
                  JOptionPane.showMessageDialog(null, "Formato invalido!, Digite de nuevo el número de cotizaciones", "Error", JOptionPane.ERROR_MESSAGE);
                  bandera=false;
              }
           
          }while(!bandera);
  
      }catch(SQLException | HeadlessException e)
      {
          JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_b_guardarActionPerformed

    private void cb_ccostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ccostosActionPerformed
        try
       {
           int id_ccostos=0;
       
            if(cb_ccostos.getSelectedItem()!=null)
            {
                String centro=cb_ccostos.getSelectedItem().toString();
                ResultSet obj=nueva.executeQuery("SELECT idccostoscc FROM css.centro_costos WHERE nombre_ccostos='"+centro+"'");
                
                while(obj.next())
                {
                    id_ccostos=obj.getInt("idccostoscc");
                }
                cb_item.removeAllItems();
            }
            
                     ResultSet obj2=nueva.executeQuery("SELECT nombre_ccostos_cc FROM css.item_ccostos_cc WHERE id_ccostos_cc="+id_ccostos+" ");
        
                        while(obj2.next())
                         {
                            cb_item.addItem(obj2.getObject("nombre_ccostos_cc"));
                         }
                            nueva.desconectar();
            
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_cb_ccostosActionPerformed

    @SuppressWarnings("UnusedAssignment")
    private void b_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registrarActionPerformed
          JD_detalle_cotizacion.pack();
          JD_detalle_cotizacion.setLocationRelativeTo(null);
          JD_detalle_cotizacion.setVisible(true);
          JD_detalle_cotizacion.setResizable(false);
    }//GEN-LAST:event_b_registrarActionPerformed

    private void b_terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_terminarActionPerformed
        int opc = JOptionPane.showConfirmDialog(null,"Desea concluir la Cotizacion?", "Aviso!", JOptionPane.YES_NO_OPTION);
        
        if(opc==JOptionPane.YES_OPTION)
        {
            habComponentesIniciales();
            LimpiarTabla();
        }
                    
    }//GEN-LAST:event_b_terminarActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        dispose();
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_imprimirActionPerformed
          
            jasper.ejecutarReporte(Integer.parseInt(label_nit.getText()));
    }//GEN-LAST:event_b_imprimirActionPerformed

    private void txt_nit_proveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nit_proveedorKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_SHIFT)
        {
            try {
                cb_proveedor.removeAllItems();
                buscarProveedores();
            } catch (SQLException ex) {
                Logger.getLogger(JIFCotizacionCss.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txt_nit_proveedorKeyReleased

    private void cb_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_proveedorActionPerformed
        if(cb_proveedor.getSelectedItem()!=null)
        {
            try {
                String nombre=cb_proveedor.getSelectedItem().toString();
                ResultSet obj=nueva.executeQuery("SELECT nit_proveedor FROM proveedores.proveedor WHERE prove_razon_social='"+nombre+"'");

                while(obj.next())
                {
                    nit=obj.getLong("nit_proveedor");
                    txt_nit_proveedor.setText("");
                    txt_nit_proveedor.setText(String.valueOf(nit));
                }
                nueva.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(JIFCotizacionUtdvvcc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cb_proveedorActionPerformed

    private void b_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_aceptarActionPerformed
 try
       {
        
        int id_unidad=0;
        
        if(cb_und.getSelectedItem()!=null)
          {
              String unidad=cb_und.getSelectedItem().toString();
              ResultSet obj=nueva.executeQuery("SELECT id_unidad FROM unidad_medida WHERE unidad='"+unidad+"'");
            
                while(obj.next())
                {
                    id_unidad=obj.getInt(1);       
                }  
          }
        nueva.desconectar();
        
        if(txt_cant.getText().isEmpty() || txt_detalle.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campos nulos! Detalle Prod y/o servicio ó cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else 
        if(Integer.parseInt(txt_cant.getText())<=0)
        {
          JOptionPane.showMessageDialog(null, "La cantidad debe ser Mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);

        }else
        {
     
        if(contador <= cant_cotizaciones)       
        {
                detalle.setItem(Integer.parseInt(txt_item.getText()));
                detalle.setUnidad(id_unidad);
                detalle.setDetalle_prod_servicio(txt_detalle.getText());
                detalle.setCant_prod_servicio(Float.parseFloat(txt_cant.getText()));
                detalle.setReferencia(txt_ref.getText());
                detalle.setRequisicion(Long.parseLong(txt_req.getText()));
                if(Integer.parseInt(txt_vlorunitario.getText()) <=0)
                {
                    JOptionPane.showMessageDialog(null, "El valor unitario debe ser Mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    detalle.setVlor_unitario(Long.parseLong(txt_vlorunitario.getText()));
                }
           
                detalle.setCotizacion(txt_cot.getText());
                detalle.setDescuento(Float.parseFloat(txt_desc.getText()));
                detalle.setNit_proveedor(Long.parseLong(txt_nit_proveedor.getText()));
                detalle.setConsecutivo_cotizacion(Long.parseLong(label_consecutivo.getText()));
      
                dao_detalle.guardarDetalle(detalle);
                contador++;
                JD_detalle_cotizacion.dispose();
                LimpiarTabla();
                detalleTablaCotizacion();
            
               // System.out.println("contador:" + contador);     
        }
            if(contador < cant_cotizaciones)
        
             {
                JD_detalle_cotizacion.pack();
                JD_detalle_cotizacion.setLocationRelativeTo(null);
                JD_detalle_cotizacion.setVisible(true);
                JD_detalle_cotizacion.setResizable(false);
                
                limpiar.limpiar(jPanel2);
                txt_desc.setText("0");
              
             }else
            {
                 //System.out.println("x aca paso");
            JD_detalle_cotizacion.dispose();
            nueva.executeUpdateQuery("UPDATE cotizaciones.detalle_cotizacion_cas SET estado="+true+" WHERE subtotal IN (SELECT MIN(subtotal) FROM cotizaciones.detalle_cotizacion_cas WHERE item="+txt_item.getText()+" AND consecutivo_cotizacion="+label_consecutivo.getText()+") AND item="+txt_item.getText()+" AND consecutivo_cotizacion="+label_consecutivo.getText()+"");

            contador=0;
            txt_item.setText("");
            txt_detalle.setText("");
            txt_cant.setText("");
            limpiar.limpiar(jPanel2);
            txt_desc.setText("0");
            }
    
        nueva.desconectar();
     }//fin else
       }catch(SQLException | HeadlessException | NumberFormatException e) 
       {
           JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
       }

    }//GEN-LAST:event_b_aceptarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        JD_detalle_cotizacion.dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_provActionPerformed
        jifproveedor=new JIFProveedor();
        MDIPrincipal.desktopPane.add(jifproveedor);
        jifproveedor.setLocation(300, 0);

        jifproveedor.show();
    }//GEN-LAST:event_b_provActionPerformed

    private void b_buscar_proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscar_proveActionPerformed
        //Verifica que el campo nit proveedor solo reciba datos de tipo numericos
        try
        {
            if(txt_nit_proveedor.getText().matches("[0-9]*"))
            {
                ResultSet obj=nueva.executeQuery("SELECT prove_razon_social FROM proveedores.proveedor WHERE nit_proveedor="+txt_nit_proveedor.getText()+"");

                if(obj.next()==true)
                {

                    JOptionPane.showMessageDialog(null, "El proveedor se encuentra registrado! " + obj.getString("prove_razon_social"));

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El proveedor no se encuentra registrado!");
                    jifproveedor=new JIFProveedor();
                    MDIPrincipal.desktopPane.add(jifproveedor);
                    jifproveedor.setLocation(300, 0);
                    jifproveedor.show();

                    //Asigna el nit del proveedor a la interfaz JIFProveedor
                    nit=Long.parseLong(txt_nit_proveedor.getText());
                    JIFProveedor.settxtnitproveedor(JIFCotizacionUtdvvcc.getnit());
                }
            }else
            {
                JOptionPane.showMessageDialog(null, "El nit del proveedor tiene que ser un valor numérico", "Error", JOptionPane.ERROR_MESSAGE);

            }

            nueva.desconectar();

        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_buscar_proveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JD_detalle_cotizacion;
    private javax.swing.JButton b_aceptar;
    private javax.swing.JButton b_buscar_prove;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_imprimir;
    private javax.swing.JButton b_prov;
    private javax.swing.JButton b_registrar;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_terminar;
    private javax.swing.JComboBox cb_ccostos;
    private javax.swing.JComboBox cb_item;
    private javax.swing.JComboBox cb_proveedor;
    private javax.swing.JComboBox cb_und;
    private com.toedter.calendar.JDateChooser date_fecha_cotizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_consecutivo;
    private javax.swing.JLabel label_empresa;
    private javax.swing.JLabel label_nit;
    private javax.swing.JPanel pane_encabezado;
    private javax.swing.JPanel panel_cotizacion;
    private javax.swing.JPanel panel_detalle;
    private javax.swing.JPanel panel_tabla;
    private javax.swing.JTable tabla_cotizacion;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_cargoA;
    private javax.swing.JTextField txt_cot;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_detalle;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_nit_proveedor;
    private javax.swing.JTextField txt_ref;
    private javax.swing.JTextField txt_req;
    private javax.swing.JTextField txt_vlorunitario;
    // End of variables declaration//GEN-END:variables

public void detalleTablaCotizacion()
{
    
    try
        {
            ResultSet obj=nueva.executeQuery("SELECT d.id_detalle_cotizacion, d.nit_proveedor, d.item,d.detalle_prod_servicio,d.referencia,d.cantidad_prod_servicio,d.vlor_unitario,d.subtotal "
                    + "FROM cotizaciones.cotizacion_cas c JOIN cotizaciones.detalle_cotizacion_cas d ON c.consecutivo_cotizacion=d.consecutivo_cotizacion  where c.consecutivo_cotizacion= "+label_consecutivo.getText()+" ORDER BY d.item ASC");
            
         while (obj.next()) 
        {
        
        Object [] datos = new Object[8];
        
     
        for (int i=0;i<8;i++)
        {
            datos[i] =obj.getObject(i+1);
        }

         modelo.addRow(datos);
       
        }
           tabla_cotizacion.setModel(modelo);
           nueva.desconectar();
           
           
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
}

    public void LimpiarTabla()
    {

        for(int i=modelo.getRowCount()-1;i>=0;i--)
        {
            modelo.removeRow(i);
            
        }
    }
      public void buscarProveedores() throws SQLException
    {
        
        
        ResultSet obj=nueva.executeQuery("SELECT prove_razon_social FROM proveedores.proveedor WHERE prove_razon_social like '%"+txt_nit_proveedor.getText().toUpperCase()+"%' ORDER BY prove_razon_social ASC");
        
        while(obj.next())
        {
            cb_proveedor.addItem(obj.getObject("prove_razon_social"));
        }

        nueva.desconectar();
    }
    
    public void deshabilitarCampos()
    {
        b_guardar.setEnabled(false);
        date_fecha_cotizacion.setEnabled(false);
        cb_ccostos.setEnabled(false);
        cb_item.setEnabled(false);
        txt_cargoA.setEnabled(false);
        
    }
    
    public void habComponentesDetalles()
    {
        txt_detalle.setEnabled(true);
        txt_cant.setEnabled(true);
        txt_item.setEnabled(true);
        cb_und.setEnabled(true);
        b_registrar.setEnabled(true);
    }
    
    public void habComponentesIniciales()
    {
        date_fecha_cotizacion.setEnabled(true);
        cb_ccostos.setEnabled(true);
        cb_item.setEnabled(true);
        txt_cargoA.setEnabled(true);
        b_guardar.setEnabled(true);
        
        txt_detalle.setEnabled(false);
        txt_cant.setEnabled(false);
        cb_und.setEnabled(false);
        b_registrar.setEnabled(false);
        
        
    }

}
