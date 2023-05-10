package gui;

import gui.ayarlar.ButonAyarları;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ParaÇekEkranı extends javax.swing.JFrame {

    private int çekilecekmiktar = 0;

    public ParaÇekEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        ParaÇekPanel.setFocusable(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParaÇekPanel = new javax.swing.JPanel();
        GeriButton = new javax.swing.JLabel();
        ParaÇekEkranıBaşlık = new javax.swing.JLabel();
        Bakiye = new javax.swing.JLabel();
        ÇekilecekMiktar = new javax.swing.JLabel();
        ÇekilecekMiktarText = new javax.swing.JTextField();
        ParaÇekButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ParaÇekPanel.setBackground(new java.awt.Color(153, 255, 204));

        GeriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Geri48px_2.png"))); // NOI18N
        GeriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GeriButtonMousePressed(evt);
            }
        });

        ParaÇekEkranıBaşlık.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ParaÇekEkranıBaşlık.setForeground(new java.awt.Color(0, 102, 102));
        ParaÇekEkranıBaşlık.setText("Sayın [Müşteri Adı Soyadı]");

        Bakiye.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Bakiye.setForeground(new java.awt.Color(0, 102, 102));
        Bakiye.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Bakiye.setText("Toplam Bakiye :");

        ÇekilecekMiktar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ÇekilecekMiktar.setForeground(new java.awt.Color(0, 102, 102));
        ÇekilecekMiktar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ÇekilecekMiktar.setText("Çekilecek Miktar :");

        ÇekilecekMiktarText.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ÇekilecekMiktarText.setForeground(new java.awt.Color(153, 153, 153));
        ÇekilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ÇekilecekMiktarTextKeyReleased(evt);
            }
        });

        ParaÇekButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ParaÇekButton.setForeground(new java.awt.Color(0, 204, 204));
        ParaÇekButton.setText("Para Çek");
        ParaÇekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("[BAKİYE]");

        javax.swing.GroupLayout ParaÇekPanelLayout = new javax.swing.GroupLayout(ParaÇekPanel);
        ParaÇekPanel.setLayout(ParaÇekPanelLayout);
        ParaÇekPanelLayout.setHorizontalGroup(
            ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaÇekPanelLayout.createSequentialGroup()
                .addGroup(ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaÇekPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriButton)
                        .addGap(33, 33, 33)
                        .addComponent(ParaÇekEkranıBaşlık))
                    .addGroup(ParaÇekPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bakiye)
                            .addComponent(ÇekilecekMiktar))
                        .addGap(18, 18, 18)
                        .addGroup(ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ÇekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ParaÇekPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(ParaÇekButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        ParaÇekPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Bakiye, ÇekilecekMiktar});

        ParaÇekPanelLayout.setVerticalGroup(
            ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaÇekPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ParaÇekEkranıBaşlık)
                    .addComponent(GeriButton))
                .addGap(59, 59, 59)
                .addGroup(ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bakiye)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(ParaÇekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ÇekilecekMiktar)
                    .addComponent(ÇekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ParaÇekButton)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        ParaÇekPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Bakiye, ÇekilecekMiktar});

        ParaÇekPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, ÇekilecekMiktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaÇekPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaÇekPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
        this.setVisible(false);
        new MüşteriEkranı().setVisible(true);
    }//GEN-LAST:event_GeriButtonMousePressed

    private void ParaÇekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaÇekButtonMouseEntered
        ButonAyarları.setcolor(ParaÇekButton, Color.DARK_GRAY);
    }//GEN-LAST:event_ParaÇekButtonMouseEntered

    private void ParaÇekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaÇekButtonMouseExited
        ButonAyarları.resetcolor(ParaÇekButton);
    }//GEN-LAST:event_ParaÇekButtonMouseExited

    private void ÇekilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ÇekilecekMiktarTextKeyReleased
        String text = this.ÇekilecekMiktarText.getText();
        if (!text.equals("")) {
            this.çekilecekmiktar = Integer.valueOf(text);
        }
        else{
        this.çekilecekmiktar=0;
        }
    }//GEN-LAST:event_ÇekilecekMiktarTextKeyReleased

    private void ParaÇekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaÇekButtonActionPerformed
        JOptionPane.showMessageDialog(this,"BAŞARILI \n"+"Çekilen Miktar:"+çekilecekmiktar);
        this.ÇekilecekMiktarText.setText("");
    }//GEN-LAST:event_ParaÇekButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaÇekEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaÇekEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaÇekEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaÇekEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaÇekEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bakiye;
    private javax.swing.JLabel GeriButton;
    private javax.swing.JButton ParaÇekButton;
    private javax.swing.JLabel ParaÇekEkranıBaşlık;
    private javax.swing.JPanel ParaÇekPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ÇekilecekMiktar;
    private javax.swing.JTextField ÇekilecekMiktarText;
    // End of variables declaration//GEN-END:variables
}
