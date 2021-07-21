/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class koneksi2 {
    private static Connection koneksi;

    static Connection GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/wsi4", "root" , "");
            stm = con.createStatement();
            System.out.println("KONEKSI BERHASIL");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "KONEKSI GAGAL"+e.getMessage());
        
        }
        
        }
    
    }
