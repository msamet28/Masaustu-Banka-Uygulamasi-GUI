
package gui;


public class BankaDurumEkranı extends javax.swing.JFrame {

   
    public BankaDurumEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        BankaDurumPanel.setFocusable(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BankaDurumPanel = new javax.swing.JPanel();
        GeriButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BankaDurumPanel.setBackground(new java.awt.Color(153, 255, 204));

        GeriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Geri48px_2.png"))); // NOI18N
        GeriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GeriButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BankaDurumPanelLayout = new javax.swing.GroupLayout(BankaDurumPanel);
        BankaDurumPanel.setLayout(BankaDurumPanelLayout);
        BankaDurumPanelLayout.setHorizontalGroup(
            BankaDurumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankaDurumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriButton)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        BankaDurumPanelLayout.setVerticalGroup(
            BankaDurumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankaDurumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriButton)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BankaDurumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BankaDurumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
        this.setVisible(false);
        new MüdürEkranı().setVisible(true);
    }//GEN-LAST:event_GeriButtonMousePressed

   
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankaDurumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankaDurumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankaDurumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankaDurumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankaDurumEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BankaDurumPanel;
    private javax.swing.JLabel GeriButton;
    // End of variables declaration//GEN-END:variables
}
