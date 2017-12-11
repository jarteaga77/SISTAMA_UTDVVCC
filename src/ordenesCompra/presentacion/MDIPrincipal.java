
package ordenesCompra.presentacion;

import cotizacion.presentacion.JIFCotizacionEntrada;
import cotizacion.presentacion.JIFGenerarReporteCotizaciones;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import ordenesCompra.conexion.ConexionBD;
import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;
/**
 *
 * @author jarteaga
 */
public class MDIPrincipal extends javax.swing.JFrame {
    
    
    private JIFInicioOrdenCompra jifInicioOrden;
    private JIFImprimirOrdenCompra jifimprimir;
    private JIFCotizacionEntrada jifcot_entrada;
    private JIFGenerarReporteCotizaciones jifgenerar_cot;
    private JIFExportarExcelOrden jifexcelorden;
    private JIFExportarExcelReq exportarReq;
    private JIFProveedor proveedor;
            
    
    private static int seccion;
            

    public MDIPrincipal() {
        initComponents();
         desktopPane.setBorder(new Imagenfondo());
    }
    
    //get Seccion para obtener la cedula del usuario del sistema
     public static int getSeccion() {
        return MDIPrincipal.seccion;
    }

     //Set statico para mantener vigente la cedula del usuario del sistema
    public static void setSeccion(int seccion) {
        MDIPrincipal.seccion = seccion;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDLogueo = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jB_ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpf_clave = new javax.swing.JPasswordField();
        jtf_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jB_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btn_proveedor = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        JB_ordenCompra = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        b_cotizacion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jm_cotizaciones = new javax.swing.JMenuItem();
        jm_imprimir_cot = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        JDLogueo.setResizable(false);
        JDLogueo.setUndecorated(true);

        jTabbedPane1.setBackground(new java.awt.Color(65, 238, 232));

        jPanel1.setBackground(new java.awt.Color(65, 238, 232));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(65, 238, 232));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jB_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/ingresar.png"))); // NOI18N
        jB_ingresar.setToolTipText("Ingresar");
        jB_ingresar.setBorder(null);
        jB_ingresar.setBorderPainted(false);
        jB_ingresar.setContentAreaFilled(false);
        jB_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_ingresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/IngresarR.png"))); // NOI18N
        jB_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ingresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Contraseña:");

        jpf_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpf_claveKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Usuario:");

        jB_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/salirS.png"))); // NOI18N
        jB_salir.setToolTipText("Salir");
        jB_salir.setBorder(null);
        jB_salir.setBorderPainted(false);
        jB_salir.setContentAreaFilled(false);
        jB_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/salirSR.png"))); // NOI18N
        jB_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jB_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_salir)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_ingresar)
                    .addComponent(jB_salir))
                .addGap(21, 21, 21))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/login_manager.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UTDVVCC", jPanel1);

        javax.swing.GroupLayout JDLogueoLayout = new javax.swing.GroupLayout(JDLogueo.getContentPane());
        JDLogueo.getContentPane().setLayout(JDLogueoLayout);
        JDLogueoLayout.setHorizontalGroup(
            JDLogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        JDLogueoLayout.setVerticalGroup(
            JDLogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema UTDVVCC V 0.1");

        jToolBar1.setRollover(true);

        btn_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/proveedor.png"))); // NOI18N
        btn_proveedor.setToolTipText("Nuevo Proveedor");
        btn_proveedor.setFocusable(false);
        btn_proveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_proveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_proveedor);
        jToolBar1.add(jSeparator1);

        JB_ordenCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/ordencompra.png"))); // NOI18N
        JB_ordenCompra.setToolTipText("Orden de Compra");
        JB_ordenCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_ordenCompra.setFocusable(false);
        JB_ordenCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB_ordenCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB_ordenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ordenCompraActionPerformed(evt);
            }
        });
        jToolBar1.add(JB_ordenCompra);
        jToolBar1.add(jSeparator3);

        b_cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/cotizacion.png"))); // NOI18N
        b_cotizacion.setToolTipText("Cotizaciones");
        b_cotizacion.setFocusable(false);
        b_cotizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_cotizacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b_cotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cotizacionActionPerformed(evt);
            }
        });
        jToolBar1.add(b_cotizacion);

        jMenu1.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Cerrar sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Orden de Compra");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Orden de Compra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Imprimir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Consultas orden compra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Requisiciones");

        jMenuItem6.setText("Consultar Requisiciones");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Cotizaciones");

        jm_cotizaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jm_cotizaciones.setText("Cotizaciones");
        jm_cotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_cotizacionesActionPerformed(evt);
            }
        });
        jMenu3.add(jm_cotizaciones);

        jm_imprimir_cot.setText("Imprimir");
        jm_imprimir_cot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_imprimir_cotActionPerformed(evt);
            }
        });
        jMenu3.add(jm_imprimir_cot);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Ayuda");

        jMenuItem7.setText("Manual");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Acerca de");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_ordenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ordenCompraActionPerformed
        if(estacerrado(jifInicioOrden))
      {
       jifInicioOrden=new JIFInicioOrdenCompra();
       desktopPane.add(jifInicioOrden);
       jifInicioOrden.setLocation(350, 0);
       jifInicioOrden.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_JB_ordenCompraActionPerformed

    private void jB_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ingresarActionPerformed
        logueo();
    }//GEN-LAST:event_jB_ingresarActionPerformed

    private void jpf_claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpf_claveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logueo();
        }
    }//GEN-LAST:event_jpf_claveKeyPressed

    private void jB_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB_salirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       cerrarSesion();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(estacerrado(jifInicioOrden))
      {
       jifInicioOrden=new JIFInicioOrdenCompra();
       desktopPane.add(jifInicioOrden);
       jifInicioOrden.setLocation(350, 0);
       jifInicioOrden.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       if(estacerrado(jifimprimir))
      {
       jifimprimir=new JIFImprimirOrdenCompra();
       desktopPane.add(jifimprimir);
       jifimprimir.setLocation(250, 0);
       jifimprimir.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void b_cotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cotizacionActionPerformed
        if(estacerrado(jifcot_entrada))
      {
       jifcot_entrada=new JIFCotizacionEntrada();
       desktopPane.add(jifcot_entrada);
       jifcot_entrada.setLocation(350, 0);
       jifcot_entrada.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_b_cotizacionActionPerformed

    private void jm_imprimir_cotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_imprimir_cotActionPerformed
        if(estacerrado(jifgenerar_cot))
      {
       jifgenerar_cot=new JIFGenerarReporteCotizaciones();
       desktopPane.add(jifgenerar_cot);
       jifgenerar_cot.setLocation(350, 0);
       jifgenerar_cot.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jm_imprimir_cotActionPerformed

    private void jm_cotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_cotizacionesActionPerformed
         if(estacerrado(jifcot_entrada))
      {
       jifcot_entrada=new JIFCotizacionEntrada();
       desktopPane.add(jifcot_entrada);
       jifcot_entrada.setLocation(350, 0);
       jifcot_entrada.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jm_cotizacionesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            if(estacerrado(jifexcelorden))
      {
       jifexcelorden=new JIFExportarExcelOrden();
       desktopPane.add(jifexcelorden);
       jifexcelorden.setLocation(200, 0);
       jifexcelorden.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(estacerrado(exportarReq))
      {
       exportarReq=new JIFExportarExcelReq();
       desktopPane.add(exportarReq);
       exportarReq.setLocation(200, 0);
       exportarReq.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
         if(estacerrado(proveedor))
      {
       proveedor=new JIFProveedor();
       desktopPane.add(proveedor);
       proveedor.setLocation(250, 0);
       proveedor.show();
      }
      else
      {
          JOptionPane.showMessageDialog(this,"La ventana esta abierta", "Error",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btn_proveedorActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       JOptionPane.showMessageDialog(null,"UTD");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    File path;
        try {
            path = new File(getClass().getResource("/Manual/ManualdeusuarioOrdenesdeCompra.pdf").toURI());
            Desktop.getDesktop().open(path);
        } catch (URISyntaxException | IOException ex) {
        }

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
        
        /*
         * Set the Nimbus look and feel
         */
         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;");
                    break;
                }
            }
            
            UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
             
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
            
        //</editor-fold>
            MDIPrincipal principal = new MDIPrincipal(); // Inicializa la ventana con los menús de la aplicación
            principal.setLocationRelativeTo(null);
            principal.setVisible(false);//Frame Principal No arranca visible
            principal.setExtendedState(JFrame.MAXIMIZED_BOTH);//Frame toma el tramaño de la resolución de la pantalla
            principal.inicioSeccion();  
 
        /*
         * Create and display the form
         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new MDIPrincipal().setVisible(true);
//            }
//        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_ordenCompra;
    private javax.swing.JDialog JDLogueo;
    private javax.swing.JButton b_cotizacion;
    private javax.swing.JButton btn_proveedor;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jB_ingresar;
    private javax.swing.JButton jB_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jm_cotizaciones;
    private javax.swing.JMenuItem jm_imprimir_cot;
    private javax.swing.JPasswordField jpf_clave;
    private javax.swing.JTextField jtf_usuario;
    // End of variables declaration//GEN-END:variables
 private boolean estacerrado(Object obj){
        JInternalFrame[] activos=desktopPane.getAllFrames();
        boolean cerrado=true;
        int i=0;
        while (i<activos.length && cerrado){
            if(activos[i]==obj){
		cerrado=false;
            }
            i++;
        }
    return cerrado;
    }
 
 //Manejo de la ventan de logueo
  public void inicioSeccion()
    {
        JDLogueo.pack();
        JDLogueo.setLocationRelativeTo(null);
        JDLogueo.setVisible(true);
        JDLogueo.setResizable(false);
    }
    
    //Metodo para Validar al usuario (usuario y contraseña)
    public void logueo()
    {
        try
        {
            ConexionBD nueva=new ConexionBD();
            ResultSet oResultSet=nueva.executeQuery("SELECT usuario,claveusuario,cedula FROM usuariosistema.usuario WHERE usuario='"+jtf_usuario.getText()+"' AND claveusuario= '"+String.copyValueOf(jpf_clave.getPassword())+"'");
    
         if(oResultSet.next()==true)
         {
           JDLogueo.dispose();
           jtf_usuario.setText("");
           jpf_clave.setText("");
           this.setVisible(true);
           
           //Se captura la cedula del usuario
           int id=oResultSet.getInt("cedula");
           //System.out.println(id);
           //Se adiciona la cedula del usuario
           setSeccion(id);
           
          
         }
         else
         {
             jtf_usuario.setText("");
             jpf_clave.setText("");
             
             JOptionPane.showMessageDialog(null, "Usuario ó Contraseña invalido,  \n Intentelo de nuevo!", "Error", JOptionPane.ERROR_MESSAGE);
             
         }
       
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    //oculta el frame principal y pide de nuevo usuario y contraseña
     public void cerrarSesion()
    {
        this.setVisible(false);
        inicioSeccion();
    }



}
