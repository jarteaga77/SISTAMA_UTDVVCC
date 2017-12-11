
package cotizacion.presentacion;


import cotizacion.reporte.ReporteCotizacionCSS;
import cotizacion.reporte.ReporteCotizacionMVVCC;
import cotizacion.reporte.ReporteCotizacionUTD;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class JIFGenerarReporteCotizaciones extends javax.swing.JInternalFrame {

        private ReporteCotizacionUTD jasper;
        private ReporteCotizacionCSS jasper2;
        private ReporteCotizacionMVVCC jasper3;
        
    public JIFGenerarReporteCotizaciones() {
        initComponents();
        jasper=new ReporteCotizacionUTD ();
        jasper2=new ReporteCotizacionCSS();
        jasper3=new ReporteCotizacionMVVCC();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_consecutivo = new javax.swing.JTextField();
        rb_utdvvcc = new javax.swing.JRadioButton();
        rb_css = new javax.swing.JRadioButton();
        rb_mvvcc = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        b_generar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Reporte de Cotizaciones");
        setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_consecutivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_consecutivoKeyPressed(evt);
            }
        });

        buttonGroup1.add(rb_utdvvcc);
        rb_utdvvcc.setSelected(true);
        rb_utdvvcc.setText("UTDVVCC");

        buttonGroup1.add(rb_css);
        rb_css.setText("Carlos Solarte");

        buttonGroup1.add(rb_mvvcc);
        rb_mvvcc.setText("MVVCC");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Consecutivo Cotización N°:");

        b_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTDVVCC/recursos/printer2.png"))); // NOI18N
        b_generar.setBorderPainted(false);
        b_generar.setContentAreaFilled(false);
        b_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_generarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_utdvvcc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_css)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_mvvcc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_consecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_generar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_utdvvcc)
                    .addComponent(rb_mvvcc)
                    .addComponent(rb_css))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_consecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(b_generar)))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void b_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generarActionPerformed
     
        
        if(rb_utdvvcc.isSelected()==true)
        {
       
            
            if(txt_consecutivo.getText().matches("[0-9]*"))
          {
              int consecutivo = Integer.parseInt(txt_consecutivo.getText());
              jasper.ejecutarReporte(consecutivo);
              dispose();
          
          }else
          {
              JOptionPane.showMessageDialog(null, "El número de la Cotización debe ser de tipo numérico!", "Error", JOptionPane.ERROR_MESSAGE);
          }
        }else if(rb_css.isSelected()==true)
        {
      
            
            if(txt_consecutivo.getText().matches("[0-9]*"))
          {
              int consecutivo= Integer.parseInt(txt_consecutivo.getText());
              jasper2.ejecutarReporte(consecutivo);
              dispose();
          
          }else
          {
              JOptionPane.showMessageDialog(null, "El número de la Cotización debe ser de tipo numérico!", "Error", JOptionPane.ERROR_MESSAGE);
          }
        }   else if(rb_mvvcc.isSelected()==true)
            {
        
     
            
                if(txt_consecutivo.getText().matches("[0-9]*"))
                {
                    int consecutivo=Integer.parseInt(txt_consecutivo.getText());
                    jasper3.ejecutarReporte(consecutivo);
                    dispose();
                }
            }
        
    }//GEN-LAST:event_b_generarActionPerformed

    private void txt_consecutivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_consecutivoKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        
        if(rb_utdvvcc.isSelected()==true)
        {
         
            
            if(txt_consecutivo.getText().matches("[0-9]*"))
          {
              int consecutivo = Integer.parseInt(txt_consecutivo.getText());
              jasper.ejecutarReporte(consecutivo);
              dispose();
          
          }else
          {
              JOptionPane.showMessageDialog(null, "El número de la Cotización debe ser de tipo numérico!", "Error", JOptionPane.ERROR_MESSAGE);
          }
        }else if(rb_css.isSelected()==true)
        {
           
            
            if(txt_consecutivo.getText().matches("[0-9]*"))
          {
              int consecutivo= Integer.parseInt(txt_consecutivo.getText());
              jasper2.ejecutarReporte(consecutivo);
              dispose();
          
          }else
          {
              JOptionPane.showMessageDialog(null, "El número de la Cotización debe ser de tipo numérico!", "Error", JOptionPane.ERROR_MESSAGE);
          }
        }   else if(rb_mvvcc.isSelected()==true)
            {
            
            
                if(txt_consecutivo.getText().matches("[0-9]*"))
                {
                    int consecutivo=Integer.parseInt(txt_consecutivo.getText());
                    jasper3.ejecutarReporte(consecutivo);
                    dispose();
                }
            
            }    
       }
    }//GEN-LAST:event_txt_consecutivoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_generar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb_css;
    private javax.swing.JRadioButton rb_mvvcc;
    private javax.swing.JRadioButton rb_utdvvcc;
    private javax.swing.JTextField txt_consecutivo;
    // End of variables declaration//GEN-END:variables
}
