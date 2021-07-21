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


import java.sql.DriverManager;
public class koneksi_register {
    private static java.sql.Connection koneksi1;
    
    public static java.sql.Connection getkoneksi1(){
    if(koneksi1 == null);
    try{
            String url = "jdbc:mysql://localhost/userlogin";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi1 = DriverManager.getConnection(url, username, password);
            System.out.println("koneksi berhasil");
            
    }
    catch (Exception e){
        System.out.println("koneksi gagal");
       
    }
   return koneksi1; 
    }
    public static void main (String args[]){
        getkoneksi1();
    }
    
    
}
