package gui;

import gui.ayarlar.ButonAyarları;
import java.awt.Color;

public class TemsilciEkranı extends javax.swing.JFrame {

    public TemsilciEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        TemsilciPanel.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TemsilciPanel = new javax.swing.JPanel();
        Hoşgeldiniz = new javax.swing.JLabel();
        AdSoyad = new javax.swing.JLabel();
        MüşteriEkleButton = new javax.swing.JButton();
        MüşteriSilButton = new javax.swing.JButton();
        MüşteriDüzenleButton = new javax.swing.JButton();
        MüşteriDurumButton = new javax.swing.JButton();
        MüşteriTalepButton = new javax.swing.JButton();
        MüşteriİşlemButton = new javax.swing.JButton();
        GeriButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 403));

        TemsilciPanel.setBackground(new java.awt.Color(153, 255, 204));

        Hoşgeldiniz.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Hoşgeldiniz.setForeground(new java.awt.Color(0, 102, 102));
        Hoşgeldiniz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoşgeldiniz.setText("Hosgeldiniz");
        Hoşgeldiniz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AdSoyad.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AdSoyad.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyad.setText("[Temsilci Adı Soyadı]");
        AdSoyad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MüşteriEkleButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MüşteriEkleButton.setForeground(new java.awt.Color(0, 204, 204));
        MüşteriEkleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/MüşteriEkle48px.png"))); // NOI18N
        MüşteriEkleButton.setText("Müşteri Ekle");
        MüşteriEkleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüşteriEkleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüşteriEkleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüşteriEkleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüşteriEkleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüşteriEkleButtonMouseExited(evt);
            }
        });
        MüşteriEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüşteriEkleButtonActionPerformed(evt);
            }
        });

        MüşteriSilButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MüşteriSilButton.setForeground(new java.awt.Color(0, 204, 204));
        MüşteriSilButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/MüşteriSil48px.png"))); // NOI18N
        MüşteriSilButton.setText("Müşteri Sil");
        MüşteriSilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüşteriSilButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüşteriSilButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüşteriSilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüşteriSilButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüşteriSilButtonMouseExited(evt);
            }
        });
        MüşteriSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüşteriSilButtonActionPerformed(evt);
            }
        });

        MüşteriDüzenleButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MüşteriDüzenleButton.setForeground(new java.awt.Color(0, 204, 204));
        MüşteriDüzenleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/MüşteriDüzenle48px.png"))); // NOI18N
        MüşteriDüzenleButton.setText("Müşteri Düzenle");
        MüşteriDüzenleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüşteriDüzenleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüşteriDüzenleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüşteriDüzenleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüşteriDüzenleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüşteriDüzenleButtonMouseExited(evt);
            }
        });
        MüşteriDüzenleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüşteriDüzenleButtonActionPerformed(evt);
            }
        });

        MüşteriDurumButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MüşteriDurumButton.setForeground(new java.awt.Color(0, 204, 204));
        MüşteriDurumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/MüşteriveBankaDurum48px.png"))); // NOI18N
        MüşteriDurumButton.setText("Müşteri Durumunu Görüntüle");
        MüşteriDurumButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüşteriDurumButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüşteriDurumButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüşteriDurumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüşteriDurumButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüşteriDurumButtonMouseExited(evt);
            }
        });
        MüşteriDurumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüşteriDurumButtonActionPerformed(evt);
            }
        });

        MüşteriTalepButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MüşteriTalepButton.setForeground(new java.awt.Color(0, 204, 204));
        MüşteriTalepButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/MüşteriTalep48px.png"))); // NOI18N
        MüşteriTalepButton.setText("Müşteri Taleplerini Görüntüle");
        MüşteriTalepButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüşteriTalepButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüşteriTalepButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüşteriTalepButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüşteriTalepButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüşteriTalepButtonMouseExited(evt);
            }
        });
        MüşteriTalepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüşteriTalepButtonActionPerformed(evt);
            }
        });

        MüşteriİşlemButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MüşteriİşlemButton.setForeground(new java.awt.Color(0, 204, 204));
        MüşteriİşlemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Müşteriİşlem48px.png"))); // NOI18N
        MüşteriİşlemButton.setText("Müşteri İşlemlerini Görüntüle");
        MüşteriİşlemButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MüşteriİşlemButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MüşteriİşlemButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MüşteriİşlemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MüşteriİşlemButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MüşteriİşlemButtonMouseExited(evt);
            }
        });
        MüşteriİşlemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MüşteriİşlemButtonActionPerformed(evt);
            }
        });

        GeriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Geri48px_2.png"))); // NOI18N
        GeriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GeriButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TemsilciPanelLayout = new javax.swing.GroupLayout(TemsilciPanel);
        TemsilciPanel.setLayout(TemsilciPanelLayout);
        TemsilciPanelLayout.setHorizontalGroup(
            TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemsilciPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TemsilciPanelLayout.createSequentialGroup()
                        .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MüşteriEkleButton)
                            .addComponent(MüşteriSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MüşteriDüzenleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MüşteriDurumButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MüşteriTalepButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MüşteriİşlemButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(TemsilciPanelLayout.createSequentialGroup()
                        .addComponent(GeriButton)
                        .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TemsilciPanelLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TemsilciPanelLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(Hoşgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        TemsilciPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MüşteriDurumButton, MüşteriDüzenleButton, MüşteriEkleButton, MüşteriSilButton, MüşteriTalepButton, MüşteriİşlemButton});

        TemsilciPanelLayout.setVerticalGroup(
            TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemsilciPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TemsilciPanelLayout.createSequentialGroup()
                        .addComponent(Hoşgeldiniz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdSoyad))
                    .addComponent(GeriButton))
                .addGap(18, 18, 18)
                .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MüşteriEkleButton)
                    .addComponent(MüşteriDurumButton))
                .addGap(18, 18, 18)
                .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MüşteriSilButton)
                    .addComponent(MüşteriTalepButton))
                .addGap(18, 18, 18)
                .addGroup(TemsilciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MüşteriDüzenleButton)
                    .addComponent(MüşteriİşlemButton))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        TemsilciPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MüşteriDurumButton, MüşteriDüzenleButton, MüşteriEkleButton, MüşteriSilButton, MüşteriTalepButton, MüşteriİşlemButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TemsilciPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TemsilciPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MüşteriEkleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriEkleButtonMouseEntered
        ButonAyarları.setcolor(MüşteriEkleButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriEkleButtonMouseEntered

    private void MüşteriEkleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriEkleButtonMouseExited
        ButonAyarları.resetcolor(MüşteriEkleButton);
    }//GEN-LAST:event_MüşteriEkleButtonMouseExited

    private void MüşteriSilButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriSilButtonMouseEntered
        ButonAyarları.setcolor(MüşteriSilButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriSilButtonMouseEntered

    private void MüşteriSilButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriSilButtonMouseExited
        ButonAyarları.resetcolor(MüşteriSilButton);
    }//GEN-LAST:event_MüşteriSilButtonMouseExited

    private void MüşteriDüzenleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriDüzenleButtonMouseEntered
        ButonAyarları.setcolor(MüşteriDüzenleButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriDüzenleButtonMouseEntered

    private void MüşteriDüzenleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriDüzenleButtonMouseExited
        ButonAyarları.resetcolor(MüşteriDüzenleButton);
    }//GEN-LAST:event_MüşteriDüzenleButtonMouseExited

    private void MüşteriDurumButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriDurumButtonMouseEntered
        ButonAyarları.setcolor(MüşteriDurumButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriDurumButtonMouseEntered

    private void MüşteriDurumButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriDurumButtonMouseExited
        ButonAyarları.resetcolor(MüşteriDurumButton);
    }//GEN-LAST:event_MüşteriDurumButtonMouseExited

    private void MüşteriTalepButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriTalepButtonMouseEntered
        ButonAyarları.setcolor(MüşteriTalepButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriTalepButtonMouseEntered

    private void MüşteriTalepButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriTalepButtonMouseExited
        ButonAyarları.resetcolor(MüşteriTalepButton);
    }//GEN-LAST:event_MüşteriTalepButtonMouseExited

    private void MüşteriİşlemButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriİşlemButtonMouseEntered
        ButonAyarları.setcolor(MüşteriİşlemButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriİşlemButtonMouseEntered

    private void MüşteriİşlemButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriİşlemButtonMouseExited
        ButonAyarları.resetcolor(MüşteriİşlemButton);
    }//GEN-LAST:event_MüşteriİşlemButtonMouseExited

    private void MüşteriEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriEkleButtonActionPerformed
         this.setVisible(false);
         new MüşteriEkleTemsilciEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriEkleButtonActionPerformed

    private void MüşteriSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriSilButtonActionPerformed
         this.setVisible(false);
         new MüşteriSilEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriSilButtonActionPerformed

    private void MüşteriDüzenleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriDüzenleButtonActionPerformed
         this.setVisible(false);
         new MüşteriDüzenleEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriDüzenleButtonActionPerformed

    private void MüşteriDurumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriDurumButtonActionPerformed
         this.setVisible(false);
         new MüşteriDurumEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriDurumButtonActionPerformed

    private void MüşteriTalepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriTalepButtonActionPerformed
         this.setVisible(false);
         new MüşteriTalepEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriTalepButtonActionPerformed

    private void MüşteriİşlemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriİşlemButtonActionPerformed
         this.setVisible(false);
         new MüşteriİşlemEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriİşlemButtonActionPerformed

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
         this.setVisible(false);
         new TemsilciGirişEkranı().setVisible(true);
    }//GEN-LAST:event_GeriButtonMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemsilciEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyad;
    private javax.swing.JLabel GeriButton;
    private javax.swing.JLabel Hoşgeldiniz;
    private javax.swing.JButton MüşteriDurumButton;
    private javax.swing.JButton MüşteriDüzenleButton;
    private javax.swing.JButton MüşteriEkleButton;
    private javax.swing.JButton MüşteriSilButton;
    private javax.swing.JButton MüşteriTalepButton;
    private javax.swing.JButton MüşteriİşlemButton;
    private javax.swing.JPanel TemsilciPanel;
    // End of variables declaration//GEN-END:variables
}
