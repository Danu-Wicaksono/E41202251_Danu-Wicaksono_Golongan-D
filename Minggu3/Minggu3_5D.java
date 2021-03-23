/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3_5d;

import java.util.Scanner;

/**
 *
 * @author Danuw
 */
public class Minggu3_5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int harga1;
       int harga2;
       int harga3;
       int harga4;
       int harga5;
       String total;
       String nama;
       
       Scanner cc = new Scanner (System.in);
       
        System.out.println("------------------------------------------------");
        System.out.println("        Kharisma Agung Plaza < KAP >            ");
        System.out.println("           Promo Belanja Berhadiah              ");
        System.out.println("       Khusus Pembelian 5 Barang Pertama        ");
        System.out.println("         Dengan harga minimum Rp 10000          ");
        System.out.println("------------------------------------------------");
       
        System.out.print("Masukkan Nama Pembeli : ");
        nama = cc.nextLine();
        System.out.println("");
        System.out.print("Masukkan Harga Barang ke-1     : ");
        harga1 = cc.nextInt();
        System.out.print("Masukkan Harga Barang ke-2     : ");
        harga2 = cc.nextInt();
        System.out.print("Masukkan Harga Barang ke-3     : ");
        harga3 = cc.nextInt();
        System.out.print("Masukkan Harga Barang ke-4     : ");
        harga4 = cc.nextInt();
        System.out.print("Masukkan Harga Barang ke-5     : ");
        harga5 = cc.nextInt();
        
        int jumlah = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total pembelian atas nama " + nama + " adalah Rp " + jumlah);
        
        if (jumlah >= 10000){
            total = "Anda Mendapatkan Hadiah 1 Buah mug Cantik";
            System.out.println("");
            System.out.println("Selamat...");
            System.out.println(total);
            System.out.println("");
        }else{
            total = " ";
        }
        System.out.println("------------------------------------------------");
        System.out.println("                  Terima Kasih                  ");
        System.out.println(" Anda Sudah Belanja di Kharisma Agung Plaza     ");
    }   
}




    
