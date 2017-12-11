package ordenesCompraCIVSAS.presentacion;

import ordenesCompra.presentacion.*;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ordenesCompra.conexion.ConexionBD;
import ordenesCompra.dominio.ordenesCompra.Requisicion;
import ordenesCompra.dominio.ordenesCompraCIVSAS.DaoDetalleOrdenCompra;
import ordenesCompra.dominio.ordenesCompraCIVSAS.DaoOrdenCompra;
import ordenesCompra.dominio.ordenesCompraCIVSAS.detalle_orden_compra;
import ordenesCompra.dominio.ordenesCompraCIVSAS.ordenCompra;
import ordenesCompraCIVSAS.reporte.ReporteOrdenCompra_CIVSAS;

/**
 *
 * @author jarteaga
 */
public class JIFOrdenesCompraCIVSAS extends javax.swing.JInternalFrame {


    private ConexionBD conexion=new ConexionBD();
    private DefaultTableModel modelo;
    private int contador=0;
    private ReporteOrdenCompra_CIVSAS jasper;
    private JIFProveedor proveedor;
    

    
    public static MDIPrincipal principal;
    
   //Se declara la variable tipo vector Array
    Vector larequi=new Vector();
    //Objeto de tipo requisicion
    Requisicion req;
    
    public JIFOrdenesCompraCIVSAS() {
        initComponents();
    
        modelo=new DefaultTableModel();
  
    try
    {
        
        ResultSet obj=conexion.executeQuery("SELECT nombre_ccostos FROM civsas.centro_costos");//Consulta para traer el nombre de centro de costos
        
        while(obj.next())
        {
            cb_ccostos.addItem(obj.getObject("nombre_ccostos"));//Llena JCombobox con el nombre del centro de costos
        }
        
       ResultSet obj2=conexion.executeQuery("SELECT unidad FROM unidad_medida");// consulta para traer el nombre de unidad de medida
       
       while(obj2.next())
       {
           cb_um.addItem(obj2.getObject("unidad"));//Llana el JCombobox con el nombre de la unida de medida
       }
       
       //Consulta para traer el ultimo registro de y sumarle 1 para el consecutivo orden compra
       ResultSet obj3=conexion.executeQuery("SELECT MAX(consecutivo_orden_compra)+1 as consecutivo FROM ordenescompra.orden_compra_civsas");
       
       while(obj3.next())
       {
           txt_orden.setText(String.valueOf(obj3.getLong("consecutivo")));//Le asigna el consecutivo siguiente de orden compra al textfield
       }
       ResultSet obj4=conexion.executeQuery("SELECT iva_descripcion FROM tipos_iva ORDER BY id_iva ASC");

       while(obj4.next())
       {
           cb_iva.addItem(obj4.getObject("iva_descripcion"));//Llana el JCombobox con el nombre de la unida de medida
       }
 
        conexion.desconectar();
        
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
        //modelo de tabla
        modelo.addColumn("ID");
        modelo.addColumn("IT");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cant.");
        modelo.addColumn("UM");
        modelo.addColumn("VR Unitario");
        modelo.addColumn("Desc.");
        modelo.addColumn("IVA");
        modelo.addColumn("Total");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        JD_Detalle_Orden = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_item = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_refe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cant = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cb_um = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txt_vlor_unit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cb_iva = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txt_dto_com = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_can = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_navegador_adelante = new javax.swing.JButton();
        btn_navegador_atras = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_orden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_proveedor = new javax.swing.JTextField();
        cb_proveedor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_requision = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cotizacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_obs = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cb_ccostos = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cb_item = new javax.swing.JComboBox();
        txt_dto_fin = new javax.swing.JTextField();
        chb_dto_fin = new javax.swing.JCheckBox();
        btn_buscar_orden = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_cargo_a = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_area_con = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        btn_proveedor = new javax.swing.JButton();
        panel_botones3 = new javax.swing.JPanel();
        btn_ingresar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_detalle = new javax.swing.JTable();
        btn_adicionar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_mod = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        label_iva = new javax.swing.JLabel();
        label_subtotal = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        label_dto = new javax.swing.JLabel();

        JD_Detalle_Orden.setTitle("Linea Orden de Compra");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel7.setText("Item");

        txt_item.setText("1");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel8.setText("Descripción:");

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel9.setText("Referencia:");

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel10.setText("Cantidad:");

        txt_cant.setText("1");

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel11.setText("Vlor.Unitario:$");

        cb_um.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel12.setText("U.M");

        txt_vlor_unit.setText("0");

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel13.setText("IVA: %");

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel14.setText("Dto.Comercial:(%)");

        txt_dto_com.setText("0");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setToolTipText("");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_can.setText("Cancelar");
        btn_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegador Requisición"));

        btn_navegador_adelante.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_navegador_adelante.setText("------->");
        btn_navegador_adelante.setToolTipText("Adelante");
        btn_navegador_adelante.setEnabled(false);
        btn_navegador_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_navegador_adelanteActionPerformed(evt);
            }
        });

        btn_navegador_atras.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_navegador_atras.setText("<-------");
        btn_navegador_atras.setToolTipText("Atras");
        btn_navegador_atras.setEnabled(false);
        btn_navegador_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_navegador_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_navegador_atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_navegador_adelante)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_navegador_adelante)
                    .addComponent(btn_navegador_atras))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cant)
                                    .addComponent(cb_iva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_refe))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dto_com, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb_um, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_vlor_unit))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(349, 349, 349)
                        .addComponent(btn_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_can)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_aceptar)
                        .addComponent(btn_can))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txt_refe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(cb_um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vlor_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cb_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txt_dto_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_Detalle_OrdenLayout = new javax.swing.GroupLayout(JD_Detalle_Orden.getContentPane());
        JD_Detalle_Orden.getContentPane().setLayout(JD_Detalle_OrdenLayout);
        JD_Detalle_OrdenLayout.setHorizontalGroup(
            JD_Detalle_OrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_Detalle_OrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JD_Detalle_OrdenLayout.setVerticalGroup(
            JD_Detalle_OrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_Detalle_OrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ordenes de Compra - CIVSAS");
        setPreferredSize(new java.awt.Dimension(830, 838));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden de Compra"));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Orden de Compra N°: ");

        txt_orden.setEditable(false);
        txt_orden.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("Proveedor:");

        txt_proveedor.setToolTipText("Ej: Inicial_Prove + SHIFT");
        txt_proveedor.setEnabled(false);
        txt_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_proveedorKeyReleased(evt);
            }
        });

        cb_proveedor.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cb_proveedor.setEnabled(false);
        cb_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_proveedorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel3.setText("Requisición N°:");

        txt_requision.setText("0");
        txt_requision.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel4.setText("Cotización N°");

        txt_cotizacion.setEnabled(false);

        txt_area_obs.setColumns(20);
        txt_area_obs.setRows(5);
        txt_area_obs.setEnabled(false);
        jScrollPane1.setViewportView(txt_area_obs);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel5.setText("Observación:");

        cb_ccostos.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cb_ccostos.setEnabled(false);
        cb_ccostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ccostosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel6.setText("Centro Costos:");

        cb_item.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cb_item.setEnabled(false);

        txt_dto_fin.setText("0");

        chb_dto_fin.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        chb_dto_fin.setText("Dto.Financiero:$");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_dto_fin, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), chb_dto_fin, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        btn_buscar_orden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/Buscar.png"))); // NOI18N
        btn_buscar_orden.setToolTipText("Buscar Orden");
        btn_buscar_orden.setBorderPainted(false);
        btn_buscar_orden.setContentAreaFilled(false);
        btn_buscar_orden.setEnabled(false);
        btn_buscar_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_ordenActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel16.setText("Cargo A:");

        txt_cargo_a.setEnabled(false);

        txt_area_con.setColumns(20);
        txt_area_con.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        txt_area_con.setRows(5);
        txt_area_con.setText("Favor facturar a nombre COMERCIALIZADORA INTEGRAL VIAL S.A.S,\nNIT 900.686.839-0, *fecha entrega factura (modificar)*\nTiempo de entrega: Inmediato .\nForma de pago: Crédito 30 días\nSitio de entrega: Km 14 Recta Cali - Palmira, entrada al CIAT.\n");
        txt_area_con.setEnabled(false);
        jScrollPane3.setViewportView(txt_area_con);

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jLabel18.setText("Condiciones:");

        btn_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/nuevo.png"))); // NOI18N
        btn_proveedor.setToolTipText("Nuevo Proveedor");
        btn_proveedor.setBorderPainted(false);
        btn_proveedor.setContentAreaFilled(false);
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 40, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb_ccostos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_item, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cargo_a)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(chb_dto_fin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dto_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar_orden)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addComponent(txt_requision, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 169, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_buscar_orden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_requision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_ccostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_cargo_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dto_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_dto_fin))
                .addContainerGap())
        );

        panel_botones3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/nuevo.png"))); // NOI18N
        btn_ingresar.setToolTipText("Ingresar");
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.setFocusPainted(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/mod.png"))); // NOI18N
        btn_modificar.setToolTipText("Modificar");
        btn_modificar.setBorderPainted(false);
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.setFocusPainted(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/actualizar.png"))); // NOI18N
        btn_actualizar.setToolTipText("actualizar");
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.setEnabled(false);
        btn_actualizar.setFocusPainted(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/printer2.png"))); // NOI18N
        btn_imprimir.setToolTipText("imprimir orden de compra actual");
        btn_imprimir.setBorderPainted(false);
        btn_imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_imprimir.setEnabled(false);
        btn_imprimir.setFocusPainted(false);
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/eqsl_exit.png"))); // NOI18N
        btn_salir.setToolTipText("salir");
        btn_salir.setBorderPainted(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setFocusPainted(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/cancelar.png"))); // NOI18N
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/save.png"))); // NOI18N
        btn_guardar.setToolTipText("Guardar Orden Compra");
        btn_guardar.setBorderPainted(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.setEnabled(false);
        btn_guardar.setFocusPainted(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botones3Layout = new javax.swing.GroupLayout(panel_botones3);
        panel_botones3.setLayout(panel_botones3Layout);
        panel_botones3Layout.setHorizontalGroup(
            panel_botones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botones3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_botones3Layout.setVerticalGroup(
            panel_botones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botones3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Linea de Orden de Compra"));

        tabla_detalle.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        tabla_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla_detalle);

        btn_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/add.png"))); // NOI18N
        btn_adicionar.setToolTipText("Adicionar");
        btn_adicionar.setBorderPainted(false);
        btn_adicionar.setEnabled(false);
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/delete.png"))); // NOI18N
        btn_eliminar.setToolTipText("Eliminar");
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/mod_detalle.png"))); // NOI18N
        btn_mod.setToolTipText("Modificar Linea");
        btn_mod.setBorderPainted(false);
        btn_mod.setEnabled(false);
        btn_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel21.setText("TOTAL:$");

        jLabel17.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel17.setText("Dto. Com.:$");

        label_total.setFont(new java.awt.Font("DejaVu Sans", 1, 8)); // NOI18N
        label_total.setText("0,0");

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel15.setText("Subtotal:$");

        label_iva.setFont(new java.awt.Font("DejaVu Sans", 1, 8)); // NOI18N
        label_iva.setText("0,0");

        label_subtotal.setFont(new java.awt.Font("DejaVu Sans", 1, 8)); // NOI18N
        label_subtotal.setText("0,0");

        jLabel19.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel19.setText(".I.V.A:$");

        label_dto.setFont(new java.awt.Font("DejaVu Sans", 1, 8)); // NOI18N
        label_dto.setText("0,0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_dto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(label_subtotal)
                    .addComponent(jLabel17)
                    .addComponent(label_dto)
                    .addComponent(jLabel19)
                    .addComponent(label_iva)
                    .addComponent(jLabel21)
                    .addComponent(label_total))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_adicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel_botones3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_botones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        btn_guardar.setEnabled(true);
     
        btn_ingresar.setEnabled(false);
        btn_modificar.setEnabled(false);
        txt_orden.setEnabled(true);
        txt_proveedor.setEnabled(true);
        cb_proveedor.setEnabled(true);
        cb_ccostos.setEnabled(true);
        cb_item.setEnabled(true);
        txt_cargo_a.setEnabled(true);
        txt_requision.setEnabled(true);
        txt_cotizacion.setEnabled(true);
        txt_area_obs.setEnabled(true);
        txt_area_con.setEnabled(true);
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        txt_orden.setEnabled(true);
        txt_orden.setEditable(true);
        btn_buscar_orden.setEnabled(true);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
         ordenCompra orden=new ordenCompra();
         DaoOrdenCompra dao=new DaoOrdenCompra();
         int id_item=0;
         ConexionBD nueva=new ConexionBD();
         
              if(cb_item.getSelectedItem()!=null)
            {
                String item_ccostos=cb_item.getSelectedItem().toString();
                ResultSet obj2=nueva.executeQuery("SELECT id_item_ccostos_civsas FROM civsas.item_ccostos WHERE nombre_item_civsas='"+item_ccostos+"'");
            try {                
                while(obj2.next())
                {
                    id_item=obj2.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            nueva.desconectar();
    
         orden.setConsecutivo(Long.parseLong(txt_orden.getText()));
         orden.setNit_proveedor(Long.parseLong(txt_proveedor.getText()));
         orden.setFecha_hora(new Date());
         orden.setCargo_orden(txt_cargo_a.getText());
         orden.setCotizacion(txt_cotizacion.getText());
         orden.setObservacion(txt_area_obs.getText());
         orden.setDto_financiero(Integer.parseInt(txt_dto_fin.getText()));
         orden.setId_item_ccostos(id_item);
         orden.setCondiciones(txt_area_con.getText());
         
         dao.actualizarOrden(orden);
         
         btn_adicionar.setEnabled(true);
         btn_eliminar.setEnabled(true);
         btn_mod.setEnabled(true);
         btn_actualizar.setEnabled(false);
         
         txt_proveedor.setEditable(false);
         txt_cargo_a.setEditable(false);
         txt_area_obs.setEditable(false);
         txt_dto_fin.setEditable(false);
  
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        jasper=new ReporteOrdenCompra_CIVSAS();
        int  orden = Integer.parseInt(txt_orden.getText());
        jasper.ejecutarReporte(orden);
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
      dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
      int opcion=JOptionPane.showConfirmDialog(null,"Nueva Orden de Compra?", "Aviso!", JOptionPane.YES_NO_OPTION);
        //LimpiarCampos limpiar=new LimpiarCampos(); 
        
        if(opcion==JOptionPane.YES_OPTION)
        {
            txt_requision.setText("");
            txt_proveedor.setText("");
            txt_cargo_a.setText("");
            txt_cotizacion.setText("");
            txt_area_obs.setText("");
            txt_dto_fin.setText("0");
            txt_item.setText("");
            txt_descripcion.setText("");
            txt_refe.setText("");
            txt_cant.setText("");
            txt_vlor_unit.setText("");
            txt_dto_com.setText("0");
            
            deshabilitarComponentes();
            LimpiarTabla();
        }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    @SuppressWarnings("static-access")
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        ordenCompra orden=new ordenCompra();
        DaoOrdenCompra dao=new DaoOrdenCompra();
        ConexionBD nueva=new ConexionBD();
        int dto_come=0;
        boolean estado_dto=false;
        int idusuario=MDIPrincipal.getSeccion();
   
        int id_item=0;
        
          //Se captura el id de item centro de costos
            if(cb_item.getSelectedItem()!=null)
            {
                String item_ccostos=cb_item.getSelectedItem().toString();
                ResultSet obj2=nueva.executeQuery("SELECT id_item_ccostos_civsas FROM civsas.item_ccostos WHERE nombre_item_civsas='"+item_ccostos+"'");
            try {                
                while(obj2.next())
                {
                    id_item=obj2.getInt(1);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
            nueva.desconectar();
      
//            if(chb_dto_come.isSelected()==true)
//            {
//                estado_dto=true;
//                dto_come=Integer.parseInt(txt_dtocome.getText());
//                System.out.println("paso por aqui");
//            }
//            else
//            {
//                estado_dto=false;
//                dto_come=0;
//            }
            
        orden.setFecha_hora(new Date());
        orden.setNit_proveedor(Long.parseLong(txt_proveedor.getText()));
        orden.setId_item_ccostos(id_item);
        orden.setCargo_orden(txt_cargo_a.getText());
        orden.setRequisicion(txt_requision.getText());
        orden.setCotizacion(txt_cotizacion.getText());
        orden.setObservacion(txt_area_obs.getText());
        orden.setDto_financiero(Integer.parseInt(txt_dto_fin.getText()));
        orden.setId_usuario(idusuario);
        orden.setCondiciones(txt_area_con.getText());
        orden.setDto_comer(dto_come);
        orden.setEstado_dtocome(estado_dto);
        
        dao.guardarOrden(orden);
        deshabilitarComponentes();
        
        txt_orden.setText(String.valueOf(dao.getId_orden()));
        
        btn_imprimir.setEnabled(true);
        btn_adicionar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_mod.setEnabled(true);
  
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
          JD_Detalle_Orden.pack();
          JD_Detalle_Orden.setLocationRelativeTo(null);
          JD_Detalle_Orden.setVisible(true);
          JD_Detalle_Orden.setResizable(false);
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void cb_ccostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ccostosActionPerformed
        try
        {
            ConexionBD nueva=new ConexionBD();
            
            int id_ccostos=0;

            if(cb_ccostos.getSelectedItem()!=null)
            {
                String centro=cb_ccostos.getSelectedItem().toString();
                ResultSet obj=nueva.executeQuery("SELECT id_ccostos FROM civsas.centro_costos WHERE nombre_ccostos='"+centro+"'");

                while(obj.next())
                {
                    id_ccostos=obj.getInt("id_ccostos");
                }
                cb_item.removeAllItems();
            }

            ResultSet obj2=nueva.executeQuery("SELECT nombre_item_civsas FROM civsas.item_ccostos WHERE id_ccostos_civsas="+id_ccostos+" ");

            while(obj2.next())
            {
                cb_item.addItem(obj2.getObject("nombre_item_civsas"));
            }
            nueva.desconectar();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cb_ccostosActionPerformed

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

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        ordenCompra orden=new ordenCompra();
        detalle_orden_compra detalle=new detalle_orden_compra();
        DaoDetalleOrdenCompra dao=new DaoDetalleOrdenCompra();
        long subtotal,total,iva;
        long descuento;
        int um = 0, id_iva;
        ConexionBD nueva=new ConexionBD();
        LimpiarCampos limpiar=new LimpiarCampos();
       
//        for(int i=0; i<larequi.size() ; i++)
//        { 
//            if ((((Requisicion)larequi.elementAt(i)).getIt())== Integer.parseInt(txt_item.getText())  )
//            {
//                larequi.removeElementAt(i);
//            }
//        } 
 
        if(cb_iva.getSelectedItem().equals("%0"))
        {
           
           detalle.setItem(Integer.parseInt(txt_item.getText()));
           detalle.setDescripcion(txt_descripcion.getText());
           detalle.setReferencia(txt_refe.getText());
           detalle.setCantidad(Float.parseFloat(txt_cant.getText()));
           detalle.setVlorUnitario(Float.parseFloat(txt_vlor_unit.getText())); 
           
           
           descuento=(long) (((detalle.getCantidad() * detalle.getVlorUnitario()) * (Float.parseFloat(txt_dto_com.getText())))/ 100);
           subtotal= (long) ((detalle.getVlorUnitario() * detalle.getCantidad()) -  descuento);
           iva=0;
           total=subtotal + iva;
           id_iva=1;

           if(cb_um.getSelectedItem()!=null)
            {
                String unidad=cb_um.getSelectedItem().toString();
                ResultSet obj=nueva.executeQuery("SELECT id_unidad FROM unidad_medida WHERE unidad='"+unidad+"'");
               try {
                   while(obj.next())
                   {
                       um=obj.getInt(1);
                   }
               } catch (SQLException ex) {
                   Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
           detalle.setId_unidad(um); 
           detalle.setId_iva(id_iva);
           detalle.setIva(iva);
           detalle.setSubtotal(subtotal);
           detalle.setDto_comercial(descuento);
           detalle.setTotal(total);
           detalle.setId_consecutivo_orden(Long.parseLong(txt_orden.getText()));
           
           dao.guardarDetalle(detalle);
           
        }
        else
            if(cb_iva.getSelectedItem().equals("%10"))
            {
                detalle.setItem(Integer.parseInt(txt_item.getText()));
                detalle.setDescripcion(txt_descripcion.getText());
                detalle.setReferencia(txt_refe.getText());
                detalle.setCantidad(Float.parseFloat(txt_cant.getText()));
                detalle.setVlorUnitario(Float.parseFloat(txt_vlor_unit.getText()));
                
                descuento=(long) (((detalle.getCantidad() * detalle.getVlorUnitario()) * (Float.parseFloat(txt_dto_com.getText())))/ 100);
                subtotal=(long)((detalle.getVlorUnitario()* detalle.getCantidad()) - descuento);
                
                iva=(long) (subtotal * 0.10);
                total=subtotal + iva;
                id_iva=2;//ID del iva predefinido en la BD
          
           
                if(cb_um.getSelectedItem()!=null)
                {
                    String unidad=cb_um.getSelectedItem().toString();
                    ResultSet obj=nueva.executeQuery("SELECT id_unidad FROM unidad_medida WHERE unidad='"+unidad+"'");
                    try {
                        while(obj.next())
                            {
                                um=obj.getInt(1);
                            }
                        } catch (SQLException ex) {
                        Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                    detalle.setId_unidad(um);
                    detalle.setId_iva(id_iva);
                    detalle.setIva(iva);
                    detalle.setSubtotal(subtotal);
                    detalle.setDto_comercial(descuento);
                    detalle.setTotal(total);
                    detalle.setId_consecutivo_orden(Long.parseLong(txt_orden.getText()));
           
                    dao.guardarDetalle(detalle);
            }
            else 
                if(cb_iva.getSelectedItem().equals("%16"))
                {
                    
                    
                detalle.setItem(Integer.parseInt(txt_item.getText()));
                detalle.setDescripcion(txt_descripcion.getText());
                detalle.setReferencia(txt_refe.getText());
                detalle.setCantidad(Float.parseFloat(txt_cant.getText()));   
                detalle.setVlorUnitario(Float.parseFloat(txt_vlor_unit.getText()));
                
                
                descuento=(long) (((detalle.getCantidad() * detalle.getVlorUnitario()) * (Float.parseFloat(txt_dto_com.getText())))/ 100);
                subtotal=(long)((detalle.getVlorUnitario()* detalle.getCantidad()) - descuento);
                iva=(long) (subtotal * 0.16);
                total=subtotal + iva;
                id_iva=3;//ID del iva predefinido en la BD
          
                    if(cb_um.getSelectedItem()!=null)
                    {
                        String unidad=cb_um.getSelectedItem().toString();
                        ResultSet obj=nueva.executeQuery("SELECT id_unidad FROM unidad_medida WHERE unidad='"+unidad+"'");
                         try {
                                while(obj.next())
                                {
                                     um=obj.getInt(1);
                                }
                             } catch (Exception ex){
                                  JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
                               }
                    }
                        detalle.setId_unidad(um);
                        detalle.setId_iva(id_iva);
                        detalle.setDto_comercial(descuento);
                        detalle.setIva(iva);
                        detalle.setSubtotal(subtotal);
                        detalle.setTotal(total);
                        detalle.setId_consecutivo_orden(Long.parseLong(txt_orden.getText()));
           
                        dao.guardarDetalle(detalle);
                }
        else
                    if(cb_iva.getSelectedItem().equals("%5"))
                    {
                         detalle.setItem(Integer.parseInt(txt_item.getText()));
                detalle.setDescripcion(txt_descripcion.getText());
                detalle.setReferencia(txt_refe.getText());
                detalle.setCantidad(Float.parseFloat(txt_cant.getText()));   
                detalle.setVlorUnitario(Float.parseFloat(txt_vlor_unit.getText()));
                
                
                descuento=(long) (((detalle.getCantidad() * detalle.getVlorUnitario()) * (Float.parseFloat(txt_dto_com.getText())))/ 100);
                subtotal=(long)((detalle.getVlorUnitario()* detalle.getCantidad()) - descuento);
                iva=(long) (subtotal * 0.05);
                total=subtotal + iva;
                id_iva=4;//ID del iva predefinido en la BD
          
                    if(cb_um.getSelectedItem()!=null)
                    {
                        String unidad=cb_um.getSelectedItem().toString();
                        ResultSet obj=nueva.executeQuery("SELECT id_unidad FROM unidad_medida WHERE unidad='"+unidad+"'");
                         try {
                                while(obj.next())
                                {
                                     um=obj.getInt(1);
                                }
                             } catch (Exception ex){
                                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);                               }
                    }
                        detalle.setId_unidad(um);
                        detalle.setId_iva(id_iva);
                        detalle.setDto_comercial(descuento);
                        detalle.setIva(iva);
                        detalle.setSubtotal(subtotal);
                        detalle.setTotal(total);
                        detalle.setId_consecutivo_orden(Long.parseLong(txt_orden.getText()));
           
                        dao.guardarDetalle(detalle);
                    }
        
        else
            if(cb_iva.getSelectedItem().equals("%10"))
            {
                detalle.setItem(Integer.parseInt(txt_item.getText()));
                detalle.setDescripcion(txt_descripcion.getText());
                detalle.setReferencia(txt_refe.getText());
                detalle.setCantidad(Float.parseFloat(txt_cant.getText()));
                detalle.setVlorUnitario(Float.parseFloat(txt_vlor_unit.getText()));
                
                descuento=(long) (((detalle.getCantidad() * detalle.getVlorUnitario()) * (Float.parseFloat(txt_dto_com.getText())))/ 100);
                subtotal=(long)((detalle.getVlorUnitario()* detalle.getCantidad()) - descuento);
                
                iva=(long) (subtotal * 0.10);
                total=subtotal + iva;
                id_iva=2;//ID del iva predefinido en la BD
          
           
                if(cb_um.getSelectedItem()!=null)
                {
                    String unidad=cb_um.getSelectedItem().toString();
                    ResultSet obj=nueva.executeQuery("SELECT id_unidad FROM unidad_medida WHERE unidad='"+unidad+"'");
                    try {
                        while(obj.next())
                            {
                                um=obj.getInt(1);
                            }
                        } catch (SQLException ex) {
                        Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                    detalle.setId_unidad(um);
                    detalle.setId_iva(id_iva);
                    detalle.setIva(iva);
                    detalle.setSubtotal(subtotal);
                    detalle.setDto_comercial(descuento);
                    detalle.setTotal(total);
                    detalle.setId_consecutivo_orden(Long.parseLong(txt_orden.getText()));
           
                    dao.guardarDetalle(detalle);
            }
            else 
                if(cb_iva.getSelectedItem().equals("%19"))
                {
                    
                    
                detalle.setItem(Integer.parseInt(txt_item.getText()));
                detalle.setDescripcion(txt_descripcion.getText());
                detalle.setReferencia(txt_refe.getText());
                detalle.setCantidad(Float.parseFloat(txt_cant.getText()));   
                detalle.setVlorUnitario(Float.parseFloat(txt_vlor_unit.getText()));
                
                
                descuento=(long) (((detalle.getCantidad() * detalle.getVlorUnitario()) * (Float.parseFloat(txt_dto_com.getText())))/ 100);
                subtotal=(long)((detalle.getVlorUnitario()* detalle.getCantidad()) - descuento);
                iva=(long) (subtotal * 0.19);
                total=subtotal + iva;
                id_iva=5;//ID del iva predefinido en la BD
          
                    if(cb_um.getSelectedItem()!=null)
                    {
                        String unidad=cb_um.getSelectedItem().toString();
                        ResultSet obj=nueva.executeQuery("SELECT id_unidad FROM unidad_medida WHERE unidad='"+unidad+"'");
                         try {
                                while(obj.next())
                                {
                                     um=obj.getInt(1);
                                }
                             } catch (Exception ex){
                                  JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
                               }
                    }
                        detalle.setId_unidad(um);
                        detalle.setId_iva(id_iva);
                        detalle.setDto_comercial(descuento);
                        detalle.setIva(iva);
                        detalle.setSubtotal(subtotal);
                        detalle.setTotal(total);
                        detalle.setId_consecutivo_orden(Long.parseLong(txt_orden.getText()));
           
                        dao.guardarDetalle(detalle);
                }
                    nueva.desconectar();
                    limpiar.limpiar(jPanel4);
                    LimpiarTabla();
                    detalleTabla();
                    txt_dto_com.setText("0");
        try {
            actualizarTotales();
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);        }
   
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canActionPerformed
        JD_Detalle_Orden.dispose();
    }//GEN-LAST:event_btn_canActionPerformed

    private void btn_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modActionPerformed
          detalle_orden_compra detalle=new detalle_orden_compra();
          ConexionBD nueva=new ConexionBD();
        
        if(tabla_detalle.isRowSelected(tabla_detalle.getSelectedRow()))
        {
             int row = tabla_detalle.getSelectedRow();
             
             for(int i = 0; i < modelo.getRowCount(); i++)
             {
                 ResultSet obj=nueva.executeQuery("SELECT item_det_orden,descripcion,referencia,cantidad,vlor_unitario,dto_comercial FROM ordenescompra.detalle_orden_civsas WHERE id_detalle_orden_compra="+modelo.getValueAt(row,0)+" AND consecutivo_ordencompra="+txt_orden.getText()+"");
                 try {
                     if(obj.next()==true)
                     {
                         detalle.setItem(obj.getInt("item_det_orden"));
                         detalle.setDescripcion(obj.getString("descripcion"));
                         detalle.setReferencia(obj.getString("referencia"));
                         detalle.setCantidad(obj.getFloat("cantidad"));
                         detalle.setVlorUnitario(obj.getFloat("vlor_unitario"));
                         detalle.setDto_comercial((obj.getLong("dto_comercial")));
                         
                         txt_item.setText(String.valueOf(detalle.getItem()));
                         txt_descripcion.setText(detalle.getDescripcion());
                         txt_refe.setText(detalle.getReferencia());
                         txt_cant.setText(String.valueOf(detalle.getCantidad()));
                         txt_vlor_unit.setText(String.valueOf(detalle.getVlorUnitario()));
                         txt_dto_com.setText(String.valueOf(detalle.getDto_comercial()));
                         
                          JD_Detalle_Orden.pack();
                          JD_Detalle_Orden.setLocationRelativeTo(null);
                          JD_Detalle_Orden.setVisible(true);
                          JD_Detalle_Orden.setResizable(false);
                         
          
                         nueva.executeUpdateQuery("DELETE FROM ordenescompra.detalle_orden_civsas WHERE id_detalle_orden_compra="+modelo.getValueAt(row,0)+" AND consecutivo_ordencompra="+txt_orden.getText()+"");
                        
           
                     }
                 } catch (SQLException ex) {
                     Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             
                   int numRows = tabla_detalle.getSelectedRows().length;
         
                     for(int i = 0; i < numRows ; i++ )
                    {
                        modelo.removeRow(row);
                       
                    }
           
        nueva.desconectar();
        LimpiarTabla();
        detalleTabla();
        
        }
      else
     {
      JOptionPane.showMessageDialog(this, "Debe seleccionar un registro de la tabla para Modificarlo!."
         ,"Aviso", JOptionPane.WARNING_MESSAGE);
     }
          
        try {
            actualizarTotales();
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);        }
    }//GEN-LAST:event_btn_modActionPerformed

    private void btn_navegador_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_navegador_adelanteActionPerformed
     
        try
        {
            
        btn_navegador_atras.setEnabled(true);
        
        int it=((Requisicion)larequi.elementAt(contador)).getIt();
        txt_item.setText(String.valueOf(it));
        String des=((Requisicion)larequi.elementAt(contador)).getDescripcion();
        txt_descripcion.setText(des);
        float can=((Requisicion)larequi.elementAt(contador)).getCant();
        txt_cant.setText(String.valueOf(can));
        
        contador++;
        
        if(contador >=larequi.size() )
        {
            btn_navegador_adelante.setEnabled(false);
        }
      
        }catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btn_navegador_adelanteActionPerformed

    private void btn_navegador_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_navegador_atrasActionPerformed
        
        try
        {
            btn_navegador_adelante.setEnabled(true);
            contador --;
        
            int it=((Requisicion)larequi.elementAt(contador)).getIt();
            txt_item.setText(String.valueOf(it));
            String des=((Requisicion)larequi.elementAt(contador)).getDescripcion();
            txt_descripcion.setText(des);
            float can=((Requisicion)larequi.elementAt(contador)).getCant();
            txt_cant.setText(String.valueOf(can));
        
        if(contador <=0)
        {
            btn_navegador_atras.setEnabled(false);
        }
   
        }catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_btn_navegador_atrasActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
         
        ConexionBD nueva=new ConexionBD();
        
        //Verifica que la fila de la tabla esta seleccionada
        if(tabla_detalle.isRowSelected(tabla_detalle.getSelectedRow()))
        {
           int row = tabla_detalle.getSelectedRow();

        for(int i = 0; i < modelo.getRowCount(); i++)
        {
           nueva.executeUpdateQuery("DELETE FROM ordenescompra.detalle_orden_civsas WHERE id_detalle_orden_compra="+modelo.getValueAt(row,0)+" AND consecutivo_ordencompra="+txt_orden.getText()+"");

        }
         int numRows = tabla_detalle.getSelectedRows().length;
         
         for(int i = 0; i < numRows ; i++ )
         {
            modelo.removeRow(row);
         } 

            try {
                actualizarTotales();
            } catch (SQLException ex) {
                Logger.getLogger(JIFOrdenesCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         
 
     else
     {
      JOptionPane.showMessageDialog(this, "Debe seleccionar un registro de la tabla para eliminarlo!."
         ,"Aviso", JOptionPane.WARNING_MESSAGE);
     }
          nueva.desconectar(); 
          LimpiarTabla();
          detalleTabla();
         
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscar_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_ordenActionPerformed
       buscarOrden();
    }//GEN-LAST:event_btn_buscar_ordenActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
        proveedor=new JIFProveedor();
          MDIPrincipal.desktopPane.add(proveedor);
          proveedor.setLocation(250, 0);
          proveedor.show();
    }//GEN-LAST:event_btn_proveedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JD_Detalle_Orden;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_buscar_orden;
    private javax.swing.JButton btn_can;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_mod;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_navegador_adelante;
    private javax.swing.JButton btn_navegador_atras;
    private javax.swing.JButton btn_proveedor;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cb_ccostos;
    private javax.swing.JComboBox cb_item;
    private javax.swing.JComboBox cb_iva;
    private javax.swing.JComboBox cb_proveedor;
    private javax.swing.JComboBox cb_um;
    private javax.swing.JCheckBox chb_dto_fin;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label_dto;
    private javax.swing.JLabel label_iva;
    private javax.swing.JLabel label_subtotal;
    private javax.swing.JLabel label_total;
    private javax.swing.JPanel panel_botones3;
    private javax.swing.JTable tabla_detalle;
    private javax.swing.JTextArea txt_area_con;
    private javax.swing.JTextArea txt_area_obs;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_cargo_a;
    private javax.swing.JTextField txt_cotizacion;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_dto_com;
    private javax.swing.JTextField txt_dto_fin;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_orden;
    private javax.swing.JTextField txt_proveedor;
    private javax.swing.JTextField txt_refe;
    private javax.swing.JTextField txt_requision;
    private javax.swing.JTextField txt_vlor_unit;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

     public void buscarProveedores() throws SQLException
    {
        
        ConexionBD nueva=new ConexionBD();
        ResultSet obj=nueva.executeQuery("SELECT prove_razon_social FROM proveedores.proveedor WHERE prove_razon_social like '%"+txt_proveedor.getText().toUpperCase()+"%' ORDER BY prove_razon_social ASC");
        
        while(obj.next())
        {
            cb_proveedor.addItem(obj.getObject("prove_razon_social"));
        }
      
        nueva.desconectar();
        
    }
     
   public void deshabilitarComponentes()
   {
       btn_guardar.setEnabled(false);
       txt_requision.setEditable(false);
       txt_proveedor.setEditable(false);
       txt_cargo_a.setEditable(false);
       txt_cotizacion.setEditable(false);
       txt_area_obs.setEditable(false);
       chb_dto_fin.setEnabled(false);
       
       btn_adicionar.setEnabled(true);
       btn_mod.setEnabled(true);
       btn_eliminar.setEnabled(true);
   }
   
   public void extraerDetalleReq() throws SQLException
   {
       ConexionBD nueva=new ConexionBD();
       
       ResultSet obj=nueva.executeQuery("SELECT item_det_req,detalle_det_req,cant_det_req "
               + "FROM requisicion.detallerequisicion "
               + "WHERE requisicion_idreq="+txt_requision.getText()+"");
       
       
//       if(obj.next()==false)
//       {
//           
//           JOptionPane.showMessageDialog(null, "No se encontro la Requisición N°: " + txt_requision.getText());
//       }
//       else {
  
       while (obj.next())
       {
           //Object [] datos = new Object[4];
           
           int it=obj.getInt("item_det_req");
           String des=obj.getString("detalle_det_req");
           float cant=obj.getFloat("cant_det_req");
          
           System.out.println("it"+it +"des: "+des + "cant: "+cant);
           
           req=new Requisicion(it,des,cant);
     
           //El vector recibe el objeto de tipo requisicion
          
            larequi.addElement(req);
            System.out.println(larequi.size());

        }
       
            JOptionPane.showMessageDialog(null, "Se cargo con exito la Requisición N°: " + txt_requision.getText());
//      }
    
           nueva.desconectar();
   }
   
   public void detalleTabla()
   {
       try
        {
            ConexionBD nueva=new ConexionBD();
            
            ResultSet obj=nueva.executeQuery("SELECT detalle.id_detalle_orden_compra,detalle.item_det_orden,detalle.descripcion,detalle.cantidad,uni.unidad,detalle.vlor_unitario, detalle.dto_comercial,detalle.iva,detalle.total "
                    + "FROM ordenescompra.detalle_orden_civsas detalle JOIN unidad_medida uni ON detalle.id_unidad=uni.id_unidad "
                    + "WHERE detalle.consecutivo_ordencompra="+txt_orden.getText()+""
                    + "ORDER BY detalle.item_det_orden ASC");
            
         while (obj.next()) 
        {
        
        Object [] datos = new Object[9];
        
     
        for (int i=0;i<9;i++)
        {
            datos[i] =obj.getObject(i+1);
        }

         modelo.addRow(datos);
       
        }
           tabla_detalle.setModel(modelo);
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
  
     public void buscarOrden()
    {
        try
        {
            ConexionBD nueva=new ConexionBD();
            ordenCompra orden=new ordenCompra();
            int idusuario=MDIPrincipal.getSeccion();
            
            ResultSet obj=nueva.executeQuery("SELECT nit_proveedor,id_requisicion,cargoa_orden,dto_financiero,cotizacion,observacion,condiciones FROM ordenescompra.orden_compra_civsas WHERE consecutivo_orden_compra="+txt_orden.getText()+" AND id_usuario="+idusuario+"");
   
                
                if(obj.next()==true)
                {
  
                    orden.setNit_proveedor(obj.getLong("nit_proveedor"));
                    orden.setRequisicion(obj.getString("id_requisicion"));
                    orden.setDto_financiero(obj.getInt("dto_financiero"));
                    orden.setCargo_orden(obj.getString("cargoa_orden"));
                    orden.setObservacion(obj.getString("observacion"));
                    orden.setCotizacion(obj.getString("cotizacion"));
                    orden.setCondiciones(obj.getString("condiciones"));
                    
                    
                    txt_proveedor.setText(String.valueOf(orden.getNit_proveedor()));
                    txt_requision.setText(String.valueOf(orden.getRequisicion()));
                    txt_cotizacion.setText(orden.getCotizacion());
                    txt_cargo_a.setText(orden.getCargo_orden());
                    txt_area_obs.setText(orden.getObservacion());
                    txt_dto_fin.setText(String.valueOf(orden.getDto_financiero()));
                    txt_area_con.setText(orden.getCondiciones());
          

                    txt_proveedor.setEditable(true);
                    txt_cotizacion.setEnabled(true);
                    txt_proveedor.setEnabled(true);
                    txt_cargo_a.setEnabled(true);
                    txt_area_obs.setEnabled(true);
                    txt_area_con.setEnabled(true);
                     
                    cb_proveedor.setEnabled(true);
                    cb_ccostos.setEnabled(true);
                    cb_item.setEnabled(true);
                    txt_orden.setEditable(false);
                    btn_buscar_orden.setEnabled(false);
                    btn_modificar.setEnabled(false);
                    btn_actualizar.setEnabled(true);
                    btn_imprimir.setEnabled(true);
                    btn_ingresar.setEnabled(false);
              
                     detalleTabla();  
                     actualizarTotales();
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "No se encuentra la Orden y/o la orden no corresponde al usuario");

                } 
     
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
     
     
     public void actualizarTotales() throws SQLException
     {
         ConexionBD nueva=new ConexionBD();
         
         String subtotal=null,total=null,iva=null,dto=null;
         
         ResultSet obj=nueva.executeQuery("SELECT to_char(SUM(detalle.subtotal),'999G999G999G999D99')AS subtotal, to_char(SUM(detalle.dto_comercial),'999G999G999G999D99')AS descuento,"
                 + "to_char(SUM(detalle.iva),'999G999G999G999D99')AS iva,to_char(SUM(detalle.total)- (orden.dto_financiero) ,'999G999G999G999D99')AS total "
                 + "FROM ordenescompra.detalle_orden_civsas detalle JOIN ordenescompra.orden_compra_civsas orden ON orden.consecutivo_orden_compra=detalle.consecutivo_ordencompra "
                 + "WHERE detalle.consecutivo_ordencompra="+txt_orden.getText()+" GROUP BY orden.dto_financiero");
         
         while(obj.next())
         {
            subtotal=obj.getString("subtotal");
            dto=obj.getString("descuento");
            iva=obj.getString("iva");
            total=obj.getString("total");
         }
         
         label_subtotal.setText(subtotal);
         label_dto.setText(dto);
         label_iva.setText(iva);
         label_total.setText(total);

     }

}
