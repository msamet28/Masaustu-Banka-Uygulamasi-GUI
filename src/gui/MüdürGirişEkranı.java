package gui;

import gui.ayarlar.ButonAyarları;
import gui.ayarlar.TextAyarları;
import java.awt.Color;

public class MüdürGirişEkranı extends javax.swing.JFrame {

    public MüdürGirişEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        MüdürGirişPanel.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MüdürGirişPanel = new javax.swing.JPanel();
        MüdürGirişBaşlık = new javax.swing.JLabel();
        KullanıcıAdıText = new javax.swing.JTextField();
        ŞifreText = new javax.swing.JPasswordField();
        GirişButton = new javax.swing.JButton();
        GeriButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 380));

        MüdürGirişPanel.setBackground(new java.awt.Color(155, 255, 204));

        MüdürGirişBaşlık.setFont(new java.awt.Font("Tempus Sans ITC", 1, 25)); // NOI18N
        MüdürGirişBaşlık.setForeground(new java.awt.Color(0, 102, 102));
        MüdürGirişBaşlık.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MüdürGirişBaşlık.setText(" KOU BANK Müdür Giris Ekranı");

        KullanıcıAdıText.setForeground(new java.awt.Color(153, 153, 153));
        KullanıcıAdıText.setText("TC No / Temsilci No");
        KullanıcıAdıText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KullanıcıAdıTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                KullanıcıAdıTextFocusLost(evt);
            }
        });

        ŞifreText.setForeground(new java.awt.Color(153, 153, 153));
        ŞifreText.setText("***************");
        ŞifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ŞifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ŞifreTextFocusLost(evt);
            }
        });

        GirişButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GirişButton.setForeground(new java.awt.Color(0, 204, 204));
        GirişButton.setText("Giriş");
        GirişButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GirişButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GirişButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GirişButtonMouseExited(evt);
            }
        });
        GirişButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirişButtonActionPerformed(evt);
            }
        });

        GeriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Geri48px_2.png"))); // NOI18N
        GeriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GeriButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MüdürGirişPanelLayout = new javax.swing.GroupLayout(MüdürGirişPanel);
        MüdürGirişPanel.setLayout(MüdürGirişPanelLayout);
        MüdürGirişPanelLayout.setHorizontalGroup(
            MüdürGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MüdürGirişPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(MüdürGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(GirişButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ŞifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KullanıcıAdıText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MüdürGirişBaşlık, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        MüdürGirişPanelLayout.setVerticalGroup(
            MüdürGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MüdürGirişPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MüdürGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MüdürGirişPanelLayout.createSequentialGroup()
                        .addComponent(GeriButton)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MüdürGirişPanelLayout.createSequentialGroup()
                        .addComponent(MüdürGirişBaşlık, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(KullanıcıAdıText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ŞifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(GirişButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MüdürGirişPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MüdürGirişPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GirişButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GirişButtonMouseEntered
        ButonAyarları.setcolor(GirişButton, Color.DARK_GRAY);
    }//GEN-LAST:event_GirişButtonMouseEntered

    private void GirişButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GirişButtonMouseExited
        ButonAyarları.resetcolor(GirişButton);
    }//GEN-LAST:event_GirişButtonMouseExited

    private void KullanıcıAdıTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KullanıcıAdıTextFocusGained
        TextAyarları.FocusGained(KullanıcıAdıText, "TC No / Temsilci No");
    }//GEN-LAST:event_KullanıcıAdıTextFocusGained

    private void KullanıcıAdıTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KullanıcıAdıTextFocusLost
        TextAyarları.FocusLost(KullanıcıAdıText, "TC No / Temsilci No");
    }//GEN-LAST:event_KullanıcıAdıTextFocusLost

    private void ŞifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ŞifreTextFocusGained
        TextAyarları.FocusGained(ŞifreText, "***************");
    }//GEN-LAST:event_ŞifreTextFocusGained

    private void ŞifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ŞifreTextFocusLost
        TextAyarları.FocusLost(ŞifreText, "***************");
    }//GEN-LAST:event_ŞifreTextFocusLost

    private void GirişButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirişButtonActionPerformed
        this.setVisible(false);
        new MüdürEkranı().setVisible(true);
    }//GEN-LAST:event_GirişButtonActionPerformed

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
        this.setVisible(false);
        new GirişEkranı().setVisible(true);
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
            java.util.logging.Logger.getLogger(MüdürGirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MüdürGirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MüdürGirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MüdürGirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MüdürGirişEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GeriButton;
    private javax.swing.JButton GirişButton;
    private javax.swing.JTextField KullanıcıAdıText;
    private javax.swing.JLabel MüdürGirişBaşlık;
    private javax.swing.JPanel MüdürGirişPanel;
    private javax.swing.JPasswordField ŞifreText;
    // End of variables declaration//GEN-END:variables
}
