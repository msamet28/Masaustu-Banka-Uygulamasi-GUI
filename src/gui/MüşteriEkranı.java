package gui;

import gui.ayarlar.ButonAyarları;
import java.awt.Color;

public class MüşteriEkranı extends javax.swing.JFrame {

    public MüşteriEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        MüşteriPanel.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MüşteriPanel = new javax.swing.JPanel();
        Hoşgeldiniz = new javax.swing.JLabel();
        AdSoyad = new javax.swing.JLabel();
        ParaÇekButton = new javax.swing.JButton();
        ParaYatırButton = new javax.swing.JButton();
        HavaleButton = new javax.swing.JButton();
        KrediBaşvuruButton = new javax.swing.JButton();
        KrediÖdemeButton = new javax.swing.JButton();
        HesapAçButton = new javax.swing.JButton();
        Kasaİkonu = new javax.swing.JLabel();
        BakiyeText = new javax.swing.JLabel();
        GeriButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MüşteriPanel.setBackground(new java.awt.Color(153, 255, 204));

        Hoşgeldiniz.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Hoşgeldiniz.setForeground(new java.awt.Color(0, 102, 102));
        Hoşgeldiniz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoşgeldiniz.setText("Hosgeldiniz");

        AdSoyad.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AdSoyad.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyad.setText("[Kullanıcı Adı Soyadı]");
        AdSoyad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ParaÇekButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ParaÇekButton.setForeground(new java.awt.Color(0, 204, 204));
        ParaÇekButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/ParaÇek48px.png"))); // NOI18N
        ParaÇekButton.setText("Para Çek");
        ParaÇekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaÇekButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ParaÇekButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ParaÇekButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ParaÇekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaÇekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParaÇekButtonMouseExited(evt);
            }
        });
        ParaÇekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaÇekButtonActionPerformed(evt);
            }
        });

        ParaYatırButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ParaYatırButton.setForeground(new java.awt.Color(0, 204, 204));
        ParaYatırButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/ParaYatır48px.png"))); // NOI18N
        ParaYatırButton.setText("Para Yatır");
        ParaYatırButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaYatırButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ParaYatırButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ParaYatırButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaYatırButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParaYatırButtonMouseExited(evt);
            }
        });
        ParaYatırButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaYatırButtonActionPerformed(evt);
            }
        });

        HavaleButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HavaleButton.setForeground(new java.awt.Color(0, 204, 204));
        HavaleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Havale48px.png"))); // NOI18N
        HavaleButton.setText("Havale");
        HavaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HavaleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HavaleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HavaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HavaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HavaleButtonMouseExited(evt);
            }
        });
        HavaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HavaleButtonActionPerformed(evt);
            }
        });

        KrediBaşvuruButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KrediBaşvuruButton.setForeground(new java.awt.Color(0, 204, 204));
        KrediBaşvuruButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/KrediBaşvurusu48px.png"))); // NOI18N
        KrediBaşvuruButton.setText("Kredi Başvurusu");
        KrediBaşvuruButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KrediBaşvuruButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        KrediBaşvuruButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        KrediBaşvuruButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KrediBaşvuruButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KrediBaşvuruButtonMouseExited(evt);
            }
        });
        KrediBaşvuruButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrediBaşvuruButtonActionPerformed(evt);
            }
        });

        KrediÖdemeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KrediÖdemeButton.setForeground(new java.awt.Color(0, 204, 204));
        KrediÖdemeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/KrediÖdemesi48px.png"))); // NOI18N
        KrediÖdemeButton.setText("Kredi Ödemesi");
        KrediÖdemeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KrediÖdemeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        KrediÖdemeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        KrediÖdemeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KrediÖdemeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KrediÖdemeButtonMouseExited(evt);
            }
        });
        KrediÖdemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrediÖdemeButtonActionPerformed(evt);
            }
        });

        HesapAçButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HesapAçButton.setForeground(new java.awt.Color(0, 204, 204));
        HesapAçButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/YeniHesap48px.png"))); // NOI18N
        HesapAçButton.setText("Yeni Hesap Aç");
        HesapAçButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HesapAçButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HesapAçButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HesapAçButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HesapAçButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HesapAçButtonMouseExited(evt);
            }
        });
        HesapAçButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HesapAçButtonActionPerformed(evt);
            }
        });

        Kasaİkonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Kasa200px.png"))); // NOI18N
        Kasaİkonu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BakiyeText.setForeground(new java.awt.Color(0, 102, 102));
        BakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BakiyeText.setText("[BAKİYE]");

        GeriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Geri48px_2.png"))); // NOI18N
        GeriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GeriButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MüşteriPanelLayout = new javax.swing.GroupLayout(MüşteriPanel);
        MüşteriPanel.setLayout(MüşteriPanelLayout);
        MüşteriPanelLayout.setHorizontalGroup(
            MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MüşteriPanelLayout.createSequentialGroup()
                .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MüşteriPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriButton)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MüşteriPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ParaYatırButton, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(HavaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ParaÇekButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hoşgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MüşteriPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Kasaİkonu, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MüşteriPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KrediÖdemeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KrediBaşvuruButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HesapAçButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        MüşteriPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HavaleButton, HesapAçButton, KrediBaşvuruButton, KrediÖdemeButton, ParaYatırButton, ParaÇekButton});

        MüşteriPanelLayout.setVerticalGroup(
            MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MüşteriPanelLayout.createSequentialGroup()
                .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MüşteriPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ParaÇekButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KrediBaşvuruButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(3, 3, 3)
                        .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(ParaYatırButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KrediÖdemeButton)
                            .addComponent(Kasaİkonu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MüşteriPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Hoşgeldiniz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)))
                .addGap(6, 6, 6)
                .addGroup(MüşteriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HesapAçButton)
                    .addComponent(HavaleButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        MüşteriPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {HavaleButton, HesapAçButton, KrediBaşvuruButton, KrediÖdemeButton, ParaYatırButton, ParaÇekButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MüşteriPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MüşteriPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParaÇekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaÇekButtonMouseEntered
        ButonAyarları.setcolor(ParaÇekButton, Color.DARK_GRAY);
    }//GEN-LAST:event_ParaÇekButtonMouseEntered

    private void ParaÇekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaÇekButtonMouseExited
        ButonAyarları.resetcolor(ParaÇekButton);
    }//GEN-LAST:event_ParaÇekButtonMouseExited

    private void ParaYatırButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatırButtonMouseEntered
        ButonAyarları.setcolor(ParaYatırButton, Color.DARK_GRAY);
    }//GEN-LAST:event_ParaYatırButtonMouseEntered

    private void ParaYatırButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatırButtonMouseExited
        ButonAyarları.resetcolor(ParaYatırButton);
    }//GEN-LAST:event_ParaYatırButtonMouseExited

    private void HavaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaleButtonMouseEntered
        ButonAyarları.setcolor(HavaleButton, Color.DARK_GRAY);
    }//GEN-LAST:event_HavaleButtonMouseEntered

    private void HavaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaleButtonMouseExited
        ButonAyarları.resetcolor(HavaleButton);
    }//GEN-LAST:event_HavaleButtonMouseExited

    private void KrediBaşvuruButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediBaşvuruButtonMouseEntered
        ButonAyarları.setcolor(KrediBaşvuruButton, Color.DARK_GRAY);
    }//GEN-LAST:event_KrediBaşvuruButtonMouseEntered

    private void KrediBaşvuruButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediBaşvuruButtonMouseExited
        ButonAyarları.resetcolor(KrediBaşvuruButton);
    }//GEN-LAST:event_KrediBaşvuruButtonMouseExited

    private void KrediÖdemeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediÖdemeButtonMouseEntered
        ButonAyarları.setcolor(KrediÖdemeButton, Color.DARK_GRAY);
    }//GEN-LAST:event_KrediÖdemeButtonMouseEntered

    private void KrediÖdemeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediÖdemeButtonMouseExited
        ButonAyarları.resetcolor(KrediÖdemeButton);
    }//GEN-LAST:event_KrediÖdemeButtonMouseExited

    private void HesapAçButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HesapAçButtonMouseEntered
        ButonAyarları.setcolor(HesapAçButton, Color.DARK_GRAY);
    }//GEN-LAST:event_HesapAçButtonMouseEntered

    private void HesapAçButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HesapAçButtonMouseExited
        ButonAyarları.resetcolor(HesapAçButton);
    }//GEN-LAST:event_HesapAçButtonMouseExited

    private void ParaÇekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaÇekButtonActionPerformed
        this.setVisible(false);
        new ParaÇekEkranı().setVisible(true);
    }//GEN-LAST:event_ParaÇekButtonActionPerformed

    private void ParaYatırButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaYatırButtonActionPerformed
        this.setVisible(false);
        new ParaYatırEkranı().setVisible(true);
    }//GEN-LAST:event_ParaYatırButtonActionPerformed

    private void HavaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HavaleButtonActionPerformed
        this.setVisible(false);
        new HavaleEkranı().setVisible(true);
    }//GEN-LAST:event_HavaleButtonActionPerformed

    private void KrediBaşvuruButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrediBaşvuruButtonActionPerformed
        this.setVisible(false);
        new KrediBaşvuruEkranı().setVisible(true);
    }//GEN-LAST:event_KrediBaşvuruButtonActionPerformed

    private void KrediÖdemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrediÖdemeButtonActionPerformed
        this.setVisible(false);
        new KrediÖdemeEkranı().setVisible(true);
    }//GEN-LAST:event_KrediÖdemeButtonActionPerformed

    private void HesapAçButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HesapAçButtonActionPerformed
        this.setVisible(false);
        new YeniHesapEkranı().setVisible(true);
    }//GEN-LAST:event_HesapAçButtonActionPerformed

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
        this.setVisible(false);
        new MüşteriGirişEkranı().setVisible(true);
    }//GEN-LAST:event_GeriButtonMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MüşteriEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MüşteriEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MüşteriEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MüşteriEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MüşteriEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyad;
    private javax.swing.JLabel BakiyeText;
    private javax.swing.JLabel GeriButton;
    private javax.swing.JButton HavaleButton;
    private javax.swing.JButton HesapAçButton;
    private javax.swing.JLabel Hoşgeldiniz;
    private javax.swing.JLabel Kasaİkonu;
    private javax.swing.JButton KrediBaşvuruButton;
    private javax.swing.JButton KrediÖdemeButton;
    private javax.swing.JPanel MüşteriPanel;
    private javax.swing.JButton ParaYatırButton;
    private javax.swing.JButton ParaÇekButton;
    // End of variables declaration//GEN-END:variables

}
