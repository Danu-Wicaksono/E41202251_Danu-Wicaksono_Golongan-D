/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login2;

import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Daftar
     */
    private Connection conn;
    private Statement stat;
    private ResultSet rs;
    
    public Daftar() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bkembali = new javax.swing.JButton();
        txtkk = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        txtttl = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtprofesi = new javax.swing.JTextField();
        txttelp = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("DAFTAR PENDUDUK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 76, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("No_KK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 107, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 138, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("NIK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 169, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tempat_Tanggal_Lahir");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 231, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText(" Jenis_Kelamin");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Profesi");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 295, -1, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 74, 137, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("No_Telp");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 326, -1, -1));

        bsimpan.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(bsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 372, -1, -1));

        bhapus.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        bhapus.setText("Hapus");
        getContentPane().add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 372, -1, -1));

        bkembali.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        bkembali.setText("Kembali");
        bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(bkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 372, -1, -1));

        txtkk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkkActionPerformed(evt);
            }
        });
        getContentPane().add(txtkk, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 105, 137, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 136, 137, -1));
        getContentPane().add(txtnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 167, 137, -1));
        getContentPane().add(txtttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 198, 85, -1));
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 229, 141, -1));

        txtprofesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprofesiActionPerformed(evt);
            }
        });
        getContentPane().add(txtprofesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 293, 141, -1));
        getContentPane().add(txttelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 324, 141, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan", "Berkelamin Ganda", "Custom" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        // TODO add your handling code here:
        new Data_Penduduk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bkembaliActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtkkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkkActionPerformed

    private void txtprofesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprofesiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprofesiActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        String ID = txtid.getText();
        String No_KK = txtkk.getText();
        String Nama = txtnama.getText();
        String NIK = txtnik.getText();
        String Tempat_Tanggal_Lahir = txtttl.getText();
        String Alamat = txtalamat.getText();
        String Profesi = txtprofesi.getText();
        String No_Telp = txttelp.getText();

        try {
            conn = koneksi2.GetConnection();
            String sql = "INSERT INTO `daftar` (`ID`, `No_KK`, `Nama`, `NIK`, `Tempat_Tanggal_Lahir`, `Alamat`, `Jenis_Kelamin`, `Profesi`, `No_Telp`) "
                    + "    VALUES (?,?,?,?,?,?,?,?,?)" ;
                   
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, ID);
            pst.setString(2, No_KK);
            pst.setString(3, Nama);
            pst.setString(4, NIK);
            pst.setString(5, Tempat_Tanggal_Lahir);
            pst.setString(6, Alamat);
            pst.setString(7, Profesi);
            pst.setString(8, No_Telp);

            pst.execute();
           
            JOptionPane.showMessageDialog(this, "Tambah Data Berhasil");
            new Data_Penduduk().setVisible(true);
                this.dispose();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Tambah Data Gagal");
            System.out.println(e.getMessage());
        }
       
    }//GEN-LAST:event_bsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkembali;
    private javax.swing.JButton bsimpan;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtkk;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtprofesi;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txtttl;
    // End of variables declaration//GEN-END:variables
}
