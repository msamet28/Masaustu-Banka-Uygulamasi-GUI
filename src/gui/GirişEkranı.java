package gui;

import database.dbConnection;
import gui.ayarlar.ButonAyarları;
import java.awt.Color;

public class GirişEkranı extends javax.swing.JFrame {

    public GirişEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        GirişPanel.setFocusable(true);
        new dbConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GirişPanel = new javax.swing.JPanel();
        GirişBaşlık = new javax.swing.JLabel();
        TemsilciButton = new javax.swing.JButton();
        MüdürButton = new javax.swing.JButton();
        MüşteriButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KOU BANK ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(550, 400));

        GirişPanel.setBackground(new java.awt.Color(153, 255, 204));

        GirişBaşlık.setFont(new java.awt.Font("Tempus Sans ITC", 1, 25)); // NOI18N
        GirişBaşlık.setForeground(new java.awt.Color(0, 102, 102));
        GirişBaşlık.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GirişBaşlık.setText("KOU BANK");

        TemsilciButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TemsilciButton.setForeground(new java.awt.Color(0, 204, 204));
        TemsilciButton.setText("Temsilci Girişi");
        TemsilciButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TemsilciButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TemsilciButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TemsilciButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TemsilciButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TemsilciButtonMouseExited(evt);
            }
        });
        TemsilciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemsilciButtonActionPerformed(evt);
            }
        });

        MüdürButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MüdürButton.setForeground(new java.awt.Color(0, 204, 204));
        MüdürButton.setText("Müdür Girişi");
        MüdürButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüdürButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüdürButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüdürButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüdürButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüdürButtonMouseExited(evt);
            }
        });
        MüdürButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüdürButtonActionPerformed(evt);
            }
        });

        MüşteriButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MüşteriButton.setForeground(new java.awt.Color(0, 204, 204));
        MüşteriButton.setText("Müşteri Girişi");
        MüşteriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüşteriButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüşteriButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüşteriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüşteriButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüşteriButtonMouseExited(evt);
            }
        });
        MüşteriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüşteriButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GirişPanelLayout = new javax.swing.GroupLayout(GirişPanel);
        GirişPanel.setLayout(GirişPanelLayout);
        GirişPanelLayout.setHorizontalGroup(
            GirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirişPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(MüşteriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TemsilciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MüdürButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GirişPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GirişBaşlık, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        GirişPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MüdürButton, MüşteriButton, TemsilciButton});

        GirişPanelLayout.setVerticalGroup(
            GirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirişPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GirişBaşlık)
                .addGap(36, 36, 36)
                .addGroup(GirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TemsilciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MüşteriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MüdürButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        GirişPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MüdürButton, MüşteriButton, TemsilciButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirişPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirişPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MüşteriButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriButtonMouseEntered
        ButonAyarları.setcolor(MüşteriButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriButtonMouseEntered

    private void MüşteriButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriButtonMouseExited
        ButonAyarları.resetcolor(MüşteriButton);
    }//GEN-LAST:event_MüşteriButtonMouseExited

    private void TemsilciButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemsilciButtonMouseEntered
        ButonAyarları.setcolor(TemsilciButton, Color.DARK_GRAY);
    }//GEN-LAST:event_TemsilciButtonMouseEntered

    private void TemsilciButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemsilciButtonMouseExited
        ButonAyarları.resetcolor(TemsilciButton);
    }//GEN-LAST:event_TemsilciButtonMouseExited

    private void MüdürButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüdürButtonMouseEntered
        ButonAyarları.setcolor(MüdürButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüdürButtonMouseEntered

    private void MüdürButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüdürButtonMouseExited
        ButonAyarları.resetcolor(MüdürButton);
    }//GEN-LAST:event_MüdürButtonMouseExited

    private void MüşteriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriButtonActionPerformed
        this.setVisible(false);
        new MüşteriGirişEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriButtonActionPerformed

    private void TemsilciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemsilciButtonActionPerformed
        this.setVisible(false);
        new TemsilciGirişEkranı().setVisible(true);
    }//GEN-LAST:event_TemsilciButtonActionPerformed

    private void MüdürButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüdürButtonActionPerformed
        this.setVisible(false);
        new MüdürGirişEkranı().setVisible(true);
    }//GEN-LAST:event_MüdürButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirişEkranı().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GirişBaşlık;
    private javax.swing.JPanel GirişPanel;
    private javax.swing.JButton MüdürButton;
    private javax.swing.JButton MüşteriButton;
    private javax.swing.JButton TemsilciButton;
    // End of variables declaration//GEN-END:variables
}
