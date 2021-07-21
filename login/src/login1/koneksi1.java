/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class koneksi1 {
    private static Connection koneksi;
    
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/login", "root" , "");
            stm = con.createStatement();
            System.out.println("HIP HIP HORE BERHASIL");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "KONEKSI GAGAL BLOK"+e.getMessage());
        
        }
        
        }
    
    }

