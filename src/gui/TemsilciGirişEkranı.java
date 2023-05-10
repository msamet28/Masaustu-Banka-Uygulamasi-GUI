package gui;

import gui.ayarlar.ButonAyarları;
import gui.ayarlar.TextAyarları;
import java.awt.Color;

public class TemsilciGirişEkranı extends javax.swing.JFrame {

    public TemsilciGirişEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        TemsilciGirişPanel.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TemsilciGirişPanel = new javax.swing.JPanel();
        TemsilciGirişBaşlık = new javax.swing.JLabel();
        KullanıcıAdıText = new javax.swing.JTextField();
        ŞifreText = new javax.swing.JPasswordField();
        GirişButton = new javax.swing.JButton();
        GeriButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 380));

        TemsilciGirişPanel.setBackground(new java.awt.Color(155, 255, 204));

        TemsilciGirişBaşlık.setFont(new java.awt.Font("Tempus Sans ITC", 1, 25)); // NOI18N
        TemsilciGirişBaşlık.setForeground(new java.awt.Color(0, 102, 102));
        TemsilciGirişBaşlık.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TemsilciGirişBaşlık.setText("KOU BANK Temsilci Giris Ekranı");

        KullanıcıAdıText.setForeground(new java.awt.Color(153, 153, 153));
        KullanıcıAdıText.setText("TC No / Temsilci No");
        KullanıcıAdıText.setToolTipText("");
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

        javax.swing.GroupLayout TemsilciGirişPanelLayout = new javax.swing.GroupLayout(TemsilciGirişPanel);
        TemsilciGirişPanel.setLayout(TemsilciGirişPanelLayout);
        TemsilciGirişPanelLayout.setHorizontalGroup(
            TemsilciGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemsilciGirişPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriButton)
                .addGap(65, 65, 65)
                .addGroup(TemsilciGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TemsilciGirişBaşlık, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KullanıcıAdıText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ŞifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GirişButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        TemsilciGirişPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {KullanıcıAdıText, ŞifreText});

        TemsilciGirişPanelLayout.setVerticalGroup(
            TemsilciGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemsilciGirişPanelLayout.createSequentialGroup()
                .addGroup(TemsilciGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TemsilciGirişPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriButton))
                    .addGroup(TemsilciGirişPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(TemsilciGirişBaşlık, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KullanıcıAdıText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ŞifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(GirişButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TemsilciGirişPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TemsilciGirişPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        new TemsilciEkranı().setVisible(true);
    }//GEN-LAST:event_GirişButtonActionPerformed

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
        this.setVisible(false);
        new GirişEkranı().setVisible(true);
    }//GEN-LAST:event_GeriButtonMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemsilciGirişEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GeriButton;
    private javax.swing.JButton GirişButton;
    private javax.swing.JTextField KullanıcıAdıText;
    private javax.swing.JLabel TemsilciGirişBaşlık;
    private javax.swing.JPanel TemsilciGirişPanel;
    private javax.swing.JPasswordField ŞifreText;
    // End of variables declaration//GEN-END:variables
}
