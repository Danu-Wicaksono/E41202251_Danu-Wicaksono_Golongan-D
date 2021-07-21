/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mencoba_cari_kerja_1;

/**
 *
 * @author fastabee
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class koneksi_tabel {
    Connection koneksi2;
    public Connection getConnection(){
    try {
        koneksi2 = DriverManager.getConnection("jdbc:mysql://localhost/cari_kerja", "root", "");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "koneksi ke server gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    return koneksi2;
    
    }
    
    
}
