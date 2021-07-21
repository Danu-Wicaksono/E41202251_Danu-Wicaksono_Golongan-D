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
import java.sql.Statement;
public class koneksi_register_semua {
    public static Connection conn;
    public Statement cn;
    private static java.sql.Connection koneksi3;
    
    public static java.sql.Connection getkoneksi3(){
        if (koneksi3 == null); 
        try {
            String url = "jdbc:mysql://localhost/cari_kerja";
             String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi3 = DriverManager.getConnection(url, username, password);
            System.out.println("mengambil data berhasil");
            
                      
        } catch (Exception e) {
            System.out.println("mengambil data gagal");
        }
              return koneksi3;
        }

         public static void main(String args[]){
         getkoneksi3();
    }
         

  }

