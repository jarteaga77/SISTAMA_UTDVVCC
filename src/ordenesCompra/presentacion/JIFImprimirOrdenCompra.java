
package ordenesCompra.presentacion;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import ordenCompraCSS.reporte.ReporteOrdenCompraCAS;
import ordenesCompra.reporte.ReporteOrdenCompra;
import ordenesCompraCIVSAS.reporte.ReporteOrdenCompra_CIVSAS;
import ordenesCompraCLG.reporte.ReporteOrdenCompra_CLG;
import ordenesCompraMVVCC.reporte.ReporteOrdenCompraMVVCC;

/**
 *
 * @author jarteaga
 */
public class JIFImprimirOrdenCompra extends javax.swing.JInternalFrame {

   private ReporteOrdenCompra jasper;
   private ReporteOrdenCompraMVVCC jasper2;
   private ReporteOrdenCompraCAS jasper3;
   private ReporteOrdenCompra_CLG jasper4;
   private ReporteOrdenCompra_CIVSAS jasper5;
           
    public JIFImprimirOrdenCompra() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_orden = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b_imprimir = new javax.swing.JButton();
        rb_utdvvcc = new javax.swing.JRadioButton();
        rb_cas = new javax.swing.JRadioButton();
        rb_mvvcc = new javax.swing.JRadioButton();
        rb_clg = new javax.swing.JRadioButton();
        rb_civsas = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Imprimir Orden de Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_orden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ordenKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Orden de Compra N°:");

        b_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/printer2.png"))); // NOI18N
        b_imprimir.setToolTipText("Imprimir");
        b_imprimir.setBorderPainted(false);
        b_imprimir.setContentAreaFilled(false);
        b_imprimir.setFocusPainted(false);
        b_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_imprimirActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_utdvvcc);
        rb_utdvvcc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_utdvvcc.setSelected(true);
        rb_utdvvcc.setText("UTDVVCC");

        buttonGroup1.add(rb_cas);
        rb_cas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_cas.setText("CSS Constructores");

        buttonGroup1.add(rb_mvvcc);
        rb_mvvcc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_mvvcc.setText("MVVCC");

        buttonGroup1.add(rb_clg);
        rb_clg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_clg.setText("Concesión LGB");

        rb_civsas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rb_civsas.setText("CIV S.A.S");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_imprimir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(rb_utdvvcc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_cas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_clg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_mvvcc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_civsas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_cas)
                    .addComponent(rb_utdvvcc)
                    .addComponent(rb_mvvcc)
                    .addComponent(rb_clg)
                    .addComponent(rb_civsas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_imprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txt_ordenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ordenKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          
              if(txt_orden.getText().matches("[0-9]*"))
          {
              if(rb_utdvvcc.isSelected()==true)
              {
                  jasper=new ReporteOrdenCompra();
                   int  orden = Integer.parseInt(txt_orden.getText());
                   jasper.ejecutarReporte(orden);
                   dispose();
              }
              else if(rb_mvvcc.isSelected()==true)
              {
                  jasper2=new ReporteOrdenCompraMVVCC();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper2.ejecutarReporte(orden);
                  dispose();
              }
              else if(rb_cas.isSelected()==true)
              {
                  jasper3 =new ReporteOrdenCompraCAS();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper3.ejecutarReporte(orden);
                  dispose();
              }
               else if(rb_clg.isSelected()==true)
              {
                  jasper4 =new ReporteOrdenCompra_CLG();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper4.ejecutarReporte(orden);
                  dispose();
              }
              
                   else if(rb_civsas.isSelected()==true)
              {
                  jasper5=new ReporteOrdenCompra_CIVSAS();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper5.ejecutarReporte(orden);
                  dispose();
              }
          
          }else
          {
              JOptionPane.showMessageDialog(null, "El número de la orden debe ser de tipo numérico!", "Error", JOptionPane.ERROR_MESSAGE);
          }
          
        }
            
    }//GEN-LAST:event_txt_ordenKeyPressed

    private void b_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_imprimirActionPerformed
        if(txt_orden.getText().matches("[0-9]*"))
          {
              if(rb_utdvvcc.isSelected()==true)
              {
                  jasper=new ReporteOrdenCompra();
                   int  orden = Integer.parseInt(txt_orden.getText());
                   jasper.ejecutarReporte(orden);
                   dispose();
              }
              else if(rb_mvvcc.isSelected()==true)
              {
                  jasper2=new ReporteOrdenCompraMVVCC();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper2.ejecutarReporte(orden);
                  dispose();
              }
              else if(rb_cas.isSelected()==true)
              {
                  jasper3 =new ReporteOrdenCompraCAS();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper3.ejecutarReporte(orden);
                  dispose();
              }
              else if(rb_clg.isSelected()==true)
              {
                  jasper4 =new ReporteOrdenCompra_CLG();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper4.ejecutarReporte(orden);
                  dispose();
              }
              else if(rb_civsas.isSelected()==true)
              {
                  jasper5=new ReporteOrdenCompra_CIVSAS();
                  int  orden = Integer.parseInt(txt_orden.getText());
                  jasper5.ejecutarReporte(orden);
                  dispose();
              }
          
          }else
          {
              JOptionPane.showMessageDialog(null, "El número de la orden debe ser de tipo numérico!", "Error", JOptionPane.ERROR_MESSAGE);
          }
          
        
    }//GEN-LAST:event_b_imprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_imprimir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb_cas;
    private javax.swing.JRadioButton rb_civsas;
    private javax.swing.JRadioButton rb_clg;
    private javax.swing.JRadioButton rb_mvvcc;
    private javax.swing.JRadioButton rb_utdvvcc;
    private javax.swing.JTextField txt_orden;
    // End of variables declaration//GEN-END:variables
}
