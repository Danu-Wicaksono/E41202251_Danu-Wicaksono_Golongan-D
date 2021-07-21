/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USE
 */
public class koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksi() {
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/WSI4";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection( url,username, password);
                System.out.println("KONEKSI BERHASIL");
            }catch (SQLException e){
                System.out.println("ERROR");
            }
        }
        return koneksi;
    }
     public static void main(String args[]){
        getkoneksi();
    }
   
}

