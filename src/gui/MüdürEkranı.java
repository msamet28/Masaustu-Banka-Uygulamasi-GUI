package gui;

import gui.ayarlar.ButonAyarları;
import java.awt.Color;

public class MüdürEkranı extends javax.swing.JFrame {

    public MüdürEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        MüdürPanel.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MüdürPanel = new javax.swing.JPanel();
        Hoşgeldiniz = new javax.swing.JLabel();
        AdSoyad = new javax.swing.JLabel();
        BankaDurumButton = new javax.swing.JButton();
        KurButton = new javax.swing.JButton();
        MaaşButton = new javax.swing.JButton();
        KrediFaizButton = new javax.swing.JButton();
        GecikmeFaizButton = new javax.swing.JButton();
        MüşteriEkleButton = new javax.swing.JButton();
        GeriButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MüdürPanel.setBackground(new java.awt.Color(153, 255, 204));

        Hoşgeldiniz.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Hoşgeldiniz.setForeground(new java.awt.Color(0, 102, 102));
        Hoşgeldiniz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoşgeldiniz.setText("Hosgeldiniz");
        Hoşgeldiniz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AdSoyad.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AdSoyad.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyad.setText("[Müdür Adı Soyadı]");
        AdSoyad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BankaDurumButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BankaDurumButton.setForeground(new java.awt.Color(0, 204, 204));
        BankaDurumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/MüşteriveBankaDurum48px.png"))); // NOI18N
        BankaDurumButton.setText("Banka Durumunu Görüntüle");
        BankaDurumButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BankaDurumButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BankaDurumButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BankaDurumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BankaDurumButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BankaDurumButtonMouseExited(evt);
            }
        });
        BankaDurumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankaDurumButtonActionPerformed(evt);
            }
        });

        KurButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KurButton.setForeground(new java.awt.Color(0, 204, 204));
        KurButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Kur48px.png"))); // NOI18N
        KurButton.setText("Kur Güncelle");
        KurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KurButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        KurButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        KurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KurButtonMouseExited(evt);
            }
        });
        KurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurButtonActionPerformed(evt);
            }
        });

        MaaşButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MaaşButton.setForeground(new java.awt.Color(0, 204, 204));
        MaaşButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Maaş48px.png"))); // NOI18N
        MaaşButton.setText("Maaş Güncelle");
        MaaşButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaaşButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MaaşButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MaaşButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaaşButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaaşButtonMouseExited(evt);
            }
        });
        MaaşButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaaşButtonActionPerformed(evt);
            }
        });

        KrediFaizButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KrediFaizButton.setForeground(new java.awt.Color(0, 204, 204));
        KrediFaizButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Faiz48px.png"))); // NOI18N
        KrediFaizButton.setText("Kredi Faiz Oranı Belirle");
        KrediFaizButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KrediFaizButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        KrediFaizButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        KrediFaizButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KrediFaizButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KrediFaizButtonMouseExited(evt);
            }
        });
        KrediFaizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrediFaizButtonActionPerformed(evt);
            }
        });

        GecikmeFaizButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GecikmeFaizButton.setForeground(new java.awt.Color(0, 204, 204));
        GecikmeFaizButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Faiz48px.png"))); // NOI18N
        GecikmeFaizButton.setText("Gecikme Faiz Oranı Belirle");
        GecikmeFaizButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GecikmeFaizButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GecikmeFaizButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GecikmeFaizButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GecikmeFaizButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GecikmeFaizButtonMouseExited(evt);
            }
        });
        GecikmeFaizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GecikmeFaizButtonActionPerformed(evt);
            }
        });

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

        GeriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Geri48px_2.png"))); // NOI18N
        GeriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GeriButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MüdürPanelLayout = new javax.swing.GroupLayout(MüdürPanel);
        MüdürPanel.setLayout(MüdürPanelLayout);
        MüdürPanelLayout.setHorizontalGroup(
            MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MüdürPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MüdürPanelLayout.createSequentialGroup()
                        .addComponent(GeriButton)
                        .addGap(145, 145, 145)
                        .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hoşgeldiniz))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MüdürPanelLayout.createSequentialGroup()
                        .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(MüdürPanelLayout.createSequentialGroup()
                                .addComponent(BankaDurumButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KrediFaizButton))
                            .addGroup(MüdürPanelLayout.createSequentialGroup()
                                .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(KurButton)
                                    .addComponent(MaaşButton, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(175, 175, 175)
                                .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GecikmeFaizButton)
                                    .addComponent(MüşteriEkleButton))))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );

        MüdürPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BankaDurumButton, GecikmeFaizButton, KrediFaizButton, KurButton, MaaşButton, MüşteriEkleButton});

        MüdürPanelLayout.setVerticalGroup(
            MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MüdürPanelLayout.createSequentialGroup()
                .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MüdürPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriButton))
                    .addGroup(MüdürPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Hoşgeldiniz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdSoyad)))
                .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MüdürPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(KrediFaizButton))
                    .addGroup(MüdürPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BankaDurumButton)))
                .addGap(23, 23, 23)
                .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MüşteriEkleButton)
                    .addComponent(KurButton))
                .addGap(35, 35, 35)
                .addGroup(MüdürPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MaaşButton)
                    .addComponent(GecikmeFaizButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        MüdürPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BankaDurumButton, GecikmeFaizButton, KrediFaizButton, KurButton, MaaşButton, MüşteriEkleButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MüdürPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MüdürPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BankaDurumButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankaDurumButtonMouseEntered
        ButonAyarları.setcolor(BankaDurumButton, Color.DARK_GRAY);
    }//GEN-LAST:event_BankaDurumButtonMouseEntered

    private void BankaDurumButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankaDurumButtonMouseExited
        ButonAyarları.resetcolor(BankaDurumButton);
    }//GEN-LAST:event_BankaDurumButtonMouseExited

    private void KurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KurButtonMouseEntered
        ButonAyarları.setcolor(KurButton, Color.DARK_GRAY);
    }//GEN-LAST:event_KurButtonMouseEntered

    private void KurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KurButtonMouseExited
        ButonAyarları.resetcolor(KurButton);
    }//GEN-LAST:event_KurButtonMouseExited

    private void MaaşButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaaşButtonMouseEntered
        ButonAyarları.setcolor(MaaşButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MaaşButtonMouseEntered

    private void MaaşButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaaşButtonMouseExited
        ButonAyarları.resetcolor(MaaşButton);
    }//GEN-LAST:event_MaaşButtonMouseExited

    private void KrediFaizButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediFaizButtonMouseEntered
        ButonAyarları.setcolor(KrediFaizButton, Color.DARK_GRAY);
    }//GEN-LAST:event_KrediFaizButtonMouseEntered

    private void KrediFaizButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediFaizButtonMouseExited
        ButonAyarları.resetcolor(KrediFaizButton);
    }//GEN-LAST:event_KrediFaizButtonMouseExited

    private void MüşteriEkleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriEkleButtonMouseEntered
        ButonAyarları.setcolor(MüşteriEkleButton, Color.DARK_GRAY);
    }//GEN-LAST:event_MüşteriEkleButtonMouseEntered

    private void MüşteriEkleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MüşteriEkleButtonMouseExited
        ButonAyarları.resetcolor(MüşteriEkleButton);
    }//GEN-LAST:event_MüşteriEkleButtonMouseExited

    private void GecikmeFaizButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GecikmeFaizButtonMouseEntered
        ButonAyarları.setcolor(GecikmeFaizButton, Color.DARK_GRAY);
    }//GEN-LAST:event_GecikmeFaizButtonMouseEntered

    private void GecikmeFaizButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GecikmeFaizButtonMouseExited
        ButonAyarları.resetcolor(GecikmeFaizButton);
    }//GEN-LAST:event_GecikmeFaizButtonMouseExited

    private void BankaDurumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankaDurumButtonActionPerformed
        this.setVisible(false);
        new BankaDurumEkranı().setVisible(true);
    }//GEN-LAST:event_BankaDurumButtonActionPerformed

    private void KurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurButtonActionPerformed
        this.setVisible(false);
        new KurEkranı().setVisible(true);
    }//GEN-LAST:event_KurButtonActionPerformed

    private void MaaşButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaaşButtonActionPerformed
        this.setVisible(false);
        new MaaşEkranı().setVisible(true);
    }//GEN-LAST:event_MaaşButtonActionPerformed

    private void KrediFaizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrediFaizButtonActionPerformed
        this.setVisible(false);
        new KrediFaizEkranı().setVisible(true);
    }//GEN-LAST:event_KrediFaizButtonActionPerformed

    private void MüşteriEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MüşteriEkleButtonActionPerformed
        this.setVisible(false);
        new MüşteriEkleMüdürEkranı().setVisible(true);
    }//GEN-LAST:event_MüşteriEkleButtonActionPerformed

    private void GecikmeFaizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GecikmeFaizButtonActionPerformed
        this.setVisible(false);
        new GecikmeFaizEkranı().setVisible(true);
    }//GEN-LAST:event_GecikmeFaizButtonActionPerformed

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
        this.setVisible(false);
        new MüdürGirişEkranı().setVisible(true);
    }//GEN-LAST:event_GeriButtonMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MüdürEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyad;
    private javax.swing.JButton BankaDurumButton;
    private javax.swing.JButton GecikmeFaizButton;
    private javax.swing.JLabel GeriButton;
    private javax.swing.JLabel Hoşgeldiniz;
    private javax.swing.JButton KrediFaizButton;
    private javax.swing.JButton KurButton;
    private javax.swing.JButton MaaşButton;
    private javax.swing.JPanel MüdürPanel;
    private javax.swing.JButton MüşteriEkleButton;
    // End of variables declaration//GEN-END:variables
}
