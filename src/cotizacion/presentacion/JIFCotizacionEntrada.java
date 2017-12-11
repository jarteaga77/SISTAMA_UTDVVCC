
package cotizacion.presentacion;


import ordenesCompra.presentacion.MDIPrincipal;

/**
 *
 * @author jarteaga
 */
public class JIFCotizacionEntrada extends javax.swing.JInternalFrame {

    private JIFCotizacionCss jifCotizacioncss;
    private JIFCotizacionMvvcc  jifCotizacionmvccc;
    private JIFCotizacionUtdvvcc jifCotizacionUtdvvcc;
    
    public static MDIPrincipal principal;
    
    
    
    
    public JIFCotizacionEntrada() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_cotizacion_entrada = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rb_utd = new javax.swing.JRadioButton();
        rb_css = new javax.swing.JRadioButton();
        rb_mvcc = new javax.swing.JRadioButton();
        b_entrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cotizaciones");
        setPreferredSize(new java.awt.Dimension(362, 120));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 100));

        grupo_cotizacion_entrada.add(rb_utd);
        rb_utd.setSelected(true);
        rb_utd.setText("UTDVVCC ");
        jPanel1.add(rb_utd);

        grupo_cotizacion_entrada.add(rb_css);
        rb_css.setText(" Carlos Solarte");
        jPanel1.add(rb_css);

        grupo_cotizacion_entrada.add(rb_mvcc);
        rb_mvcc.setText("MVVCC");
        jPanel1.add(rb_mvcc);

        b_entrar.setText("Entrar");
        b_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(b_entrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_entrarActionPerformed
       try
       {
           
        if(rb_css.isSelected()==true )
        {
         
           jifCotizacioncss=new JIFCotizacionCss();
           MDIPrincipal.desktopPane.add(jifCotizacioncss);
           jifCotizacioncss.setLocation(40, 0);
           jifCotizacioncss.show();
           
           dispose();
        }
        
       else if(rb_utd.isSelected()== true)
        {
           jifCotizacionUtdvvcc=new JIFCotizacionUtdvvcc();
           MDIPrincipal.desktopPane.add(jifCotizacionUtdvvcc);
           jifCotizacionUtdvvcc.setLocation(120, 0);
           jifCotizacionUtdvvcc.show();
           
           dispose();
        }
        else
           if(rb_mvcc.isSelected()==true)
           {
               jifCotizacionmvccc=new JIFCotizacionMvvcc();
               MDIPrincipal.desktopPane.add(jifCotizacionmvccc);
               jifCotizacionmvccc.setLocation(120, 0);
               jifCotizacionmvccc.show();
           
           dispose();
               
           }
                  
     
        }catch(Exception e)
        {
            
           
             
        }   
        
        
    }//GEN-LAST:event_b_entrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_entrar;
    private javax.swing.ButtonGroup grupo_cotizacion_entrada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb_css;
    private javax.swing.JRadioButton rb_mvcc;
    private javax.swing.JRadioButton rb_utd;
    // End of variables declaration//GEN-END:variables
}
