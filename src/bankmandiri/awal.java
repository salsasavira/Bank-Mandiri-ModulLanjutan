/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmandiri;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class awal extends javax.swing.JFrame {

    private Object Int;

    /**
     * Creates new form awal
     */
    public awal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tpin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bMasuk = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\asd.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 440, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-----------------SELAMAT DATANG--------------");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 610, 80));
        jPanel1.add(tpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 190, 40));

        jLabel3.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        jLabel3.setText("Masukkan PIN anda ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 250, 70));

        bMasuk.setText("OK");
        bMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasukActionPerformed(evt);
            }
        });
        jPanel1.add(bMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 80, 30));

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(bKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 80, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmandiri/tyu.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(635, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasukActionPerformed
        // TODO add your handling code here:
        int pin = Integer.parseInt(String.valueOf(tpin.getText()));
         if(pin==1234) {
              transaksi satu = new transaksi();
                satu.show();
                dispose();    
         } else{
             JOptionPane.showMessageDialog(null, "Pastikan Pin Anda Benar");              
         }
    }//GEN-LAST:event_bMasukActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n" ,"INFO",1);
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
       JOptionPane.showConfirmDialog(null,"Anda ingin keluar?","ATM MANDIRI",JOptionPane.YES_NO_OPTION, 3);
       this.dispose();
    }//GEN-LAST:event_bKeluarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bMasuk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tpin;
    // End of variables declaration//GEN-END:variables
}
