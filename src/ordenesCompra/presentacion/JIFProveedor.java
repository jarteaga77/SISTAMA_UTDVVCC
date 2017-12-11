
package ordenesCompra.presentacion;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ordenesCompra.conexion.ConexionBD;
import ordenesCompra.dominio.proveedores.DaoProveedor;
import ordenesCompra.dominio.proveedores.proveedor;

/**
 *
 * @author jarteaga
 */
public class JIFProveedor extends javax.swing.JInternalFrame {

   
    ConexionBD nueva=new ConexionBD();
    
    LimpiarCampos limpiar =new LimpiarCampos();
 
    
    
    public JIFProveedor() {
        initComponents();
        
           //Objeto jPanel encabezado con color personalizado
        Color c1 = new Color(66,111,166);
        Color c2 = new Color(102,174,118);
        JPColor jpmicolor = new JPColor(c1,c2);
        jpmicolor.setSize(this.getSize());        
        panel_encabezado.add(jpmicolor); 
        
        try
        {
         
        ResultSet obj=nueva.executeQuery("SELECT nombre_ciudad FROM ciudad order by nombre_ciudad asc");
        
        while(obj.next())
        {
            cb_ciudad.addItem(obj.getObject("nombre_ciudad"));
        }
        nueva.desconectar();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    private static long nit;
    
    public static long getnit()
    {
        return JIFProveedor.nit;
    }
    public static void settxtnitproveedor(long nit)
    {
        JIFProveedor.txt_nit.setText(String.valueOf(nit));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_razon_social = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_ciudad = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_telefono2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_asesor1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cel1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_asesor2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_celular2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_fax = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        b_ingresar = new javax.swing.JButton();
        b_guardar = new javax.swing.JButton();
        b_modificar = new javax.swing.JButton();
        b_actualizar = new javax.swing.JButton();
        b_eliminar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        b_buscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_razon_comercial = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Proveedor UTDVVCC");
        setEnabled(false);

        panel_encabezado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Nimbus Sans L", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 245, 245));
        jLabel1.setText("Proveedor");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/proveedor_1.png"))); // NOI18N

        javax.swing.GroupLayout panel_encabezadoLayout = new javax.swing.GroupLayout(panel_encabezado);
        panel_encabezado.setLayout(panel_encabezadoLayout);
        panel_encabezadoLayout.setHorizontalGroup(
            panel_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_encabezadoLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_encabezadoLayout.setVerticalGroup(
            panel_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_encabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Nit Proveedor:");

        txt_nit.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Razón Social:");

        txt_razon_social.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel5.setText("Dirección:");

        txt_direccion.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setText("Ciudad:");

        cb_ciudad.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel7.setText("Telefono 1:");

        txt_telefono1.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel8.setText("Telefono 2");

        txt_telefono2.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel9.setText("Asesor 1");

        txt_asesor1.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel10.setText("Celular 1");

        txt_cel1.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel11.setText("Asesor 2");

        txt_asesor2.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel12.setText("Celular 2");

        txt_celular2.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel13.setText("Fax:");

        txt_fax.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        b_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/open.png"))); // NOI18N
        b_ingresar.setToolTipText("Ingresar");
        b_ingresar.setBorderPainted(false);
        b_ingresar.setContentAreaFilled(false);
        b_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ingresar.setFocusPainted(false);
        b_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ingresarActionPerformed(evt);
            }
        });

        b_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/save.png"))); // NOI18N
        b_guardar.setToolTipText("Guardar");
        b_guardar.setBorderPainted(false);
        b_guardar.setContentAreaFilled(false);
        b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_guardar.setEnabled(false);
        b_guardar.setFocusPainted(false);
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });

        b_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/mod.png"))); // NOI18N
        b_modificar.setToolTipText("Modificar");
        b_modificar.setBorderPainted(false);
        b_modificar.setContentAreaFilled(false);
        b_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_modificar.setFocusPainted(false);
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });

        b_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/actualizar.png"))); // NOI18N
        b_actualizar.setToolTipText("Actualizar");
        b_actualizar.setBorderPainted(false);
        b_actualizar.setContentAreaFilled(false);
        b_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_actualizar.setEnabled(false);
        b_actualizar.setFocusPainted(false);
        b_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actualizarActionPerformed(evt);
            }
        });

        b_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/eliminar.png"))); // NOI18N
        b_eliminar.setToolTipText("Eliminar");
        b_eliminar.setBorderPainted(false);
        b_eliminar.setContentAreaFilled(false);
        b_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_eliminar.setEnabled(false);
        b_eliminar.setFocusPainted(false);
        b_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarActionPerformed(evt);
            }
        });

        b_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/cancelar.png"))); // NOI18N
        b_cancelar.setToolTipText("Cancelar");
        b_cancelar.setBorderPainted(false);
        b_cancelar.setContentAreaFilled(false);
        b_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cancelar.setFocusPainted(false);
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/eqsl_exit.png"))); // NOI18N
        b_salir.setToolTipText("Salir");
        b_salir.setBorderPainted(false);
        b_salir.setContentAreaFilled(false);
        b_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_salir.setFocusPainted(false);
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(b_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_ingresar)
                    .addComponent(b_guardar)
                    .addComponent(b_modificar)
                    .addComponent(b_actualizar)
                    .addComponent(b_eliminar)
                    .addComponent(b_cancelar)
                    .addComponent(b_salir))
                .addGap(25, 25, 25))
        );

        b_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/Buscar.png"))); // NOI18N
        b_buscar.setBorderPainted(false);
        b_buscar.setContentAreaFilled(false);
        b_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_buscar.setEnabled(false);
        b_buscar.setFocusPainted(false);
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });

        jLabel14.setText("Razón Comercial:");

        txt_razon_comercial.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_razon_comercial, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b_buscar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_fax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(txt_telefono1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txt_asesor1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_asesor2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel5))
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_celular2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_cel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                                .addComponent(txt_razon_social)
                                                .addComponent(cb_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_buscar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_razon_comercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_asesor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txt_cel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_asesor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(txt_celular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ingresarActionPerformed
        ingresarGUI();
    }//GEN-LAST:event_b_ingresarActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        try
        {
        
            proveedor prove=new proveedor();
            DaoProveedor daoProve=new DaoProveedor();
            
            int id_ciudad=0;
            
            if(cb_ciudad.getSelectedItem()!=null)
            {
                String ciudad=cb_ciudad.getSelectedItem().toString();
                ResultSet obj=nueva.executeQuery("SELECT id_ciudad FROM ciudad WHERE nombre_ciudad='"+ciudad+"'");
                
                while(obj.next())
                {
                    id_ciudad=obj.getInt(1);
                }
            }
            
            if(txt_nit.getText().isEmpty() || txt_razon_social.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Los campos nit y razon social son campos obligatorios");
            }
            else
            {
                if(txt_nit.getText().matches("[0-9]*"))
                {
                   
                    prove.setNit_proveedor(Long.parseLong(txt_nit.getText()));
                    prove.setRazon_social(txt_razon_social.getText().toUpperCase());
                    prove.setDireccion(txt_direccion.getText().toUpperCase());
                    prove.setTel1(txt_telefono1.getText());
                    prove.setTel2(txt_telefono2.getText());
                    prove.setCelular1(txt_cel1.getText());
                    prove.setCelular2(txt_celular2.getText());
                    prove.setFax(txt_fax.getText());
                    prove.setContacto1(txt_asesor1.getText().toUpperCase());
                    prove.setContacto2(txt_asesor2.getText().toUpperCase());
                    prove.setId_ciudad(id_ciudad);
                    prove.setRazon_comercial(txt_razon_comercial.getText().toUpperCase());
                    
                    daoProve.guardarProveedor(prove, Long.parseLong(txt_nit.getText()));
                   
                    limpiar.limpiar(jPanel1);
                    estaInicialComponentes();
                    dispose();
                    
                }
                else
                {                    
                     JOptionPane.showMessageDialog(null,"El campo nit debe ser un valor numérico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }

        }catch(NumberFormatException | SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_guardarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
       txt_nit.setEnabled(true);
       b_buscar.setEnabled(true);
       b_ingresar.setEnabled(false);
       b_modificar.setEnabled(false);
    }//GEN-LAST:event_b_modificarActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        consultar();
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actualizarActionPerformed
        try
        {
            
            proveedor prove=new proveedor();
            DaoProveedor daoProve=new DaoProveedor();
            long proveedor=0;
            
            int id_ciudad=0;
            
            if(cb_ciudad.getSelectedItem()!=null)
            {
                String ciudad=cb_ciudad.getSelectedItem().toString();
                ResultSet obj=nueva.executeQuery("SELECT id_ciudad FROM ciudad WHERE nombre_ciudad='"+ciudad+"'");
                
                while(obj.next())
                {
                    id_ciudad=obj.getInt(1);
                }
            }
            
            if(txt_nit.getText().isEmpty() || txt_razon_social.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Los campos nit y razon social son campos obligatorios");
            }
            else
            {
                if(txt_nit.getText().matches("[0-9]*"))
                {
                   
                 
                    prove.setRazon_social(txt_razon_social.getText().toUpperCase());
                    prove.setDireccion(txt_direccion.getText().toUpperCase());
                    prove.setTel1(txt_telefono1.getText());
                    prove.setTel2(txt_telefono2.getText());
                    prove.setCelular1(txt_cel1.getText());
                    prove.setCelular2(txt_celular2.getText());
                    prove.setFax(txt_fax.getText());
                    prove.setContacto1(txt_asesor1.getText().toUpperCase());
                    prove.setContacto2(txt_asesor2.getText().toUpperCase());
                    prove.setId_ciudad(id_ciudad);
                    prove.setRazon_comercial(txt_razon_comercial.getText().toUpperCase());
                    proveedor=Long.parseLong(txt_nit.getText());
                    daoProve.actualizar(prove, proveedor);
                   
                    limpiar.limpiar(jPanel1);
                    estaInicialComponentes();
                }
                else
                {                    
                     JOptionPane.showMessageDialog(null,"El campo nit debe ser un valor numérico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }

        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_actualizarActionPerformed

    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
        try
        {
            proveedor prove=new proveedor();
            DaoProveedor daoProve=new DaoProveedor();
            
            int opc=JOptionPane.showConfirmDialog(null, "Desea Eliminar el Proveedor ?", "Aviso",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if(opc==JOptionPane.YES_OPTION)
            {
                daoProve.eliminar(Long.parseLong(txt_nit.getText()));
                limpiar.limpiar(jPanel1);
                 estaInicialComponentes();
            }
            
        }catch(HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_eliminarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        limpiar.limpiar(jPanel1);
        estaInicialComponentes();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        dispose();
    }//GEN-LAST:event_b_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_eliminar;
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_ingresar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JButton b_salir;
    private javax.swing.JComboBox cb_ciudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel panel_encabezado;
    private javax.swing.JTextField txt_asesor1;
    private javax.swing.JTextField txt_asesor2;
    private javax.swing.JTextField txt_cel1;
    private javax.swing.JTextField txt_celular2;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fax;
    private static javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_razon_comercial;
    private javax.swing.JTextField txt_razon_social;
    private javax.swing.JTextField txt_telefono1;
    private javax.swing.JTextField txt_telefono2;
    // End of variables declaration//GEN-END:variables
//    private boolean estacerrado(Object obj){
//        JInternalFrame[] activos=MDIPrincipal.desktopPane.getAllFrames();
//        boolean cerrado=true;
//        int i=0;
//        while (i<activos.length && cerrado){
//            if(activos[i]==obj){
//		cerrado=false;
//            }
//            i++;
//        }
//    return cerrado;
//    }

    public void ingresarGUI()
    {
        
        txt_nit.setEnabled(true);
        txt_razon_social.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_telefono1.setEnabled(true);
        txt_telefono2.setEnabled(true);
        txt_cel1.setEnabled(true);
        txt_celular2.setEnabled(true);
        txt_fax.setEnabled(true);
        txt_asesor1.setEnabled(true);
        txt_asesor2.setEnabled(true);
        cb_ciudad.setEnabled(true); 
        b_guardar.setEnabled(true);
        txt_razon_comercial.setEnabled(true);
        
        
        b_ingresar.setEnabled(false);
        b_modificar.setEnabled(false);
        
    }
    
    public void estaInicialComponentes()
    {
        txt_nit.setEnabled(false);
        txt_razon_social.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_telefono1.setEnabled(false);
        txt_telefono2.setEnabled(false);
        txt_cel1.setEnabled(false);
        txt_celular2.setEnabled(false);
        txt_fax.setEnabled(false);
        txt_asesor1.setEnabled(false);
        txt_asesor2.setEnabled(false);
        cb_ciudad.setEnabled(false); 
        b_guardar.setEnabled(false);
        b_actualizar.setEnabled(false);
        b_eliminar.setEnabled(false);
        txt_nit.setEditable(true);
        txt_razon_comercial.setEnabled(false);
        
        b_ingresar.setEnabled(true);
        b_modificar.setEnabled(true);
        
    }
     
    public void consultar()
    {
        try
        {
            
            proveedor prove=new proveedor();
            
            ResultSet obj=nueva.executeQuery("SELECT * FROM proveedores.proveedor WHERE nit_proveedor="+txt_nit.getText()+"");
            
            if(obj.next()==true)
            {
                prove.setRazon_social(obj.getString("prove_razon_social"));
                prove.setDireccion(obj.getString("prove_direccion"));
                prove.setTel1(obj.getString("prove_telefono1"));
                prove.setTel2(obj.getString("prove_telefono2"));
                prove.setCelular1(obj.getString("prove_celular1"));
                prove.setCelular2(obj.getString("prove_celular2"));
                prove.setFax(obj.getString("prove_fax"));
                prove.setContacto1(obj.getString("prove_contacto1"));
                prove.setContacto2(obj.getString("prove_contacto2"));
                prove.setRazon_comercial(obj.getString("razon_comercial"));
                
                txt_razon_social.setText(prove.getRazon_social());
                txt_direccion.setText(prove.getDireccion());
                txt_telefono1.setText(prove.getTel1());
                txt_telefono2.setText(prove.getTel2());
                txt_cel1.setText(prove.getCelular1());
                txt_celular2.setText(prove.getCelular2());
                txt_fax.setText(prove.getFax());
                txt_asesor1.setText(prove.getContacto1());
                txt_asesor2.setText(prove.getContacto2());
                txt_razon_comercial.setText(prove.getRazon_comercial());
                
                txt_nit.setEditable(false);
                txt_razon_social.setEnabled(true);
                txt_direccion.setEnabled(true);
                txt_telefono1.setEnabled(true);
                txt_telefono2.setEnabled(true);
                txt_cel1.setEnabled(true);
                txt_celular2.setEnabled(true);
                txt_fax.setEnabled(true);
                txt_asesor1.setEnabled(true);
                txt_asesor2.setEnabled(true);
                cb_ciudad.setEnabled(true); 
                txt_razon_comercial.setEnabled(true);
                
                
                 b_actualizar.setEnabled(true);
                 //b_eliminar.setEnabled(true);
                 
                 b_buscar.setEnabled(false);  
                
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el proveedor con Nit: " + txt_nit.getText() );
            }
            
        }catch(SQLException | HeadlessException e)
        {
            
        }
    }




}
