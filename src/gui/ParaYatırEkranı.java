package gui;

import gui.ayarlar.ButonAyarları;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ParaYatırEkranı extends javax.swing.JFrame {

    int yatırılacakmiktar = 0;

    public ParaYatırEkranı() {
        initComponents();
        this.setLocationRelativeTo(null);
        ParaYatırPanel.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParaYatırPanel = new javax.swing.JPanel();
        GeriButton = new javax.swing.JLabel();
        ParaYatırEkranıBaşlık = new javax.swing.JLabel();
        Bakiye = new javax.swing.JLabel();
        YatırılacakMiktar = new javax.swing.JLabel();
        YatırılacakMiktarText = new javax.swing.JTextField();
        ParaYatırButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ParaYatırPanel.setBackground(new java.awt.Color(153, 255, 204));

        GeriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Geri48px_2.png"))); // NOI18N
        GeriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GeriButtonMousePressed(evt);
            }
        });

        ParaYatırEkranıBaşlık.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ParaYatırEkranıBaşlık.setForeground(new java.awt.Color(0, 102, 102));
        ParaYatırEkranıBaşlık.setText("Sayın [Müşteri Adı Soyadı]");

        Bakiye.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Bakiye.setForeground(new java.awt.Color(0, 102, 102));
        Bakiye.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Bakiye.setText("Toplam Bakiye :");

        YatırılacakMiktar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        YatırılacakMiktar.setForeground(new java.awt.Color(0, 102, 102));
        YatırılacakMiktar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        YatırılacakMiktar.setText("Yatırılacak Miktar :");

        YatırılacakMiktarText.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        YatırılacakMiktarText.setForeground(new java.awt.Color(153, 153, 153));
        YatırılacakMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                YatırılacakMiktarTextKeyReleased(evt);
            }
        });

        ParaYatırButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ParaYatırButton.setForeground(new java.awt.Color(0, 204, 204));
        ParaYatırButton.setText("Para Yatır");
        ParaYatırButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("[BAKİYE]");

        javax.swing.GroupLayout ParaYatırPanelLayout = new javax.swing.GroupLayout(ParaYatırPanel);
        ParaYatırPanel.setLayout(ParaYatırPanelLayout);
        ParaYatırPanelLayout.setHorizontalGroup(
            ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaYatırPanelLayout.createSequentialGroup()
                .addGroup(ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaYatırPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriButton)
                        .addGap(33, 33, 33)
                        .addComponent(ParaYatırEkranıBaşlık))
                    .addGroup(ParaYatırPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(YatırılacakMiktar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bakiye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ParaYatırPanelLayout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(YatırılacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ParaYatırPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(ParaYatırPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(ParaYatırButton)))
                .addGap(37, 37, 37))
        );
        ParaYatırPanelLayout.setVerticalGroup(
            ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaYatırPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ParaYatırEkranıBaşlık)
                    .addComponent(GeriButton))
                .addGap(59, 59, 59)
                .addGroup(ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bakiye)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(ParaYatırPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YatırılacakMiktar)
                    .addComponent(YatırılacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ParaYatırButton)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaYatırPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaYatırPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeriButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriButtonMousePressed
        this.setVisible(false);
        new MüşteriEkranı().setVisible(true);
    }//GEN-LAST:event_GeriButtonMousePressed

    private void ParaYatırButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatırButtonMouseEntered
        ButonAyarları.setcolor(ParaYatırButton, Color.DARK_GRAY);
    }//GEN-LAST:event_ParaYatırButtonMouseEntered

    private void ParaYatırButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatırButtonMouseExited
        ButonAyarları.resetcolor(ParaYatırButton);
    }//GEN-LAST:event_ParaYatırButtonMouseExited

    private void YatırılacakMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YatırılacakMiktarTextKeyReleased
        String text = this.YatırılacakMiktarText.getText();
        if (!text.equals("")) {
            this.yatırılacakmiktar=Integer.valueOf(text);
        }
        else{
          this.yatırılacakmiktar=0;
        }
    }//GEN-LAST:event_YatırılacakMiktarTextKeyReleased

    private void ParaYatırButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaYatırButtonActionPerformed
        JOptionPane.showMessageDialog(this,"BAŞARILI \n"+"Yatırılan Miktar:"+yatırılacakmiktar);
        this.YatırılacakMiktarText.setText("");
    }//GEN-LAST:event_ParaYatırButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaYatırEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatırEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatırEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatırEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatırEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bakiye;
    private javax.swing.JLabel GeriButton;
    private javax.swing.JButton ParaYatırButton;
    private javax.swing.JLabel ParaYatırEkranıBaşlık;
    private javax.swing.JPanel ParaYatırPanel;
    private javax.swing.JLabel YatırılacakMiktar;
    private javax.swing.JTextField YatırılacakMiktarText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
