
package ordenesCompra.presentacion;


import ordenesCompraCIVSAS.presentacion.JIFOrdenesCompraCIVSAS;
import ordenesCompraCLG.presentacion.JIFOrdenesCompraCLG;
import ordenesCompraCSS.presentacion.JIFOrdenesCompraCSS;
import ordenesCompraMVVCC.presentacion.JIFOrdenesCompraMVVCC;

/**
 *
 * @author jarteaga
 */
public class JIFInicioOrdenCompra extends javax.swing.JInternalFrame {

    
    private JIFOrdenesCompraCSS jifOrdenCSS;
    private JIFOrdenesCompraMVVCC jifOrdenMVVCC;
    private JIFOrdenesCompra jifOrdenUTD;
    private JIFOrdenesCompraCLG jifOrdenCLG;
    private JIFOrdenesCompraCIVSAS jifOrdenCIVSAS;
     
    public static MDIPrincipal principal;
    
    public JIFInicioOrdenCompra() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rb_utdvvcc = new javax.swing.JRadioButton();
        rb_css = new javax.swing.JRadioButton();
        rb_mvvcc = new javax.swing.JRadioButton();
        b_entrar = new javax.swing.JButton();
        rb_clg = new javax.swing.JRadioButton();
        rb_civsas = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Orden de Compra");
        setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(rb_utdvvcc);
        rb_utdvvcc.setText("UTDVVCC");

        buttonGroup1.add(rb_css);
        rb_css.setText("CSS Constructores");

        buttonGroup1.add(rb_mvvcc);
        rb_mvvcc.setText("MVVCC");

        b_entrar.setText("Entrar");
        b_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_entrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_clg);
        rb_clg.setSelected(true);
        rb_clg.setText("CLG-B");

        buttonGroup1.add(rb_civsas);
        rb_civsas.setText("CIV S.A.S");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rb_clg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_css)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_utdvvcc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_mvvcc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_civsas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(b_entrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_utdvvcc)
                    .addComponent(rb_css)
                    .addComponent(rb_mvvcc)
                    .addComponent(rb_clg)
                    .addComponent(rb_civsas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_entrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_entrarActionPerformed
       try
       {
           
        if(rb_css.isSelected()==true )
        {
         
           jifOrdenCSS=new JIFOrdenesCompraCSS();
           MDIPrincipal.desktopPane.add(jifOrdenCSS);
           jifOrdenCSS.setLocation(250, 0);
           jifOrdenCSS.show();
           
           dispose();
        }
        
       else if(rb_utdvvcc.isSelected()== true)
        {
           jifOrdenUTD=new JIFOrdenesCompra();
           MDIPrincipal.desktopPane.add(jifOrdenUTD);
           jifOrdenUTD.setLocation(250, 0);
           jifOrdenUTD.show();
           
           dispose();
        }
        else
           if(rb_mvvcc.isSelected()==true)
           {
               jifOrdenMVVCC=new JIFOrdenesCompraMVVCC();
               MDIPrincipal.desktopPane.add(jifOrdenMVVCC);
               jifOrdenMVVCC.setLocation(250, 0);
               jifOrdenMVVCC.show();
           
           dispose();
               
           }
        else
               if(rb_clg.isSelected()==true)
               {
                   jifOrdenCLG=new JIFOrdenesCompraCLG();
                   MDIPrincipal.desktopPane.add(jifOrdenCLG);
                   jifOrdenCLG.setLocation(250,0);
                   jifOrdenCLG.show();
                   
                   dispose();
               }
               else if(rb_civsas.isSelected()==true)
               {
                   jifOrdenCIVSAS=new JIFOrdenesCompraCIVSAS();
                   MDIPrincipal.desktopPane.add(jifOrdenCIVSAS);
                   jifOrdenCIVSAS.setLocation(250,0);
                   jifOrdenCIVSAS.show();
               }
     
        }catch(Exception e)
        {
            
           System.out.println(e);
             
        }  
    }//GEN-LAST:event_b_entrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_entrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb_civsas;
    private javax.swing.JRadioButton rb_clg;
    private javax.swing.JRadioButton rb_css;
    private javax.swing.JRadioButton rb_mvvcc;
    private javax.swing.JRadioButton rb_utdvvcc;
    // End of variables declaration//GEN-END:variables
}
